public class Furniture
{
	private String colour;
	private Door door;

	public Furniture (String colour) 
	{
		this.colour = colour;
		door = new Door();
	}

	public void setColour (String colour) 
	{
		this.colour = colour;
	}

	public String open() 
	{
		return door.openDoor();
	}
}
