package frc.robot.SKSwerve.Motors;

import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import frc.robot.SKSwerve.Encoders.SKEncoder;
import frc.robot.SKSwerve.Encoders.SKMagEncoder;

public class SKTalonSRX extends SKMotorController {

    private final TalonSRX talonSRX;

    /**
     * Create a new TalonSRX at the given id
     * @param id of the talon srx
     */
    public SKTalonSRX(int id){
        this.talonSRX = new TalonSRX(id);
    }

    @Override
    public void set(double speed) {
        this.talonSRX.set(TalonSRXControlMode.PercentOutput, speed);
    }

    @Override
    public void setInverted(boolean inverted) {
        this.talonSRX.setInverted(inverted);
    }

    /**
     * Get the talon from this wrapper
     * @return the talon
     */
    public TalonSRX getTalonSRX() {
        return this.talonSRX;
    }

    @Override
    public SKEncoder getInternalEncoder() {
        return new SKMagEncoder(this.talonSRX.getSensorCollection());
    }
}
