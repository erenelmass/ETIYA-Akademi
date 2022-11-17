public class Main {
    public static void main(String[] args) {
        Product product = new Product(10982, "Monster", "Abra A5", 39999, "AA5", 1550);
        //product.setName("Monster Abra A5 15.2");
        System.out.println(product.getName());
        System.out.println(product.getKod());
    }
}