package com.company;

import java.io.*;


public class Main {

    public static void main(String[] args) throws Exception {
	    File file= new File("C:\\hello.txt");
        BufferedReader bufferedReader= new BufferedReader(new FileReader(file));
        String str;
        while ((str=bufferedReader.readLine())!=null){
            System.out.println(str);
        }
    }
}
