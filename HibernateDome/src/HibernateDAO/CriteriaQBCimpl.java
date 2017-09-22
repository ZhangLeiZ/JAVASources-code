package HibernateDAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;

import com.ht.HibernateSessionFactory;

public class CriteriaQBCimpl {

	public List findBydetache(DetachedCriteria cd){
		List list = null;
		Session session=null;
		try {
			session = HibernateSessionFactory.getSession();
			session.beginTransaction();
			session.clear();
			Criteria criteria = cd.getExecutableCriteria(session);
			list = criteria.list();
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}finally{
			session.close();
		}
		return list;
	}
}
