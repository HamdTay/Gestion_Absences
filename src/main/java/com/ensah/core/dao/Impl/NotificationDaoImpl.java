package com.ensah.core.dao.impl;

import com.ensah.core.bo.Notification;
import com.ensah.core.dao.INotificationDao;
import com.ensah.genericdao.HibernateSpringGenericDaoImpl;
import org.springframework.stereotype.Repository;

@Repository
public class NotificationDaoImpl extends HibernateSpringGenericDaoImpl<Notification, Long> implements INotificationDao {

    public NotificationDaoImpl() {
        super(Notification.class);
    }

}
