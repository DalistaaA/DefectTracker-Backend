//package com.sgic.defectTracker.controllers;
//
//import java.util.List;
//
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.sgic.defectTracker.entities.Module;
//import com.sgic.defectTracker.services.ModuleService;
//
//@RestController
//@RequestMapping("/module")
//public class ModuleController {
//	
//	@Autowired
//	ModuleService moduleService;
//	
//	@CrossOrigin("http://localhost:3000")
//	@PostMapping("/saveModule")
//	public HttpStatus createModule(@Valid @RequestBody Module module) {
//		moduleService.saveModule(module);
//		return HttpStatus.CREATED;
//	}
//	
//	@CrossOrigin("http://localhost:3000")
//	@GetMapping("/findAllDefects")
//	public List<Module> findAllModules(){
//		return moduleService.getAllModules();
//	}
//	
//	@CrossOrigin("http://localhost:3000")
//	@GetMapping("/findAllModule/{module_id}")
//	public ResponseEntity<Module> getModuleById(@PathVariable("module_id") int module_id) {
//		moduleService.getModuleById(module_id);
//		return new ResponseEntity<Module>(HttpStatus.OK);
//	}
//	
//	@CrossOrigin("http://localhost:3000")
//	@PutMapping("/updateModule")
//	public ResponseEntity<Module> updateModule(@Valid @RequestBody Module module){
//		moduleService.updateModule(module);
//		return new ResponseEntity<Module>(module, HttpStatus.NO_CONTENT);
//	}
//	
//	@CrossOrigin("http://localhost:3000")
//	@DeleteMapping("/deleteModule/{module_id}")
//	public ResponseEntity<Module> deleteModule(@PathVariable("module_id") int module_id){
//		moduleService.deleteModule(module_id);;
//		return new ResponseEntity<Module>(HttpStatus.NO_CONTENT);
//		
//	}
//}
