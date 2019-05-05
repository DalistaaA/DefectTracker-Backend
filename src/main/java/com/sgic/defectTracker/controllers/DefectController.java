
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
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.RequestMapping;

//
//import com.sgic.defectTracker.entities.Defect;
//import com.sgic.defectTracker.services.DefectService;
//
//@RestController
//@RequestMapping("/defect")
//public class DefectController {
//
//	@Autowired
//	DefectService defectService;
//	
//	@CrossOrigin("http://localhost:3000")
//	@PostMapping("/saveDefect")
//	public HttpStatus createDefect(@Valid @RequestBody Defect defect) {
//		defectService.saveDefect(defect);
//		return HttpStatus.CREATED;
//	}
//	
//	@CrossOrigin("http://localhost:3000")
//	@GetMapping("/findAllDefects")
//	public List<Defect> findAllDefects(){
//		return defectService.getAllDefects();
//	}
//	
//	@CrossOrigin("http://localhost:3000")
//	@GetMapping("/findDefectById/{defectId}")
//	public ResponseEntity<Defect> getDefectById(@PathVariable("defectId") int defectId) {
//		return new ResponseEntity<Defect>(defectService.getDefectById(defectId),HttpStatus.OK);
//	}
//	
//	@CrossOrigin("http://localhost:3000")
//	@PutMapping("/updateDefect")
//	public ResponseEntity<Defect> updateDefect(@Valid @RequestBody Defect defect){
//		defectService.updateDefect(defect);
//		return new ResponseEntity<Defect>(defect, HttpStatus.NO_CONTENT);
//	}
//	
//	@CrossOrigin("http://localhost:3000")
//	@DeleteMapping("/deleteProject/{defectId}")
//	public ResponseEntity<Defect> deleteProject(@PathVariable("defectId") int defectId){
//		defectService.deleteDefect(defectId);
//		return new ResponseEntity<Defect>(HttpStatus.NO_CONTENT);
//		
//	}
//}
