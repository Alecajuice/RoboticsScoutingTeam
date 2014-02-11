import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;
public class Robot 
{
	private ArrayList<Screen> screens = new ArrayList<Screen>();
	private int teamID;
	private int assists;
	private int topGoalAttempts;
	private int topGoalScores;
	private int topGoalRatio;
	private int bottomGoal;
	private int bottomGoalAttempts;
	private int bottomGoalRatio;
	private FileOutputStream mobilityNotes;
	private File shootingNotes = new File(teamID + "shooting.txt");
	private File blockingNotes = new File(teamID + "blocking.txt");
	private File passingNotes = new File(teamID + "passing.txt");
	private File wheelNotes = new File(teamID + "wheel.txt");
	private BufferedReader mobilityReader;
	private Scanner shootingScanner;
	private Scanner blockingScanner;
	private Scanner passingScanner;
	private Scanner wheelScanner;
	private PrintWriter mobilityWriter;
	private PrintWriter shootingWriter;
	private PrintWriter blockingWriter;
	private PrintWriter passingWriter;
	private PrintWriter wheelWriter;
	private double overallScore;
	public Robot(int teamNum) 
	{
		try 
		{
			mobilityReader = new BufferedReader(new FileReader(teamID + "mobility.txt"));
			shootingScanner = new Scanner(shootingNotes);
			blockingScanner = new Scanner(blockingNotes);
			passingScanner = new Scanner(passingNotes);
			wheelScanner = new Scanner(wheelNotes);
			mobilityWriter = new PrintWriter(mobilityNotes);
			shootingWriter = new PrintWriter(shootingNotes);
			blockingWriter = new PrintWriter(blockingNotes);
			passingWriter = new PrintWriter(passingNotes);
			wheelWriter = new PrintWriter(wheelNotes);
			mobilityNotes = new FileOutputStream(teamID + "mobility.txt");
		} catch(Exception e) 
		{
			System.out.println("Don't worry about it!");
		}
		teamID = teamNum;
		mobilityWriter.println("yey it werks");
	}
	public Object[] scanMobility() throws IOException
	{
		ArrayList<String> output = new ArrayList<String>();
		
		String string = mobilityReader.readLine();
        mobilityReader.close();
        output.add(string);
        
		return output.toArray();
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
	public double getOverallScore() 
	{
		return overallScore;
	}
	public void setOverallScore(double overallScore) 
	{
		this.overallScore = overallScore;
	}
	public PrintWriter getMobilityWriter() 
	{
		return mobilityWriter;
	}
	public void setMobilityWriter(PrintWriter mobilityWriter) 
	{
		this.mobilityWriter = mobilityWriter;
	}
	public PrintWriter getShootingWriter() 
	{
		return shootingWriter;
	}
	public void setShootingWriter(PrintWriter shootingWriter) 
	{
		this.shootingWriter = shootingWriter;
	}
	public PrintWriter getBlockingWriter() 
	{
		return blockingWriter;
	}
	public void setBlockingWriter(PrintWriter blockingWriter) 
	{
		this.blockingWriter = blockingWriter;
	}
	public PrintWriter getPassingWriter() 
	{
		return passingWriter;
	}
	public void setPassingWriter(PrintWriter passingWriter)
	{
		this.passingWriter = passingWriter;
	}
	public PrintWriter getWheelWriter()
	{
		return wheelWriter;
	}
	public void setWheelWriter(PrintWriter wheelWriter)
	{
		this.wheelWriter = wheelWriter;
	}
	
}
