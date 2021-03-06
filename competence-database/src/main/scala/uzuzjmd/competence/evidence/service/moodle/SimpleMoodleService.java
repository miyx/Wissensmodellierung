package uzuzjmd.competence.evidence.service.moodle;

import javax.ws.rs.core.MediaType;

import uzuzjmd.competence.owl.access.MagicStrings;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

/**
 * DTOs für den Moodle REST-Service
 * 
 * @author julian
 * 
 */
public class SimpleMoodleService {
	private Token token;

	public SimpleMoodleService(String username, String userpassword) {
		Client client = Client.create();
		String connectionPath = MagicStrings.MOODLEURL + "/login/token.php?username=" + username + "&password=" + userpassword + "&service=moodle_mobile_app";
		System.out.println("getting token with" + connectionPath);
		WebResource webResource = client.resource(connectionPath);
		ClientResponse response = webResource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
		if (response.getStatus() != 200) {
			throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
		}
		token = response.getEntity(Token.class);

	}

	public MoodleContentResponseList getMoodleContents(String courseId) {
		Client client = Client.create();
		String moodleRestBase = getMoodleRestBase();
		WebResource webResource = null;
		try {
			String requestString = MagicStrings.MOODLEURL + moodleRestBase + "core_course_get_contents&courseid=" + courseId;
			webResource = client.resource(requestString);
		} catch (Exception e) {
			System.err.println("Probably the moodle web services not configured properly");
			e.printStackTrace();
			System.exit(-1);
		}
		return webResource.accept(MediaType.APPLICATION_JSON).get(MoodleContentResponseList.class);

	}

	private String getMoodleRestBase() {
		String moodleRestBase = "/webservice/rest/server.php?moodlewsrestformat=json&wstoken=" + token.get("token") + "&wsfunction=";
		return moodleRestBase;
	}
}
