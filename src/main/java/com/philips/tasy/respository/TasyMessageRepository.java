package com.philips.tasy.respository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.philips.tasy.model.MessageItem;

@Repository
public class TasyMessageRepository {
	@Autowired
	JdbcTemplate dataConnector;
	
	public MessageItem getResponse(MessageItem messageItem) {
		String response = "Please contact the customer support for your queries to be answered!!";
		messageItem.setResponse(response);
		return messageItem;
	}
}
