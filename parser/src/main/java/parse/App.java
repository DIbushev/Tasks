package parse;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	Document site = Jsoup.connect("https://speedflow.com/").get(); //loads page, i assume you meant this page as the link given in the mail is invalid
    	Elements links = site.select("a[href]"); //selects by tag <a>
    	
    	for(Element link : links) //prints all hrefs - URLs ; few URLs seem to be malformed
    	{
    		System.out.println(link.attr("href"));
    		Document opened = Jsoup.connect(link.attr("href")).get();//for final task
    		System.out.println(opened.html());
    	}
    	
    	
    	
        /*since I am unsure if this is what you ask, here are some additional things that could be done*/
    	//System.out.println(site.select("a[href]").html()); //all elements in <a> with href
    	
    	//System.out.println(site.getElementsByTag("a").html()); //all elements in tag <a> in html version
    	
    	//System.out.println(site.getElementsByTag("a").attr("href")); //site url
    	
    	//System.out.println(site.select("a[href]"));
    }

}
