/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * first attempt at Drivetrain subsystem this drive train
 * will need talonsrx motor controllers dw
 */
public class Drivetrain extends Subsystem {

  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  // creating empty talon victor vessels for later initialization
  TalonSRX frontLeftTalon = null;
  TalonSRX frontRightTalon = null;
  VictorSPX middleLeftVictor = null;
  VictorSPX middleRightVictor = null;
  VictorSPX backLeftVictor = null;
  VictorSPX backRightVictor = null;

// now we need a constructor to populate the talons with constants from Robotmap
  public Drivetrain() {
      frontLeftTalon = new TalonSRX(RobotMap.DRIVETRAIN_FRONT_LEFT_TALON);
      frontRightTalon = new TalonSRX(RobotMap.DRIVETRAIN_FRONT_RIGHT_TALON);
      middleLeftVictor = new VictorSPX(RobotMap.DRIVETRAIN_MIDDLE_LEFT_VICTOR);
      middleRightVictor = new VictorSPX(RobotMap.DRIVETRAIN_MIDDLE_RIGHT_VICTOR);
      backLeftVictor =  new VictorSPX(RobotMap.DRIVETRAIN_BACK_LEFT_VICTOR);
      backRightVictor = new VictorSPX(RobotMap.DRIVETRAIN_BACK_RIGHT_VICTOR);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
