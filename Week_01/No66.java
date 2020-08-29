/**
 * 加一
 *
 * @author cc
 * @version 1.0
 * @date 2020/8/29 20:02
 */
public class No66 {

    public static void main(String[] args) {

    }

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i <= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
