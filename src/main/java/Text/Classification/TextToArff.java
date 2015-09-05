package Text.Classification;

import java.io.File;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

public class TextToArff {
	public static ArrayList<String> listFilesForFolder(final File folder) {
		ArrayList<String> arrayList = new ArrayList<String>();
		try{
		    for (final File fileEntry : folder.listFiles()) {
		        if (fileEntry.isDirectory()) {
		            listFilesForFolder(fileEntry);
		        } else {
		        	arrayList.add(fileEntry.getName());
		            System.out.println(fileEntry.getName());
		        }
		    }
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	return arrayList;
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		final File folder = new File("/Users/asad/Downloads/tokens/neg");
		ArrayList<String> listOfFiles = listFilesForFolder(folder);
		
		java.util.Scanner scanner = null;
		try{
		 PrintWriter writer = new PrintWriter("/Users/asad/Downloads/tokens/data/the-file-name.arff", "UTF-8");
		 writer.println("@relation This_is_my_file");
		 writer.println("@attribute text string");
		 writer.println("@attribute @@class@@ {class0,class1,class2,class3,class4}");
		 writer.println("@data");
		 int i =0;
		 for(String fileNameWithPath : listOfFiles ){
		 FileInputStream fin = new FileInputStream(new File("/Users/asad/Downloads/tokens/neg/"+fileNameWithPath));
	     scanner = new java.util.Scanner(fin,"UTF-8").useDelimiter("\\A");
	     String theString = scanner.hasNext() ? scanner.next() : "";
	     i++;
	     theString = theString.replace("'", "");
	     theString ="'"+theString+"',"+"class"+i%5;
	    
	     theString = theString.replace("\r\n", " ").replace("\n", " ");
	     writer.println(theString);
	     
	     System.out.println("String"+theString);
	     }
	     scanner.close();
	     writer.close();
		}catch(Exception e){
			
		}

	}

}
