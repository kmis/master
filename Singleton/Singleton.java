public class Singleton {
	
	private static Singleton singleton = new Singleton();

	private Singleton() {
		System.out.println("インスタンスが生成されました。");
	}

	public static Singleton getInstatnce() {
		return singleton;
	}

}
