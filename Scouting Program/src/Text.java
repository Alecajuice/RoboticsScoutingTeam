
public class Text 
{
	private String text;
	private int x;
	private int y;

	public Text(String txt, int X, int Y)
	{
		text = txt;
		x = X;
		y = Y;
	}

	public String getText() 
	{
		return text;
	}

	public void setText(String text)
	{
		this.text = text;
	}

	public int getX() 
	{
		return x;
	}

	public void setX(int x) 
	{
		this.x = x;
	}

	public int getY() 
	{
		return y;
	}

	public void setY(int y) 
	{
		this.y = y;
	}
}
