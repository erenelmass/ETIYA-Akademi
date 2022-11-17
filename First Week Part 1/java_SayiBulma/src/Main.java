public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,3,4,5,6,7,8,11,10};
        int toFind = 10;
        boolean sign = false;

        for (int i: numbers){
            if (i == toFind){
                sign = true;
                break;
            }
        }
        if (sign)
            System.out.println("aradığınız sayı listede var");
        else if (sign == false)
            System.out.println("aradığınız sayı listede yok");

    }
}