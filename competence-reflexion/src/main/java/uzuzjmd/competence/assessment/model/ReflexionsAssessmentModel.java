package uzuzjmd.competence.assessment.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.StagedGroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the ReflexionsAssessment service. Represents a row in the &quot;competenceAssessment_ReflexionsAssessment&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link uzuzjmd.competence.assessment.model.impl.ReflexionsAssessmentModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link uzuzjmd.competence.assessment.model.impl.ReflexionsAssessmentImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ReflexionsAssessment
 * @see uzuzjmd.competence.assessment.model.impl.ReflexionsAssessmentImpl
 * @see uzuzjmd.competence.assessment.model.impl.ReflexionsAssessmentModelImpl
 * @generated
 */
public interface ReflexionsAssessmentModel extends BaseModel<ReflexionsAssessment>,
    StagedGroupedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a reflexions assessment model instance should use the {@link ReflexionsAssessment} interface instead.
     */

    /**
     * Returns the primary key of this reflexions assessment.
     *
     * @return the primary key of this reflexions assessment
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this reflexions assessment.
     *
     * @param primaryKey the primary key of this reflexions assessment
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the uuid of this reflexions assessment.
     *
     * @return the uuid of this reflexions assessment
     */
    @AutoEscape
    @Override
    public String getUuid();

    /**
     * Sets the uuid of this reflexions assessment.
     *
     * @param uuid the uuid of this reflexions assessment
     */
    @Override
    public void setUuid(String uuid);

    /**
     * Returns the assessment ID of this reflexions assessment.
     *
     * @return the assessment ID of this reflexions assessment
     */
    public long getAssessmentId();

    /**
     * Sets the assessment ID of this reflexions assessment.
     *
     * @param assessmentId the assessment ID of this reflexions assessment
     */
    public void setAssessmentId(long assessmentId);

    /**
     * Returns the group ID of this reflexions assessment.
     *
     * @return the group ID of this reflexions assessment
     */
    @Override
    public long getGroupId();

    /**
     * Sets the group ID of this reflexions assessment.
     *
     * @param groupId the group ID of this reflexions assessment
     */
    @Override
    public void setGroupId(long groupId);

    /**
     * Returns the company ID of this reflexions assessment.
     *
     * @return the company ID of this reflexions assessment
     */
    @Override
    public long getCompanyId();

    /**
     * Sets the company ID of this reflexions assessment.
     *
     * @param companyId the company ID of this reflexions assessment
     */
    @Override
    public void setCompanyId(long companyId);

    /**
     * Returns the user ID of this reflexions assessment.
     *
     * @return the user ID of this reflexions assessment
     */
    @Override
    public long getUserId();

    /**
     * Sets the user ID of this reflexions assessment.
     *
     * @param userId the user ID of this reflexions assessment
     */
    @Override
    public void setUserId(long userId);

    /**
     * Returns the user uuid of this reflexions assessment.
     *
     * @return the user uuid of this reflexions assessment
     * @throws SystemException if a system exception occurred
     */
    @Override
    public String getUserUuid() throws SystemException;

    /**
     * Sets the user uuid of this reflexions assessment.
     *
     * @param userUuid the user uuid of this reflexions assessment
     */
    @Override
    public void setUserUuid(String userUuid);

    /**
     * Returns the user name of this reflexions assessment.
     *
     * @return the user name of this reflexions assessment
     */
    @AutoEscape
    @Override
    public String getUserName();

    /**
     * Sets the user name of this reflexions assessment.
     *
     * @param userName the user name of this reflexions assessment
     */
    @Override
    public void setUserName(String userName);

    /**
     * Returns the create date of this reflexions assessment.
     *
     * @return the create date of this reflexions assessment
     */
    @Override
    public Date getCreateDate();

    /**
     * Sets the create date of this reflexions assessment.
     *
     * @param createDate the create date of this reflexions assessment
     */
    @Override
    public void setCreateDate(Date createDate);

    /**
     * Returns the modified date of this reflexions assessment.
     *
     * @return the modified date of this reflexions assessment
     */
    @Override
    public Date getModifiedDate();

    /**
     * Sets the modified date of this reflexions assessment.
     *
     * @param modifiedDate the modified date of this reflexions assessment
     */
    @Override
    public void setModifiedDate(Date modifiedDate);

    /**
     * Returns the competence description of this reflexions assessment.
     *
     * @return the competence description of this reflexions assessment
     */
    @AutoEscape
    public String getCompetenceDescription();

    /**
     * Sets the competence description of this reflexions assessment.
     *
     * @param competenceDescription the competence description of this reflexions assessment
     */
    public void setCompetenceDescription(String competenceDescription);

    /**
     * Returns the competence ID of this reflexions assessment.
     *
     * @return the competence ID of this reflexions assessment
     */
    @AutoEscape
    public String getCompetenceId();

    /**
     * Sets the competence ID of this reflexions assessment.
     *
     * @param competenceId the competence ID of this reflexions assessment
     */
    public void setCompetenceId(String competenceId);

    /**
     * Returns the assessment index of this reflexions assessment.
     *
     * @return the assessment index of this reflexions assessment
     */
    public int getAssessmentIndex();

    /**
     * Sets the assessment index of this reflexions assessment.
     *
     * @param assessmentIndex the assessment index of this reflexions assessment
     */
    public void setAssessmentIndex(int assessmentIndex);

    /**
     * Returns the is learning goal of this reflexions assessment.
     *
     * @return the is learning goal of this reflexions assessment
     */
    public boolean getIsLearningGoal();

    /**
     * Returns <code>true</code> if this reflexions assessment is is learning goal.
     *
     * @return <code>true</code> if this reflexions assessment is is learning goal; <code>false</code> otherwise
     */
    public boolean isIsLearningGoal();

    /**
     * Sets whether this reflexions assessment is is learning goal.
     *
     * @param isLearningGoal the is learning goal of this reflexions assessment
     */
    public void setIsLearningGoal(boolean isLearningGoal);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(ReflexionsAssessment reflexionsAssessment);

    @Override
    public int hashCode();

    @Override
    public CacheModel<ReflexionsAssessment> toCacheModel();

    @Override
    public ReflexionsAssessment toEscapedModel();

    @Override
    public ReflexionsAssessment toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
