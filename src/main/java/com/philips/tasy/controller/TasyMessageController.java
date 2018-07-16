package com.philips.tasy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.philips.tasy.model.MessageItem;
import com.philips.tasy.service.TasyMessageService;

@RequestMapping("/message")
@RestController
public class TasyMessageController {
	@Autowired
	TasyMessageService service;

	@RequestMapping("/acknowledge")
	MessageItem getResponse(@RequestParam String request) {
		MessageItem messageItem = new MessageItem();
		messageItem.setRequest(request);
		return service.getResponse(messageItem);
	}
}
