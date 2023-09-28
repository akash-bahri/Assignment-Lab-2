import java.util;
import java.util.Scanner;

public class Java_2D_Array_solution {

    public static void input(int[][] arr)
    {
        Scanner scan = new Scanner(System.in);
        
        for(int i = 0; i < 6; i++)
        {
            String[] inputline = scan.nextLine().split(" ");
           
            for(int j = 0; j < 6; j++)
            {
                arr[i][j] = Integer.parseInt(inputline[j]);
                
            }            
        }        
    }



    public static void main(String[] args) {
        
        int[][] array = new int[6][6];
        input(array);
        int sum=Integer.MIN_VALUE;
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                int temp = array[i][j] + array[i][j+1] + array[i][j+2] + array[i+1][j+1] + array[i+2][j] + array[i+2][j+1] + array[i+2][j+2];
                sum=Math.max(sum, temp);               
            }
            //System.out.println();
        }
        System.out.println(sum);
    }

}