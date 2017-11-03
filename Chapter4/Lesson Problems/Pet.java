public class Pet{
    private String name;
    private int age;
    public static int numPets;
    public Pet(){
        
    }
    public Pet(String nm, int ag){
        this.name = nm;
        this.age = ag;
        numPets++;
    }
    public String toString(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int ag){
        this.age = ag;
    }
    public static void example(){
        System.out.println("This is static");
    }
}