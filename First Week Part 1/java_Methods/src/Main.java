public class Main {
    public static void main(String[] args) {
        sayiBulmaca();
    }

    public static void sayiBulmaca(){
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
            sendMessage("sayı mevcut: "+ toFind);
        else if (sign == false)
            sendMessage("sayı mevcut değil: "+ toFind);
    }
    public static void sendMessage(String message){
        System.out.println(message);
    }
}