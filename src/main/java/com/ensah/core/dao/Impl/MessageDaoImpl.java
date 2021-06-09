package com.ensah.core.dao.impl;

import com.ensah.core.bo.Message;
import com.ensah.core.dao.IMessageDao;
import com.ensah.genericdao.HibernateSpringGenericDaoImpl;
import org.springframework.stereotype.Repository;

@Repository
public class MessageDaoImpl extends HibernateSpringGenericDaoImpl<Message, Long> implements IMessageDao {

    public MessageDaoImpl() {
        super(Message.class);
    }

}
