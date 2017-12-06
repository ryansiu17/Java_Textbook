// ****************************************************************
// IntegerList.java
//
// Define an IntegerList class with methods to create, fill,
// sort, and search in a list of integers.
//          
// ****************************************************************
import java.util.Scanner;
public class IntegerList{
    int[] list; //values in the list
    Scanner scan = new Scanner(System.in);
    //-------------------------------------------------------
    //create a list of the given size
    //-------------------------------------------------------
    public IntegerList(int size)
    {
        list = new int[size];
    }
    //-------------------------------------------------------
    //fill array with integers between 1 and 100, inclusive
    //-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<list.length; i++)
            list[i] = (int)(Math.random() * 100) + 1;
    }
    //-------------------------------------------------------
    //print array elements with indices
    //-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<list.length; i++)
            System.out.println(i + ":\t" + list[i]);
    }
    //-------------------------------------------------------
    //return the index of the first occurrence of target in the list.
    //return -1 if target does not appear in the list
    //-------------------------------------------------------
    public int search(int target)
    {
        // linear search
        for(int k = 0; k < list.length; k++){
            if (list[k] == target){
                return k;
            }
        }
        return -1;
    }
    //-------------------------------------------------------
    //sort the list into ascending order using the selection sort algorithm
    //-------------------------------------------------------
    public void selectionSort()
    {
        int minIndex = 0;
        int minValue = list[0];
        int j = 0;
        for (int k = 0; k < list.length; k++){
            for (int i=j; i < list.length; i++){
                if(list[i] < minValue){
                    minValue = list[i];
                    minIndex = i;
                }
            }
            
            list[minIndex] = list[j];
            list[j] = minValue;
            j++;
        }
    }
    
    public void replaceFirst(int oldVal, int newVal){
        if(list[search(oldVal)] != -1){
            list[search(oldVal)] = newVal;
        }
    }
    
    public void replaceAll(int oldVal, int newVal){
        while(search(oldVal) != -1){
            list[search(oldVal)] = newVal;
        }
    }
}
