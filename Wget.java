public class Wget{
    public static String readFile(String url){
        String data;
        In in = new In(url);
        data = in.readAll();
        return data;
    }
    
    public static void writeToFile(String data,String fileName){
        Out out = new Out(fileName);
        out.println(data);
        out.close();
    }
    public static void main(String[] args){
        String rawData = readFile(args[0]);
        String fileName = args[0].substring(args[0].lastIndexOf('/')+1);
        writeToFile(rawData,fileName);
    }
}

/*public class Wget {
    
    public static void main(String[] args) {
        
        // read in data from URL
        String url = args[0];
        In in = new In(url);
        String data = in.readAll();
        
        // write data to a file
        String filename = url.substring(url.lastIndexOf('/') + 1);
        Out out = new Out(filename);
        out.println(data);
        out.close();
    }
    
}*/
