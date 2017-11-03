public class Student
{
    private String name;
    private int idNumber;
    private Student bestFriend;
    
    public Student()
    {
        
    }
    public Student(int num, String nm){
        this.idNumber = num;
        this.name = nm;
    }
    
    public int getId(){
        return this.idNumber;
    }
    public Student newStudent(Student other) {
        Student temp = new Student(other.idNumber, this.name);
        return temp;
    }
    public int combineId(){
        return this.idNumber + bestFriend.idNumber;
    }
    public String toString() {
        return "The student's name is: " + this.name;
    }
}
