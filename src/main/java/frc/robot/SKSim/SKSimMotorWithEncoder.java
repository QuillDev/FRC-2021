package frc.robot.SKSim;

import frc.robot.SKSwerve.Encoders.SKEncoder;

public class SKSimMotorWithEncoder extends SKSimMotor{

    private final SKEncoder encoder = new SKSimEncoder();

    public SKSimMotorWithEncoder(int port) {
        super(port);
    }

    @Override
    public SKEncoder getInternalEncoder(){
        return this.encoder;
    }
}
