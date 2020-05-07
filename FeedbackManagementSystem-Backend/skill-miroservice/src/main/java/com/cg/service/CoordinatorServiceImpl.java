package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.beans.Skills;
import com.cg.dao.SkillsDao;

@Service
public class CoordinatorServiceImpl implements CoordinatorService {

	@Autowired
	private SkillsDao sDao;

	@Override
	public Skills addSkillSet(Skills skill) {
		return sDao.save(skill);
	}

	@Override
	public boolean deleteSkillSet(String skillName) {
		List<Skills> allSkills = sDao.findAll();
		Skills skill = allSkills.stream().filter(x -> x.getSkillName().equalsIgnoreCase(skillName)).findFirst().get();
		sDao.delete(skill);
		return true;
	}

	@Override
	public List<Skills> getAllSkillSet() {
		List<Skills> skills = sDao.findAll();
		return skills;
	}

	@Override
	public Skills getSkillSetByName(String skillName) {
		List<Skills> allSkills = sDao.findAll();
		Skills skill = allSkills.stream().filter(s->s.getSkillName().equalsIgnoreCase(skillName)).findFirst().get();
		return skill;
	}

}
