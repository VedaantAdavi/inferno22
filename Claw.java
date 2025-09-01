package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.Servo;

public class Claw {
    public static final double WRIST_MAX_POS = 0.8;
    public static final double WRIST_MIN_POSITION = -0.5;
    public static final double CLAW_OPEN_POS = 0.5;
    public static final  double CLAW_CLOSED_POS = 0.1;
    private Servo wristServo;
    private Servo clawServo;

    public Claw(Servo wristServo,  Servo clawServo) {
        this.wristServo = wristServo;
        this.clawServo = clawServo;
    }

    public void setWristPos(double pos) {
        wristServo.setPosition(pos);
    }
    public void setClawPos(double pos) {
        clawServo.setPosition(pos);

    }

}
