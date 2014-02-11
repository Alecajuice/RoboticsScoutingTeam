import java.util.ArrayList;


public class Screen {
	
	private ArrayList<Button> buttons = new ArrayList<Button>();
	private ArrayList<TextBox> textBoxes = new ArrayList<TextBox>();
	private ArrayList<Text> text = new ArrayList<Text>();
	private String title;
	
	public Screen (Button[] but, String titl)
	{
		for (Button b : but)
		{
			buttons.add(b);
		}
		title = titl;
	}

	public void switchTo()
	{
		Main.currentScreen = this;
	}
	
	public void draw()
	{
		
	}
	
	public ArrayList<Button> getButtons() 
	{
		return buttons;
	}

	public void setButtons(ArrayList<Button> buttons) 
	{
		this.buttons = buttons;
	}

	public ArrayList<TextBox> getTextBoxes() 
	{
		return textBoxes;
	}

	public void setTextBoxes(ArrayList<TextBox> textBoxes) 
	{
		this.textBoxes = textBoxes;
	}

	public ArrayList<Text> getText() 
	{
		return text;
	}

	public void setText(ArrayList<Text> text) 
	{
		this.text = text;
	}

	public String getTitle() 
	{
		return title;
	}

	public void setTitle(String title) 
	{
		this.title = title;
	}
}
