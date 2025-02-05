public class SuperheroGame {
	public static void main(String[] args) {
		Superhero.createHero("Spiderman");
		Superhero.getInfo();
		Superhero.heal(10);
		Superhero.getInfo();
		Superhero.getHurt(2);
		Superhero.webShoot();
		Superhero.getInfo();
	}
}