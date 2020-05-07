
package com.cg.bean;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Uma Shankar
 *
 * 06-May-2020 9:07:38 pm
 */
@Entity
@Table(name = "FEEDBACK_MASTER")
public class Feedback {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer feedbackId;
	
	
	@JoinColumn(name ="TRAINING_CODE")
	@OneToOne
	private TrainingProgram trainingCode;
	
	
	
	@JoinColumn(name ="EMPLOYEE_ID")
	@OneToOne
	private Employee particitantId;

	/**
	 * Feedback for Presentation and Communication Skills
	 */
	@Column(name = "FB_Prs_comm")
	private Integer fbPrsComm;
	
	/**
	 * Feedback for Ability to Clarify Doubts
	 */
	@Column(name = "FB_Clrfy_dbts")
	private Integer fbClrfyDbts;
	
	/**
	 * Feedback for Time Management Skills
	 */
	@Column(name = "FB_TM")
	private Integer fbTm;
	
	/**
	 * Feedback for Providing Handouts and other material
	 */
	@Column(name = "FB_Hnd_out")
	private Integer fbHndOut;
	
	/**
	 * Feedback for Hardware, Software and Network Ability
	 */
	@Column(name = "FB_Hw_Sw_Ntwrk")
	private Integer fbHwSwNtwrk;
	
	/**
	 * Comments
	 */
	@Column(name = "Comments")
	private String comments;
	
	/**
	 * Suggestions
	 */
	@Column(name = "Suggestions")
	private String suggestions;
	
	/**
	 * Time of Feedback
	 */
	@Temporal(value=TemporalType.DATE)
	@Column(name = "fbdate")
	private Date feedbackDate;

	public Integer getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackId(Integer feedbackId) {
		this.feedbackId = feedbackId;
	}

	
	public TrainingProgram getTrainingCode() {
		return trainingCode;
	}

	public void setTrainingCode(TrainingProgram trainingCode) {
		this.trainingCode = trainingCode;
	}

	public Employee getParticitantId() {
		return particitantId;
	}

	public void setParticitantId(Employee particitantId) {
		this.particitantId = particitantId;
	}

	public Integer getFbPrsComm() {
		return fbPrsComm;
	}

	public void setFbPrsComm(Integer fbPrsComm) {
		this.fbPrsComm = fbPrsComm;
	}

	public Integer getFbClrfyDbts() {
		return fbClrfyDbts;
	}

	public void setFbClrfyDbts(Integer fbClrfyDbts) {
		this.fbClrfyDbts = fbClrfyDbts;
	}

	public Integer getFbTm() {
		return fbTm;
	}

	public void setFbTm(Integer fbTm) {
		this.fbTm = fbTm;
	}

	public Integer getFbHndOut() {
		return fbHndOut;
	}

	public void setFbHndOut(Integer fbHndOut) {
		this.fbHndOut = fbHndOut;
	}

	public Integer getFbHwSwNtwrk() {
		return fbHwSwNtwrk;
	}

	public void setFbHwSwNtwrk(Integer fbHwSwNtwrk) {
		this.fbHwSwNtwrk = fbHwSwNtwrk;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getSuggestions() {
		return suggestions;
	}

	public void setSuggestions(String suggestions) {
		this.suggestions = suggestions;
	}

	public Date getFeedbackDate() {
		return feedbackDate;
	}

	public void setFeedbackDate(Date feedbackDate) {
		this.feedbackDate = feedbackDate;
	}
	
	

}
