package com.contact.contact_service.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.contact_service.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService{

	List<Contact> list;
	public ContactServiceImpl() {
		list=new ArrayList<>();
		list.add(new Contact(1, "agfhs@gmail.com", "rtyui", 1211));
		list.add(new Contact(2, "aytyui@gmail.com", "kjhgf", 1211));
		list.add(new Contact(3, "sdfghj@gmail.com", "sdfgh", 1212));
		list.add(new Contact(4, "kjh@gmail.com", "ertrty", 1213));
		list.add(new Contact(5, "mnbv@gmail.com", "cvbn", 1213));
	}
	@Override
	public List<Contact> getContactsOfUser(long userId) {
	
		return list.stream().filter(contact->contact.getUserid()==(userId)).collect(Collectors.toList());
	}

}
