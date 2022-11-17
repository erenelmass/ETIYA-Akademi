public class Main {
    public static void main(String[] args) {
        String message = "when the sun goes down...";
        String newMessage = city();
        int number = total(5,7);
        int totalNumbers = topla2(1,2,3,4,5,6,7,8,9);
        System.out.println(newMessage);
        System.out.println(number);
        System.out.println(totalNumbers);
    }

    public static void add(){
        System.out.println("Eklendi");
    }
    public static void delete(){
        System.out.println("Silindi");
    }
    public static void update(){
        System.out.println("Güncellendi");
    }
    public static int total(int a, int b){
        return (a + b);
    }
    public static int topla2(int... numbers){
        int t = 0;
        for (int nbr : numbers){
            t += nbr;
        }
        return t;
    }
    public static String city(){
        return "İzmit";
    }
}