// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.kinematics.DifferentialDriveKinematics;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide
 * numerical or boolean constants. This class should not be used for any other
 * purpose. All constants should be declared globally (i.e. public static). Do
 * not put anything functional in this class.
 *
 * <p>
 * It is advised to statically import this class (or one of its inner classes)
 * wherever the constants are needed, to reduce verbosity.
 */
public final class Constants {

        
    /*
        TODO: Tune these values, these are only examples

        Constansts Copied From Here: https://docs.wpilib.org/en/stable/docs/software/examples-tutorials/trajectory-tutorial/entering-constants.html

        Execute: C:\Users\GEH-Magnet School 1\Desktop\frc-characterization-main\frc-characterization-main\frc_characterization\cli

        
    */

    
    public static final double ksVolts = 0.929;
    public static final double kvVoltSecondsPerMeter = 6.33;
    public static final double kaVoltSecondsSquaredPerMeter = 0.0389;

    public static final double kPDriveVel = 0.085;

    public static final double kTrackwidthMeters = 0.142072613;
    public static final DifferentialDriveKinematics kDriveKinematics = new DifferentialDriveKinematics(kTrackwidthMeters);

    // Max Trajectory Velocity/Acceleration
    public static final double kMaxSpeedMetersPerSecond = 0.8;
    public static final double kMaxAccelerationMetersPerSecondSquared = 0.8;

    // Reasonable baseline values for a RAMSETE follower in units of meters and seconds
    public static final double kRamseteB = 2;
    public static final double kRamseteZeta = 0.7;


    // This is the max Speed for the teleoperated Robot

    /*  
        The PERFECT ratio is 4 : 3 = SpeedInput : RotationInput
    */
    public static final double maxSpeedInput = 1; // 1

    // This is the max Rotation for the teleoperated Robot
    public static final double maxRotationalInput = 0.87; //0.87
}
