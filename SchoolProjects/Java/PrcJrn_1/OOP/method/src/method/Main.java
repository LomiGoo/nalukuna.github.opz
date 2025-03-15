package method;

public class Main {
										
										public static void main(String[] args) {
																				character c = new character("chiv", "assassin", 150, 60);
																				character c2 = new character("chab", "mage", 400, 300);
																				
																				c.dialog();
																				
																				c.talkTo(c2);
										}
										
}