/**
 * 
 */
package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bean.TrainingProgram;
import com.cg.service.TrainingProgramMaintainance;

/**
 * @author Uma Shankar
 *
 *         06-May-2020 7:44:11 pm
 */
@RestController
@CrossOrigin("http://localhost:4200")
public class TrainingProgramController {

	@Autowired
	TrainingProgramMaintainance trainingProgramMaintainance;

	//http://localhost:5056/admin/getAllTrainingProgramList
	@GetMapping("/admin/getAllTrainingProgramList")
	public List<TrainingProgram> getAllTrainingProgramList() {
		return this.trainingProgramMaintainance.getAllTrainingProgram();
	}

	//http://localhost:5056/admin/getTrainingById/{id}
	@GetMapping("/admin/getTrainingById/{id}")
	public TrainingProgram getTrainingProgramById(@PathVariable(value = "id") Integer trainingCode) {
		TrainingProgram trainingProgram = this.trainingProgramMaintainance.getTrainingProgramById(trainingCode);

		return trainingProgram;
	}
	//http://localhost:5056/admin/addTrainingProgram
	@PostMapping("/admin/addTrainingProgram")
	public TrainingProgram createTrainingProgram(@RequestBody TrainingProgram trainingProgram) {

		return this.trainingProgramMaintainance.addTrainingProgram(trainingProgram);

	}
	
	//http://localhost:5056/admin/deleteTrainingProgram/{id}
	@DeleteMapping("/admin/deleteTrainingProgram/{id}")
	public Boolean deleteCourse(@PathVariable(value = "id") Integer trainingCode) {

	   return this.trainingProgramMaintainance.deleteTrainingProgram(trainingCode);
	}
	
	@GetMapping("/admin/checkTrainingProgram/{trainingCode}")
	public Boolean isTrainingProgram(@PathVariable Integer trainingCode) {
		return this.trainingProgramMaintainance.isTrainingProgram(trainingCode);
	}

}
