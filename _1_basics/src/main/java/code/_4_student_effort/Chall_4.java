package code._4_student_effort;

public class Chall_4 {

    public static void main(String[] args) {
        int[] numbers = {-1, -1, -1, 2};
        int noPairs = no_pairs(numbers);
        System.out.println(noPairs);
    }

    private static int no_pairs(int [] numbers) {
        int noPairs = 0;
        for (int i = 0 ; i < numbers.length - 2; i++)
            for (int j = i + 1; j < numbers.length - 1; j++)
                for (int k = j + 1; k < numbers.length; k++) {
                    if(numbers[i] + numbers[j] + numbers[k] == 0) {
                        noPairs++;
                        numbers[i]=numbers[j]=numbers[k]=Integer.MAX_VALUE;
                    }
                }
        return noPairs;
    }
}
