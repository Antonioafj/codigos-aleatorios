import java.net.URL;

public class URLValidator {
    public static void main(String[] args) throws Exception {

        String url ="https://www.google.com.br";

        if (urlValidator(url)) {

            System.out.println("La url dada " + url + " es valida" );
            
        }else

        System.out.println("La url dada " + url + " no es valida");
    }

    public static boolean urlValidator(String url){

        URL validator = new URL(url).toURI();
        
        return validator.isValid(url); 
    }
}
