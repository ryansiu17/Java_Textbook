public class TeamDriver{
    public static void main(String args[]){
        Team team1 = new Team("Soccer",10);
        print(team1);
        team1.addPlayer();
        team1.addPlayer();
        print(team1);
    }
    public static void print(String s){
        System.out.println(s);
    }
    public static void print(int s){
        System.out.println(s);
    }
    public static void print(Team s){
        System.out.println(s);
    }
    public static void print(Athelete s){
        System.out.println(s);
    }    
}