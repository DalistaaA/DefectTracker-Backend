//package com.sgic.defectTracker.services;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.sgic.defectTracker.entities.Defect;
//import com.sgic.defectTracker.repositories.DefectRepository;
//
//@Service
//public class DefectServiceImpl implements DefectService {
//
//	@Autowired
//	DefectRepository defectRepository;
//	
//	@Override
//	public Defect saveDefect(Defect defect) {
//		return defectRepository.save(defect);
//	}
//
//	@Override
//	public Defect updateDefect(Defect defect) {
//		return defectRepository.save(defect);
//	}
//
//	@Override
//	public void deleteDefect(int defectId) {
//		defectRepository.deleteById(defectId);
//	}
//
//	@Override
//	public Defect getDefectById(int defectId) {
//		return defectRepository.findDefectById(defectId);
//	}
//
//	@Override
//	public List<Defect> getAllDefects() {
//		return defectRepository.findAll();
//	}
//
//	public DefectRepository getDefectRepository() {
//		return defectRepository;
//	}
//
//	public void setDefectRepository(DefectRepository defectRepository) {
//		this.defectRepository = defectRepository;
//	}
//	
//	
//
//}
