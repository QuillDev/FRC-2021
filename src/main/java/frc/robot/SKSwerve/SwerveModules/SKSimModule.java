package frc.robot.SKSwerve.SwerveModules;

public class SKSimModule extends SwerveModule{

    public double angle = 0;
    public double velocity = 0;

    /**
     * Create a new simulated swerve module
     * @param config of the module we're simulating
     */
    public SKSimModule(SwerveModuleConfig config) {
        super(config);
    }

    @Override
    public void setPosition(double angle, double velocity) {
        this.angle = angle;
        this.velocity = velocity;
    }
}
