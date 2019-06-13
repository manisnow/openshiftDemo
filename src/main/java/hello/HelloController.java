package hello;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

	@RequestMapping("/{key}")
	public ResponseEntity<String> index(@PathVariable("key") String key) throws ClientProtocolException, IOException {
		RestTemplate restTemplate = new RestTemplate();
		//CloseableHttpClient httpClient = HttpClients.createDefault();
		//String urlOverHttps = "https://demo-sbx-992325.sbx2apps.paasdev.delta.com/rest/" + key;
	//HttpGet getMethod = new HttpGet(urlOverHttps);
	//HttpResponse response = httpClient.execute(getMethod);
	//System.out.println(response.getStatusLine().getStatusCode());
		//return 
		//	new ResponseEntity<String>("done", HttpStatus.OK);
		
		return restTemplate.getForEntity("https://demo-sbx-992325.sbx2apps.paasdev.delta.com/rest/" + key, String.class);
	}

}
