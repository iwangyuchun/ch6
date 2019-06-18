package cn.edu.ujn.ch6.dao;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import cn.edu.ujn.ch6.model.Dlb;

public class DlDaoImp extends HibernateDaoSupport implements IDlDao{

	@Override
	public Dlb find(Dlb dl) {
		// TODO Auto-generated method stub
		
		List<Dlb> list = getHibernateTemplate().findByExample(dl);
		if (list.size()>0) {
			return list.get(0);
		}else {
			return null;
		}
	}
	
	

}
