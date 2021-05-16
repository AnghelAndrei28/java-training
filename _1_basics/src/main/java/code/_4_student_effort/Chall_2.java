package code._4_student_effort;

public class Chall_2 {

    static Integer reverse(int nr) {
        int nrReversed = 0;
        while (nr != 0)
        {
            nrReversed = nrReversed * 10;
            nrReversed = nrReversed + nr%10;
            nr = nr/10;
        }
        return nrReversed;
    }

    static String compute(int nr) {
        boolean found = false;
        String text = "";
        for(int i = 3; i <= 7 ; i+=2) {
            if(nr % i == 0) {
                found = true;
                switch (i) {
                    case 3:
                        text = text.concat("Foo");
                        break;
                    case 5:
                        text = text.concat("Bar");
                        break;
                    case 7:
                        text = text.concat("Qix");
                        break;
                    default:
                        System.out.println("If you see this it's bad");
                }
            }
        }
        nr = reverse(nr);
        while(nr != 0) {
            int c = nr % 10;
            switch (c) {
                case 3:
                    text = text.concat("Foo");
                    found = true;
                    break;
                case 5:
                    text = text.concat("Bar");
                    found = true;
                    break;
                case 7:
                    text = text.concat("Qix");
                    found = true;
                    break;
            }
            nr /= 10;
        }
        if(!found) {
            text = String.valueOf(nr);
        }
        return text;
    }

    static String compute2(int nr) {
        boolean found = false;
        String text = "";
        for(int i = 3; i <= 7 ; i+=2) {
            if(nr % i == 0) {
                found = true;
                switch (i) {
                    case 3:
                        text = text.concat("Foo");
                        break;
                    case 5:
                        text = text.concat("Bar");
                        break;
                    case 7:
                        text = text.concat("Qix");
                        break;
                    default:
                        System.out.println("If you see this it's bad");
                }
            }
        }
        nr = reverse(nr);
        int nr2 = nr;
        while(nr != 0) {
            int c = nr % 10;
            switch (c) {
                case 0:
                    text = text.concat("*");
                    break;
                case 3:
                    text = text.concat("Foo");
                    found = true;
                    break;
                case 5:
                    text = text.concat("Bar");
                    found = true;
                    break;
                case 7:
                    text = text.concat("Qix");
                    found = true;
                    break;
            }
            nr /= 10;
        }
        if(!found) {
            text = "";
            while(nr2 != 0) {
                if(nr2 % 10 == 0) {
                    text = text.concat("*");
                }
                else {
                    text = text.concat(String.valueOf(nr2 % 10));
                }
                nr2 /= 10;
            }
        }
        return text;
    }
}
