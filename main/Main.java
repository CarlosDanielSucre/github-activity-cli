import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main{
    public static void main(String[] args){
        System.out.println("Hello");
        HttpClient client = HttpClient.newHttpClient();
        
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://api.github.com/users/CarlosDanielSucre/events")).GET().build();


        try{
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        Pattern typePattern = Pattern.compile("\"type\"\\s*:\\s*\"(.*?)\"");
        Pattern repoPattern = Pattern.compile("\"name\"\\s*:\\s*\"(.*?)\"");

        Matcher typeMatcher = typePattern.matcher(response.body());
        Matcher repoMatcher = repoPattern.matcher(response.body());

        while (typeMatcher.find() && repoMatcher.find()) {
            System.out.println("Pass here 0");
            String type = typeMatcher.group(1);
            String repo = repoMatcher.group(1);
            
            // Format the output based on the type
            if (type.equals("PushEvent")) {
                System.out.println("Pass here 1");
                System.out.println("- Pushed to " + repo);
            } else if (type.equals("WatchEvent")) {
                System.out.println("Pass here 2");
                System.out.println("- Starred " + repo);
            } else {
                System.out.println("Pass here 3");
                System.out.println("- " + type + " in " + repo);
            }
        }
        }catch(Exception e){
            e.printStackTrace();
        }

        
        
    }
}