package jReader;

import java.io.*;
//import java.io.FileOutputStream;
//import java.io.FileReader;fd
//import java.io.IOException;

/***
 * Read form a file XXXXXX write in a file YYYYYY
 *
 * */
public class ReadFromAFileAndWriteInAnotherFile {

    public static void main(String[] args) throws IOException {


       File ahsan = new File ("/Users/mdahsanzahid/Documents/IdeaProjects/midtermbatch1902/src/main/resources/BC Senior");
       File zahid= new File("/Users/mdahsanzahid/Documents/IdeaProjects/midtermbatch1902/src/main/resources/BCFile");
       FileReader readlife= new FileReader(ahsan);
        FileOutputStream move= new FileOutputStream(zahid);
        int i;

        while((i=readlife.read())!=-1){
            move.write(i);
            System.out.print((char)i);
        }




    }


}
