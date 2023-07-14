import java.util.Arrays;

public class InsertionSort {
    private int [] data;

    public void setData(int[]data){
        this.data = data;
    }
    public void InsertionSort(){
        int size = this.data.length;

        for(int step = 1;step < size;step++){
            int key = this.data[step];
            int j = step -1;

            //compare key with each element on the left of it until
            //it is found
            //for descending order, change key<array[j] to key>array
            while(j>=0 && key<this.data[j]){
                this.data[j+1] = this.data[j];
                --j;
            }
            //place key at after the element just smaller than it
            this.data[j+1] = key;
        }
    }
    public static void main(String[] args) {
     int[] age = {12,7,2,1,0,67,78,95};
        InsertionSort sorter = new InsertionSort();
        sorter.setData(age);
        System.out.println("Original Array: " + Arrays.toString(age));
        sorter.InsertionSort();
        for(int step=0;step<= age.length;step++){
            System.out.println("step "+step+" : "+Arrays.toString(sorter.data));
        }
        System.out.println("Sorted Array: " + Arrays.toString(sorter.data));
    }
}
