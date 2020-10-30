class StudentCode125
{
	private String name;
	private int score;
	
	StudentCode125(String name, int score)
	{
		this.name = name;
		this.score = score;
	}
	
	String getName() {
		return name;
	}
	int getScore() {
		return score;
	}
	void print()
	{
		System.out.println(name + "(" + score + ")");
	}
}

public class Code125 
{
	public static void main(String[] args)
	{
		StudentCode125 [] st = {new StudentCode125("Alice", 88),
				new StudentCode125("Tom", 98),
				new	StudentCode125("Jenny", 80),
				new StudentCode125("Betty", 79),
				new StudentCode125("Daniel", 91)
		};
		
		int total = 0;
		for(StudentCode125 s : st)
			total += s.getScore();
		
		double average = (double)total / st.length;
		
		System.out.println("average : " + average);
	}
}
