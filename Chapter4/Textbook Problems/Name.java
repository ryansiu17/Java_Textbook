public class Name{
    private String first;
    private String middle;
    private String last;
    public Name(String fir, String mid, String las){
        this.first = fir;
        this.middle = mid;
        this.last = las;
    }
    public String getFirst(){
        return this.first;
    }
    public String getMiddle(){
        return this.middle;
    }  
    public String getLast(){
        return this.last;
    }
    public String firstMiddleLast(){
        return this.first + " " + this.middle + " " + this.last;
    }
    public String lastFirstMiddle(){
        return this.last + ", " + this.first + " " + this.middle;
    }
    public boolean equals(Name otherName){
        if (this.first.equalsIgnoreCase(otherName.first) && this.middle.equalsIgnoreCase(otherName.middle) && this.last.equalsIgnoreCase(otherName.last)){
            return true;
        }
        else{
            return false;
        }
    }
    public String initials(){
        String temp;
        temp = (this.first.substring(0,1) + this.middle.substring(0,1) + this.last.substring(0,1));
        return temp.toUpperCase();
    }
    public int length(){
        return first.length() + middle.length() + last.length();
    }
}