package com.ensah.core.services.impl;

import com.ensah.core.bo.Absence;
import com.ensah.core.services.IAbsenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ensah.core.dao.IAbsenceDao;

import java.util.List;

@Service
@Transactional
public class AbsenceServiceImpl implements IAbsenceService {

	@Autowired
	private IAbsenceDao absenceDao;

	public void addAbsence(Absence pAbsence) {
		absenceDao.create(pAbsence);

	}

	public Absence getAbsenceById(Long id) {
		return absenceDao.findById(id);

	}

	public List<Absence> getAllAbsences() {
		return absenceDao.getAll();
	}

	public void updateAbsence(Absence pAbsence) {
		absenceDao.update(pAbsence);

	}

	public void deleteAbsence(Long id) {
		absenceDao.delete(id);

	}

}
