/**
 * @author Shivani
 * @data May 4, 2020
 * @time 11:19:43 AM
 */
package com.cg.beans;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * @author Shivani
 *
 */
public class ParticipantEnrollment {
	
	@Id
	@Column(name="PART_ENROL_NO")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer partEnrolNo;
	
	@OneToOne
	@JoinColumn(name = "EMPLOYEE_ID")
	private Employee participantId;
	
	@OneToMany
	@JoinColumn(name = "TRAINING_CODE")
	private List<TrainingProgram> trainingCode;
	
	/**
	 * Default Constructor
	 */
	public ParticipantEnrollment() {
		// TODO Auto-generated constructor stub
	}
	
	/**********
	 * Getters and Setters
	 **********/

	/**
	 * @return the participantId
	 */
	public Employee getParticipantId() {
		return participantId;
	}

	/**
	 * @param participantId the participantId to set
	 */
	public void setParticipantId(Employee participantId) {
		this.participantId = participantId;
	}

	/**
	 * @return the trainingCode
	 */
	public List<TrainingProgram> getTrainingCode() {
		return trainingCode;
	}

	/**
	 * @param trainingCode the trainingCode to set
	 */
	public void setTrainingCode(List<TrainingProgram> trainingCode) {
		this.trainingCode = trainingCode;
	}

	
}
