package code._4_student_effort;

public class Chall_1 {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++) {
            if(!is_divisible_stage_1(i)) {
                System.out.println(i);
            }
        }
        System.out.println("-------Stage 2-------");
        for(int i = 1; i <= 100; i++) {
            if(!is_divisible_stage_2(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean is_divisible_stage_1(int nr) {
        if(nr % 3 == 0 && nr % 5 == 0) {
            System.out.println("FizzBuzz");
            return true;
        }
        else if(nr % 3 == 0) {
            System.out.println("Fizz");
            return true;
        }
        else if(nr % 5 == 0){
            System.out.println("Buzz");
            return true;
        }
        return false;
    }

    private static boolean is_divisible_stage_2(int nr) {
        boolean divisible = false;
        if (nr % 3 == 0) {
            System.out.print("Fizz");
            divisible = true;
        }
        if (nr % 5 == 0) {
            System.out.print("Buzz");
            divisible = true;
        }
        if (nr % 7 == 0) {
            System.out.print("Rizz");
            divisible = true;
        }
        if (nr % 11 == 0) {
            System.out.print("Jazz");
            divisible = true;
        }
        if(divisible) {
            System.out.println();
            return true;
        }
        else {
            return  false;
        }
    }
}
