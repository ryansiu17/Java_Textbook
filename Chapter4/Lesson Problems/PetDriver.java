public class PetDriver{
    public static void main(String args[]){
        Pet sam = new Pet("sam",4);
        System.out.println(sam.getAge());
        System.out.println(sam);
        sam.setAge(6);
        System.out.println(sam.getAge());
        System.out.println(sam);
        Pet john = new Pet("john", 2);
        System.out.println(Pet.numPets);
    }
}