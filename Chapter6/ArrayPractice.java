import java.util.Arrays;
public class ArrayPractice{
    // arr.length for rows
    // arr[0].length for columns
    public static void main(String[] args){
        int[][] arr1 = { {2,5}, {4,6} };
        
    }
    public double averageArray(int[][] nums){
        int sum = 0;
        for(int row = 0; row < nums.length; row++){
            for(int col = 0; col < nums[0].length; col++){
                sum += nums[row][col];
            }
        }
        return (double) sum/(nums.length*nums[0].length);
    }
    public int[] sumColumns(int[][] nums){
        int[] sum = new int[nums[0].length];
        int temp = 0;
        for(int i = 0; i < nums[0].length; i++){
            for(int k = 0; k < nums.length; k++){
                temp += nums[k][i];
                sum[k] = temp;
            }
            temp = 0;
        }
        System.out.println(sum[0]);
        System.out.println(sum[1]);
        return sum;
    }
    public int[][] squareArray(int[][] nums){
        int[][] temp = nums;
        for(int i = 0; i < nums.length; i++){
            for(int k = 0; k < nums[0].length; k++){
                temp[i][k] = temp[i][k] * temp[i][k];
            }
        }
        return temp;
    }
    public void print1Array(int[] nums)
    {
        for(int row = 0; row < nums.length; row++) {
            System.out.print(nums[row] + "\t");
            System.out.println();
        }
    }  
    public void printArray(int[][] nums)
    {
        for(int row = 0; row < nums.length; row++) {
            for(int col =0; col < nums[0].length; col++) {
                System.out.print(nums[row][col] + "\t");
            }
            System.out.println();
        }
    }   
}