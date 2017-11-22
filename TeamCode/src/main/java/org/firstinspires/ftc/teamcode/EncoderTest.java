package org.firstinspires.ftc.teamcode;

import android.graphics.Color;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

/**
 * Created by G3 Robotics 8621 on 11/19/2017.
 */

@Autonomous(name="EncoderTest", group="Opmode")

public class EncoderTest extends OpMode {


    private DcMotor leftDrive;
    private DcMotor rightDrive;
    private DcMotor rightEscalator;
    private DcMotor leftEscalator;
    private DcMotor escalatorSlope;

    private ColorSensor color;

    @Override
    public void init() {

        leftDrive = hardwareMap.dcMotor.get("leftDrive");
        rightDrive = hardwareMap.dcMotor.get("rightDrive");
        leftEscalator = hardwareMap.dcMotor.get("leftEscalator");
        rightEscalator = hardwareMap.dcMotor.get("rightEscalator");
        escalatorSlope = hardwareMap.dcMotor.get("escalatorSlope");

        color = hardwareMap.colorSensor.get("color");

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

        int blue;
        int red;

        telemetry.addData("left joystick value", leftY);
        telemetry.addData("right joystick value", rightY);
        telemetry.addData("Escalator In", EscalatorIn);
        telemetry.addData("Escalator Out", -EscalatorOut);
        telemetry.addData("Escalator Down", EscalatorDown);
        telemetry.addData("Escalator Up", EscalatorUp);

        leftY = (leftY == 0) ? -gamepad1.left_stick_y : leftY;
        rightY = (rightY == 0) ? -gamepad1.right_stick_y : rightY;

        leftDrive.setPower(leftY / 1.3);
        rightDrive.setPower(rightY / 1.3);

        if (EscalatorIn > 0.0) {
            leftEscalator.setPower(EscalatorIn);
            rightEscalator.setPower(EscalatorIn);
        } else if (EscalatorOut > 0.0) {
            leftEscalator.setPower(-EscalatorOut);
            rightEscalator.setPower(-EscalatorOut);
        } else {
            leftEscalator.setPower(0.0);
            rightEscalator.setPower(0.0);
        }
        if (EscalatorDown) {
            escalatorSlope.setPower(-0.5);
            telemetry.addData("Escalator Down", EscalatorDown);
        } else if (EscalatorUp) {
            escalatorSlope.setPower(0.5);
            telemetry.addData("Escalator Up", EscalatorUp);
        } else {
            escalatorSlope.setPower(0.0);
            telemetry.addData("Escalator Up", "false");
            telemetry.addData("Escalator Down", "false");
        }
    }
}