public class Grades
{
    public static void main (String[] args){
        printHeader();
        System.out.println("Joe\t\t33\t1\t34");
        System.out.println("James\t\t54\t29\t83");
        System.out.println("Peter\t\t12\t0\t12");
        listData("Bob",43,10);
        listData("CoolMan",22,24);
    }   
    public static void printHeader(){
        System.out.println("--------------------------------------");
        System.out.println("==         Student Points           ==");
        System.out.println("--------------------------------------");
        System.out.println("Name\t\tLab\tBonus\tTotal");
        System.out.println("----\t\t---\t-----\t-----");
    }
    public static void listData(String name, int score, int bonus){
        System.out.println(name + "\t\t" + score + "\t" + bonus + "\t" + (score+bonus));
        
    }
}