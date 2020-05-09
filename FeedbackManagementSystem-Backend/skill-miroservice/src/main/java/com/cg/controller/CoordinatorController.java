package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.beans.Skills;
import com.cg.service.CoordinatorService;

@RestController
@RequestMapping("/coordinator")
public class CoordinatorController {
	
	@Autowired
	private CoordinatorService  coodinatorService;
	
	//http://localhost:5055/coordinator/addskills
	@PostMapping("/addskills")
	public Skills addSkill(@RequestBody Skills skill) {
		return this.coodinatorService.addSkillSet(skill);	
	}
	
	//http://localhost:5055/coordinator/allskills
	@GetMapping("/allskills")
	public List<Skills> getAllSkills() {
		return this.coodinatorService.getAllSkillSet();
	}
	
	//http://localhost:5055/coordinator/allskills/{skillName}
	@GetMapping("/allskills/{skillName}")
	public Skills getSkillByName(@PathVariable(value = "skillName") String skillName) {
		return this.coodinatorService.getSkillSetByName(skillName);
	}
	
	//http://localhost:5055/coordinator/deleteSkill/{skillName}
	@DeleteMapping("/deleteSkill/{skillName}")
	public String deleteSkill(@PathVariable(value= "skillName") String skillName) {
		this.coodinatorService.deleteSkillSet(skillName); 
		return "Successfully deleted";
	}

}
