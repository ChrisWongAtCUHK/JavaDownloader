package demo;

import url.URLReader;

public class DummyDemo {
	public static void main(String[] args) throws Exception {
        //URL oracle = new URL("http://www.oracle.com/");
        URLReader urlReader = new URLReader("http://docs.oracle.com/javase/tutorialJWS/uiswing/components/splash.gif");
        urlReader.url2Local("splash.gif");
	}
}
