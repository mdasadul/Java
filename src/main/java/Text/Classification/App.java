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
public class App {
  public static void main(String[] args) throws Exception {
    FastVector      atts;
    FastVector      attVals;
    Instances       data;
    double[]        vals;
    int             i;

    // 1. set up attributes
    atts = new FastVector();
    // - numeric
    atts.addElement(new Attribute("att1",(FastVector)null));
    // - nominal
    attVals = new FastVector();
    for (i = 0; i < 5; i++)
      attVals.addElement("val" + (i+1));
    atts.addElement(new Attribute("att2", attVals));
    // - string
    //atts.addElement(new Attribute("att3", (FastVector) null));
    // - date
    //atts.addElement(new Attribute("att4", "yyyy-MM-dd"));
//    // - relational
//    attsRel = new FastVector();
//    // -- numeric
//    attsRel.addElement(new Attribute("att5.1"));
//    // -- nominal
//    attValsRel = new FastVector();
//    for (i = 0; i < 5; i++)
//      attValsRel.addElement("val5." + (i+1));
//    attsRel.addElement(new Attribute("att5.2", attValsRel));
//    dataRel = new Instances("att5", attsRel, 0);
//    atts.addElement(new Attribute("att5", dataRel, 0));

    // 2. create Instances object
    data = new Instances("MyRelation", atts, 0);

    // 3. fill with data
    // first instance
    vals = new double[data.numAttributes()];
    // - numeric
    vals[0] = data.attribute(0).addStringValue("This is a string!");
    // - nominal
    vals[1] = attVals.indexOf("val3");
    // - string
    //vals[2] = data.attribute(2).addStringValue("This is a string!");
    // - date
    //vals[3] = data.attribute(3).parseDate("2001-11-09");

    data.add(new Instance(1.0, vals));

    // second instance
    vals = new double[data.numAttributes()];  // important: needs NEW array!
    // - numeric
    vals[0] = data.attribute(0).addStringValue("This is a string!");
    // - nominal
    vals[1] = attVals.indexOf("val1");
    // - string
    //vals[2] = data.attribute(2).addStringValue("And another one!");
    // - date
    //vals[3] = data.attribute(3).parseDate("2000-12-01");
    // 
    data.add(new Instance(1.0, vals));

    // 4. output data
    System.out.println(data);
  }
}