package inheritance;

public class Employe1 extends Employe {
	double hra;
	double pf;
	public void percentage()
	{
		hra=b*0.05;
		System.out.println("hra="+hra);
		pf=b*0.20;	
System.out.println("pf="+pf);
	}

}
