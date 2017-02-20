package Phones.Phone;

public abstract class Phone {
	
	protected boolean touch;
	protected boolean hasWifi;
	protected int screenSize;
	private int countCall;
	private int countSms;
	
	public Phone() {
		System.out.println("Phone constructor");
	}
	
	public boolean isTouch() {
		return touch;
	}
	
	public boolean isHasWifi() {
		return hasWifi;
	}
	
	public int getScreenSize() {
		return screenSize;
	}
	
	public void call(String number) {
		countCall++;
		System.out.println("Phone class is calling " + number);
	}
	public int getCountCall() {
		return countCall;
	}
	
	public abstract void sendSMS(String number, String message);

	public int getCountSms() {
		return countSms;
	}

	protected void increaseSmsCount() {
		countSms++;
	}
}
