package com.test.prob_solving;

public class ReverseStringArrayRecurse {
    public static void reverseString(char[] s) {

        int fst = 0;
        int lst = s.length - 1;

//        char temp = s[fst];
//        s[fst] = s[lst];
//        s[lst] = temp;
//
//        fst++;
//        lst--;
//        temp = s[fst];
//        s[fst] = s[lst];
//        s[lst] = temp;

        while (fst <= lst) {
            char temp = s[fst];
            s[fst] = s[lst];
            s[lst] = temp;

            fst++;
            lst--;
        }

    }


    public static void main(String[] args) {
        char[] val = {'h', 'e', 'l', 'l', 'o'};
        reverseString(val);
        System.out.println(val);

        assert val[0] == 'o' : "";
        assert val[1] == 'l' : "";
        assert val[2] == 'l' : "";
        assert val[3] == 'e' : "";
        assert val[4] == 'h' : "";

        char[] val2 = {'A', 'B'};
        System.out.println(val2);
        reverseString(val2);
        System.out.println(val2);
        assert val2[0] == 'B' : "0th elment is not B";
        assert val2[1] == 'A' : "1th element is not A";
    }
}
