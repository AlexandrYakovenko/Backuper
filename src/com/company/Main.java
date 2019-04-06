package com.company;

public class Main {

    public static void main(String[] args) {
        Backuper bp = new Backuper("C:\\Users\\Professional\\Pictures", "C:\\Users\\Professional\\Documents", 5000);
        bp.run();
    }
}
