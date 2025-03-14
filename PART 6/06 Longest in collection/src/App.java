public class App {
    public static void main(String[] args) throws Exception {
        SimpleCollection c = new SimpleCollection("characters");
        System.out.println("Pisin: " + c.longest());
        
        c.add("magneto");
        c.add("mystique");
        c.add("phoenix");
        
        System.out.println("Longest: " + c.longest());
    }
}
