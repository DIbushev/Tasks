package reverse;


public class App 
{
    public static void main( String[] args )
    {
        String example = "String to be reversed";
        String inverted = "";
        
        for(int i = example.length() - 1; i >= 0 ; i--)
        {
        	inverted += example.charAt(i) + "";
        }
        
        System.out.println(inverted);
        
    }
}
