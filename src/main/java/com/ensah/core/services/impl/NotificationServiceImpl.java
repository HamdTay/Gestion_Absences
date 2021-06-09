package com.ensah.core.services.impl;

import com.ensah.core.services.INotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ensah.core.dao.INotificationDao;

@Service
@Transactional
public class NotificationServiceImpl implements INotificationService {
	@Autowired
	private INotificationDao notificationDao;

}
