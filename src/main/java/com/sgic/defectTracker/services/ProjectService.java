package com.sgic.defectTracker.services;

import java.util.List;

import com.sgic.defectTracker.entities.Project;

public interface ProjectService {

	Project saveProject(Project project);

	Project updateProject(Project project);

	void deleteProject(int projectId);

	Project getProjectById(int projectId);

	List<Project> getAllProjects();

	
}
