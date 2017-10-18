package com.example.contactManager.service.implement;

import com.example.contactManager.DAO.intertface.ContactDao;
import com.example.contactManager.model.ContactDTO;
import com.example.contactManager.service.interfaces.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

 @Service
 @Transactional
public class ContactServiceImpl implements ContactService {

 	@Autowired
	private ContactDao contactDao;

	public void addContact(ContactDTO contactDTO) {
		contactDao.addContact(contactDTO);
	}

	public List<ContactDTO> getAllContact() {
		return contactDao.getAllContact();
	}

	public void deletContact(Integer id) {

		contactDao.removeContact(id);
	}
}
