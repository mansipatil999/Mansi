import java.io.*;
import java.lang.*;

class 2d
{
    int rowline=0, colline=0;
    int row=0, col=0;
    int pcnt=0;

    public 2d()
    {
        try
        {
            BufferedReader br=new BufferedReader( new InputStreamReader(System.in));

            System.out.println("Enter the number of rows:");
            rowline= Integer.parseInt(br.readLine());

            System. out.println("Enter the number of columns:");
            colline=Integer. parseInt(br.readLine());

            int a[][]=new int[rowline][colline];

            for(row=0;row<rowline;row++)
            {
                for(col=0;col<colline;col++)
                {
                    System.out.println("Enter the element at position ["+row+"]["+col+"]: ");
                    a[row][col]=Integer.parseInt(br.readLine());
                }
            }
            System.out. println("the two d array is displayed below \n");

            for(row=0;row<rowline;row++)
            {
                for( col=0;col<colline;col++)
                {
                    System.out.print(a[row][col] + " ");
                }
                System.out.println("\n");
            }
            for(row=0;row<rowline;row++)
            {
                for(col=0;col<colline;col++)
                {
                    if(a[ row][col]>0)
                    {
                        pcnt++;
                    }
                }
            }
            System. out.println("the number of positive elements in the array is "+pcnt);
        }
        catch( Exception e)
        {
            System.out.println(e);
        }
    }
}
class abc
{
    public static void main(String args[])
    {
        2d array obj=new 2darray();

    }
}