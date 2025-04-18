package ObjHash;
import java.util.HashMap; 

public class Main {

    public static void main(String[] args) {
        HashMap<Integer, studentInfo> student = new HashMap<>();
        
        student.put(
            111000000, 
            new studentInfo("Chevelle", "Nacionales", 11, "Fortran")
            );
            
        student.put(
            112000000, 
            new studentInfo("Micha Lauraine", "Monastrial", 11, "aybiem")
            );
            
        student.get(111000000).displayInfo();
        System.out.println();
        
        for(int stu : student.keySet()) {
            System.out.println("#" + stu);
            student.get(stu).displayInfo();
            System.out.println();
        }
    }
}

