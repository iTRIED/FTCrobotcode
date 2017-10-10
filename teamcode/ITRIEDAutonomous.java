/*
Copyright (c) 2016 Robert Atkinson
All rights reserved.
Redistribution and use in source and binary forms, with or without modification,
are permitted (subject to the limitations in the disclaimer below) provided that
the following conditions are met:
Redistributions of source code must retain the above copyright notice, this list
of conditions and the following disclaimer.
Redistributions in binary form must reproduce the above copyright notice, this
list of conditions and the following disclaimer in the documentation and/or
other materials provided with the distribution.
Neither the name of Robert Atkinson nor the names of his contributors may be used to
endorse or promote products derived from this software without specific prior
written permission.
NO EXPRESS OR IMPLIED LICENSES TO ANY PARTY'S PATENT RIGHTS ARE GRANTED BY THIS
LICENSE. THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
"AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESSFOR A PARTICULAR PURPOSE
ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE
FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR
TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/
package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorController;
import com.qualcomm.robotcore.util.ElapsedTime;

/**
 * This file contains an minimal example of a Linear "OpMode". An OpMode is a 'program' that runs in either
 * the autonomous or the teleop period of an FTC match. The names of OpModes appear on the menu
 * of the FTC Driver Station. When an selection is made from the menu, the corresponding OpMode
 * class is instantiated on the Robot Controller and executed.
 *
 * This particular OpMode just executes a basic Tank Drive Teleop for a PushBot
 * It includes all the skeletal structure that all linear OpModes contain.
 *
 * Use Android Studios to Copy this Class, and Paste it into your team's code folder with a new name.
 * Remove or comment out the @Disabled line to add this opmode to the Driver Station OpMode list
 */

@Autonomous(name="ITRIED Autonomous", group="ITRIED")  // @Autonomous(...) is the other common choice
@Disabled
public class ITRIEDAutonomous extends LinearOpMode {

    /* Declare OpMode members. */

    /* Jaizelle's Notes:

    Declare the Motors here.

    4-6 motors, we may have 2 servos for the claws, I think. I will set the code down below
    as an option, just take the "//" in front of them if we do end up using them
    Rename if needed/desired.

     */

    private ElapsedTime runtime = new ElapsedTime();
    DcMotor Wheelmotor1 = null;
    DcMotor Wheelmotor2 = null;
    DcMotor Wheelmotor3 = null;
    DcMotor Wheelmotor4 = null;

    //Servo "Servoname1" = null;
    //Servo "Servoname2" = null;

    @Override
    public void runOpMode() {
        telemetry.addData("Status", "Initialized");
        telemetry.update();

        /* eg: Initialize the hardware variables. Note that the strings used here as parameters
         * to 'get' must correspond to the names assigned during the robot configuration
         * step (using the FTC Robot Controller app on the phone)
         */.

        // Initialize Motors
        /* Make changes if needed */
        Wheelmotor1 = hardwareMap.dcMotor.get("MotorLeft");
        Wheelmotor2 = hardwareMap.dcMotor.get("MotorLeft");
        Wheelmotor3 = hardwareMap.dcMotor.get("MotorRight");
        Wheelmotor4 = hardwareMap.dcMotor.get("MotorRight");


        // eg: Set the drive motor directions:
        // "Reverse" the motor that runs backwards when connected directly to the battery
        Wheelmotor1.setDirection(DcMotor.Direction.FORWARD);// REVERSE if it is the wrong direction
        Wheelmotor2.setDirection(DcMotor.Direction.FORWARD);// REVERSE if it is the wrong direction
        Wheelmotor3.setDirection(DcMotor.Direction.REVERSE);// FORWARD if it is the wrong direction
        Wheelmotor4.setDirection(DcMotor.Direction.REVERSE);// FORWARD if it is the wrong direction


        //Initialize servos
        //"Servoname1" = hardwareMap.servo.get ("Servoname1");
        //"Servoname2" = hardwareMap.servo.get ("Servoname2");

        //Servoname1.setPosition(.0);
        //Servoname2.setPosition(.0);



        // Wait for the game to start (driver presses PLAY)
        waitForStart();









        /*
        Example codes, since we don't really have a path set right now

        }

        Use

        Public Void ""Insert direction" (double power)

       {
            "Motor".setPower(power);
       }


        To shorten code


        Example Names:
            DriveForward
            DriveBackward
            TurnRight
            TurnLeft
            StopDriving
            RaiseArm
            MoveArm
            LowerArm




         */



    }
}