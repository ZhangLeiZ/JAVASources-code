package HibernateDAO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;

import com.ht.HibernateSessionFactory;
import com.vo.DepartmentVo;
import com.vo.EmployeeVo;
import com.vo.criteriaqbc;

public class PersonDAOimpl implements PersonDAO{

	public List<EmployeeVo> QueryByPage(int offset, int pagesize) {
		List<EmployeeVo> list = new ArrayList<EmployeeVo>();
		Session session=null;
		Transaction tx=null;
		Criteria cr=null;
		try {
			session = HibernateSessionFactory.getSession();
			tx = session.beginTransaction();
			DetachedCriteria cd = DetachedCriteria.forClass(EmployeeVo.class);
			cd.setFetchMode("dep",FetchMode.JOIN );

			//离线查询对象(dc)与数据库建立连接
			cr  = cd.getExecutableCriteria(session);
			//过滤重复数据
			cr.setResultTransformer(cr.DISTINCT_ROOT_ENTITY);
			//起始位置
			cr.setFirstResult(offset);
			//每页显示的记录数
			cr.setMaxResults(pagesize);
			list = cr.list();
			tx.commit();
		} catch (Exception e) {
			if(tx!=null){
				session.getTransaction().rollback();
			}
			e.printStackTrace();
		}finally{
			session.close();
		}
		return list;
	}
	public List<DepartmentVo> QueryByPages(int offset, int pagesize) {
		List<DepartmentVo> list = new ArrayList<DepartmentVo>();
		Session session=null;
		Transaction tx=null;
		Criteria cr=null;
		try {
			session = HibernateSessionFactory.getSession();
			tx = session.beginTransaction();
			DetachedCriteria cd = DetachedCriteria.forClass(DepartmentVo.class);
			cd.setFetchMode("dep",FetchMode.JOIN );

			//离线查询对象(dc)与数据库建立连接
			cr  = cd.getExecutableCriteria(session);
			//过滤重复数据
			cr.setResultTransformer(cr.DISTINCT_ROOT_ENTITY);
			//起始位置
			cr.setFirstResult(offset);
			//每页显示的记录数
			cr.setMaxResults(pagesize);
			list = cr.list();
			tx.commit();
		} catch (Exception e) {
			if(tx!=null){
				session.getTransaction().rollback();
			}
			e.printStackTrace();
		}finally{
			session.close();
		}
		return list;
	}

	public int getAllRowcount(DetachedCriteria cd) {
		Session session = null;
		int result=0;
		Transaction tr = null;
		try {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			session = sessionFactory.openSession();
		    tr = session.beginTransaction();
		    Criteria cri = cd.getExecutableCriteria(session);
		    cd.setProjection(Projections.rowCount());
		    result = (Integer)cri.uniqueResult();
		    tr.commit();
		} catch (Exception e) {
			if(tr!=null){
				session.getTransaction().rollback();
			}
			e.printStackTrace();
		}finally{
			session.close();
		}
		return result;
	}
	public List<DepartmentVo> getselect(){
		List<DepartmentVo> list = new ArrayList<DepartmentVo>();
		Session session=null;
		try{
			//解析主文件 得到session工厂
			SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
			//通过session工厂来创建session
		session = sessionfactory.openSession();
		session.beginTransaction();
		String sql ="from DepartmentVo";
		Query q = session.createQuery(sql);
		list = q.list();
		System.out.println(list);
		}catch(Exception e){
			session.getTransaction().rollback();
			System.out.println("查询新增失败");
			e.printStackTrace();
		}finally{
			session.close();
		}
		return list;
	}
	public void getadd(DepartmentVo depa){
		Session session=null;
		try{
		session = HibernateSessionFactory.getSession();
		session.beginTransaction();
		session.save(depa);
		session.getTransaction().commit();
		}catch(Exception e){
			session.getTransaction().rollback();
			System.out.println("数据新增失败");
			e.printStackTrace();
		}finally{
			session.close();
		}
	}
	public void saveorUpdate(Object obj){
		Session session=null;
		try {
			session = HibernateSessionFactory.getSession();
			session.beginTransaction();
			session.saveOrUpdate(obj);
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		}finally{
			session.close();
		}
	}
	//新增的函数
	public void save(Object object){
		try{
			//获取hibernate的session对象
			Session session = HibernateSessionFactory.getSession();
			//清空session的缓存
			session.clear();
			//开始事务
			Transaction tx = session.beginTransaction();
			//保存任意对象(做了合法的hbm配置的对象)
			session.save(object);
			//提交事务
			tx.commit();
			//关闭session
			session.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public List find(final String sql){
		List emplist = new ArrayList();
		Session session = null;
		try{
			session = HibernateSessionFactory.getSession();
			session.clear();
			session.beginTransaction();
			Query query = session.createQuery(sql);
			emplist=query.list();
			session.getTransaction().commit();
		}catch(Exception e){
			e.printStackTrace();
			session.getTransaction().rollback();
		}finally{
			session.close();
		}
		return emplist;
	}
	public List finds(final String sql,String name,String sex){
		List emplist = new ArrayList();
		Session session = null;
		try{
			session = HibernateSessionFactory.getSession();
			session.clear();
			session.beginTransaction();
			Query query = session.createQuery(sql);
			query.setString(0, name);
			query.setString(1, sex);
			emplist=query.list();
			session.getTransaction().commit();
		}catch(Exception e){
			e.printStackTrace();
			session.getTransaction().rollback();
		}finally{
			session.close();
		}
		return emplist;
	}
	public void getdel(Object obj){
		Session session = null;
		try{
			session = HibernateSessionFactory.getSession();
			session.beginTransaction();
			session.clear();
			session.delete(obj);
			session.getTransaction().commit();
		}catch (Exception e) {
			session.getTransaction().rollback();
		}finally{
			session.close();
		}
	}
	public void getupdate(Object obj){
		Session session = null;
		try{
			session = HibernateSessionFactory.getSession();
			session.beginTransaction();
			session.clear();
			session.update(obj);
			session.getTransaction().commit();
		}catch(Exception e){
			session.getTransaction();
		}finally{
			session.close();
		}
	}
	public Object get(Class class1,Serializable id){
		Object obj = null;
		Session session = null;
		try{
			session = HibernateSessionFactory.getSession();
			session.beginTransaction();
			session.clear();
			obj=session.get(class1,id);
			session.getTransaction().commit();
		}catch(Exception e){
			session.getTransaction().rollback();
		}finally{
			session.close();
		}
		System.out.println("lll"+obj);
		return obj;
	}
	public List Detachedcriteria(DetachedCriteria cd){
		List list = null;
		Session session=null;
		try{
			session = HibernateSessionFactory.getSession();
			session.beginTransaction();
			Criteria cri = cd.getExecutableCriteria(session);
			list = cri.list();
			session.getTransaction().commit();
		}catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}finally{
			session.close();
		}
		return list;
	}
}
