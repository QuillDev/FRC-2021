package frc.robot.SKSwerve.Encoders;

import frc.robot.SKSwerve.Utilities.SKMath;

public abstract class SKEncoder {

    protected double gearRatio;
    protected double outputDiameter;

    /**
     * Create the SK Encoder with custom properties
     * @param gearRatio of the gearbox
     * @param outputDiameter of the gearbox the encoder is on
     */
    SKEncoder(double gearRatio, double outputDiameter){
        this.gearRatio = gearRatio;
        this.outputDiameter = outputDiameter;
    }

    /**
     * Create an SK Encoder with the default properties
     */
    public SKEncoder(){
        this(1, SKMath.metresToInches(1));
    }

    /**
     * Get the current angle in degrees of the encoder
     * @return the angle of the encoder
     */
    public abstract double getAngleDegrees();

    /**
     * The current angle in radians of the encoder
     * @return the angle in radians of the encoder
     */
    public abstract double getAngleRadians();

    /**
     * Get the current velocity of the output the encoder is on
     * @return the velocity in metres per second
     */
    public abstract double getVelocity();

    /**
     * Get the current position in encoder units of the encoder
     * @return the position of the encoder
     */
    public abstract double getPositionEncoderUnits();
}
