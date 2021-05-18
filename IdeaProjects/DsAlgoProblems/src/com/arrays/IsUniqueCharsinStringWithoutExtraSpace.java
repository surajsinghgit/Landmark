package com.arrays;

public class IsUniqueCharsinStringWithoutExtraSpace {
    public static void main(String[] args) {
        String Str = "abcd";
        System.out.println(isUniqueChars(Str));
    }

    private static boolean isUniqueChars(String str) {
        int checker = 0;
        for (int i = 0; i < str.length(); ++i) {
            int val = str.charAt(i) -'a';
            if ((checker & (1 << val)) > 0) return false;
            checker |= (1 << val);
        }
        return true;

    }
}
