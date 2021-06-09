package com.ensah.core.services.impl;

import com.ensah.core.services.IConversationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ensah.core.dao.IConversationDao;

@Service
@Transactional
public class ConversationServiceImpl implements IConversationService {
	@Autowired
	private IConversationDao conversationDao;

}
