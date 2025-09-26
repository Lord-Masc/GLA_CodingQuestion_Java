
public class Palindrom {

    static boolean isPalindrom(int i) {
        int temp = i;
        int num = 0;
        while (i != 0) {
            int k = i % 10;
            num = num * 10 + k;
            i /= 10;
        }
        if (temp == num) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int arr[] = {111, 222, 333, 444, 577};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            boolean flag = isPalindrom(arr[i]);
            if (flag) {
                count++;
            }
        }
        if (count == arr.length) {
            System.out.println("Number is palindrom");
        } else {
            System.out.println("Not palindrom");
        }
        


    }
}
