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

@Autonomous(name="ITRIED Autonomous", group="ITRIED")
public class ITRIEDAutonomous extends LinearOpMode {


    /*
    Identify Motors here

    4-6 motors, we may have 2 servos for the claws, I think. I will set the code down below
    as an option, just take the "//" in front of them if we do end up using them
    Rename if needed/desired.

     */

    private ElapsedTime runtime = new ElapsedTime();
    DcMotor FrontMotor1;
    DcMotor FrontMotor2;
    DcMotor BackMotor1;
    DcMotor BackMotor2;


    /* Identify Servos here*/

    //Servo "Servoname1";
    //Servo "Servoname2";

    @Override
    public void runOpMode() {
        telemetry.addData("Status", "Initialized");
        telemetry.update();


        // Initialize Motors
        /* Make changes if needed */
        FrontMotor1 = hardwareMap.dcMotor.get("FrontMotor");
        FrontMotor2 = hardwareMap.dcMotor.get("FrontMotor");
        BackMotor1 = hardwareMap.dcMotor.get("BackMotor");
        BackMotor2 = hardwareMap.dcMotor.get("BackMotor");



        FrontMotor1.setDirection(DcMotor.Direction.FORWARD);// REVERSE if it is the wrong direction
        FrontMotor2.setDirection(DcMotor.Direction.FORWARD);// REVERSE if it is the wrong direction
        BackMotor1.setDirection(DcMotor.Direction.REVERSE);// FORWARD if it is the wrong direction
        BackMotor2.setDirection(DcMotor.Direction.REVERSE);// FORWARD if it is the wrong direction


        //Initialize servos
        //"Servoname1" = hardwareMap.servo.get ("Servoname1");
        //"Servoname2" = hardwareMap.servo.get ("Servoname2");

        //Servoname1.setPosition(.0);
        //Servoname2.setPosition(.0);



        waitForStart();









        /*


        Example codes, though we don't really have a path set right now

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