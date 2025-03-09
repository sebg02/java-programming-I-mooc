public class MainP {
    public static void main(String[] args) {
        Pet hulda = new Pet("Hulda", "Golden retriever");
        Person08 leo = new Person08("Leo", hulda);
        Person08 stitch = new Person08();

        System.out.println(leo);
        System.out.println(stitch);
    }
}
