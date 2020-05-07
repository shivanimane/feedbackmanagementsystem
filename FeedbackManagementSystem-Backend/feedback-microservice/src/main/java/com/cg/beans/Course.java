/**
 * @author Shivani
 * @data May 4, 2020
 * @time 10:11:14 AM
 */
package com.cg.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Shivani
 *
 */

@Entity
@Table(name = "COURSE_MASTER")
public class Course {
	
	@Id
	@Column(name = "COURSE_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer courseId;
	
	
	@Column(name = "COURSE_NAME")
	private String courseName;
	
	@Column(name = "NO_OF_DAYS")
	private Integer noOfDays;
	
	/**
	 * Default Constructor
	 */
	public Course() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the courseId
	 */
	public Integer getCourseId() {
		return courseId;
	}

	/**
	 * @param courseId the courseId to set
	 */
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	/**
	 * @return the courseName
	 */
	public String getCourseName() {
		return courseName;
	}

	/**
	 * @param courseName the courseName to set
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	/**
	 * @return the noOfDays
	 */
	public Integer getNoOfDays() {
		return noOfDays;
	}

	/**
	 * @param noOfDays the noOfDays to set
	 */
	public void setNoOfDays(Integer noOfDays) {
		this.noOfDays = noOfDays;
	}

	/**
	 * @param courseId
	 * @param courseName
	 * @param noOfDays
	 */
	public Course(Integer courseId, String courseName, Integer noOfDays) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.noOfDays = noOfDays;
	}
	
	

}
