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

@Autonomous ( name = "AutonPractice")

//Right motor is reversed, negative direction goes left and positive goes right

public class AutonPractice extends LinearOpMode {
    int leftCurrent;
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

    public void DriveBackwards(float power, int rotations){

        left.setPower(power);
        right.setPower(-power);
        left.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        right.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        right.setTargetPosition(-rotations*1440);
        left.setTargetPosition(rotations*1440);
        while (Math.abs(rotations*1440)>Math.abs(leftCurrent)) {
            right.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            left.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            leftCurrent = left.getCurrentPosition();
        }
        left.setPower(0);
        right.setPower(0);

        right.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        left.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

    }
    public void Turn(float direction, int rotations){

        left.setPower(-direction);
        right.setPower(-direction);

        left.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        right.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        right.setTargetPosition(-rotations*1440);
        left.setTargetPosition(-rotations*1440);

        while (Math.abs(rotations*1440)>Math.abs(leftCurrent)) {
            right.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            left.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            leftCurrent = left.getCurrentPosition();
        }
        left.setPower(0);
        right.setPower(0);

        right.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        left.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    }
    public void DriveForward(float power, int rotations){

        left.setPower(-power);
        right.setPower(power);
        left.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        right.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        left.setTargetPosition(-rotations*1440);
        right.setTargetPosition(rotations*1440);

        while (Math.abs(rotations*1440)>Math.abs(leftCurrent)) {
            left.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            right.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            leftCurrent = left.getCurrentPosition();
        }
        left.setPower(0);
        right.setPower(0);

        left.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        right.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    }
    @Override

    public void runOpMode() throws InterruptedException {

        right = hardwareMap.dcMotor.get("rightDrive");
        left = hardwareMap.dcMotor.get("leftDrive");
        leftEscalator = hardwareMap.dcMotor.get("leftEscalator");
        rightEscalator = hardwareMap.dcMotor.get("rightEscalator");

        right.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        left.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        DriveForward(0.5f, 5);
        Turn(0.5f, 2);
        DriveForward(0.5f, 1);
        DropGlyph();
        DropGlyph();
        DriveBackwards(0.7f, 1);

    }
}
