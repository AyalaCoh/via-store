
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class pogram {

	public static void main(String[] args) {
		
		public class restUtil {
			public static void postReq(String url) throws IOException, InterruptedException {
			   checkproduct();

			    HttpClient client = HttpClient.newBuilder().build();
			    HttpRequest request = HttpRequest.newBuilder()
			            .uri(URI.create(url))
			            .POST(HttpRequest.BodyPublishers.ofString(postData))
			            .build();

			    HttpResponse<?> response = client.send(request, HttpResponse.BodyHandlers.discarding());
			    System.out.println(response.statusCode());

			}

	}





@AfterAll
URL: "https://api.demoblaze.com/view" //JSON.parse(JSON.stringify(data))
{
cat: "phone"
desc: "The Motorola Google Nexus 6 is powered by 2.7GHz quad-core Qualcomm Snapdragon 805 processor and it comes with 3GB of RAM."
id: 3
img: "imgs/Nexus_6.jpg"
price: 650
title: "Nexus 6"
}

}