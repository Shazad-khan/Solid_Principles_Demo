import java.util.Scanner;

public class DependancyViolation {
    public static void main(String[] args) {
        FootballTeam football = new football();
        CricketTeam cricket = new cricket();
        football.creating();
        cricket.creating();
    }    
}

class FootballTeam{
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

class CricketTeam{
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
    

