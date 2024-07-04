import java.net.HttpURLConnection;
import java.net.URL;

public class URLValidator {
    public static void main(String[] args) throws Exception {

        String urlName ="https://www.melelaco.com.br/";

        if (urlValidator(urlName)) {

            System.out.println("La url dada " + urlName + " es valida" );
            
        }else

        System.out.println("La url dada " + urlName + " no es valida");
    }

    public static boolean urlValidator(String urlName){
        
       try {
      HttpURLConnection.setFollowRedirects(false);
      HttpURLConnection con =
         (HttpURLConnection) new URL(urlName).openConnection();
      con.setRequestMethod("HEAD");
      return (con.getResponseCode() == HttpURLConnection.HTTP_OK);
    }
    catch (Exception e) {
       e.printStackTrace();
       return false;
    }
    }
}
