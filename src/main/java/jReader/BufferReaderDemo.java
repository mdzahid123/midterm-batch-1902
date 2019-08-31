package java.Reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 *  Use BufferReader to read from buffer while reading Key-To-Success.txt from main/java/resources
 *
 * */

public class BufferReaderDemo {
    public static void main(String[] args) throws IOException {
        File jahid = new File("/Users/mdahsanzahid/Documents/IdeaProjects/midtermbatch1902/src/main/resources/Key-To-Success");

        FileReader mama = new FileReader(jahid);
        BufferedReader obj = new BufferedReader(mama);
        int i;
        while ((i =obj.read())!=-1) {
            System.out.println((char)i);


        }




    }}