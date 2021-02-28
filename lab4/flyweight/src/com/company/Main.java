package com.company;

public class Main {

    public static void main(String[] args) {
	    StringObj str1 = new StringObj();
	    str1.addLetter("a", 1, 1);
        str1.addLetter("b", 2, 2);
        str1.addLetter("c", 3, 3);
        str1.addLetter("c", 4, 3);
        str1.drawString();
    }
}
