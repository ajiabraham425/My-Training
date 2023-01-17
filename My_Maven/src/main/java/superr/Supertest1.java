package superr;

public class Supertest1 extends Supertest {
	
	public void minuse()
	{
		
		
		int c=a-b;
		System.out.println(c);
		System.out.println(super.a);
		
	}
	public static void main(String[] args) {
		 Supertest1 obj=new Supertest1();
		 obj.sum();
		 obj.minuse();
		

	}

}
