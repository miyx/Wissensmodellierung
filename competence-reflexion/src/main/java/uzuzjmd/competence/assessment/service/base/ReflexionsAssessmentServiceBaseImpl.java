package uzuzjmd.competence.assessment.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import uzuzjmd.competence.assessment.model.ReflexionsAssessment;
import uzuzjmd.competence.assessment.service.ReflexionsAssessmentService;
import uzuzjmd.competence.assessment.service.persistence.ReflexionsAssessmentPersistence;
import uzuzjmd.competence.assessment.service.persistence.UserLearningTemplateMapPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the reflexions assessment remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link uzuzjmd.competence.assessment.service.impl.ReflexionsAssessmentServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see uzuzjmd.competence.assessment.service.impl.ReflexionsAssessmentServiceImpl
 * @see uzuzjmd.competence.assessment.service.ReflexionsAssessmentServiceUtil
 * @generated
 */
public abstract class ReflexionsAssessmentServiceBaseImpl
    extends BaseServiceImpl implements ReflexionsAssessmentService,
        IdentifiableBean {
    @BeanReference(type = uzuzjmd.competence.assessment.service.ReflexionsAssessmentLocalService.class)
    protected uzuzjmd.competence.assessment.service.ReflexionsAssessmentLocalService reflexionsAssessmentLocalService;
    @BeanReference(type = uzuzjmd.competence.assessment.service.ReflexionsAssessmentService.class)
    protected uzuzjmd.competence.assessment.service.ReflexionsAssessmentService reflexionsAssessmentService;
    @BeanReference(type = ReflexionsAssessmentPersistence.class)
    protected ReflexionsAssessmentPersistence reflexionsAssessmentPersistence;
    @BeanReference(type = uzuzjmd.competence.assessment.service.UserLearningTemplateMapLocalService.class)
    protected uzuzjmd.competence.assessment.service.UserLearningTemplateMapLocalService userLearningTemplateMapLocalService;
    @BeanReference(type = uzuzjmd.competence.assessment.service.UserLearningTemplateMapService.class)
    protected uzuzjmd.competence.assessment.service.UserLearningTemplateMapService userLearningTemplateMapService;
    @BeanReference(type = UserLearningTemplateMapPersistence.class)
    protected UserLearningTemplateMapPersistence userLearningTemplateMapPersistence;
    @BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
    protected com.liferay.counter.service.CounterLocalService counterLocalService;
    @BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
    protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
    @BeanReference(type = com.liferay.portal.service.UserLocalService.class)
    protected com.liferay.portal.service.UserLocalService userLocalService;
    @BeanReference(type = com.liferay.portal.service.UserService.class)
    protected com.liferay.portal.service.UserService userService;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;
    private String _beanIdentifier;
    private ClassLoader _classLoader;
    private ReflexionsAssessmentServiceClpInvoker _clpInvoker = new ReflexionsAssessmentServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link uzuzjmd.competence.assessment.service.ReflexionsAssessmentServiceUtil} to access the reflexions assessment remote service.
     */

    /**
     * Returns the reflexions assessment local service.
     *
     * @return the reflexions assessment local service
     */
    public uzuzjmd.competence.assessment.service.ReflexionsAssessmentLocalService getReflexionsAssessmentLocalService() {
        return reflexionsAssessmentLocalService;
    }

    /**
     * Sets the reflexions assessment local service.
     *
     * @param reflexionsAssessmentLocalService the reflexions assessment local service
     */
    public void setReflexionsAssessmentLocalService(
        uzuzjmd.competence.assessment.service.ReflexionsAssessmentLocalService reflexionsAssessmentLocalService) {
        this.reflexionsAssessmentLocalService = reflexionsAssessmentLocalService;
    }

    /**
     * Returns the reflexions assessment remote service.
     *
     * @return the reflexions assessment remote service
     */
    public uzuzjmd.competence.assessment.service.ReflexionsAssessmentService getReflexionsAssessmentService() {
        return reflexionsAssessmentService;
    }

    /**
     * Sets the reflexions assessment remote service.
     *
     * @param reflexionsAssessmentService the reflexions assessment remote service
     */
    public void setReflexionsAssessmentService(
        uzuzjmd.competence.assessment.service.ReflexionsAssessmentService reflexionsAssessmentService) {
        this.reflexionsAssessmentService = reflexionsAssessmentService;
    }

    /**
     * Returns the reflexions assessment persistence.
     *
     * @return the reflexions assessment persistence
     */
    public ReflexionsAssessmentPersistence getReflexionsAssessmentPersistence() {
        return reflexionsAssessmentPersistence;
    }

    /**
     * Sets the reflexions assessment persistence.
     *
     * @param reflexionsAssessmentPersistence the reflexions assessment persistence
     */
    public void setReflexionsAssessmentPersistence(
        ReflexionsAssessmentPersistence reflexionsAssessmentPersistence) {
        this.reflexionsAssessmentPersistence = reflexionsAssessmentPersistence;
    }

    /**
     * Returns the user learning template map local service.
     *
     * @return the user learning template map local service
     */
    public uzuzjmd.competence.assessment.service.UserLearningTemplateMapLocalService getUserLearningTemplateMapLocalService() {
        return userLearningTemplateMapLocalService;
    }

    /**
     * Sets the user learning template map local service.
     *
     * @param userLearningTemplateMapLocalService the user learning template map local service
     */
    public void setUserLearningTemplateMapLocalService(
        uzuzjmd.competence.assessment.service.UserLearningTemplateMapLocalService userLearningTemplateMapLocalService) {
        this.userLearningTemplateMapLocalService = userLearningTemplateMapLocalService;
    }

    /**
     * Returns the user learning template map remote service.
     *
     * @return the user learning template map remote service
     */
    public uzuzjmd.competence.assessment.service.UserLearningTemplateMapService getUserLearningTemplateMapService() {
        return userLearningTemplateMapService;
    }

    /**
     * Sets the user learning template map remote service.
     *
     * @param userLearningTemplateMapService the user learning template map remote service
     */
    public void setUserLearningTemplateMapService(
        uzuzjmd.competence.assessment.service.UserLearningTemplateMapService userLearningTemplateMapService) {
        this.userLearningTemplateMapService = userLearningTemplateMapService;
    }

    /**
     * Returns the user learning template map persistence.
     *
     * @return the user learning template map persistence
     */
    public UserLearningTemplateMapPersistence getUserLearningTemplateMapPersistence() {
        return userLearningTemplateMapPersistence;
    }

    /**
     * Sets the user learning template map persistence.
     *
     * @param userLearningTemplateMapPersistence the user learning template map persistence
     */
    public void setUserLearningTemplateMapPersistence(
        UserLearningTemplateMapPersistence userLearningTemplateMapPersistence) {
        this.userLearningTemplateMapPersistence = userLearningTemplateMapPersistence;
    }

    /**
     * Returns the counter local service.
     *
     * @return the counter local service
     */
    public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
        return counterLocalService;
    }

    /**
     * Sets the counter local service.
     *
     * @param counterLocalService the counter local service
     */
    public void setCounterLocalService(
        com.liferay.counter.service.CounterLocalService counterLocalService) {
        this.counterLocalService = counterLocalService;
    }

    /**
     * Returns the resource local service.
     *
     * @return the resource local service
     */
    public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
        return resourceLocalService;
    }

    /**
     * Sets the resource local service.
     *
     * @param resourceLocalService the resource local service
     */
    public void setResourceLocalService(
        com.liferay.portal.service.ResourceLocalService resourceLocalService) {
        this.resourceLocalService = resourceLocalService;
    }

    /**
     * Returns the user local service.
     *
     * @return the user local service
     */
    public com.liferay.portal.service.UserLocalService getUserLocalService() {
        return userLocalService;
    }

    /**
     * Sets the user local service.
     *
     * @param userLocalService the user local service
     */
    public void setUserLocalService(
        com.liferay.portal.service.UserLocalService userLocalService) {
        this.userLocalService = userLocalService;
    }

    /**
     * Returns the user remote service.
     *
     * @return the user remote service
     */
    public com.liferay.portal.service.UserService getUserService() {
        return userService;
    }

    /**
     * Sets the user remote service.
     *
     * @param userService the user remote service
     */
    public void setUserService(
        com.liferay.portal.service.UserService userService) {
        this.userService = userService;
    }

    /**
     * Returns the user persistence.
     *
     * @return the user persistence
     */
    public UserPersistence getUserPersistence() {
        return userPersistence;
    }

    /**
     * Sets the user persistence.
     *
     * @param userPersistence the user persistence
     */
    public void setUserPersistence(UserPersistence userPersistence) {
        this.userPersistence = userPersistence;
    }

    public void afterPropertiesSet() {
        Class<?> clazz = getClass();

        _classLoader = clazz.getClassLoader();
    }

    public void destroy() {
    }

    /**
     * Returns the Spring bean ID for this bean.
     *
     * @return the Spring bean ID for this bean
     */
    @Override
    public String getBeanIdentifier() {
        return _beanIdentifier;
    }

    /**
     * Sets the Spring bean ID for this bean.
     *
     * @param beanIdentifier the Spring bean ID for this bean
     */
    @Override
    public void setBeanIdentifier(String beanIdentifier) {
        _beanIdentifier = beanIdentifier;
    }

    @Override
    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        Thread currentThread = Thread.currentThread();

        ClassLoader contextClassLoader = currentThread.getContextClassLoader();

        if (contextClassLoader != _classLoader) {
            currentThread.setContextClassLoader(_classLoader);
        }

        try {
            return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
        } finally {
            if (contextClassLoader != _classLoader) {
                currentThread.setContextClassLoader(contextClassLoader);
            }
        }
    }

    protected Class<?> getModelClass() {
        return ReflexionsAssessment.class;
    }

    protected String getModelClassName() {
        return ReflexionsAssessment.class.getName();
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = reflexionsAssessmentPersistence.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}