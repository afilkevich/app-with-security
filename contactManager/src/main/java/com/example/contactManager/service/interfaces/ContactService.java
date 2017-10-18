package com.example.contactManager.service.interfaces;

import com.example.contactManager.model.ContactDTO;

import java.util.List;

/**
 * Created by afilkevich on 14.9.17.
 */
public interface ContactService {
	void  addContact(ContactDTO contactDTO);
	List<ContactDTO> getAllContact();
	void deletContact(Integer id);

}
