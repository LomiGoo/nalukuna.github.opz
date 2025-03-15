package method;

public class character {
										String name, role;
										int hp, mana;
										
										character(String name, String role, int hp, int mana) {
																				this.name = name;
																				this.role = role;
																				this.hp = hp;
																				this.mana = mana;
										}
										
										void dialog() {
																				System.out.println("i am " + name + ", the one who knocks.");
										}
										
										void talkTo(character c2) {
																				System.out.println("i am " + name + ". hey " + c2.name + ", im here to beat you.");
										}
}