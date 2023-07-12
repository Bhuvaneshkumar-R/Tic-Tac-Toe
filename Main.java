import java.util.*;

public class Main
{
    public static void Display(char [][]arr)
    {
        for(int r=0;r<3;r++)
       {
           for(int c=0;c<3;c++)
           {
               System.out.print(arr[r][c] +" ");
           }
           System.out.println();
       }
    }
public static void main(String[] args) {
   
   Scanner sc = new Scanner(System.in);
   char arr[][] = new char[3][3];
   int r,c;
   for(r=0;r<3;r++)
   {
       for(c=0;c<3;c++)
       {
           arr[r][c] = '-';
           System.out.print(arr[r][c] +" ");
       }
       System.out.println();
   }
   int i=0;
   while(true)
   {
       int row = sc.nextInt();
       int col = sc.nextInt();
       if(row>2 || col>2)
       {
           System.out.println("Enter the value in range of matrix");
           continue;
       }
       if(arr[row][col]!='-'){
           System.out.println("Element is already exist");
           continue;
       }
       //condition
           if(i%2==0)
           {
               arr[row][col] = 'X';
           }
           else
           {
               arr[row][col] = 'O';
           }
       
       //Printing the matrix with x and o
       Display(arr);
       i++;
   }
}
}
