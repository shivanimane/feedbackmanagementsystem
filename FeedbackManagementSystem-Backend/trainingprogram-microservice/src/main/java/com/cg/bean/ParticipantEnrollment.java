
package com.cg.bean;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author Uma Shankar
 *
 * 06-May-2020 9:08:23 pm
 */
@Entity
@Table(name = "PARTICIPANT_ENROLLED")
public class ParticipantEnrollment {

	@Id
	@Column(name = "PART_ENROL_NO")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer partEnrollNo;

	@OneToOne
	@JoinColumn(name = "Employee_ID")
	private Employee participantId;

	@OneToMany
	@JoinColumn(name = "TRAINING_CODE")
	private List<TrainingProgram> trainingprogram;

	public Integer getPartEnrollNo() {
		return partEnrollNo;
	}

	public void setPartEnrollNo(Integer partEnrollNo) {
		this.partEnrollNo = partEnrollNo;
	}

	public Employee getParticipantId() {
		return participantId;
	}

	public void setParticipantId(Employee participantId) {
		this.participantId = participantId;
	}

	public List<TrainingProgram> getTrainingprogram() {
		return trainingprogram;
	}

	public void setTrainingprogram(List<TrainingProgram> trainingprogram) {
		this.trainingprogram = trainingprogram;
	}

}
