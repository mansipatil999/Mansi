import java.io.*;
import java.lang.*;

class even_odd
{
    int no;

    public even_odd(int r)
    {
        no=r
    }

    public void check()
    {
        if (no%2==0)
        {
            System.out.println( "Number is even");
        }
        else
        {
            System. out.println( "Number is odd");
        }
    }
}
class xys
{
    public static void main(String[] args)
    {
        int a=0;

        try
        {
            BufferedReader br=new BufferedReader( new InputStreamReader(System.in));

            System. out.println("Enter a number");
            a= Integer.parseInt(br.readLine());

            even_odd e=new  even_odd(a);
            e. check();
        }
        catch(Exception e)
        {
            System. out.println(e);

        }
    }
}