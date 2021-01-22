package frc.robot.SKSwerve.Utilities;

public class SKMath {

    /**
     *
     * @param inches amount of inches to convert
     * @return the measurement in metres
     */
    public static double inchesToMetres(double inches){
        return inches * 0.0254;
    }

    /**
     * Convert the metres entered to inches
     * @param metres to convert
     * @return the amount of metres in inches
     */
    public static double metresToInches(double metres){
        return metres * 39.37007874015748031496062992126;
    }
}
