package com.cg.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Skills")

public class Skills {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="SKILL_ID")
	private Integer skillId;
	
	@Column(name="SKILL_NAME")
	private String skillName;

	/**
	 * 
	 */
	public Skills() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the skillId
	 */
	public Integer getSkillId() {
		return skillId;
	}

	/**
	 * @param skillId the skillId to set
	 */
	public void setSkillId(Integer skillId) {
		this.skillId = skillId;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

}
