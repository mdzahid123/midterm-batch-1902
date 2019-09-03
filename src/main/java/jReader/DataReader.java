package jReader;

import com.sun.codemodel.internal.JForEach;
import jdk.internal.org.objectweb.asm.commons.TryCatchBlockSorter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Use API to read the below textFile and print to console.
 * /src/main/resources/Key-To-Success
 * Use FileReader class, no need to store in buffer
 * Use try....catch block to handle Exception.
 * Use ForEach loop/while loop/Iterator to retrieve data.
 */
public class DataReader {

	public static void main(String[] args)  {
		File reder = new File("/Users/mdahsanzahid/Documents/IdeaProjects/midtermbatch1902/src/main/resources/Key-To-Success");
		int i;
		try{
		FileReader reder2 = new FileReader(reder);
		//int i;
		while ((i = reder2.read())!=-1) {

			System.out.print((char)i);
		}
	}
		catch (Exception e){
			e.printStackTrace();
		}


}


}

