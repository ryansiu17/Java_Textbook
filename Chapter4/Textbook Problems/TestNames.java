public class TestNames{
    public static void main(String args[]){
        Name name1 = new Name("Ryan", "Alexander", "Siu");
        Name name2 = new Name("John", "Doe", "Smith");
        System.out.println(name1.firstMiddleLast());
        System.out.println(name2.firstMiddleLast());
        System.out.println(name1.lastFirstMiddle());     
        System.out.println(name2.lastFirstMiddle());   
        System.out.println(name1.initials());
        System.out.println(name2.initials());
        System.out.println(name1.length());
        System.out.println(name2.length());
        System.out.print(name1.equals(name2));
    }
}