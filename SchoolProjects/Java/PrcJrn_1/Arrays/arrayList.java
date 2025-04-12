import java.util.ArrayList;

class arrayListStudent {
    String name;
    Integer age;
    
    arrayListStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    arrayListStudent(int age) {
        this.age = age;
    }
    
    arrayListStudent(String name) {
        this.name = name;
    }
    
    void say() {
        System.out.println("name : " + name);
        System.out.println("age : " + age);
    }
    
    void sey() {
        System.out.println(name);
    }
}

public class arrayList {
    
    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<String>();
        ArrayList<Integer> num = new ArrayList<Integer>();
        
        ArrayList<arrayListStudent> stu = new ArrayList<arrayListStudent>();
        stu.add(new arrayListStudent("bro", 19));
        stu.add(new arrayListStudent("bru", 26));
        
        people.add("chib");
        people.add("chob");
        people.add("chab");
        people.add("cheb");
        
        num.add(1);
        num.add(2);
        
        System.out.println(people);
        people.set(3, "cheyb");
        System.out.println(people);
        System.out.println("size : " + people.size());
        
        System.out.println(num);
        
        stu.get(0).say();
        
        for(arrayListStudent e : stu) {
            e.say();
        }
        
        stu.get(0).sey();
        stu.set(0, new arrayListStudent("eys", 30));
        stu.get(0).sey();
        
        stu.remove(0).say();
        stu.clear();
        
        for(String p : people) {
            System.out.println(p);
        }
    }
}