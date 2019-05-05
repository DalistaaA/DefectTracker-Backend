package com.sgic.defectTracker.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "defect")
public class Defect {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int defectId;
	private String module;
	private String description;
	private String stepsToRecreate;
	private String severity;
	private String defectType;
	private String enteredBy;
	private String enteredDate;
	private String status;
	private String assignedTo;
	private String fixedBy;
	private String fixedDate;
	private String avalableIn;
	
	public int getDefectId() {
		return defectId;
	}
	public void setDefectId(int defectId) {
		this.defectId = defectId;
	}
	public String getModule() {
		return module;
	}
	public void setModule(String module) {
		this.module = module;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStepsToRecreate() {
		return stepsToRecreate;
	}
	public void setStepsToRecreate(String stepsToRecreate) {
		this.stepsToRecreate = stepsToRecreate;
	}
	public String getSeverity() {
		return severity;
	}
	public void setSeverity(String severity) {
		this.severity = severity;
	}
	public String getDefectType() {
		return defectType;
	}
	public void setDefectType(String defectType) {
		this.defectType = defectType;
	}
	public String getEnteredBy() {
		return enteredBy;
	}
	public void setEnteredBy(String enteredBy) {
		this.enteredBy = enteredBy;
	}
	public String getEnteredDate() {
		return enteredDate;
	}
	public void setEnteredDate(String enteredDate) {
		this.enteredDate = enteredDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAssignedTo() {
		return assignedTo;
	}
	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}
	public String getFixedBy() {
		return fixedBy;
	}
	public void setFixedBy(String fixedBy) {
		this.fixedBy = fixedBy;
	}
	public String getFixedDate() {
		return fixedDate;
	}
	public void setFixedDate(String fixedDate) {
		this.fixedDate = fixedDate;
	}
	public String getAvalableIn() {
		return avalableIn;
	}
	public void setAvalableIn(String avalableIn) {
		this.avalableIn = avalableIn;
	}
	
	


}
