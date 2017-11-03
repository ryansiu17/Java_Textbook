public class CarDriver{
    public static void main(String args[]){
        Car car1 = new Car("Prius",2004);
        Car car2 = new Car("Supra",1999);        
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car1.getYear() + car2.getYear());
    
    }
}