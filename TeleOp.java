package org.firstinspires.ftc.teamcode;

import com.arcrobotics.ftclib.controller.PIDController;
import com.arcrobotics.ftclib.hardware.motors.Motor;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;


import org.firstinspires.ftc.robotcontroller.external.samples.BasicOmniOpMode_Linear;

@com.qualcomm.robotcore.eventloop.opmode.TeleOp(name="Basic: Omni Linear OpMode",group="Linear OpMode")
public class TeleOp extends LinearOpMode {

    private Zarm zarm;
    private Xarm xarm;
    private Claw claw;

    @Override
    public void runOpMode() {
        waitForStart();

        Motor motor = new Motor(hardwareMap, "motor");
        motor.stopAndResetEncoder();

        PIDController pidController = new PIDController(0.2,0.1,0.1);
        int targetPosition = 1000;
        motor.set(1);
    }

}
