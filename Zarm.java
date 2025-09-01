package org.firstinspires.ftc.teamcode;

import com.arcrobotics.ftclib.controller.PIDController;
import com.arcrobotics.ftclib.hardware.motors.Motor;

public class Zarm {
    private Motor motor;
    public void setSpeed(double s) {
        motor.set(1);
    }
    public static final double MAX_POS = 4.0;
    public static final double MIN_POS = 0.0;
    public static final double PID_P = 0.001;
    public static final double PID_I = 0.0001;
    public static final double PID_D = 0.004;

    private Motor slideMotor;
    private PIDController slideMotorPID = new PIDController(PID_D, PID_I, PID_D);

    public Zarm(Motor motor) {
        slideMotor = motor;
        slideMotor.setRunMode(Motor.RunMode.RawPower);
        slideMotor.resetEncoder();
    }

    public void setPosition(double pos) {
        slideMotorPID.setSetPoint(pos);

    }
    public void tickPID() {
        double currentPos = slideMotor.getCurrentPosition();
        double output = slideMotorPID.calculate(currentPos);
        slideMotor.set(output);

    }

}
