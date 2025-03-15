package Encapsulation;

public class character {
										private String name, role;
										private int lvl;
										
										character(String name, String role, int lvl) {
																				this.name = name;
																				this.role = role;
																				this.lvl = lvl;
										}
										
										String getName() {
																				return name;
										} 
										
										String getRole() {
																				return role;
										} 
										
										int getLvl() {
																				return lvl;
										} 
										
										void setName(String name) {
																				this.name = name;
										}
}