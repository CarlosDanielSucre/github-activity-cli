import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main{
    public static void main(String[] args){
        System.out.println("Hello");
        HttpClient client = HttpClient.newHttpClient();
        
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://api.github.com/users/CarlosDanielSucre/events")).GET().build();
        try{
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Mostrar resultado
            System.out.println("Status Code: " + response.statusCode());
            System.out.println("Body: " + response.body());

        System.out.println(request);
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
}