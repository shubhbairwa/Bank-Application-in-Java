package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Csv {
// this method will read data from file and return the data
	public static List<String[]> read(String file){   //static so you can access from anywhere
		 List<String[]> data=new LinkedList<String[]>();
		 String dataRow;
		try {
			BufferedReader br=new BufferedReader(new FileReader(file));
			while((dataRow=br.readLine())!=null) {
			String[] dataRecord=dataRow.split(",");
			data.add(dataRecord);}
			}
		 catch (FileNotFoundException e) {
			System.out.println("COULD NOT FOUND FILE!!");
			e.printStackTrace();
		} catch (IOException e) {
		System.out.println("COULD NOT READ  FILE");
			e.printStackTrace();
		}
		return data;
	
}
}