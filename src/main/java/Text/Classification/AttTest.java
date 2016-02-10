package Text.Classification;

import weka.core.Attribute;
import weka.core.FastVector;
import weka.core.Instance;
import weka.core.Instances;

/**
 * Generates a little ARFF file with different attribute types.
 *
 * @author FracPete
 */
public class AttTest {
  public static void main(String[] args) throws Exception {
    FastVector      atts;
    FastVector      attsRel;
    FastVector      attVals;
    FastVector      attValsRel;
    Instances       data;
    Instances       dataRel = null;
    double[]        vals;
    double[]        valsRel;
    int             i;

    // 1. set up attributes
    atts = new FastVector();
    // - numeric
   // atts.addElement(new Attribute("att1",(FastVector) null));
    // - nominal
    attVals = new FastVector();
    for (i = 0; i < 5; i++)
      attVals.addElement("val" + (i+1));
    atts.addElement(new Attribute("att2", attVals));
    data = new Instances("MyRelation", atts, 0);

    // 3. fill with data
    // first instance
    vals = new double[data.numAttributes()];
    // - numeric
    vals[0] = (double)data.attribute(0).addStringValue("This is a string!");
    // - nominal
    vals[1] = (double)data.attribute(1).addStringValue("This is a second string!");
    
   //dataRel.add(new Instance(1.0,vals));
    data.add(new Instance(1.0, vals));
    
    System.out.println(data);
  }
}