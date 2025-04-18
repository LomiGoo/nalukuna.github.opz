import java.util.ArrayList;

public class Array2DList {

    public static void main(String[] args) {
        ArrayList<String> student = new ArrayList<>();
        ArrayList<String> student2 = new ArrayList<>();
        ArrayList<String> age = new ArrayList<>();
        ArrayList<String> age2 = new ArrayList<>();
        
        ArrayList<ArrayList<String>> ICT = new ArrayList<>();
        ArrayList<ArrayList<String>> ABM = new ArrayList<>();
        
        ArrayList<ArrayList<ArrayList<String>>> strand = new ArrayList<>();
        
        student.add("chiv");
        age.add("17");
        
        student.add("denniel");
        age.add("17");
        
        ICT.add(student);
        ICT.add(age);
        strand.add(ICT);
        
        student2.add("micha");
        age2.add("16");
        
        student2.add("danniel");
        age2.add("18");
        
        ABM.add(student2);
        ABM.add(age2);
        strand.add(ABM);
        
        System.out.println(strand);
        System.out.println();
    }
}
