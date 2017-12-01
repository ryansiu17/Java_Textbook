public class Comparisons{
    public static void main(String args[]){
        String s1 = new String("bob");
        String s2 = new String("hello");
        
        System.out.println(Compare1.largest(s1,s2));
        System.out.println(Compare3.largest(s1,s2));
        
        Integer i1 = new Integer(1);
        Integer i2 = new Integer(3);
        
        System.out.println(Compare2.largest(i1,i2));
        System.out.println(Compare3.largest(i1,i2));
        
        
        System.out.println(Compare3.largest(s1,i2));
    }
}