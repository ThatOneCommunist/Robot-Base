// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;

import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.kinematics.SwerveDriveKinematics;
import edu.wpi.first.math.util.Units;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }

  public static class ModuleConstant{
    public static final int FR_DRIVE = 1; // Each CAN Device needs their own ID
    public static final int FR_TURN = 2;
    public static final int FR_ENCODER = 3;

    public static final int FL_DRIVE = 4;
    public static final int FL_TURN = 5;
    public static final int FL_ENCODER = 6;

    public static final int BR_DRIVE = 7;
    public static final int BR_TURN = 8;
    public static final int BR_ENCODER = 9;

    public static final int BL_DRIVE = 10;
    public static final int BL_TURN = 11;
    public static final int BL_ENCODER = 12;
  }

  public static class HardwareConfigs{
    public static final boolean turnMotorInvert = false;
    public static final IdleMode turnNuetralMode = IdleMode.kBrake;
    public static final double turnGearRatio = 5.67;
  

    public static final double driveKP = .01;
    public static final double driveKI = 0;
    public static final double driveKD = 0;
    public static final boolean driveMotorInvert = false;
    public static final IdleMode driveNuetralMode = IdleMode.kBrake;
    public static final double driveGearRatio = 5.67; //placeholder numbers
    public static final double wheelCircumference = 5.67;
  }
  public static class kswerve{
    public static final double TRACK_WIDTH = Units.inchesToMeters(19.5); // Width of the drivetrain measured from the middle of the wheels.
    public static final double WHEEL_BASE = Units.inchesToMeters(19.5); // Length of the drivetrain measured from the middle of the wheels.
    public static final double WHEEL_DIAMETER = Units.inchesToMeters(4);
    public static final double WHEEL_CIRCUMFERENCE = WHEEL_DIAMETER * Math.PI;

    public static final SwerveDriveKinematics KINEMATICS = new SwerveDriveKinematics(
      new Translation2d(WHEEL_BASE / 2.0, TRACK_WIDTH / 2.0),
      new Translation2d(WHEEL_BASE / 2.0, -TRACK_WIDTH / 2.0),
      new Translation2d(-WHEEL_BASE / 2.0, TRACK_WIDTH / 2.0),
      new Translation2d(-WHEEL_BASE / 2.0, -TRACK_WIDTH / 2.0)
    );
  }
}
