
package com.cg.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 * @author Uma Shankar
 *
 *         06-May-2020 9:08:23 pm
 */
@Entity
@Table(name = "PARTICIPANT_ENROLLED")
public class ParticipantEnrolled {

	@Id
	@Column(name = "PARTICIPANT_ID")
	private Integer participantId;

	@Column(name = "PARTICIPANT_NAME")
	private String participantName;

	@ManyToOne
	@JoinColumn(name = "TRAINING_CODE")
	@Cascade(CascadeType.ALL)
	private TrainingProgram trainingprogram;

	public Integer getParticipantId() {
		return participantId;
	}

	public void setParticipantId(Integer participantId) {
		this.participantId = participantId;
	}

	public String getParticipantName() {
		return participantName;
	}

	public void setParticipantName(String participantName) {
		this.participantName = participantName;
	}

	public TrainingProgram getTrainingprogram() {
		return trainingprogram;
	}

	public void setTrainingprogram(TrainingProgram trainingprogram) {
		this.trainingprogram = trainingprogram;
	}

	@Override
	public String toString() {
		return "ParticipantEnrolled [participantId=" + participantId + ", participantName=" + participantName
				+ ", trainingprogram=" + trainingprogram + "]";
	}
	
	

}
