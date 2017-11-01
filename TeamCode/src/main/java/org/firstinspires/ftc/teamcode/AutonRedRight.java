package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.usb.RobotArmingStateNotifier;

/**
 * Created by Petoskey Paladins on 10/15/2017.
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

    public void DriveBackwards(float power, int time){
        left.setPower(-power);
        right.setPower(power);
        sleep(time);
        left.setPower(0);
        right.setPower(0);

    }
    public void Turn(float direction, int time){
        left.setPower(direction);
        right.setPower(direction);
        sleep(time);
        left.setPower(0);
        right.setPower(0);
    }

    public void TurnLeft(float power, int time){
        left.setPower(-power);
        right.setPower(-power);
        sleep(time);
        left.setPower(0);
        right.setPower(0);
    }
    public void TurnRight(float power, int time){
        left.setPower(power);
        right.setPower(power);
        sleep(time);
        left.setPower(0);
        right.setPower(0);
    }

    public void DriveForward(float power, int time){
        left.setPower(power);
        right.setPower(-power);
        sleep(time);
        left.setPower(0);
        right.setPower(0);
    }
    @Override
    public void runOpMode() throws InterruptedException {
        right = hardwareMap.dcMotor.get("rightMotor");
        left = hardwareMap.dcMotor.get("leftMotor");

        DriveForward(0.5f, 1550);
        TurnRight(0.5f, 650);
        DriveBackwards(0.5f, 520);
        TurnLeft(0.5f, 750);
    }
}