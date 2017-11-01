package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

/**
 * Created by Administrator on 9/25/2016.
 */
@TeleOp(name="TankDrive", group="Opmode")

public class TankDrive extends OpMode {

    DcMotor leftDrive;
    DcMotor rightDrive;
    DcMotor rightEscalator;
    DcMotor leftEscalator;
    DcMotor escalatorSlope;

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
        boolean EscalatorUp = gamepad2.a;
        boolean EscalatorDown = gamepad2.b;
//        leftY = (leftY == 0) ? -gamepad2.left_stick_y : leftY;
//        rightY = (rightY == 0) ? -gamepad2.right_stick_y : rightY;

        telemetry.addData("left joystick value", leftY);
        telemetry.addData("right joystick value", rightY);
        telemetry.addData("Escalator In", EscalatorIn);
        telemetry.addData("Escalator Out", -EscalatorOut);
        telemetry.addData("Escalator Down?", EscalatorDown);
        telemetry.addData("Escalator Up?", EscalatorUp);

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
            escalatorSlope.setPower(-0.7);
        } else if (EscalatorUp){
            escalatorSlope.setPower(0.7);
        } else {
            escalatorSlope.setPower(0.0);
        }
    }

}