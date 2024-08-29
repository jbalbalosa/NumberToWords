import java.lang.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Number To Words!");

//        System.out.println(getDigitCount(0));
//        System.out.println(getDigitCount(123));
//        System.out.println(getDigitCount(-12));
//        System.out.println(getDigitCount(5200));
//
//        System.out.println(reverse(-121));
//        System.out.println(reverse(1212));
//        System.out.println(reverse(1234));
//        System.out.println(reverse(100));

        System.out.println("123");numberToWords(123);
        System.out.print("0");numberToWords(0);
        System.out.print("1010");numberToWords(1010);
        System.out.println("1000");numberToWords(1000);
        System.out.println("100");numberToWords(100);
        System.out.println("-12");numberToWords(-12);
        System.out.println("0");numberToWords(0);

    }

    public static void numberToWords(int number) {

        if(number < 0){         // To test if the input is valid positive number;
            System.out.println("Invalid Value");
            return;
        } else if (number == 0) {
            System.out.println("Zero");
            return;
        }
        int digitCount = getDigitCount(number); //Get the count of the digit of the original number;
        int reversedNumber = reverse(number);   // Reverse the number
        int digitCountReverse = getDigitCount(reversedNumber); //Get the count of the reversed number;

        int diffDigit = digitCount - digitCountReverse;

        while (reversedNumber != 0) {
            int lastDigit = reversedNumber % 10;
            switch (lastDigit) {
                case 0 -> System.out.println("Zero");
                case 1 -> System.out.println("One");
                case 2 -> System.out.println("Two");
                case 3 -> System.out.println("Three");
                case 4 -> System.out.println("Four");
                case 5 -> System.out.println("Five");
                case 6 -> System.out.println("Six");
                case 7 -> System.out.println("Seven");
                case 8 -> System.out.println("Eight");
                case 9 -> System.out.println("Nine");
            }
            reversedNumber /= 10;
        }

        for(int i = 1; i <= diffDigit; i++){
            System.out.println("Zero");
        }

    }

    public static int reverse(int number) {
        boolean isNegativeNumber = (number < 0);

        if(isNegativeNumber){
            number = Math.abs(number);
        }
        StringBuilder sb = new StringBuilder();
        while (number != 0) {
            sb.append(number % 10);
            number /= 10;
        }
        //Convert StringBuilder to Integer;
        String str = sb.toString();
        if (isNegativeNumber){
            str = "-" + str;
        }
        return Integer.parseInt(str);

        /*
        Solution by Tim Buchalka
           public static int reverse(int number) {

                int reverse = 0;
                while (number != 0) {
                    // multiply by 10 then and add last digit (number % 10)
                    reverse = reverse * 10 + number % 10;
                    number /= 10; // discard last digit
                }
                return reverse;
            }
        */

    }

    public static int getDigitCount(int number) {
        if (number < 0 ){
            return -1;
        }
        String str = Integer.toString(number);
        return str.length();
    }

}