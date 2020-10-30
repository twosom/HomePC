class DataCode120
{
	private int x;	//private는 같은 클래스 내에서만
	public int y;	//public은 어디에서나
	int z;			//default는 같은 패키지 내에서만
	
	DataCode120(){}
	
	DataCode120(int x)
	{
		this.x = x;
	}
	
	void print()
	{
		System.out.println(this.x);
	}
}

public class Code120
{
	public static void main(String[] args)
	{
		DataCode120 data = new DataCode120();
		DataCode120 data1 = new DataCode120(10);
		
		data1.print();
		data.y = 20;
		data.z = 30;
	}
}
