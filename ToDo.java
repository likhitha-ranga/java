import java.util.*;
class ToDo{
    public static void main(String[] args)
    {
        List<String> to=new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        String a;
        while(true){
        System.out.println("enter choice:\n1.Add items on a to-do list\n2.Remove items on a to-do list\n3.View items on a to-do list\n4.Exit");
        int c=sc.nextInt();
        switch(c)
        {
            case 1:
            System.out.println("enter the item to add");
            sc.nextLine();
            a=sc.nextLine();
            to.add(a);
            break;
            case 2:
            System.out.println("enter the item to remove");
            sc.nextLine();
            a=sc.nextLine();
            to.remove(a);
            break;
            case 3:
            System.out.println("item on a to-do list:");
            for(String i:to)
                System.out.println(i);
            break;
            case 4:
            java.lang.System.exit(0);
        }
    }
    }
}