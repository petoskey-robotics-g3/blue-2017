package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.usb.RobotArmingStateNotifier;

/**
 * Created by William Goelz and Bridger Mattson for G3 Robotics (Blue).
 * Written over the course of September, October, and November of 2017
 * Used in the Petoskey and Houghton FTC Qualifying rounds.
 * Developed in Android Studio using the FTC SDK on GitHub.
 */

@Autonomous ( name = "AutonRedleft")

//Right motor is reversed, negative direction goes left and positive goes right

public class AutonRedLeft extends LinearOpMode {

    @Override

    public synchronized void waitForStart() {
        super.waitForStart();
    }

    public DcMotor right;
    public DcMotor left;
    public DcMotor rightEscalator;
    public DcMotor leftEscalator;

    ColorSensor colorSensor;
    Servo rightServo;
    Servo rightServoOpener;

    public void DropGlyph() {

        leftEscalator.setPower(0.5);
        rightEscalator.setPower(-0.5);

        sleep(1000);
    }

    public void DriveBackwards(float power, int time){

        left.setPower(power);
        right.setPower(-power);

        sleep(time);

        left.setPower(0);
        right.setPower(0);

    }
    public void Turn(float direction, int time){

        left.setPower(-direction);
        right.setPower(-direction);

        sleep(time);

        left.setPower(0);
        right.setPower(0);
    }
    public void DriveForward(float power, int time){

        left.setPower(-power);
        right.setPower(power);

        sleep(time);

        left.setPower(0);
        right.setPower(0);
    }
    @Override

    public void runOpMode() throws InterruptedException {
        waitForStart();
        right = hardwareMap.dcMotor.get("rightDrive");
        left = hardwareMap.dcMotor.get("leftDrive");
        leftEscalator = hardwareMap.dcMotor.get("leftEscalator");
        rightEscalator = hardwareMap.dcMotor.get("rightEscalator");
        rightServo = hardwareMap.servo.get("rightServo");
        //Servo clasp
        rightServoOpener = hardwareMap.servo.get("rightServoOpener");
        colorSensor = hardwareMap.colorSensor.get("colorSensor");
        colorSensor.enableLed(true);

        rightServoOpener.setDirection(Servo.Direction.REVERSE);
        rightServoOpener.setPosition(0);
        sleep(1000);
        rightServoOpener.setPosition(0);
        rightServo.setDirection(Servo.Direction.FORWARD);
        rightServo.setPosition(1);
        sleep(1000);
        rightServo.setPosition(1);
        // insert the color sensor code from ColorSensorPractice
        telemetry.addData("LED", true ? "On" : "Off");
        telemetry.addData("Red  ", colorSensor.red());
        telemetry.addData("Blue ", colorSensor.blue());
        if (colorSensor.blue() > 20) {
            Turn(-0.5f, 400);
            Turn(0.5f, 400);
        } else {
            Turn(0.5f, 400);
            Turn(-0.5f, 400);
        }
        rightServo.setDirection(Servo.Direction.REVERSE);
        rightServo.setPosition(0.5);
        sleep(1000);
        rightServoOpener.setDirection(Servo.Direction.FORWARD);
        rightServoOpener.setPosition(-0.5);
        sleep(1000);

        DriveForward(0.5f, 1140);
        Turn(0.5f, 650);
        DriveForward(0.5f, 450);
        DropGlyph();
        DriveBackwards(0.5f, 150);
    }
}