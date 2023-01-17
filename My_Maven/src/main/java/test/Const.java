package test;

public class Const {
	
	String name;
	int age;
	
	public Const(String a,int b)
	{
		name=a;
		age=b;
	}
	public void print()
	{
		System.out.println("name: "+name+" "+"age: "+age);
	}

	public static void main(String[] args) {
		
		Const obj=new Const("Aji",25);
		obj.print();

	}

}
