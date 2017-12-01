

public class Probability implements ProbabilityCalc, Comparable<Probability>{
    private int favorable;
    private int sampleSpace;
    private double prob;
    public Probability(int fav, int sam){
        this.favorable = fav;
        this.sampleSpace = sam;
        this.prob = (double)favorable/sampleSpace;
    }
    public double probabilityAND(Probability p){
        return this.prob*p.prob;
    }
    public double probabilityOR(Probability p, double o){
    return (this.prob + p.prob) - (this.probabilityAND(p));    
    }
    public String toString(){
        return "Probability of " + this.prob;
    }
    public int compareTo(Probability ob){
        if(this.prob > ob.prob){
            return 1;
        }
        else if(this.prob < ob.prob){
            return -1;
        }
        else{
            return 0;
        }
    }
}