/**
 * 
 */
package com.cg.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Uma Shankar
 *
 * 05-May-2020 5:43:49 pm
 */
@Entity
@Table(name="SKILLS")
public class Skills {
	
	@Id
	@Column(name="SKILL_NAME")
	private String skillName ;

}
