package JavaProLectures.HomeWork._28_08_28;

public class Calc {
    private int[] Array;

    public Calc(int[] Array) {
        this.Array = Array;
    }

    public double average() {
        int average = 0;
        int index = 0;
        for (int element : Array) {
            if (element > 0) {
                average += element;
                index += 1;
            }
        }
        return average / index;
    }

//    public int summ() {
//        int summ = 0;
//        for (int element : Array
//        ) {
//            if (element == null) {
//
//            }
//
//        }
//    }
}
