package com.sgic.defectTracker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.defectTracker.entities.Project;

public interface ProjectRepository extends JpaRepository<Project , Integer> {
	Project findByProjectId(int projectId);
}
