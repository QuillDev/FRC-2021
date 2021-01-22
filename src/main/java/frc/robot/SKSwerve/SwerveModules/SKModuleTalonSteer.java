package frc.robot.SKSwerve.SwerveModules;

import frc.robot.SKSwerve.Motors.SKTalonSRX;

public class SKModuleTalonSteer extends SwerveModule{

    /**
     * Create a swerve module that's using a talon for steering
     * @param config of the module
     */
    public SKModuleTalonSteer(SwerveModuleConfig config) {
        super(config);
        ( (SKTalonSRX) config.steerMotor ).getTalonSRX().setSensorPhase(config.steerInverted);
    }

    @Override
    public void setPosition(double angle, double velocity) {

    }
}
