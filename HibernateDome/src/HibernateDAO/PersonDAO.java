package HibernateDAO;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.vo.DepartmentVo;

public interface PersonDAO {

	public List<com.vo.EmployeeVo> QueryByPage(int offset,int pagesize);
	public int getAllRowcount(DetachedCriteria cd);
}
