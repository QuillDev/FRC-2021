package frc.robot.SKSwerve.Encoders;

import com.ctre.phoenix.motorcontrol.SensorCollection;
import frc.robot.SKSwerve.Utilities.SKMath;

public class SKMagEncoder extends SKEncoder{

    private final SensorCollection encoder;
    private boolean inverted = false;

    public SKMagEncoder(SensorCollection encoder, double gearRatio, double outputDiameter){
        super(gearRatio, outputDiameter);
        this.encoder = encoder;
    }
    public SKMagEncoder(SensorCollection encoder){
        this.encoder = encoder;
    }

    @Override
    public double getAngleDegrees() {
        return this.getPositionEncoderUnits() / 4096 * 360;
    }

    @Override
    public double getAngleRadians() {
        return this.getPositionEncoderUnits() / 4096 * (2.0 * Math.PI);
    }

    @Override
    public double getVelocity() {
        return SKMath.inchesToMetres(this.encoder.getQuadratureVelocity() / 4096. / gearRatio * 10. * 2. * Math.PI * outputDiameter);
    }

    @Override
    public double getPositionEncoderUnits() {
        return this.encoder.getQuadraturePosition();
    }
}
