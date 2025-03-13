public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("--------------");
        
        Stack s = new Stack();
        s.add("1");
        s.add("2");
        s.add("3");
        s.add("4");
        s.add("5");
        
        while (!s.isEmpty()) {
            System.out.println(s.take());
        }
    }
}
