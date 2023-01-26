package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        StringBuilder builder = new StringBuilder(String.valueOf(number));
        StringBuilder reversed = builder.reverse();
        System.out.println(reversed);
    }
}
