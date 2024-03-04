import java.util.Scanner;
import java.util.Random;

public class Number_Guess
{
    @SuppressWarnings("resource")
    public static void main(String s[])
    {
        Random rand=new Random();
        int randomno=rand.nextInt(100);
         //System.out.println("Random Number is:"+randomno);
        int trycount=0;
         while(true)
         {
        System.out.println("Enter your Guess(1-100):");
        Scanner sc=new Scanner(System.in);
        int playerGuess=sc.nextInt();
        trycount++;
        if(playerGuess==randomno)
        {
            System.out.println("Correct!You Win!");
             System.out.println("It took you "+trycount+"tries");
            break;
        }
        else if(randomno>playerGuess)
        {
            System.out.println("Nope!The Number is higher.Guess again");
            
        }
        else
        {
            System.out.println("Nope! The number is lowe44r.Guess again");

        }
    }
    }
}