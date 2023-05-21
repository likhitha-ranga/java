import java.util.*;
class TicTacToe{
    static char[][] gb={
        {' ','|',' ','|',' '},
        {'-','+','-','+','-'},
        {' ','|',' ','|',' '},
        {'-','+','-','+','-'},
        {' ','|',' ','|',' '}
    };
    static ArrayList<Integer> player1=new ArrayList<Integer>();
    static ArrayList<Integer> player2=new ArrayList<Integer>();
    public static void main(String[] args)
    {
        print();
        String p1,p2,s1,s2;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name of player 1");
        p1=sc.nextLine();
        System.out.println("enter the name of player 2");
        p2=sc.nextLine();
        System.out.println("enter the symbol of player 1 (X or O)");
        s1=sc.nextLine();
        if(s1.equalsIgnoreCase("x"))
        s2="o";
        else
        s2="x";
        System.out.println("symbol of player "+p1+" is "+s1);
        System.out.println("symbol of player "+p2+" is "+s2);
        while(true){
            int pos;
            System.out.println("enter the position to place the symbol in (1-9) for player "+p1);
            pos=sc.nextInt();
            place(pos,s1);
            player1.add(pos);
            print();
            if(check(p1,p2))
            break;
            if((player1.size()+player2.size())==9)
            break;
            System.out.println("enter the position to place the symbol in (1-9) for player "+p2);
            pos=sc.nextInt();
            player2.add(pos);
            place(pos,s2);
            print();
            if(check(p1,p2))
            break;
        }
    }
    public static void print(){
        for(int i=0;i<5;i++){
            for(int j=0;j<gb[i].length;j++){
                System.out.print(gb[i][j]);
            }
            System.out.println();
        }
    }
    public static void place(int pos,String s){
        switch(pos){
            case 1:gb[0][0]=s.charAt(0);
            break;
            case 2:gb[0][2]=s.charAt(0);
            break;
            case 3:gb[0][4]=s.charAt(0);
            break;
            case 4:gb[2][0]=s.charAt(0);
            break;
            case 5:gb[2][2]=s.charAt(0);
            break;
            case 6:gb[2][4]=s.charAt(0);
            break;
            case 7:gb[4][0]=s.charAt(0);
            break;
            case 8:gb[4][2]=s.charAt(0);
            break;
            case 9:gb[4][4]=s.charAt(0);
            break;
        }
    }
    public static boolean check(String p1,String p2){
        List tr =Arrays.asList(1,2,3);
    List mr=Arrays.asList(4,5,6);
    List br=Arrays.asList(7,8,9);
    List lc=Arrays.asList(1,4,7);
    List mc=Arrays.asList(2,5,8);
    List rc=Arrays.asList(3,6,9);
    List ld=Arrays.asList(1,5,9);
    List rd=Arrays.asList(3,5,7);
    List<List> l=new ArrayList<List>();
    l.add(tr);
    l.add(mr);
    l.add(br);
    l.add(lc);
    l.add(mc);
    l.add(rc);
    l.add(ld);
    l.add(rd);
        for(List w:l){
            if(player1.containsAll(w)){
            System.out.println("............................................................Congratulations..! player "+p1+" Won.....................................................");
            System.out.println("Player "+p2+" Lost....Try Again");
            return true;
            }
            else if(player2.containsAll(w)){
            System.out.println("............................................................Congratulations..! player "+p2+" Won................................................");
            System.out.println("Player "+p1+" Lost....Try Again");
            return true;
            }
            else if((player1.size()+player2.size())==9){
            System.out.println("......It's a tie.......!");
           return true;
            }
        }
        return false;
    } 
}