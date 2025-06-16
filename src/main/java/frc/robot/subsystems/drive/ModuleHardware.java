package frc.robot.subsystems.drive;

import com.ctre.phoenix6.hardware.CANcoder;
import com.ctre.phoenix6.swerve.SwerveModule;
import com.revrobotics.AbsoluteEncoder;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkBase.ResetMode;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import frc.robot.Constants.ModuleConstant;

public class ModuleHardware{
    private HardwareConfigs hardwareConfigs;

    private SparkMax mdriveMotor; // Introduce the Motors
    private SparkMax mturnMotor;

    private RelativeEncoder relDriveEncoder; // Introduce the Relative Encoders
    private RelativeEncoder relTurnEncoder;

    private CANcoder absoulteEncoder; // Introduce the CANcoder

    public ModuleHardware(int module){
        switch(module){
            case 1 : 
            mdriveMotor = new SparkMax(ModuleConstant.FR_DRIVE,MotorType.kBrushless);
            mturnMotor = new SparkMax(ModuleConstant.FR_TURN,MotorType.kBrushless);
            absoulteEncoder = new CANcoder(ModuleConstant.FR_ENCODER);
            case 2 :
            mdriveMotor = new SparkMax(ModuleConstant.FL_DRIVE,MotorType.kBrushless);
            mturnMotor = new SparkMax(ModuleConstant.FL_TURN,MotorType.kBrushless);
            absoulteEncoder = new CANcoder(ModuleConstant.FL_ENCODER);
            case 3 :
            mdriveMotor = new SparkMax(ModuleConstant.BR_DRIVE,MotorType.kBrushless);
            mturnMotor = new SparkMax(ModuleConstant.BR_TURN,MotorType.kBrushless);
            absoulteEncoder = new CANcoder(ModuleConstant.BR_ENCODER);
            case 4 :
            mdriveMotor = new SparkMax(ModuleConstant.BL_DRIVE,MotorType.kBrushless);
            mturnMotor = new SparkMax(ModuleConstant.BL_TURN,MotorType.kBrushless);
            absoulteEncoder = new CANcoder(ModuleConstant.BL_ENCODER);
        }
        mdriveMotor.configure(hardwareConfigs.driveConfig,ResetMode.kResetSafeParameters ,PersistMode.kPersistParameters);
        mturnMotor.configure(hardwareConfigs.turnConfig, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
        
    }
}

