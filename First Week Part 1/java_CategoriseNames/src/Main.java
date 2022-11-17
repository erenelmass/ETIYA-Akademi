public class Main {
    public static void main(String[] args) {

        String[] isimler = {"Ali", "Mehmet", "Ahmet", "Merve", "Veli", "Zeynep"};

        int i = 0;
        for (; i < isimler.length; i++){
            if (isimler[i].startsWith("A"))
            {
                System.out.print(isimler[i] + ", ");
            }
        }
        i = 0;
        for (; i < isimler.length; i++){
            if (isimler[i].startsWith("M"))
            {
                System.out.print(isimler[i] + ", ");
            }
        }
        i = 0;
        for (; i < isimler.length; i++){
            if (!(isimler[i].startsWith("M")) && !(isimler[i].startsWith("A")))
            {
                System.out.print(isimler[i] + ", ");
            }
        }
    }
}