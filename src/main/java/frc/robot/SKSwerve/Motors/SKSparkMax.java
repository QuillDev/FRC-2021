package frc.robot.SKSwerve.Motors;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import frc.robot.SKSwerve.Encoders.SKEncoder;
import frc.robot.SKSwerve.Encoders.SKSparkMaxEncoder;

public class SKSparkMax extends SKMotorController{

    private final CANSparkMax sparkMax;

    /**
     * Create a new SK Spark max with the given ID
     * @param id can id of the spark max
     */
    public SKSparkMax(int id){
        this.sparkMax = new CANSparkMax(id, CANSparkMaxLowLevel.MotorType.kBrushless);
    }

    @Override
    public void set(double speed) {
        this.sparkMax.set(speed);
    }

    @Override
    public void setInverted(boolean inverted) {
        this.sparkMax.setInverted(inverted);
    }

    @Override
    public SKEncoder getInternalEncoder() {
        return new SKSparkMaxEncoder(this.sparkMax);
    }

    /**
     * Get the base spark max for this wrapper
     * @return the spark max
     */
    public CANSparkMax getSparkMax(){
        return this.sparkMax;
    }

}
