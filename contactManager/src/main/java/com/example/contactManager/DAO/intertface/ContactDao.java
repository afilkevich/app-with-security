package com.example.contactManager.DAO.intertface;

import com.example.contactManager.model.ContactDTO;

import java.util.List;

/**
 * Created by afilkevich on 14.9.17.
 */
public interface ContactDao {

	void addContact(ContactDTO contactDTO);

	List<ContactDTO> getAllContact();

	void removeContact(Integer id);
}
