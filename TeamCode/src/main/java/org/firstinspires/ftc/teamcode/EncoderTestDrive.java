package org.firstinspires.ftc.teamcode;

/**
 * Created by G3 Robotics 8621 on 11/19/2017.
 */

public class EncoderTestDrive {
}
/* Copyright (c) 2017 FIRST. All rights reserved.
*
* Redistribution and use in source and binary forms, with or without modification,
* are permitted (subject to the limitations in the disclaimer below) provided that
* the following conditions are met:
*
* Redistributions of source code must retain the above copyright notice, this list
* of conditions and the following disclaimer.
*
* Redistributions in binary form must reproduce the above copyright notice, this
* list of conditions and the following disclaimer in the documentation and/or
* other materials provided with the distribution.
*
* Neither the name of FIRST nor the names of its contributors may be used to endorse or
* promote products derived from this software without specific prior written permission.
*
* NO EXPRESS OR IMPLIED LICENSES TO ANY PARTY'S PATENT RIGHTS ARE GRANTED BY THIS
* LICENSE. THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
* "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
* THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
* ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE
* FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
* DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
* SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
* CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
* OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
* OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

/* Declare OpMode members. */

// Use a Pushbot's hardware

// eg: TETRIX Motor Encoder

// This is < 1.0 if geared UP

// For figuring circumference

/*
        * Initialize the drive system variables.
        * The init() method of the hardware class does all the work here
        */

// Send telemetry message to signify robot waiting;

//

// Send telemetry message to indicate successful Encoder reset

// Wait for the game to start (driver presses PLAY)

// Step through each leg of the path,
// Note: Reverse movement is obtained by setting a negative distance (not speed)

// S1: Forward 34 Inches with 3 Sec timeout

// S2: Turn Right 12 Inches with 4 Sec timeout

// S3: Forward 6 Inches with 4 Sec timeout


// S4: Stop and close the claw.

// pause for servos to move


/*
    *  Method to perfmorm a relative move, based on encoder counts.
    *  Encoders are not reset as the move is based on the current position.
    *  Move will stop if any of three conditions occur:
    *  1) Move gets to the desired position
    *  2) Move runs out of time
    *  3) Driver stops the opmode running.
    */

// Ensure that the opmode is still active

// Determine new target position, and pass to motor controller

// Turn On RUN_TO_POSITION

// reset the timeout time and start motion.

// keep looping while we are still active, and there is time left, and both motors are running.
// Note: We use (isBusy() && isBusy()) in the loop test, which means that when EITHER motor hits
// its target position, the motion will stop.  This is "safer" in the event that the robot will
// always end the motion as soon as possible.
// However, if you require that BOTH motors have finished their moves before the robot continues
// onto the next step, use (isBusy() || isBusy()) in the loop test.

// Display it for the driver.

// Stop all motion;

// Turn off RUN_TO_POSITION

//  sleep(250);   // optional pause after each move

/* Copyright (c) 2017 FIRST. All rights reserved.
*
* Redistribution and use in source and binary forms, with or without modification,
* are permitted (subject to the limitations in the disclaimer below) provided that
* the following conditions are met:
*
* Redistributions of source code must retain the above copyright notice, this list
* of conditions and the following disclaimer.
*
* Redistributions in binary form must reproduce the above copyright notice, this
* list of conditions and the following disclaimer in the documentation and/or
* other materials provided with the distribution.
*
* Neither the name of FIRST nor the names of its contributors may be used to endorse or
* promote products derived from this software without specific prior written permission.
*
* NO EXPRESS OR IMPLIED LICENSES TO ANY PARTY'S PATENT RIGHTS ARE GRANTED BY THIS
* LICENSE. THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
* "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
* THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
* ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE
* FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
* DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
* SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
* CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
* OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
* OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

/* Declare OpMode members. */

// Use a Pushbot's hardware

// eg: TETRIX Motor Encoder

// This is < 1.0 if geared UP

// For figuring circumference

/*
        * Initialize the drive system variables.
        * The init() method of the hardware class does all the work here
        */

// Send telemetry message to signify robot waiting;

//

// Send telemetry message to indicate successful Encoder reset

// Wait for the game to start (driver presses PLAY)

// Step through each leg of the path,
// Note: Reverse movement is obtained by setting a negative distance (not speed)

// S1: Forward 34 Inches with 3 Sec timeout

// S2: Turn Right 12 Inches with 4 Sec timeout

// S3: Forward 6 Inches with 4 Sec timeout


// S4: Stop and close the claw.

// pause for servos to move


/*
    *  Method to perfmorm a relative move, based on encoder counts.
    *  Encoders are not reset as the move is based on the current position.
    *  Move will stop if any of three conditions occur:
    *  1) Move gets to the desired position
    *  2) Move runs out of time
    *  3) Driver stops the opmode running.
    */

// Ensure that the opmode is still active

// Determine new target position, and pass to motor controller

// Turn On RUN_TO_POSITION

// reset the timeout time and start motion.

// keep looping while we are still active, and there is time left, and both motors are running.
// Note: We use (isBusy() && isBusy()) in the loop test, which means that when EITHER motor hits
// its target position, the motion will stop.  This is "safer" in the event that the robot will
// always end the motion as soon as possible.
// However, if you require that BOTH motors have finished their moves before the robot continues
// onto the next step, use (isBusy() || isBusy()) in the loop test.

// Display it for the driver.

// Stop all motion;

// Turn off RUN_TO_POSITION

//  sleep(250);   // optional pause after each move

/* Copyright (c) 2017 FIRST. All rights reserved.
*
* Redistribution and use in source and binary forms, with or without modification,
* are permitted (subject to the limitations in the disclaimer below) provided that
* the following conditions are met:
*
* Redistributions of source code must retain the above copyright notice, this list
* of conditions and the following disclaimer.
*
* Redistributions in binary form must reproduce the above copyright notice, this
* list of conditions and the following disclaimer in the documentation and/or
* other materials provided with the distribution.
*
* Neither the name of FIRST nor the names of its contributors may be used to endorse or
* promote products derived from this software without specific prior written permission.
*
* NO EXPRESS OR IMPLIED LICENSES TO ANY PARTY'S PATENT RIGHTS ARE GRANTED BY THIS
* LICENSE. THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
* "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
* THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
* ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE
* FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
* DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
* SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
* CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
* OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
* OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

/* Declare OpMode members. */

// Use a Pushbot's hardware

// eg: TETRIX Motor Encoder

// This is < 1.0 if geared UP

// For figuring circumference

/*
        * Initialize the drive system variables.
        * The init() method of the hardware class does all the work here
        */

// Send telemetry message to signify robot waiting;

//

// Send telemetry message to indicate successful Encoder reset

// Wait for the game to start (driver presses PLAY)

// Step through each leg of the path,
// Note: Reverse movement is obtained by setting a negative distance (not speed)

// S1: Forward 34 Inches with 3 Sec timeout

// S2: Turn Right 12 Inches with 4 Sec timeout

// S3: Forward 6 Inches with 4 Sec timeout


// S4: Stop and close the claw.

// pause for servos to move


/*
    *  Method to perfmorm a relative move, based on encoder counts.
    *  Encoders are not reset as the move is based on the current position.
    *  Move will stop if any of three conditions occur:
    *  1) Move gets to the desired position
    *  2) Move runs out of time
    *  3) Driver stops the opmode running.
    */

// Ensure that the opmode is still active

// Determine new target position, and pass to motor controller

// Turn On RUN_TO_POSITION

// reset the timeout time and start motion.

// keep looping while we are still active, and there is time left, and both motors are running.
// Note: We use (isBusy() && isBusy()) in the loop test, which means that when EITHER motor hits
// its target position, the motion will stop.  This is "safer" in the event that the robot will
// always end the motion as soon as possible.
// However, if you require that BOTH motors have finished their moves before the robot continues
// onto the next step, use (isBusy() || isBusy()) in the loop test.

// Display it for the driver.

// Stop all motion;

// Turn off RUN_TO_POSITION

//  sleep(250);   // optional pause after each move

