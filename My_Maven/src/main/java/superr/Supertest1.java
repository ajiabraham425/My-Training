package superr;

public class Supertest1 extends Supertest {
	int a=30;
	int b=10;
	public void minuse()
	{
		
		
		int c=a-b;
		System.out.println(c);
		System.out.println(super.a);
	    super.sum();
		
	}
	public static void main(String[] args) {
		 Supertest1 obj=new Supertest1();
		 obj.minuse();
		

	}

}
