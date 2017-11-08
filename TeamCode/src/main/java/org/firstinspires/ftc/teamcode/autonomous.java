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

@Autonomous ( name = "AutonomousEncoderPractice")

public class autonomous extends LinearOpMode {

    @Override

    public synchronized void waitForStart() {
        super.waitForStart();
    }

    public DcMotor right;
    public DcMotor left;

    @Override

    public void runOpMode() throws InterruptedException {

        right = hardwareMap.dcMotor.get("rightMotor");
        left = hardwareMap.dcMotor.get("leftMotor");

        left.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        right.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        right.setTargetPosition(4320);
        left.setTargetPosition(-4320);
        right.setPower(0.7);
        left.setPower(-0.7);

        right.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        left.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        right.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        left.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        double Robert = 24.5;

        telemetry.addData("left motor value", Robert  );
        telemetry.addData("right motor value" , Robert);
    }
}