
package com.cg.bean;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "FACULTY_SKILL")
public class Faculty {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "FACULTY_ID")
	private int facultyId;

	@Column(name = "FACULTY_NAME")
	private String FacultyName;

	@ManyToMany
	@JoinColumn(name = "SKILLSET")
	private List<Skills> listOfSkills;

	public int getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}

	public String getFacultyName() {
		return FacultyName;
	}

	public void setFacultyName(String FacultyName) {
		this.FacultyName = FacultyName;
	}

	public List<Skills> getListOfSkills() {
		return listOfSkills;
	}

	public void setListOfSkills(List<Skills> listOfSkills) {
		this.listOfSkills = listOfSkills;
	}

}
