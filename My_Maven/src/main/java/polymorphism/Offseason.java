package polymorphism;

public class Offseason extends Onseason {
	
	public void discount()
	{
		super.discount();
		disc=(price*0.15);
		System.out.println("offseason"+disc);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Offseason obj=new Offseason();
		obj.discount();

	}

}
