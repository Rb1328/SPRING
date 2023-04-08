package com.StudenntDao;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.DaoEntities.Student;


public class StudentDao {

	private  HibernateTemplate hibernateTemplate;
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	public int  insert(Student student) {
		return 0;}

}
