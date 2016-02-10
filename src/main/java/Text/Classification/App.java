package Text.Classification;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import weka.core.Attribute;
import weka.core.FastVector;
import weka.core.Instance;
import weka.core.Instances;

/**
 * Generates a little ARFF file with different attribute types.
 *
 * @author FracPete
 */
public class App {
	
	public void listFilesForFolder(final File folder) {
		
	    for (final File fileEntry : folder.listFiles()) {
	        if (fileEntry.isDirectory()) {
	            listFilesForFolder(fileEntry);
	        } else {
	            System.out.println(fileEntry.getName());
	        }
	    }
	}

	

  private static String readFile(String filePath){
	  File file = new File("a.txt");
	
	  FileInputStream fis;
	  String str = "";
	try {
		fis = new FileInputStream(filePath);
		byte[] data = new byte[(int) file.length()];

		  fis.read(data);
		  str = new String(data, "UTF-8");
		  fis.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}catch(IOException e){
		
	}
	 
	 

	  return str;
  }
  public  Instances TextToArff() throws Exception {
    FastVector      atts;
    FastVector      attVals;
    Instances       data;
    double[]        vals;
    int             i;
    final File folder = new File("/home/you/Desktop");
	listFilesForFolder(folder);
	
    atts = new FastVector();
    // - numeric
    atts.addElement(new Attribute("att1",(FastVector)null));
    // - nominal
    attVals = new FastVector();
    for (i = 0; i < 5; i++)
      attVals.addElement("val" + (i+1));
    atts.addElement(new Attribute("att2", attVals));
    
    data = new Instances("MyRelation", atts, 0);
    vals = new double[data.numAttributes()];
    vals[0] = data.attribute(0).addStringValue("This is a string!");
    vals[1] = attVals.indexOf("val3");

    data.add(new Instance(1.0, vals));

    vals = new double[data.numAttributes()];  // important: needs NEW array!
    // - numeric
    vals[0] = data.attribute(0).addStringValue("This is a string!");
    // - nominal
    vals[1] = attVals.indexOf("val1");
  
    data.add(new Instance(1.0, vals));
    return data;
  }
}