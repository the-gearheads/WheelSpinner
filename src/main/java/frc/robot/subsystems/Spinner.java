/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class Spinner extends SubsystemBase {
  private final CANSparkMax spinnerMotor;

  public Spinner() {
    spinnerMotor = new CANSparkMax(15, MotorType.kBrushless);
  }

  public void spinClockwise() {
    spinnerMotor.set(-0.5);
  }

  public void spinCClockwise() {
    spinnerMotor.set(0.5);
  }

  public void stop() {
    spinnerMotor.set(0);
  }
}
