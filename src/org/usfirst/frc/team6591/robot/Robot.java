/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team6591.robot;
//import java.util.Map;

//import edu.wpi.first.wpilibj.Spark;
//import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

//import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.*;
//import edu.wpi.first.wpilibj.livewindow.LiveWindow;

public class Robot extends IterativeRobot {
	public static SpeedController driveTrainLeftFrontMotor;
    public static SpeedController driveTrainLeftRearMotor;
    public static SpeedController driveTrainRightFrontMotor;
    public static SpeedController driveTrainRightRearMotor;
    //public static SpeedController shooterFrontLeft; 
    //public static SpeedController shooterFrontRight;
    public static SpeedController shooterBack;
    public static SpeedController shooterAngle;
    public static SpeedController inTakeArmLeft;
    public static SpeedController inTakeArmRight;
    public static SpeedController climberWinch;
    public static SpeedController climberExtention;
    public static SpeedController climberAngle;
    public static SpeedController climberLockRelease;
    
    public static WPI_TalonSRX shooterFrontLeft;
    public static WPI_TalonSRX shooterFrontRight;


	
	Joystick ForwardBackwardStick = new Joystick(0);
	Joystick LeftRightStick = new Joystick(1);
	Joystick GameStick = new Joystick(2);
	
	SpeedControllerGroup leftMotors; //= new SpeedControllerGroup(driveTrainLeftFrontMotor,driveTrainLeftRearMotor);
	SpeedControllerGroup rightMotors; //= new SpeedControllerGroup(driveTrainRightFrontMotor,driveTrainRightRearMotor);
	
	DifferentialDrive myRobot;// = new DifferentialDrive(leftMotors,rightMotors);
	
	// Pneumatics

	

	public void robotInit() {
		
		//@SuppressWarnings("unused");
		driveTrainLeftFrontMotor = new VictorSP(0);
	    driveTrainLeftFrontMotor.setInverted(false);
        //LiveWindow.addActuator("DriveTrain", "LeftFrontMotor", (VictorSP) driveTrainLeftFrontMotor);
        
        driveTrainLeftRearMotor = new VictorSP(1);
        driveTrainLeftRearMotor.setInverted(false);
        //LiveWindow.addActuator("DriveTrain", "LeftRearMotor", (VictorSP) driveTrainLeftRearMotor);
        
        driveTrainRightFrontMotor = new VictorSP(2);
        driveTrainRightFrontMotor.setInverted(false);	        
        //LiveWindow.addActuator("DriveTrain", "RightFrontMotor", (VictorSP) driveTrainRightFrontMotor);
        
        driveTrainRightRearMotor = new VictorSP(3);
        driveTrainRightRearMotor.setInverted(false);
        //LiveWindow.addActuator("DriveTrain", "RightRearMotor", (VictorSP) driveTrainRightRearMotor);
        
//       driveTrainRobotDrive = new RobotDrive(driveTrainLeftFrontMotor, driveTrainLeftRearMotor, driveTrainRightFrontMotor, driveTrainRightRearMotor);       
//        driveTrainRobotDrive.setSafetyEnabled(true);
//        driveTrainRobotDrive.setExpiration(0.1);
//        driveTrainRobotDrive.setSensitivity(0.5);
//        driveTrainRobotDrive.setMaxOutput(1.0);

       //Shooter
        shooterFrontLeft = new WPI_TalonSRX(0);
       // LiveWindow.addActuator("Shooter", "FrontLeft", (Talon) shooterFrontLeft);
        shooterFrontRight = new WPI_TalonSRX(1);
        //LiveWindow.addActuator("Shooter", "FrontRight", (Talon) shooterFrontRight);
	    shooterBack = new VictorSP(4);
	    //LiveWindow.addActuator("Shooter", "Back", (VictorSP) shooterBack);

        shooterAngle = new VictorSP(5); 
        //LiveWindow.addActuator("Shooter", "Angle", (VictorSP) shooterAngle);
        
        //In take arms
        inTakeArmLeft = new Spark(9);
        //LiveWindow.addActuator("InTake", "ArmLeft", (Spark) inTakeArmLeft);
        inTakeArmRight = new Spark(8);
        //LiveWindow.addActuator("InTake", "ArmRight", (Spark) inTakeArmRight);
        
        //Climber/Arm
        climberWinch = new VictorSP(6);
        //LiveWindow.addActuator("Climber", "Winch", (VictorSP) climberWinch);
        climberExtention = new Spark(7);
        //LiveWindow.addActuator("Climber", "Extention", (Spark) climberExtention);
        //VictorSP climberAngle = new VictorSP(15);
        //LiveWindow.addActuator("Climber", "Angle", (VictorSP) climberAngle);
        //VictorSP climberLockRelease = new VictorSP(16);
        //LiveWindow.addActuator("Climber", "LockRelease", (VictorSP) climberLockRelease);
		
		

		/*DoubleSolenoid inTakeArmsDouble = new DoubleSolenoid(1, 2);
		
		inTakeArmsDouble.set(DoubleSolenoid.Value.kOff);
		inTakeArmsDouble.set(DoubleSolenoid.Value.kForward);
		inTakeArmsDouble.set(DoubleSolenoid.Value.kReverse);
		
		DoubleSolenoid shooterLockDouble = new DoubleSolenoid(3, 4);
		
		shooterLockDouble.set(DoubleSolenoid.Value.kOff);
		shooterLockDouble.set(DoubleSolenoid.Value.kForward);
		shooterLockDouble.set(DoubleSolenoid.Value.kReverse);
		leftMotors = new SpeedControllerGroup(driveTrainLeftFrontMotor,driveTrainLeftRearMotor);
		rightMotors = new SpeedControllerGroup(driveTrainRightFrontMotor,driveTrainRightRearMotor);
		myRobot = new DifferentialDrive(leftMotors,rightMotors);
		*/
        
        leftMotors= new SpeedControllerGroup(driveTrainLeftFrontMotor,driveTrainLeftRearMotor);
    	rightMotors= new SpeedControllerGroup(driveTrainRightFrontMotor,driveTrainRightRearMotor);
    	
    	myRobot = new DifferentialDrive(leftMotors,rightMotors);
	}

	/**
	 * This function is run once each time the robot enters autonomous mode.
	 */
	@Override
	public void autonomousInit() {
		//m_timer.reset();
		//m_timer.start();
	}

	/**
	 * This function is called periodically during autonomous.
	 */
	@Override
	public void autonomousPeriodic() {
		
	}

	/**
	 * This function is called once each time the robot enters teleoperated mode.
	 */
	@Override
	public void teleopInit() {
	}

	/**
	 * This function is called periodically during teleoperated mode.
	 */
	@Override
	public void teleopPeriodic() {
		
		double  ForwardBackwardDrive = ForwardBackwardStick.getRawAxis(1);
		double  TurnDrive = LeftRightStick.getRawAxis(0);

		
		myRobot.arcadeDrive(ForwardBackwardDrive, TurnDrive);
		
		/*
		
		
		 driveTrainLeftFrontMotor.set(ForwardBackwardDrive);
		 driveTrainLeftRearMotor.set(ForwardBackwardDrive);
		 driveTrainRightFrontMotor.set(ForwardBackwardDrive);
		 driveTrainRightRearMotor.set(ForwardBackwardDrive);
		
		 driveTrainLeftFrontMotor.set(TurnDrive);
		 driveTrainLeftRearMotor.set(TurnDrive);
		 driveTrainRightFrontMotor.set(TurnDrive);
		 driveTrainRightRearMotor.set(TurnDrive);
		
		
		*/
	//Luke was here	
	

		if(GameStick.getRawButton(3)) {
			Robot.shooterAngle.set(1);
			Robot.shooterFrontLeft.set(1);
			Robot.shooterFrontRight.set(1);
			Robot.shooterBack.set(1);
		}
		else if(GameStick.getRawButton(4)) {
			Robot.shooterAngle.set(1);
			Robot.shooterFrontLeft.set(0.5);
			Robot.shooterFrontRight.set(0.5);
			Robot.shooterBack.set(1);
		}
		else {
			Robot.shooterAngle.set(0);
			Robot.shooterFrontLeft.set(0);
			Robot.shooterFrontRight.set(0);
			Robot.shooterBack.set(0);
		}
		
		if(GameStick.getRawButton(5)) {
			Robot.inTakeArmRight.set(-1);
			Robot.inTakeArmLeft.set(1);
		}
		else if(GameStick.getRawButton(6)) {
			Robot.inTakeArmLeft.set(-1);
			Robot.inTakeArmRight.set(1);
		}
		else {
			Robot.inTakeArmLeft.set(0);
			Robot.inTakeArmRight.set(0);
		}
		
		if(GameStick.getRawButton(7)) {
			Robot.inTakeArmLeft.set(-1);
			Robot.inTakeArmRight.set(-1);
		}
		else {
			Robot.inTakeArmLeft.set(0);
			Robot.inTakeArmRight.set(0);
		}
		if(GameStick.getRawButton(8)){
			Robot.inTakeArmLeft.set(1);
			Robot.inTakeArmRight.set(1);
			Robot.shooterFrontLeft.set(1);
			Robot.shooterFrontRight.set(1);
			Robot.shooterBack.set(1);
		}
		else {
			Robot.inTakeArmLeft.set(0);
			Robot.inTakeArmRight.set(0);
			Robot.shooterFrontLeft.set(0);
			Robot.shooterFrontRight.set(0);
			Robot.shooterBack.set(0);
		}
		
		if(GameStick.getRawButton(9)) {
			Robot.shooterAngle.set(1);
		}
		else {
			Robot.shooterAngle.set(0);
		}
		
		if(GameStick.getRawButton(10)) {
			
		}
		else {
			
		}
		
		if(GameStick.getRawButton(11)) {
			Robot.shooterAngle.set(-1);
		}
		else {
			Robot.shooterAngle.set(0);
		}
		
		if(GameStick.getRawButton(12)) {
			
		}
		else {
			
		}
}
	/**
	 * This function is called periodically during test mode.
	 */
	@Override
	public void testPeriodic() {
	}
}