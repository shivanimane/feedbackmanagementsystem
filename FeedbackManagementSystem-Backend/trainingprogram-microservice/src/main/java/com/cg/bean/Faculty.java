
package com.cg.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author Uma Shankar
 *
 * 06-May-2020 9:07:34 pm
 */
@Entity
@Table(name = "FACULTY_SKILL")
public class Faculty {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "FACULTY_ID")
	private int facultyId;

	@Column(name = "FACULTY_NAME")
	private String facultyName;

	@ManyToMany(cascade = CascadeType.MERGE)
	@JoinColumn(name = "SKILLSET")
	private List<Skills> listOfSkills;

	public int getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public List<Skills> getListOfSkills() {
		return listOfSkills;
	}

	public void setListOfSkills(List<Skills> listOfSkills) {
		this.listOfSkills = listOfSkills;
	}

}
