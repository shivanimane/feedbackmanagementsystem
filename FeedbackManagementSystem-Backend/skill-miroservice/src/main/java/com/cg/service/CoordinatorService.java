package com.cg.service;

import java.util.List;
import com.cg.beans.Skills;

public interface CoordinatorService {

	// FacultySkillMaintainance
	Skills addSkillSet(Skills s);

	boolean deleteSkillSet(String skillName);

	List<Skills> getAllSkillSet();

	Skills getSkillSetByName(String skillName);
	
}
