package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.usb.RobotArmingStateNotifier;

/**
 * Created by William Goelz and Bridger Mattson for G3 Robotics (Blue).
 * Written over the course of September, October, and November of 2017
 * Used in the Petoskey and Houghton FTC Qualifying rounds.
 * Developed in Android Studio using the FTC SDK on GitHub.
 */

@Autonomous ( name = "AutonRedRight")

//Right motor is reversed, negative direction goes left and positive goes right

public class AutonRedRight extends LinearOpMode {

    @Override

    public synchronized void waitForStart() {
        super.waitForStart();
    }

    public DcMotor right;
    public DcMotor left;
    public DcMotor rightEscalator;
    public DcMotor leftEscalator;

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

    public void TurnLeft(float power, int time){

        left.setPower(power);
        right.setPower(power);

        sleep(time);

        left.setPower(0);
        right.setPower(0);
    }
    public void TurnRight(float power, int time){
        left.setPower(-power);
        right.setPower(-power);
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

        right = hardwareMap.dcMotor.get("rightDrive");
        left = hardwareMap.dcMotor.get("leftDrive");
        leftEscalator = hardwareMap.dcMotor.get("leftEscalator");
        rightEscalator = hardwareMap.dcMotor.get("rightEscalator");

        DriveForward(0.5f, 900);
        TurnRight(0.5f, 555);
        DriveBackwards(0.5f, 520);
        TurnLeft(0.5f, 555);
        DriveForward(0.5f, 300);
        DropGlyph();
        DriveBackwards(0.5f, 75);
    }
}