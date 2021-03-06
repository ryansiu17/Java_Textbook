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
        int j = 0;
        int minIndex = 0;
        int minValue = list[j];
        for (int k = 0; k < list.length; k++){
            minValue = list[j];      
            minIndex = j;
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
    
    public void increaseSize(){
        int[] newList = new int[list.length*2];
        for(int i = 0; i < list.length; i++){
            newList[i] = list[i];
        }
        list = newList;
    }
    
    public void checkSize(){
        int check = this.search(0);
        if(check == -1){
            this.increaseSize();
            System.out.println("List full. Increasing size");
        }
    }
    
    public void addElement(int val){
        int loc = this.search(0);
        list[loc] = val;
    }
    
    public void removeValue(int val){
        int loc = this.search(val);
        if(loc != -1){
                    int[] newList = new int[list.length];
                    for(int i = 0; i < loc; i++){
                        newList[i] = list[i];
                    }
                    for(int k = loc; k < list.length - 1; k++){
                        newList[k] = list[k+1];
                    }
                    list = newList;
        }
    }
    
}
