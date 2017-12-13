public class ArrayDriver{
    public static void main(String[] args){
        int[][] arr2 = { {2,5}, {4,6} };
        ArrayPractice pablo = new ArrayPractice();
        
        System.out.println(pablo.averageArray(arr2));
        System.out.println(" ");
        pablo.print1Array(pablo.sumColumns(arr2));
        System.out.println(" ");
        pablo.printArray(pablo.squareArray(arr2));
    }
}