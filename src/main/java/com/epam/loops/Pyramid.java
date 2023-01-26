package com.epam.loops;

import org.apache.commons.codec.binary.StringUtils;

import java.util.Collections;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        if (cathetusLength == 0) {
            return;
        }
        String str ="1" ;
        String[] pyramid = new String[cathetusLength];
        pyramid[0] = String.join("", Collections.nCopies(cathetusLength-1, " "))+ str;

        for (int i = 2; i <= cathetusLength; i++) {
            str = i + str + i;
            pyramid[i - 1] = String.join("", Collections.nCopies(cathetusLength-i, " "))+str;
        }
        for (String s : pyramid) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
