package encapsulation;

public class Bank {
	private int pin;
	
	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public void validatepin()
	{
		switch(pin) {
		case 1001:
			System.out.println("Valid pin");
			break;
		case 1234:
			System.out.println("Valid pin");
			break;
		case 1212:
			System.out.println("Valid pin");
			break;
			default:
				System.out.println("not Valid");
				
		}
	}

}
