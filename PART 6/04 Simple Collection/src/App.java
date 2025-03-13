public class App {
    public static void main(String[] args) throws Exception {
        SimpleCollection c = new SimpleCollection("collection");
        c.add("element");
        System.out.println(c);
    }
}
