package frc.robot.SKSwerve.Encoders;

import com.revrobotics.CANEncoder;
import com.revrobotics.CANSparkMax;

public class SKSparkMaxEncoder extends SKEncoder{

    private final CANEncoder encoder; // The CANEncoder of the spark max / wherever we got it from

    /**
     * Create a spark max encoder from a CANEncoder, the output diameter of the system, and the gear ratio of the system
     * @param encoder to get input from
     * @param outputDiameter of the system
     * @param gearRatio of the gearbox
     */
    public SKSparkMaxEncoder(CANEncoder encoder, double outputDiameter, double gearRatio){
        super(gearRatio, outputDiameter);
        this.encoder = encoder;
        this.encoder.setVelocityConversionFactor(1/(60. * gearRatio) * ( Math.PI * outputDiameter * 0.0254));
    }

    /**
     * Crete a spark max encoder from a max's CANEncoder
     * @param encoder to get the output from
     */
    public SKSparkMaxEncoder(CANEncoder encoder){
        this.encoder = encoder;
    }

    /**
     * Create a spark max encoder from a spark max, an output diameter, and a gear ratio
     * @param sparkMax the max to get the encoder input from
     * @param outputDiameter of the shaft for velocity calculations
     * @param gearRatio for velocity calculations
     */
    public SKSparkMaxEncoder(CANSparkMax sparkMax, double outputDiameter, double gearRatio){
        this(sparkMax.getEncoder(), outputDiameter, gearRatio);
    }

    /**
     * Create a new Spark Max encoder with a gear ratio of 1.0 and a output diameter of 1 metre (used in velocity calculation)
     * @param sparkMax The spark max motor controller to get the encoder from
     */
    public SKSparkMaxEncoder(CANSparkMax sparkMax){
        this(sparkMax.getEncoder());
    }

    /**
     * Set this encoder to be inverted
     * @param inverted whether the encoder is inverted or not
     */
    public void setInverted(boolean inverted){
        this.encoder.setInverted(inverted);
    }

    @Override
    public double getAngleDegrees() {
        return this.getPositionEncoderUnits() % 360.;
    }

    @Override
    public double getAngleRadians() {
        return this.getPositionEncoderUnits() % (Math.PI * 2.);
    }

    @Override
    public double getVelocity() {
        return this.encoder.getVelocity();
    }

    @Override
    public double getPositionEncoderUnits() {
        return this.encoder.getPosition() * encoder.getCountsPerRevolution();
    }
}
