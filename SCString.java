import java.lang.*;

public class SCString
{
    public static void main(String[] args)
        {
            int b=1001010;
            String str=String.valueOf(b);

            System.out.println(str.matches("[01]+"));

        }
}
