package org.firstinspires.ftc.teamcode;

import com.arcrobotics.ftclib.hardware.motors.Motor;

public class Xarm {

    public static final double MAX_POS = 4.0;
    public static final double MIN_POS = 0.0;

    public static final double MAX_PWR = 1.0;
    public static final double MIN_PWR = -1.0;
    private Motor slideMotor;


    public Xarm(Motor motor) {
        slideMotor = motor;
        slideMotor.setRunMode(Motor.RunMode.RawPower);
        slideMotor.resetEncoder();
    }

    public void setPower(double pwr) {
        double currentPos = slideMotor.getCurrentPosition();
        if (
                (pwr > 0 && currentPos < MAX_POS)
                    ||
                        (pwr < 0 && currentPos > MIN_POS)
        ) {
            slideMotor.set(pwr);
        } else return;
    }



}
