class Score
{
	private int math;
	private int english;
	
	Score(){}
	Score(int math, int english)
	{
		this.math = math;
		this.english = english;
	}
	
	int getMath() {return math;}
	int getEnglish() {return english;}
	void setMath(int math) {this.math = math;}
	void setEnglish(int english) {this.english = english;}
	
	void incMath(int n) {this.math += n;}
	void incEnglish(int n) {this.english += n;}
	
}

class StudentCode126
{
	private String name;
	private Score score;	//score클래스의 메소드를 사용하기 위한 인스턴스?
	
	
	StudentCode126(){}
	StudentCode126(String name,Score score)
	{
		this.name = name;
		this.score = score;
	}
	
	String getName() {return name;}
	Score getScore() {return score;}
	
	void setName(String name) {this.name = name;}
	void setScore(Score score) {this.score = score;}
	void incScore(int m, int e) {score.incMath(m); score.incEnglish(e);}
	
	void printStudent()
	{
		System.out.println(name + " : math(" + score.getMath() + "), english("
				+ score.getEnglish() + ")");
	}
}
public class Code126 
{
	public static void main(String[] args)
	{
		StudentCode126 s1 = new StudentCode126("Alice", new Score(90, 80));
		
		Score a = new Score(88, 93);
		StudentCode126 s2 = new StudentCode126("Bob", a);
		
		StudentCode126 s3 = new StudentCode126();
		Score b = new Score(78, 70);
		s3.setName("Paul");
		s3.setScore(b);
		
		s1.incScore(3, 5);
		
		s1.printStudent();
		s2.printStudent();
		s3.printStudent();
	}
}
