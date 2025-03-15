import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        GradeRegister register = new GradeRegister();
        register.addGradeBasedOnPoints(93);
        register.addGradeBasedOnPoints(91);
        register.addGradeBasedOnPoints(92);
        
        System.out.println(register.averageOfPoints());
    }
}
