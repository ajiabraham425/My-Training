package polymorphism;

public class Child extends Parent {
	public void print()
	{
		super.print();
		System.out.println("Hello");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Child cj=new Child();
cj.print();
	}

}
