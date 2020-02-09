/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import frc.robot.subsystems.Spinner;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.Spin360;
import frc.robot.commands.SpinColor;
import frc.robot.commands.SpinWheel;
import frc.robot.commands.StopWheel;

/**
 * This class is where the bulk of the robot should be declared.  Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls).  Instead, the structure of the robot
 * (including subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final XboxController controller = new XboxController(0);
  private final static Spinner spinner = new Spinner();

  public RobotContainer() {
    configureButtonBindings();
  }

  private void configureButtonBindings() {
    new JoystickButton(controller, XboxController.Button.kA.value)
    .whenPressed(new SpinWheel(spinner, true));

    new JoystickButton(controller, XboxController.Button.kB.value)
    .whenPressed(new SpinWheel(spinner, false));

    new JoystickButton(controller, XboxController.Button.kA.value)
    .whenReleased(new StopWheel(spinner));

    new JoystickButton(controller, XboxController.Button.kB.value)
    .whenReleased(new StopWheel(spinner));
    
    new JoystickButton(controller, XboxController.Button.kX.value)
    .whenPressed(new Spin360(spinner, 1));

    new JoystickButton(controller, XboxController.Button.kY.value)
    .whenPressed(new SpinColor(spinner, "Blue"));

  }
}
