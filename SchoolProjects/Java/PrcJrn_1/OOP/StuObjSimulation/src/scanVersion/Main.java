package scanVersion;
import StuObjSimulation.*;
import java.util.Scanner;

public class Main {
					
					public static void main(String[] args) {
										Scanner s = new Scanner(System.in);
										
										double $21stCent, genmath, hope2, 
					 												   			philo, pagbasa, physci, 
							 							 						  eTech, pr2, cp4, cp5, cp6;
										String fname, lname, strand, section, eval;
										int year;
										
										System.out.print("Enter 21st Century grade : ");
										$21stCent = s.nextDouble();
										
										System.out.print("Enter Genmath grade      : ");
										genmath = s.nextDouble();
										
										System.out.print("Enter HOPE2 grade        : ");
										hope2 = s.nextDouble();
										
										System.out.print("Enter Philosophy grade   : ");
										philo = s.nextDouble();
										
										System.out.print("Enter PAGBASA grade      : ");
										pagbasa = s.nextDouble();
										
										System.out.print("Enter Physical Science grade : ");
										physci = s.nextDouble();
										
										System.out.print("Enter ETECH grade        : ");
										eTech = s.nextDouble();
										
										System.out.print("Enter PR2 grade          : ");
										pr2 = s.nextDouble();
										
										System.out.print("Enter cp4 grade          : ");
										cp4 = s.nextDouble();
										
										System.out.print("Enter cp5 grade          : ");
										cp5 = s.nextDouble();
										 
										System.out.print("Enter cp6 grade          : ");
										cp6 = s.nextDouble();
										
										System.out.println();
										s.nextLine();
										
										subjects ave1 = new subjects($21stCent, genmath, hope2, 
																																														philo, pagbasa, physci, eTech, pr2, 
																																													cp4, cp5, cp6);
										ave1.calculate();
										
										System.out.print("Enter First Name         : ");
										fname = s.nextLine();
										
										System.out.print("Enter Last Name          : ");
										lname = s.nextLine();
										
										System.out.print("Enter Strand             : ");
										strand = s.nextLine();
										
										System.out.print("Enter Section            : ");
										section = s.nextLine();
										 
										System.out.print("Enter Year               : ");
										year = s.nextInt();
										
										System.out.println();
										
										student stu1 = new student(fname, lname, strand, 
																																													section, year, subjects.aveGr);
										subjects.evalGr();
										stu1.introSelf();
					}
}