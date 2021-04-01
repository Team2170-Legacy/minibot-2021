// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.Drivetrain;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class MondrianMadnessAutonomous extends SequentialCommandGroup {
  private final Drivetrain m_drive;
  private final double fwd_speed = 1;
 
  
  /** Creates a new MondrianMadnessAutonomous. */
  public MondrianMadnessAutonomous(Drivetrain drive) {
    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());
    m_drive = drive;
    addRequirements(drive);
    addCommands(        
      new DriveDistance(fwd_speed, 16, m_drive),
      new TurnDegreesGyro(-90, m_drive),
      new DriveDistance(fwd_speed, 16, m_drive),
      new TurnDegreesGyro(-60, m_drive),
      new DriveDistance(fwd_speed, 24, m_drive),
      new TurnDegreesGyro(60, m_drive),
      new DriveDistance(fwd_speed, 16, m_drive),
      new TurnDegreesGyro(-90, m_drive),
      new DriveDistance(fwd_speed, 16, m_drive));

      
    /* 
    addCommands(        
    new DriveDistance(fwd_speed, 16, m_drive),
    new TurnDegrees(-turn_speed, 90, m_drive),
    new DriveDistance(fwd_speed, 16, m_drive),
    new TurnDegrees(-turn_speed, 60, m_drive),
    new DriveDistance(fwd_speed, 24, m_drive),
    new TurnDegrees(turn_speed, 60, m_drive),
    new DriveDistance(fwd_speed, 16, m_drive),
    new TurnDegrees(-turn_speed, 90, m_drive),
    new DriveDistance(fwd_speed, 16, m_drive));
    */
  }
}
