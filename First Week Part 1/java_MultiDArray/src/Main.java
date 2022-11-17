public class Main {
    public static void main(String[] args) {

        int[][] MultiD_Arr = {{1,2,3,4}, {5,6,7,8,}, {9,10,11,12}};

        System.out.println("---------------");
        for (int i = 0; i < MultiD_Arr.length; i++)
        {
            System.out.print("   ");
            for (int j = 0; j < MultiD_Arr[i].length; j++)
            {
                System.out.print(MultiD_Arr[i][j] + " ");
            }
            System.out.println("\n---------------");
        }
    }
}