class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i--) {
            int num = digits[i] + 1;
            if (num == 10) {
                digits[i] = 0;
                continue;
            }

            digits[i] = num;
            return digits;
        }

        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }
}