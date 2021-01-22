package frc.robot.SKSwerve.Motors;

import frc.robot.SKSwerve.Encoders.SKEncoder;

public abstract class SKMotorController {
    public abstract void set(double speed);
    public abstract void setInverted(boolean inverted);
    public abstract SKEncoder getInternalEncoder();
}
