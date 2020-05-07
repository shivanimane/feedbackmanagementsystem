/**
 * @author Shivani
 * @data May 4, 2020
 * @time 9:32:27 AM
 */
package com.cg.beans;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author Shivani
 *
 */

@Entity
@Table(name = "TRAINING_PROGRAM")
public class TrainingProgram {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="TRAINING_CODE")
	private Integer trainingCode;
	
	@JoinColumn(name = "COURSE_ID")
	@ManyToOne
	private Course course;
	
	@JoinColumn(name = "FACULTY_ID")
	@OneToOne
	private Faculty faculty;
	
	@Temporal(TemporalType.DATE)
	@Column(name="START_DATE")
	@DateTimeFormat(pattern = "YYYY-MM-DD")
	private Date startDate;
	
	@Column(name ="END_DATE")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "YYYY-MM-DD")
	private Date endDate;
	
	/**
	 * Default Constructor
	 */
	public TrainingProgram() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the trainingCode
	 */
	public Integer getTrainingCode() {
		return trainingCode;
	}

	/**
	 * @param trainingCode the trainingCode to set
	 */
	public void setTrainingCode(Integer trainingCode) {
		this.trainingCode = trainingCode;
	}

	/**
	 * @return the course
	 */
	public Course getCourse() {
		return course;
	}

	/**
	 * @param course the course to set
	 */
	public void setCourse(Course course) {
		this.course = course;
	}

	/**
	 * @return the faculty
	 */
	public Faculty getFaculty() {
		return faculty;
	}

	/**
	 * @param faculty the faculty to set
	 */
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	
}
