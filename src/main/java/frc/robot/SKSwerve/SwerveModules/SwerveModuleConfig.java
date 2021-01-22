package frc.robot.SKSwerve.SwerveModules;

import frc.robot.SKSwerve.Encoders.SKEncoder;
import frc.robot.SKSwerve.Motors.SKMotorController;

public class SwerveModuleConfig {

    public SKMotorController driveMotor;
    public SKMotorController steerMotor;
    public SKEncoder driveEncoder;
    public SKEncoder steerEncoder;
    public boolean driveInverted;
    public boolean steerInverted;
    public boolean driveEncoderInverted;
    public boolean steerEncoderInverted;
    public boolean driveEncoderInternal;
    public boolean steerEncoderInternal;
    public String name;

    public SwerveModuleConfig(SKMotorController driveMotor,
                              SKMotorController steerMotor,
                              SKEncoder driveEncoder,
                              SKEncoder steerEncoder,
                              boolean driveInverted,
                              boolean steerInverted,
                              boolean driveEncoderInverted,
                              boolean steerEncoderInverted,
                              boolean driveEncoderInternal,
                              boolean steerEncoderInternal,
                              String name
    )
    {
        // Motors
        this.driveMotor = driveMotor;
        this.steerMotor = steerMotor;

        // Encoders
        this.driveEncoder = driveEncoder;
        this.steerEncoder = steerEncoder;

        //Whether motors are inverted
        this.driveInverted = driveInverted;
        this.steerInverted = steerInverted;

        //Whether encoders are inverted
        this.driveEncoderInverted = driveEncoderInverted;
        this.steerEncoderInverted = steerEncoderInverted;

        //Whether encoders are internal
        this.driveEncoderInternal = driveEncoderInternal;
        this.steerEncoderInternal = steerEncoderInternal;

        //Set the modules name
        this.name = name;
    }

    /**
     * Try to verify whether the motor is valid
     * @throws Exception throws an exception if the configuration for the module is invalid
     */
    public void verify() throws Exception {

        //Check if the drive / steer motors are null
        if(this.driveMotor == null){
            throw new Exception( "Did not specify drive motor!");
        }
        else if(this.steerMotor == null){
            throw new Exception( "Did not specify steer motor!");
        }

        //check if we're trying to use an internal encoder
        if(driveEncoderInternal){
            this.driveEncoder = driveMotor.getInternalEncoder();
        }
        if(steerEncoderInternal){
            this.steerEncoder = steerMotor.getInternalEncoder();
        }

        //Check if encoders are null
        if(this.steerEncoder == null){
            throw new Exception( "Did not specify a steer encoder");
        }
        else if(this.driveEncoder == null){
            throw new Exception("Did not specify a drive encoder");
        }
    }
}
