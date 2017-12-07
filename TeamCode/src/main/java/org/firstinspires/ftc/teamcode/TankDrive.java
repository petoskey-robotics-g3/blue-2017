package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by William Goelz and Bridger Mattson for G3 Robotics (Blue).
 * Written over the course of September, October, and November of 2017
 * Used in the Petoskey and Houghton FTC Qualifying rounds.
 * Developed in Android Studio using the FTC SDK on GitHub.
 */

@TeleOp(name="TankDrive", group="Opmode")

public class TankDrive extends OpMode {

    private DcMotor leftDrive;
    private DcMotor rightDrive;
    private DcMotor rightEscalator;
    private DcMotor leftEscalator;
    private DcMotor escalatorSlope;

    @Override
    public void init() {

        leftDrive = hardwareMap.dcMotor.get("leftDrive");
        rightDrive = hardwareMap.dcMotor.get("rightDrive");
        leftEscalator = hardwareMap.dcMotor.get("leftEscalator");
        rightEscalator = hardwareMap.dcMotor.get("rightEscalator");
        escalatorSlope = hardwareMap.dcMotor.get("escalatorSlope");

        rightDrive.setDirection(DcMotor.Direction.REVERSE);
        rightEscalator.setDirection(DcMotor.Direction.REVERSE);


    }

    @Override
    public void loop() {

        float leftY = gamepad1.left_stick_y;
        float rightY = gamepad1.right_stick_y;
        float EscalatorIn = gamepad2.right_trigger;
        float EscalatorOut = gamepad2.left_trigger;

        boolean EscalatorUp = gamepad2.dpad_down;
        boolean EscalatorDown = gamepad2.dpad_up;


        telemetry.addData("left joystick value", leftY);
        telemetry.addData("right joystick value", rightY);
        telemetry.addData("Escalator In", EscalatorIn);
        telemetry.addData("Escalator Out", -EscalatorOut);
        telemetry.addData("Escalator Down", EscalatorDown);
        telemetry.addData("Escalator Up", EscalatorUp);

        leftY = (leftY == 0) ? -gamepad1.left_stick_y : leftY;
        rightY = (rightY == 0) ? -gamepad1.right_stick_y : rightY;

        leftDrive.setPower(leftY);
        rightDrive.setPower(rightY);

        if (EscalatorIn > 0.0) {
            leftEscalator.setPower(EscalatorIn);
            rightEscalator.setPower(EscalatorIn);
        } else if (EscalatorOut > 0.0){
            leftEscalator.setPower(-EscalatorOut);
             rightEscalator.setPower(-EscalatorOut);
        } else{
            leftEscalator.setPower(0.0);
            rightEscalator.setPower(0.0);
        }
        if (EscalatorDown){
            escalatorSlope.setPower(-0.5);
            telemetry.addData("Escalator Down", EscalatorDown);
        } else if (EscalatorUp){
            escalatorSlope.setPower(0.5);
            telemetry.addData("Escalator Up", EscalatorUp);
        } else {
            escalatorSlope.setPower(0.0);
            telemetry.addData("Escalator Up", "false");
            telemetry.addData("Escalator Down", "false");
        }



    }

}