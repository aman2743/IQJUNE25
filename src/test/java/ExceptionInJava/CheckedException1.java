package ExceptionInJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.PrintWriter;

public class CheckedException1 {
    public static void main(String[] args) {
//        PrintWriter pw=new PrintWriter("abc.txt");
//        pw.println();
//        Thread.sleep(10000);
        File f=new File("C:\\Users\\Aman\\Desktop\\Manual test.doc");
//        f.exists();
        System.out.println(f.exists());
//        FileInputStream fs=new FileInputStream(f);
    }
}
