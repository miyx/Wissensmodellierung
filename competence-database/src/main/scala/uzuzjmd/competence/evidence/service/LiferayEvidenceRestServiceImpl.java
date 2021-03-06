package uzuzjmd.competence.evidence.service;

import java.rmi.RemoteException;

import javax.jws.WebService;

import org.apache.axis.client.Stub;

import uzuzjmd.competence.evidence.model.Evidence;
import uzuzjmd.competence.evidence.model.MoodleEvidence;
import uzuzjmd.competence.evidence.service.moodle.MoodleContentResponse;
import uzuzjmd.competence.evidence.service.moodle.MoodleContentResponseList;
import uzuzjmd.competence.evidence.service.rest.dto.UserTree;
import uzuzjmd.competence.evidence.service.rest.mapper.LiferayEvidence2Tree;

import com.liferay.portlet.social.model.SocialActivitySoap;

import de.unipotsdam.elis.model.EvidenceSoap;
import de.unipotsdam.elis.service.http.EvidenceServiceSoapProxy;

@WebService(endpointInterface = "uzuzjmd.competence.evidence.service.EvidenceService")
public class LiferayEvidenceRestServiceImpl implements EvidenceService {
	private String adminUserName;
	private String adminPassword;
	private String liferayURL;
	// private SocialActivityServiceSoapProxy endpoint;
	private EvidenceServiceSoapProxy endpoint2;

	public LiferayEvidenceRestServiceImpl(String adminUserName, String adminPassword, String liferayURL) {
		super();
		this.adminUserName = adminUserName;
		this.adminPassword = adminPassword;
		this.liferayURL = liferayURL;

		// endpoint = new SocialActivityServiceSoapProxy(this.liferayURL +
		// "/api/axis/Portlet_Social_SocialActivityService?wsdl");
		// ((Stub)
		// endpoint.getSocialActivityServiceSoap()).setUsername(this.adminUserName);
		// ((Stub)
		// endpoint.getSocialActivityServiceSoap()).setPassword(this.adminPassword);

		String serviceUrl = this.liferayURL + "/competence-portlet" + "/api/axis/Plugin_UPServices_EvidenceService?wsdl";
		System.out.println("using " + serviceUrl + " to connect to liferay");

		endpoint2 = new EvidenceServiceSoapProxy(serviceUrl);
		((Stub) endpoint2.getEvidenceServiceSoap()).setUsername(this.adminUserName);
		((Stub) endpoint2.getEvidenceServiceSoap()).setPassword(this.adminPassword);

	}

	@Override
	public MoodleEvidence[] getMoodleEvidences(String course, String user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Evidence[] getEvidences(String user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MoodleEvidence[] getUserEvidencesforMoodleCourse(String course) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserTree[] getUserTree(String course) {
		SocialActivitySoap[] activities = null;
		EvidenceSoap[] activities2 = null;
		try {
			// activities =
			// endpoint.getGroupUsersActivities(Long.parseLong(course), -1, -1);
			activities2 = endpoint2.getGroupEvidences(Long.parseLong(course));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		LiferayEvidence2Tree evidence2Tree = new LiferayEvidence2Tree(activities2);
		return evidence2Tree.convert();
	}

	@Override
	public MoodleContentResponse[] getCourseContentXML(String course) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MoodleContentResponseList getCourseContent(String course) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MoodleContentResponseList getCourseContents(String course) {
		// TODO Auto-generated method stub
		return null;
	}

}
