import sun.net.www.http.HttpClient;
import sun.net.www.protocol.http.HttpURLConnection;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * @Author Ross Newby
 */
public class Driver {

    private final String USER_AGENT = "Mozilla/5.0";

    private String cookie = "cosign-https-ckan.lancaster.ac.uk";
    private String cookiename = "VdV48bc+gJh8i4NRtvZx95OTVkyGCtoaF-TSaIOm7lz-9v3kxvvlqodDKiUKwvaNpMiuLWkgerUGySpMETKd6SqtyU9bKpcZ6pS5bydnVKAcgdUsHWlDA1dWNJ2l/1503307766";

    public Driver(){
        try {
            // http://www.baeldung.com/java-http-request
            URL url = new URL("https://ckan.lancaster.ac.uk/api/3/action/package_show?id=planonmetadata");
            HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Cookie", cookiename+"="+cookie); // cookie header for access

            // read response
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream())); // TODO: PKIX path building fails, problem with certificate
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            System.out.println(response.toString()); // for now just print

            // close connections
            in.close();
            con.disconnect();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main (String args []){

        System.out.println("Running...");
        new Driver();
    }
}





