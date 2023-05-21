import java.util.*;
class Rps{
    public static void main(String[] args)
    {
        String[] rps={"rock","paper","scissors"};
        while(true){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter choice:\n1.Rock\n2.Paper\n3.Scissors\n4.Quit\n");
            int u=sc.nextInt();
            String c=rps[new Random().nextInt(rps.length)];
            switch(u){
                case 1:
                if(c.equalsIgnoreCase("scissors"))
                System.out.println(".................................................................................Win........................................................................");
                else if(c.equalsIgnoreCase("paper"))
                System.out.println("You Lose...!\nTry Again.....");
                else
                System.out.println("You had a Tie....!");
                System.out.println("Computer's choice is "+c);
                break;
                case 2:
                if(c.equalsIgnoreCase("rock"))
                System.out.println(".................................................................................Win........................................................................");
                else if(c.equalsIgnoreCase("scissors"))
                System.out.println("You Lose...!\nTry Again.....");
                else
                System.out.println("You had a Tie....!"); 
                System.out.println("Computer's choice is "+c);
                break;
                case 3:
                if(c.equalsIgnoreCase("paper"))
                System.out.println(".................................................................................Win........................................................................");
                else if(c.equalsIgnoreCase("rock"))
                System.out.println("You Lose...!\nTry Again.....");
                else
                System.out.println("You had a Tie....!");
                System.out.println("Computer's choice is "+c);
                break;
                case 4:
                System.out.println("Exit the Game..?\nYes\nNo");
                String e=sc.next();
                if(e.equalsIgnoreCase("Yes"))
                 java.lang.System.exit(0);
                 else
                 break;
            }
        }
    }
}