package udemy;

public class Vipul {

	public static void main(String[] args) {

		System.out.println("vipul depolkar");
		Vipul v=new Vipul();
		v.add(2, 3);
		v.add(5, 6, 7);
		
		
	}
	
	
	void add(int a, int b)
	{
		int c=a+b;
				
		System.out.println(c);		
		
	}
	void add (int a,int b,int c)
	{
		int d=a+b+c;
		System.out.println(d);
		
	}

}
