
public class Button 
{
	private String text;
	private int x;
	private int y;
	private int width;
	private int height;
	
	public Button(String txt, int X, int Y, int wid, int hei) 
	{
		text = txt;
		x = X;
		y = Y;
		width = wid;
		height = hei;
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

	public int getWidth() 
	{
		return width;
	}

	public void setWidth(int width) 
	{
		this.width = width;
	}

	public int getHeight() 
	{
		return height;
	}

	public void setHeight(int height) 
	{
		this.height = height;
	}
}
