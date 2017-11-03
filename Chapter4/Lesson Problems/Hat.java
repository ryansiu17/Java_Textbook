public class Hat{
    private String name;
    private int age;
    public Hat(String nm, int ag){
        this.name = nm;
        this.age = ag;
    }
    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }
    public String toString(){
        return this.name;
    }
    public void setAge(int ag){
        this.age = ag;
    }
}