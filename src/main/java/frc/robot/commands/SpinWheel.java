/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Spinner;

public class SpinWheel extends CommandBase {
  Spinner spinner;
  boolean clockwise;

  public SpinWheel(Spinner subsystem, boolean isClockwise) {
    spinner = subsystem;
    clockwise = isClockwise;
    addRequirements(subsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    if (clockwise) {
      spinner.spinClockwise();
    }
    else {
      spinner.spinCClockwise();
    }
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return true;
  }
}
