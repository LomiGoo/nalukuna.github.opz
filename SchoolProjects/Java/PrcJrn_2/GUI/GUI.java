import javax.swing.JOptionPane;

public class GUI {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("enter name");
        JOptionPane.showMessageDialog(null, "your name is : " +  name);
        System.out.println("your name is : " + name);
        
        int age = Integer.parseInt(JOptionPane.showInputDialog("enter age"));
        JOptionPane.showMessageDialog(null, "you are : " + age + " years old!");
        System.out.println("you are : " + age + " years old!");
    }
}