package basics;

/**
 * Created by vmorozov on 19/11/2018.
 */
public class FibonnaciApp {

    public static void main (String[] args) {
        int[] period = {15, 31, 1, 4};

//        int s = getFib(period);
//        int s2 = getFac(period);
//        int l = getFacRec(period);
//        int l = getSum(period);
        int l = getArrayMin(period);
        int l2 = getArrayAverage(period);
        int l3 = getArrayMax(period);

//
//        System.out.println("----");
//        System.out.println(s);
//        System.out.println("----");
//        System.out.println(s2);
        System.out.println(l);
        System.out.println(l2);
        System.out.println(l3);

    }

    public static int getSum(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        return sum;
    }

    public static int getArrayMin(int[] n) {
        int result = 0;
        for (int i = 0; i < n.length; i ++) {
            if (n[i] < result) {
                result = n[i];
            }
        }
        return result;
    }

    public static int getArrayAverage(int[] n) {
        int sum = 0;
        for (int i = 0; i < n.length; i ++) {
            sum = sum + n[i];
        }
        return sum / n.length;
    }

    public static int getArrayMax(int[] n) {
        int result = 0;
        for (int i = 0; i < n.length; i ++) {
            if (n[i] > result) {
                result = n[i];
            }
        }
        return result;
    }

    public static int getFib(int period) {

        int[] febArray = new int[period];

        febArray[0] = 0;
        febArray[1] = 1;

        int index = 2;

        while (index < period) {
            febArray[index] = febArray[index - 1] + febArray[index - 2];
            index ++;
        }

        for (int i = 0; i < febArray.length; i++) {
            System.out.println(febArray[i]);
        }

        return febArray[period - 1];
    }

    public static int getFac(int period) {
        int sum = 1;

        while (period > 0) {
            sum = sum * period;
            period --;
        }

        return sum;
    }

    public static int getFacRec(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * getFacRec(n - 1);
        }
    }
}
