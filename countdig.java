//Question Description: Given an integer num, return the number of digits in num that divide num.
//An integer val divides nums if nums % val == 0.

//1)Input: num = 7. Output: 1 Explanation: 7 divides itself, hence the answer is 1.
//2)Input: num = 121. Output: 2 Explanation: 121 is divisible by 1, but not 2. Since 1 occurs twice as a digit, we return 2.
//3)Input: num = 1248. Output: 4 Explanation: 1248 is divisible by all of its digits, hence the answer is 4.

import java.util.*;

class countdig {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the no:");
        num = sc.nextInt();
        int count = 0;
        if (num < 9)
            count = 1;
        else if (num == 9)
            count = 3;
        else if (num > 9) {
            int numcopy = num;
            while (num > 0) {
                int d = num % 10;
                if (numcopy % d == 0)
                    count++;
                num = num / 10;
            }

        }
        System.out.println(count);
        sc.close();

    }
}