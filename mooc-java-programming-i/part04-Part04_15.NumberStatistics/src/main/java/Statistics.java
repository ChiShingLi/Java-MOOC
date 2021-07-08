
public class Statistics {

    private int count;
    private int sum;

    public Statistics() {
        // initialize the variable numberCount here
        this.count = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        // write code here
        this.sum += number;
        this.count++;

    }

    public int getCount() {
        // write code here
        return this.count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        //convert to double, to get the proper decimal places
        if (count != 0) {
            return (double) this.sum / this.count;
        }
        return 0;
    }
}
