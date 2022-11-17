public class Main {
    public static void main(String[] args) {
        //sayıların birbirinden farklı olduğu kabul edilirse:
        int a = 3, b = 4, c = 5;
        if (a > b & a > c){
            System.out.println(a + " en büyük sayıdır");
        }
        else if (b > a & b > c){
            System.out.println(b + " en büyük sayıdır");
        }
        else if (c > a & c > b){
            System.out.println(c + " en büyük sayıdır");
        }
    }
}