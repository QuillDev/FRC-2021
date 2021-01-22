package frc.robot.SKSim;

import frc.robot.SKSwerve.Encoders.SKEncoder;

public class SKSimEncoder extends SKEncoder {

    public double position = 0;
    public double encoderUnits = 4096;

    /**
     * Create a new simulated encoder
     */
    public SKSimEncoder(){
        super();
    }

    @Override
    public double getAngleDegrees() {
        return getPositionEncoderUnits() / encoderUnits % 360;
    }

    @Override
    public double getAngleRadians() {
        return getPositionEncoderUnits() / encoderUnits % (2.0 * Math.PI);
    }

    @Override
    public double getVelocity() {
        return 0;
    }

    @Override
    public double getPositionEncoderUnits() {
        return position;
    }
}
