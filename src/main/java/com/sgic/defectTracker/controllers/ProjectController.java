package com.sgic.defectTracker.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.defectTracker.entities.Project;
import com.sgic.defectTracker.services.ProjectService;

@RestController
public class ProjectController {
	@Autowired	
	ProjectService projectService;
	
	
	@CrossOrigin("http://localhost:3000")
	@PostMapping("/saveProject")
	public HttpStatus createUser(@Valid @RequestBody Project project) {
		projectService.saveProject(project);
		return HttpStatus.CREATED;
	}
	
	@CrossOrigin("http://localhost:3000")
	@GetMapping("/findAllProject")
	public List<Project> findAllProjects(){
		return projectService.getAllProjects();
	}
	
	@CrossOrigin("http://localhost:3000")
	@GetMapping("/findProjectById/{projectId}")
	public ResponseEntity<Project> getProjectById(@PathVariable("projectId") int projectId) {
		return new ResponseEntity<Project>(projectService.getProjectById(projectId),HttpStatus.OK);
	}
	
	@CrossOrigin("http://localhost:3000")
	@PutMapping("/updateProject")
	public ResponseEntity<Project> updateProject(@Valid @RequestBody Project project){
		projectService.updateProject(project);
		return new ResponseEntity<Project>(project, HttpStatus.NO_CONTENT);
	}
	
	@CrossOrigin("http://localhost:3000")
	@DeleteMapping("/deleteProject/{projectId}")
	public ResponseEntity<Project> deleteProject(@PathVariable("projectId") int projectId){
		projectService.deleteProject(projectId);
		return new ResponseEntity<Project>(HttpStatus.NO_CONTENT);
		
	}
		
}
