//package com.sgic.defectTracker.services;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.sgic.defectTracker.entities.Module;
//import com.sgic.defectTracker.repositories.ModuleRepository;
//
//@Service
//public class ModuleServiceImpl implements ModuleService {
//	
//	@Autowired
//	ModuleRepository moduleRepository;
//
//	@Override
//	public Module saveModule(Module module) {
//		return moduleRepository.save(module);
//	}
//
//	@Override
//	public Module updateModule(Module module) {
//		return moduleRepository.save(module);
//	}
//
//	@Override
//	public void deleteModule(int module_id) {
//		moduleRepository.deleteById(module_id);
//	}
//
//	@Override
//	public Module getModuleById(int module_id) {
//		return moduleRepository.findById(module_id).get();
//	}
//
//	@Override
//	public List<Module> getAllModules() {
//		return moduleRepository.findAll();
//	}
//
//	public ModuleRepository getModuleRepository() {
//		return moduleRepository;
//	}
//
//	public void setModuleRepository(ModuleRepository moduleRepository) {
//		this.moduleRepository = moduleRepository;
//	}
//	
//	
//
//}
