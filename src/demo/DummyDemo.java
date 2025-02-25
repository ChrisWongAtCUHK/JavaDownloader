package demo;

import url.URLReader;

public class DummyDemo {
	public static void main(String[] args) throws Exception {
        //URL oracle = new URL("http://www.oracle.com/");
        URLReader urlReader = new URLReader("https://media3.giphy.com/media/v1.Y2lkPTc5MGI3NjExMjE5dHpkdXJxMXExMHc4azYzdXNwMDJrcGlndTM4MjB6NHBjYWo3YyZlcD12MV9pbnRlcm5hbF9naWZfYnlfaWQmY3Q9Zw/h6x0ROdzJy4TKyUu1b/giphy.gif");
        urlReader.url2Local("splash.gif");
	}
}
