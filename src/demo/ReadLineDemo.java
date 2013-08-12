package demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import url.*;

public class ReadLineDemo {
    public static void main(String[] args) throws Exception {
        //URL oracle = new URL("http://www.oracle.com/");
        URLReader urlReader = new URLReader("http://www.oracle.com/");
    	BufferedReader in = urlReader.bReader();

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
    }
}
