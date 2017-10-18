package com.example.contactManager.DAO.implement;

import com.example.contactManager.DAO.intertface.ContactDao;
import com.example.contactManager.model.ContactDTO;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by afilkevich on 14.9.17.
 */
@Repository
public class ContactDaoImpl implements ContactDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void addContact(ContactDTO contactDTO) {
		sessionFactory.getCurrentSession().save(contactDTO);
	}


	public List<ContactDTO> getAllContact() {
		return sessionFactory.getCurrentSession().createQuery("from contacts").list();
	}

	public void removeContact(Integer id) {
		ContactDTO contactDTO=(ContactDTO) sessionFactory.getCurrentSession().load(ContactDTO.class, id);
		if(contactDTO!=null){
			sessionFactory.getCurrentSession().delete(contactDTO);
		}
	}
}
