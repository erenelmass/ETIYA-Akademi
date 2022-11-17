public class Main {
    public static void main(String[] args) {

        int[] gunler = new int[]{1,2,3,4,5,6,7};

        for (int i = 0; i < gunler.length; i++)
        {
            switch (gunler[i])
            {
                case 1:
                    System.out.println("Günlerden Pazartesi");
                    break;
                case 2:
                    System.out.println("Günlerden Salı");
                    break;
                case 3:
                    System.out.println("Günlerden Çarşamba");
                    break;
                case 4:
                    System.out.println("Günlerden Perşembe");
                    break;
                case 5:
                    System.out.println("Günlerden Cuma");
                    break;
                case 6:
                    System.out.println("Günlerden Cumartesi");
                    break;
                case 7:
                    System.out.println("Günlerden Pazar");
                    break;
                default:
                    break;
            }
        }
    }
}