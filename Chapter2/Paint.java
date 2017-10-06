//***************************************************************
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls
//of a room given its length, width, and height
//***************************************************************
 
public class Paint
{
        public static void main(String[] args)
        {
            final int COVERAGE = 350;  //paint covers 350 sq ft/gal
            //declare integers length, width, and height;
            
            int length, width, height;
            //declare double totalSqFt;
            
            double totalSqFt;
            
            //declare double paintNeeded;
            double paintNeeded;
            
            //Declare and initialize the length of the room           
            //Declare and initialize the width of the room
            //Declare and initialize the height of the room            
            length = 15;
            width = 11;
            height = 8;
           

            //Compute the total square feet to be painted--think
            //about the dimensions of each wall
            totalSqFt = (length*height*2) + (height*width*2) + (length*width);
            
            
            //Compute the amount of paint needed
            paintNeeded = (totalSqFt/350);
 
            //Print the length, width, and height of the room and the
            //number of gallons of paint needed.
            paintNeeded = Math.ceil(paintNeeded);
            System.out.print("length: " + length + "\n" + "height: " + height + "\n" + "width: " + width + "\n" + "Total Square Feet: " + totalSqFt + "\n" +  "Paint Needed: " + paintNeeded + " gallons");
        }
}