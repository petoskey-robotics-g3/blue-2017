package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

/**
 * Created by G3 Robotics 8621 on 11/19/2017.
 */@Autonomous (name = "PracticeAuton")

public class PracticeAuton extends LinearOpMode{
    @Override
    public synchronized void waitForStart() {
        super.waitForStart();
    }
    private ElapsedTime     runtime = new ElapsedTime();

    public DcMotor right;
    public DcMotor left;
    public DcMotor rightEscalator;
    public DcMotor leftEscalator;


    public void runOpMode() throws InterruptedException {

        right = hardwareMap.dcMotor.get("rightDrive");
        left = hardwareMap.dcMotor.get("leftDrive");
        leftEscalator = hardwareMap.dcMotor.get("leftEscalator");
        rightEscalator = hardwareMap.dcMotor.get("rightEscalator");

        telemetry.update();
        telemetry.addData("Status", "Resetting Encoders");


        left.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        right.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        right.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        left.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        telemetry.addData("Path0",  "Starting at %7d :%7d",
                left.getCurrentPosition(),
                right.getCurrentPosition());
        telemetry.update();

        public void DropGlyph() {

            leftEscalator.setPower(0.5);
            rightEscalator.setPower(-0.5);

            sleep(1000);
        }



    }
}
