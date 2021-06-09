package com.ensah.core.services.impl;

import com.ensah.core.services.IPieceJustificativeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ensah.core.dao.IPieceJustificativeDao;

@Service
@Transactional
public class PieceJustificativeServiceImpl implements IPieceJustificativeService {
	@Autowired
	private IPieceJustificativeDao pieceJustificativeDao;
}
