package com.sgic.defectTracker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.defectTracker.entities.Module;

public interface ModuleRepository extends JpaRepository<Module, Integer> {

	Module findModuleById(int moduleId);
}
