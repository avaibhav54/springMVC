package springMVC.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springMVC.model.user;
@Repository
public class userDAO {
	@Autowired
	private HibernateTemplate hibernateTemplate;


	@Transactional
public int saveUser(user us) {
	return (Integer) this.hibernateTemplate.save(us);
}
}
