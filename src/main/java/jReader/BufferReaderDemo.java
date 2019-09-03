package jReader;

import java.io.*;

/**
 *
 *  Use BufferReader to read from buffer while reading Key-To-Success.txt from main/java/resources
 *
 * */

public class BufferReaderDemo {
    public static void main(String[] args) throws IOException {
        File jahid = new File("/Users/mdahsanzahid/Documents/IdeaProjects/midtermbatch1902/src/main/resources/Key-To-Success");

        FileReader md = new FileReader(jahid);
        BufferedReader obj = new BufferedReader(md);
        int i;
        while ((i =md.read())!=-1) System.out.print((char) i);
    }
    }