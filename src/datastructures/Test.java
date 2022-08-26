package datastructures;

import java.io.*;

class Test {

    public static void main(String args[]) {

        File obj = new File("/java/system");

        System.out.print(obj.getParent());

        System.out.print(" " + obj.isFile());

    }

}