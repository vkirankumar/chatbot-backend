package com.philips.tasy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.philips.tasy.model.MessageItem;
import com.philips.tasy.respository.TasyMessageRepository;

@Service
public class TasyMessageService {
	@Autowired
	TasyMessageRepository repository;

	public MessageItem getResponse(MessageItem messageItem) {
		return repository.getResponse(messageItem);
	}
}
