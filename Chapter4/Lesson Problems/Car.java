public class Car{
    private String model;
    private int year;
    
    public Car(){
        
    }
    public Car(String mod, int yr){
        this.model = mod;
        this.year = yr;
    }
    public String getModel(){
        return this.model;
    }
    public int getYear(){
        return this.year;
    }
    public String toString(){
        return ("This is a " + this.model + ", year " + this.year);
    }
    
}