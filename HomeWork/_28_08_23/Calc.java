package HomeWork._28_08_23;

public class Calc {
    private int[] Array;

    public Calc(int[] Array) {
        this.Array = Array;
    }

    public double average() {
        double average = 0;
        int count = 0;
        for (int element : Array) {
            if (element > 0) {
                average += element;
                count += 1;
            }
        }
        return average / count;
    }


    public int summ() {
        int summ = 0;
        for (int element : Array) {
            if (element % 3 == 0 && element % 5 != 0) {
                summ += element;
            }

        }
        return summ;
    }

    public int maxSumm() {
        int maxSumm = 0;
        for (int i = 0; i < Array.length - 1; i++) {
            if (Array[i] + Array[i + 1] > maxSumm) {
                maxSumm = Array[i] + Array[i + 1];
            }
        }
        return maxSumm;
    }

}
