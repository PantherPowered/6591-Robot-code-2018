package org.usfirst.frc.team6591.robot;

import edu.wpi.first.wpilibj.VictorSP;
//import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.DoubleSolenoid;
//import edu.wpi.first.wpilibj.livewindow.LiveWindow;
//import edu.wpi.first.wpilibj.IterativeRobotBase;
import edu.wpi.first.wpilibj.Spark; 
//import edu.wpi.first.wpilibj.IterativeRobot;


//import edu.wpi.first.wpilibj.Compressor;
public class RobotMap {
    public static final int ShootScale = 3; 
    public static final int ShootSwitch = 4;
    public static final int FidgetCounterClockWise = 6; 
    public static final int FidgetClockWise = 5;
    public static final int InTake = 8;
    public static final int Expell = 7;
    public static final int ArmsUp = 10;
    public static final int ArmsDown = 12;
    public static final int ShooterUp = 9;
    public static final int ShooterDown = 11;
    public static final int inTakeArmsUpDown = 1;
    public static final int ShooterLockUp = 2;
    
//@SuppressWarnings("deprecation")
    //public static void init()
	/*{
		//TODO: add the rear drive motors back to the arcade drive
		    driveTrainLeftFrontMotor = new VictorSP(0);
		    driveTrainLeftFrontMotor.setInverted(false);
	        LiveWindow.addActuator("DriveTrain", "LeftFrontMotor", (VictorSP) driveTrainLeftFrontMotor);
	        
	        driveTrainLeftRearMotor = new VictorSP(1);
	        driveTrainLeftRearMotor.setInverted(false);
	        LiveWindow.addActuator("DriveTrain", "LeftRearMotor", (VictorSP) driveTrainLeftRearMotor);
	        
	        driveTrainRightFrontMotor = new VictorSP(2);
	        driveTrainRightFrontMotor.setInverted(false);	        
	        LiveWindow.addActuator("DriveTrain", "RightFrontMotor", (VictorSP) driveTrainRightFrontMotor);
	        
	        driveTrainRightRearMotor = new VictorSP(3);
	        driveTrainRightRearMotor.setInverted(false);
	        LiveWindow.addActuator("DriveTrain", "RightRearMotor", (VictorSP) driveTrainRightRearMotor);
	        
//	       driveTrainRobotDrive = new RobotDrive(driveTrainLeftFrontMotor, driveTrainLeftRearMotor, driveTrainRightFrontMotor, driveTrainRightRearMotor);       
//	        driveTrainRobotDrive.setSafetyEnabled(true);
//	        driveTrainRobotDrive.setExpiration(0.1);
//	        driveTrainRobotDrive.setSensitivity(0.5);
//	        driveTrainRobotDrive.setMaxOutput(1.0);

	       //Shooter
	        //Talon shooterFrontLeft = new Talon();
	       // LiveWindow.addActuator("Shooter", "FrontLeft", (Talon) shooterFrontLeft);
	        //Talon shooterFrontRight = new Talon();
	        //LiveWindow.addActuator("Shooter", "FrontRight", (Talon) shooterFrontRight);
		    VictorSP shooterBack = new VictorSP(4);
		    LiveWindow.addActuator("Shooter", "Back", (VictorSP) shooterBack);

	        VictorSP shooterAngle = new VictorSP(5); 
	        LiveWindow.addActuator("Shooter", "Angle", (VictorSP) shooterAngle);
	        
	        //In take arms
	        Spark inTakeArmLeft = new Spark(9);
	        LiveWindow.addActuator("InTake", "ArmLeft", (Spark) inTakeArmLeft);
	        Spark inTakeArmRight = new Spark(8);
	        LiveWindow.addActuator("InTake", "ArmRight", (Spark) inTakeArmRight);
	        
	        //Climber/Arm
	        VictorSP climberWinch = new VictorSP(6);
	        LiveWindow.addActuator("Climber", "Winch", (VictorSP) climberWinch);
	        Spark climberExtention = new Spark(7);
	        LiveWindow.addActuator("Climber", "Extention", (Spark) climberExtention);
	        //VictorSP climberAngle = new VictorSP(15);
	        //LiveWindow.addActuator("Climber", "Angle", (VictorSP) climberAngle);
	        //VictorSP climberLockRelease = new VictorSP(16);
	        LiveWindow.addActuator("Climber", "LockRelease", (VictorSP) climberLockRelease);
	        
	*/
//}
{
	        //pneumatics
	    	//Compressor  comp1 = new Compressor();




}
}