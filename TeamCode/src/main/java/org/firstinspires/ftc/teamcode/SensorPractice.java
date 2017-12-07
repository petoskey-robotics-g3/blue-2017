package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.usb.RobotArmingStateNotifier;import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by G3 Robotics 8621 on 12/7/2017.
 */
@Autonomous (name = "SensorPractice")

public class SensorPractice extends LinearOpMode {
    public synchronized void waitForStart() {
        super.waitForStart();
    }

    public DcMotor right;
    public DcMotor left;
    public DcMotor rightEscalator;
    public DcMotor leftEscalator;
    Servo rightServo;
    Servo rightServoOpener;

    public void DropGlyph() {

        leftEscalator.setPower(0.5);
        rightEscalator.setPower(-0.5);

        sleep(1000);
    }

    public void DriveBackward(float power, int rotations){

        left.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        right.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        right.setTargetPosition(-rotations*900);
        left.setTargetPosition(rotations*900);

        right.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        left.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        left.setPower(power);
        right.setPower(-power);
        while (left.isBusy() && right.isBusy()){

        }
        left.setPower(0);
        right.setPower(0);

    }
    public void Turn(float direction, int rotations){

        left.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        right.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);


        right.setTargetPosition(-rotations*1440);
        left.setTargetPosition(-rotations*1440);


        right.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        left.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        left.setPower(-direction);
        right.setPower(-direction);

        while (left.isBusy() && right.isBusy()) {

        }

        left.setPower(0);
        right.setPower(0);
    }
    public void DriveForward(float power, int rotations){

        left.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        right.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);


        left.setTargetPosition(-rotations*750);
        right.setTargetPosition(rotations*750);

        left.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        right.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        left.setPower(-power);
        right.setPower(power);

        while (left.isBusy() && right.isBusy()){

        }
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
        rightServoOpener = hardwareMap.servo.get("rightServoOpener");

        DriveForward(0.5f, 4);
        Turn(0.5f, 1);
        DriveForward(0.5f, 1);
        DropGlyph();
        DropGlyph();
        DriveBackward(0.7f, 1);

    }
}


