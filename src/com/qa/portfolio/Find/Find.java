package com.qa.portfolio;

public class Find {
    public static void main(String[] args) {
        System.out.println(find1("hello", 2, 'e'));
    }
    public static boolean find1(String s, int i, char c) {

        // find ("hello", 2, 'e')->> True
        // find ("trash", 4, 'a')->> False
        // find ("trash", 4, 's')->> True
        if (s.charAt(i - 1) == c) {
            return true;
        }
        else {
            return false;
        }
    }
}


