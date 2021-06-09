package com.ensah.core.services.impl;

import com.ensah.core.services.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ensah.core.dao.IMessageDao;

@Service
@Transactional
public class MessageServiceImpl implements IMessageService {
	@Autowired
	private IMessageDao messageDao;
}
