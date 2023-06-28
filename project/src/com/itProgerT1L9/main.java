package com.itProgerT1L9;

import java.io.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        File file = new File("text.txt");

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        String context = readFile() ;

        try {
            PrintWriter pw = new PrintWriter(file);
            System.out.print("Введите строку: ");
            Scanner in = new Scanner(System.in);
            String userInput = in.nextLine();
            context += userInput + "\n";
            pw.println(context);
            pw.close();
        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
            e.printStackTrace();
        }

        System.out.println(readFile());

    }
    public static String readFile() {
        BufferedReader br = null;
        String result = "";

        try {
            br = new BufferedReader(new FileReader("text.txt"));
            String line;
            while ((line = br.readLine()) != null ) {
                result += line + "\n";
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }


}
