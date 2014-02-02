import java.io.File;
import java.util.Formatter;
import java.util.Scanner;
public class Robot 
{
	private int teamID;
	private int assists;
	private int topGoalAttempts;
	private int topGoalScores;
	private int topGoalRatio;
	private int bottomGoal;
	private int bottomGoalAttempts;
	private int bottomGoalRatio;
	private File mobilityNotes = new File(teamID + "mobility.txt");
	private File shootingNotes = new File(teamID + "shooting.txt");
	private File blockingNotes = new File(teamID + "blocking.txt");
	private File passingNotes = new File(teamID + "passing.txt");
	private File wheelNotes = new File(teamID + "wheel.txt");
	private Scanner mobilityScanner;
	private Scanner shootingScanner;
	private Scanner blockingScanner;
	private Scanner passingScanner;
	private Scanner wheelScanner;
	private Formatter mobilityFormatter;
	private Formatter shootingFormatter;
	private Formatter blockingFormatter;
	private Formatter passingFormatter;
	private Formatter wheelFormatter;
	private double overallScore;
	public Robot(int teamNum) 
	{
		try 
		{
			mobilityScanner = new Scanner(mobilityNotes);
			shootingScanner = new Scanner(shootingNotes);
			blockingScanner = new Scanner(blockingNotes);
			passingScanner = new Scanner(passingNotes);
			wheelScanner = new Scanner(wheelNotes);
			mobilityFormatter = new Formatter(mobilityNotes);
			shootingFormatter = new Formatter(shootingNotes);
			blockingFormatter = new Formatter(blockingNotes);
			passingFormatter = new Formatter(passingNotes);
			wheelFormatter = new Formatter(wheelNotes);
		} catch(Exception e) 
		{
			System.out.println("File not found");
		}
		teamID = teamNum;
	}
	public void generateOverallScore()
	{
		overallScore = topGoalScores;//ADD REAL STUFF
	}
	public int getTeamID() 
	{
		return teamID;
	}
	public void setTeamID(int teamID) 
	{
		this.teamID = teamID;
	}
	public int getAssists() 
	{
		return assists;
	}
	public void setAssists(int assists) 
	{
		this.assists = assists;
	}
	public int getTopGoalAttempts() 
	{
		return topGoalAttempts;
	}
	public void setTopGoalAttempts(int topGoalAttempts) 
	{
		this.topGoalAttempts = topGoalAttempts;
	}
	public int getTopGoalScores() 
	{
		return topGoalScores;
	}
	public void setTopGoalScores(int topGoalScores) 
	{
		this.topGoalScores = topGoalScores;
	}
	public int getTopGoalRatio() 
	{
		return topGoalRatio;
	}
	public void setTopGoalRatio(int topGoalRatio) 
	{
		this.topGoalRatio = topGoalRatio;
	}
	public int getBottomGoal() 
	{
		return bottomGoal;
	}
	public void setBottomGoal(int bottomGoal) 
	{
		this.bottomGoal = bottomGoal;
	}
	public int getBottomGoalAttempts() 
	{
		return bottomGoalAttempts;
	}
	public void setBottomGoalAttempts(int bottomGoalAttempts) 
	{
		this.bottomGoalAttempts = bottomGoalAttempts;
	}
	public int getBottomGoalRatio() 
	{
		return bottomGoalRatio;
	}
	public void setBottomGoalRatio(int bottomGoalRatio) 
	{
		this.bottomGoalRatio = bottomGoalRatio;
	}
	public File getMobilityNotes() 
	{
		return mobilityNotes;
	}
	public void setMobilityNotes(File mobilityNotes) 
	{
		this.mobilityNotes = mobilityNotes;
	}
	public File getShootingNotes() 
	{
		return shootingNotes;
	}
	public void setShootingNotes(File shootingNotes) 
	{
		this.shootingNotes = shootingNotes;
	}
	public File getBlockingNotes() 
	{
		return blockingNotes;
	}
	public void setBlockingNotes(File blockingNotes) 
	{
		this.blockingNotes = blockingNotes;
	}
	public File getPassingNotes() 
	{
		return passingNotes;
	}
	public void setPassingNotes(File passingNotes) 
	{
		this.passingNotes = passingNotes;
	}
	public File getWheelNotes() 
	{
		return wheelNotes;
	}
	public void setWheelNotes(File wheelNotes)
	{
		this.wheelNotes = wheelNotes;
	}
	public Scanner getMobilityScanner()
	{
		return mobilityScanner;
	}
	public void setMobilityScanner(Scanner mobilityScanner) 
	{
		this.mobilityScanner = mobilityScanner;
	}
	public Scanner getShootingScanner() 
	{
		return shootingScanner;
	}
	public void setShootingScanner(Scanner shootingScanner) 
	{
		this.shootingScanner = shootingScanner;
	}
	public Scanner getBlockingScanner() 
	{
		return blockingScanner;
	}
	public void setBlockingScanner(Scanner blockingScanner) 
	{
		this.blockingScanner = blockingScanner;
	}
	public Scanner getPassingScanner() 
	{
		return passingScanner;
	}
	public void setPassingScanner(Scanner passingScanner) 
	{
		this.passingScanner = passingScanner;
	}
	public Scanner getWheelScanner() 
	{
		return wheelScanner;
	}
	public void setWheelScanner(Scanner wheelScanner) 
	{
		this.wheelScanner = wheelScanner;
	}
	public Formatter getMobilityFormatter() 
	{
		return mobilityFormatter;
	}
	public void setMobilityFormatter(Formatter mobilityFormatter) 
	{
		this.mobilityFormatter = mobilityFormatter;
	}
	public Formatter getShootingFormatter() 
	{
		return shootingFormatter;
	}
	public void setShootingFormatter(Formatter shootingFormatter) 
	{
		this.shootingFormatter = shootingFormatter;
	}
	public Formatter getBlockingFormatter() 
	{
		return blockingFormatter;
	}
	public void setBlockingFormatter(Formatter blockingFormatter) 
	{
		this.blockingFormatter = blockingFormatter;
	}
	public Formatter getPassingFormatter() 
	{
		return passingFormatter;
	}
	public void setPassingFormatter(Formatter passingFormatter) 
	{
		this.passingFormatter = passingFormatter;
	}
	public Formatter getWheelFormatter() 
	{
		return wheelFormatter;
	}
	public void setWheelFormatter(Formatter wheelFormatter) 
	{
		this.wheelFormatter = wheelFormatter;
	}
	public double getOverallScore() 
	{
		return overallScore;
	}
	public void setOverallScore(double overallScore) 
	{
		this.overallScore = overallScore;
	}
	
}
