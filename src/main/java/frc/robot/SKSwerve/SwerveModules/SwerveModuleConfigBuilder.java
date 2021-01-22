package frc.robot.SKSwerve.SwerveModules;

import frc.robot.SKSwerve.Encoders.SKEncoder;
import frc.robot.SKSwerve.Motors.SKMotorController;

public class SwerveModuleConfigBuilder {

    public SKMotorController driveMotor = null;
    public SKMotorController steerMotor = null;
    public SKEncoder driveEncoder = null;
    public SKEncoder steerEncoder = null;
    public boolean driveInverted = false;
    public boolean steerInverted = false;
    public boolean driveEncoderInverted = false;
    public boolean steerEncoderInverted = false;
    public boolean driveEncoderInternal = false;
    public boolean steerEncoderInternal = false;
    public String name = "";

    /**
     * Set the drive motor
     * @param driveMotor to set to
     * @return a config builder with the adjusted settings
     */
    public SwerveModuleConfigBuilder setDriveMotor(SKMotorController driveMotor){
        this.driveMotor = driveMotor;
        return this;
    }

    /**
     * Set the steer motor
     * @param steerMotor to set to
     * @return a config builder with the adjusted settings
     */
    public SwerveModuleConfigBuilder setSteerMotor(SKMotorController steerMotor){
        this.steerMotor = steerMotor;
        return this;
    }

    /**
     * Set the drive encoder
     * @param skEncoder encoder to set
     * @return a config builder with the adjusted settings
     */
    public SwerveModuleConfigBuilder setDriveEncoder(SKEncoder skEncoder){
        this.driveEncoder = skEncoder;
        return this;
    }

    /**
     * Set the steer encoder
     * @param skEncoder encoder to set
     * @return a config builder with the adjusted settings
     */
    public SwerveModuleConfigBuilder setSteerEncoder(SKEncoder skEncoder){
        this.steerEncoder = skEncoder;
        return this;
    }

    /**
     * Set the drive motor inversion state
     * @param inverted whether to invert
     * @return a config builder with the adjusted settings
     */
    public SwerveModuleConfigBuilder setDriveInverted(boolean inverted){
        this.driveInverted = inverted;
        return this;
    }

    /**
     * Set the steer motor inversion state
     * @param inverted whether to invert
     * @return a config builder with the adjusted settings
     */
    public SwerveModuleConfigBuilder setSteerInverted(boolean inverted){
        this.steerInverted = inverted;
        return this;
    }

    /**
     * Set the drive encoder inversion state
     * @param inverted whether to invert
     * @return a config builder with the adjusted settings
     */
    public SwerveModuleConfigBuilder setDriveEncoderInverted(boolean inverted){
        this.driveEncoderInverted = inverted;
        return this;
    }

    /**
     * Set the steer encoder inverted state
     * @param inverted whether to invert
     * @return a config builder with the adjusted settings
     */
    public SwerveModuleConfigBuilder setSteerEncoderInverted(boolean inverted){
        this.steerEncoderInverted = inverted;
        return this;
    }

    /**
     * Set the drive encoder to use it's internal encoder
     * @param internal whether or not to use the interal encoder
     * @return the modified config
     */
    public SwerveModuleConfigBuilder setDriveEncoderInternal(boolean internal){
        this.driveEncoderInternal = internal;
        return this;
    }

    /**
     * Set whether the steer encoder is internal
     * @param internal whether the encoder is internal or not
     * @return the modified config
     */
    public SwerveModuleConfigBuilder setSteerEncoderInternal(boolean internal){
        this.steerEncoderInternal = internal;
        return this;
    }

    /**
     * Set the name of the module
     * @param name to set
     * @return a config builder with the adjusted settings
     */
    public SwerveModuleConfigBuilder setName(String name){
        this.name = name;
        return this;
    }

    /**
     * Build the given swerve configuration and return it
     * @return the swerve configuration
     * @throws Exception throws an exception when given an invalid configuration
     */
    public SwerveModuleConfig build() throws Exception {
        var config = new SwerveModuleConfig(
                driveMotor,
                steerMotor,
                driveEncoder,
                steerEncoder,
                driveInverted,
                steerInverted,
                driveEncoderInverted,
                steerEncoderInverted,
                driveEncoderInternal,
                steerEncoderInternal,
                name
        );

        config.verify(); //verify the configuration

        return config;
    }
}
