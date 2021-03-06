package uzuzjmd.competence.evidence.service.client;

import uzuzjmd.competence.evidence.model.Evidence;
import uzuzjmd.competence.evidence.model.MoodleEvidence;

public class EvidenceServiceProxy implements
		uzuzjmd.competence.evidence.service.client.EvidenceService {
	private String _endpoint = null;
	private uzuzjmd.competence.evidence.service.client.EvidenceService evidenceService = null;

	public EvidenceServiceProxy() {
		_initEvidenceServiceProxy();
	}

	public EvidenceServiceProxy(String endpoint) {
		_endpoint = endpoint;
		_initEvidenceServiceProxy();
	}

	private void _initEvidenceServiceProxy() {
		try {
			evidenceService = (new uzuzjmd.competence.evidence.service.client.MoodleEvidenceServiceImplServiceLocator())
					.getMoodleEvidenceServiceImplPort();
			if (evidenceService != null) {
				if (_endpoint != null)
					((javax.xml.rpc.Stub) evidenceService)
							._setProperty(
									"javax.xml.rpc.service.endpoint.address",
									_endpoint);
				else
					_endpoint = (String) ((javax.xml.rpc.Stub) evidenceService)
							._getProperty("javax.xml.rpc.service.endpoint.address");
			}

		} catch (javax.xml.rpc.ServiceException serviceException) {
		}
	}

	public String getEndpoint() {
		return _endpoint;
	}

	public void setEndpoint(String endpoint) {
		_endpoint = endpoint;
		if (evidenceService != null)
			((javax.xml.rpc.Stub) evidenceService)._setProperty(
					"javax.xml.rpc.service.endpoint.address", _endpoint);

	}

	public uzuzjmd.competence.evidence.service.client.EvidenceService getEvidenceService() {
		if (evidenceService == null)
			_initEvidenceServiceProxy();
		return evidenceService;
	}

	public MoodleEvidence[] getUserEvidencesforMoodleCourse(
			java.lang.String arg0) throws java.rmi.RemoteException {
		if (evidenceService == null)
			_initEvidenceServiceProxy();
		return evidenceService.getUserEvidencesforMoodleCourse(arg0);
	}

	public MoodleEvidence[] getMoodleEvidences(java.lang.String arg0,
			java.lang.String arg1) throws java.rmi.RemoteException {
		if (evidenceService == null)
			_initEvidenceServiceProxy();
		return evidenceService.getMoodleEvidences(arg0, arg1);
	}

	public Evidence[] getEvidences(java.lang.String arg0)
			throws java.rmi.RemoteException {
		if (evidenceService == null)
			_initEvidenceServiceProxy();
		return evidenceService.getEvidences(arg0);
	}

}