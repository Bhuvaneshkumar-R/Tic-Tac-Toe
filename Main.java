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

    public static boolean win(char [][]arr)
    {
                //1st row
                if((arr[0][1]!='-')&&(arr[0][0] == arr[0][1]) && (arr[0][1] == arr[0][2]))
                {
                    return true;
                    
                }
                //2nd row
                else if((arr[1][1]!='-')&&(arr[1][0] == arr[1][1]) &&(arr[1][1] == arr[1][2]))
                {
                    return true;
                    
                }
                //3rd row
                else if((arr[2][1]!='-')&&(arr[2][0] == arr[2][1]) &&(arr[2][1] == arr[2][2]))
                {
                    return true;
                    
                }
                //1st column
                else if((arr[1][0]!='-')&&(arr[0][0] == arr[1][0]) &&(arr[1][0] == arr[2][0]))
                {
                    return true;
                    
                }
                //2nd column
                else if((arr[1][1]!='-')&&(arr[0][1] == arr[1][1]) && (arr[1][1] == arr[2][1]))
                {
                    return true;
                    
                }  
                //3rd column
                else if((arr[1][2]!='-')&&(arr[0][2] == arr[1][2]) && (arr[1][2] == arr[2][2]))
                {
                    return true;
                    
                }
                //left to right diagonal
                else if((arr[1][1]!='-')&&(arr[0][0] == arr[1][1]) &&(arr[1][1] == arr[2][2]))
                {
                    return true;
                    
                }
                //right to left diagonal
                else if((arr[1][1]!='-')&&(arr[0][2] == arr[1][1]) &&(arr[1][1] == arr[2][0]))
                {
                    return true;
                
                }
        return false;
    }
    public static void main(String[] arg)
    {
    
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
        // win trick
        if(win(arr))
        {
            System.out.println(arr[row][col]+ " " + "wins the match");
            break;
        }
        if(i==9)
        {
            System.out.println("Draw");
        }
        }    
    }
}