import java.util.Scanner;

public class dependancy {
    public static void main(String[] args) {
        Football football = new Football();
        Cricket cricket = new Cricket();
        football.creating();
        cricket.creating();
    }    
}

interface team{
    void creating();
} 

class Football implements team{
    @Override
    public void creating(){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        if (t == 14){
            System.out.println("Team created for footbaal.");
        }
        else if(t > 14){
            System.out.println("There should be maximum 14 members in a team");
        }
        else
            System.out.println("Insufficent members to cream a tem"); 
    }

    
}

class Cricket implements team{
    @Override
    public void creating(){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        if (t == 12){
            System.out.println("Team created for Cricket.");
        }
        else if(t > 12){
            System.out.println("There should be maximum 14 members in a team");
        }
        else
            System.out.println("Insufficent members to cream a tem"); 
    }
}