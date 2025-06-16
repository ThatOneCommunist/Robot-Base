package frc.robot.subsystems.drive;

import com.ctre.phoenix6.configs.CANcoderConfiguration;
import com.revrobotics.spark.config.SparkMaxConfig;

import frc.robot.Constants;

public class HardwareConfigs {
    public SparkMaxConfig driveConfig = new SparkMaxConfig();
    public SparkMaxConfig turnConfig = new SparkMaxConfig();
    public CANcoderConfiguration EncoderConfig = new CANcoderConfiguration();

    public HardwareConfigs(){

        //Swerve angle motor config
        //Motor inverts and nuetral modes
        turnConfig.inverted(Constants.HardwareConfigs.turnMotorInvert);
        turnConfig.idleMode(Constants.HardwareConfigs.turnNuetralMode);
 
        //Gear ratio and wrapping config
        turnConfig.encoder.positionConversionFactor(360/Constants.HardwareConfigs.turnGearRatio);
        turnConfig.encoder.velocityConversionFactor(Constants.HardwareConfigs.turnGearRatio / 60);
        turnConfig.closedLoop.positionWrappingEnabled(true);
 
        //current limiting
        turnConfig.smartCurrentLimit(40);
 
        //PID config
        driveConfig.closedLoop.p(Constants.HardwareConfigs.driveKP);
        driveConfig.closedLoop.i(Constants.HardwareConfigs.driveKI);
        driveConfig.closedLoop.d(Constants.HardwareConfigs.driveKD);
 
        //Swerve drive motor config
        //Motor inverts and nuetral modes
        driveConfig.inverted(Constants.HardwareConfigs.driveMotorInvert);
        driveConfig.idleMode(Constants.HardwareConfigs.driveNuetralMode);
 
        //Gear ratio and wrapping config
        driveConfig.encoder.positionConversionFactor(Constants.HardwareConfigs.wheelCircumference / Constants.HardwareConfigs.driveGearRatio);
        driveConfig.closedLoop.positionWrappingEnabled(true);
 
        //current limiting
        driveConfig.smartCurrentLimit(40);

 
    }
}
