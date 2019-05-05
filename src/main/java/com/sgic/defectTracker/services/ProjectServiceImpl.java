package com.sgic.defectTracker.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.defectTracker.entities.Project;
import com.sgic.defectTracker.repositories.ProjectRepository;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	ProjectRepository projectRepository;
	
	
	@Override
	public Project saveProject(Project project) {
		return projectRepository.save(project);
	}

	@Override
	public Project updateProject(Project project) {
		return projectRepository.save(project);
	}

	@Override
	public void deleteProject(int projectId) {
		projectRepository.deleteById(projectId);
	}

	@Override
	public Project getProjectById(int projectId) {
		return projectRepository.findByProjectId(projectId);
	}

	@Override
	public List<Project> getAllProjects() {
		return projectRepository.findAll();
	}

	public ProjectRepository getProjectRepository() {
		return projectRepository;
	}

	public void setProjectRepository(ProjectRepository projectRepository) {
		this.projectRepository = projectRepository;
	}

	
	
}
