package com.risk.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.risk.dao.AbstractDao;
import com.risk.dao.logindao;

import com.risk.model.Login;

@Repository("logindao")
public class logindaoimpl extends AbstractDao<Integer,Login> implements logindao{

	
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	 @SuppressWarnings("unchecked")
	public boolean checkLogin(String username, String userpassword) {
		
		System.out.println("In Check login");
		Session session = sessionFactory.getCurrentSession();
		boolean userFound = false;
		
		String SQL_QUERY =" from Login as l where l.username=? and l.userpassword=?";
		Query query = session.createQuery(SQL_QUERY);
		
		query.setParameter(0,username);
		query.setParameter(1,userpassword);
		List list = query.list();

		if ((list != null) && (list.size() > 0)) {
			userFound= true;
		}

		session.close();
		return userFound;     
		
		
	}

	/*
	 * @Override
	 * 
	 * @SuppressWarnings("unchecked") public List<Login> getlogindetails() {
	 * Criteria criteria = createEntityCriteria(); return (List<Login>)
	 * criteria.list(); }
	 * 
	 * @Override public void savelogindata(Login login) {
	 * 
	 * persist(login); }
	 */

}
