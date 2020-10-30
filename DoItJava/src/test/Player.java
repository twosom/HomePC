package test;

public class Player
{
	private PlayerLevel level;
	
	public Player()
	{
		level = new Beginner();
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel()
	{
		return level;
	}
	
	
	final void play(int count)
	{
		level.go(count);
	}
}
