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
	private File scoringNotes = new File("scoring");
	private static Scanner noteScanner = new Scanner(System.in);
	private Formatter noteWriter;
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
	public File getScoringNotes() 
	{
		return scoringNotes;
	}
	public void setScoringNotes(File scoringNotes) 
	{
		this.scoringNotes = scoringNotes;
	}
	
	
}
