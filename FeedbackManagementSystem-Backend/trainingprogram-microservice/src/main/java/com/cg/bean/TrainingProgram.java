
package com.cg.bean;







import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;


/**
 * @author Uma Shankar
 *
 * 06-May-2020 9:07:23 pm
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
	
	@Temporal(value=TemporalType.DATE)
	@Column(name = "START_DATE")
	@DateTimeFormat(style = "yyyy-mm-dd")
	private Date startDate;
	
	@Temporal(value=TemporalType.DATE)
	@Column(name="END_DATE")
	@DateTimeFormat(style = "yyyy-mm-dd")
	private Date endDate;

	public Integer getTrainingCode() {
		return trainingCode;
	}

	public void setTrainingCode(Integer trainingCode) {
		this.trainingCode = trainingCode;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	
}
