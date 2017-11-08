import java.util.Scanner;
public class Team{
    private String teamName;
    Scanner scan = new Scanner(System.in);
    private Athelete[] players;
    public Team(String name, int size){
        this.teamName = name;
        this.players = new Athelete[size];
    }
    public String toString(){
        String output = "Team " + this.teamName + " has: \n";
        for (Athelete p : players){
            output += p + "\n";
        }
        return output;
    }
    public void addPlayer(){
        System.out.println("Where to add new Player");
        int i = scan.nextInt();
        Athelete p = new Athelete();
        players[i] = p;
    }
}