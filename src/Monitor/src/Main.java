package Monitor.src;

public class Main {
	public static void main(String[] args) {
		Monitor m = new Monitor("d:\\1.txt", "d:\\2.txt", new FileEvent());
		m.start();
	}
}