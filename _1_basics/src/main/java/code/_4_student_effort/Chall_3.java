package code._4_student_effort;

public class Chall_3 {
    public static void main(String[] args) {
        int noPairs = 0;
        int[] numbers = {3,2,-3,-2,3,0};
        int[] negative_array = negative_frequency_arrays(numbers);
        int[] positive_array = positive_frequency_arrays(numbers);
        for (int i = 1; i < negative_array.length; i++) {
            if(negative_array[i] > 0 && positive_array[i] > 0) {
                if(negative_array[i] >= positive_array[i]) {
                    noPairs += positive_array[i];
                }
                else {
                    noPairs += negative_array[i];
                }
            }
        }
        System.out.println(noPairs);
    }

    static private int[] negative_frequency_arrays( int [] numbers) {
        int negative_array[] = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] < 0) {
                negative_array[Math.abs(numbers[i])]++;
            }
        }
        return  negative_array;
    }

    static private int[] positive_frequency_arrays( int [] numbers) {
        int positive_array[] = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > 0) {
                positive_array[numbers[i]] += 1;
            }
        }
        return  positive_array;
    }
}
