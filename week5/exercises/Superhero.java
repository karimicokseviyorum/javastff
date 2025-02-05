public class Superhero {
	private static String SUPERHERO_NAME = "default name"; // SUPERHERO_NAME
	private static int HIT_POINTS = 0;
	private static int WEB_SHOTS = 0;
	
	public static void createHero(String name) {
		SUPERHERO_NAME = name;
	}
	public static void getInfo() {
		System.out.println("SUPERHERO STATS.");
		System.out.println("name : " + SUPERHERO_NAME);
		System.out.println("hitpoints : " + HIT_POINTS);
		System.out.println("webshots : " + WEB_SHOTS);
		
	}
	public static void getHurt(int damage) {
		System.out.println("Ouch, taken " + damage + "damage"); 
		HIT_POINTS -= damage;
	}
	public static void webShoot() {
		WEB_SHOTS++;
	}
	public static void heal(int x) {
		HIT_POINTS += x;
	}
	public static void main(String[] args) {
		
	}
}