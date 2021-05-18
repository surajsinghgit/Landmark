package com.arrays;

public class IsUniqueCharsinString {
    public static void main(String[] args) {
        String Str = "abc";
        System.out.println(isUniqueChars(Str));
    }

    private static boolean isUniqueChars(String str) {
        boolean[] isPresentFlags = new boolean[256];
        for (int i = 0; i < str.length(); i++) {
            int indexOfisPresentFlags=str.charAt(i);
            System.out.println(indexOfisPresentFlags);
            if (isPresentFlags[str.charAt(i)] == true) {
                return false;
            } else {
                isPresentFlags[str.charAt(i)] = true;
            }
        }
        return true;
    }
}