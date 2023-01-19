package aggregation;

public class Son {
	String housename;
	int pin;
	Father sd;
	  
	Son(String housename,int pin,Father sd)
	{
	this.housename=housename;
	this.pin=pin;
	this.sd=sd;
	}
	
	public void print()
	{
		System.out.println(sd.name+" "+sd.age);
		System.out.println(housename+" "+pin);
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Father f=new Father("Aji",25);
		Son s=new Son("Andoor",14,f);
		s.print();
	}

}
