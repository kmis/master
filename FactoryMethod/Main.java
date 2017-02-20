public class Main {
	public static void main (String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("森田一義");
		Product card2 = factory.create("三村勝和");
		Product card3 = factory.create("まご正義");
		card1.use();
		card2.use();
		card3.use();
	}
}