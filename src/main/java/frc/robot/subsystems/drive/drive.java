package frc.robot.subsystems.drive;

import com.studica.frc.AHRS;
import com.studica.frc.AHRS.NavXComType;

import edu.wpi.first.math.kinematics.SwerveDriveOdometry;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class drive extends SubsystemBase{
    private final ModuleHardware[] modules;
    private final SwerveDriveOdometry swerveOdometry;
    private final AHRS gyro;
    private public drive(){
        gyro = new AHRS(NavXComType.kMXP_SPI);
        modules = new ModuleHardware[]{
            new ModuleHardware(1);
            new ModuleHardware(2);
            new ModuleHardware(3);
            new ModuleHardware(4);
        };
        swerveOdometry = new SwerveDriveOdometry(Constants.kswerve.KINEMATICS, gyro.getYaw(), );
    }
}
