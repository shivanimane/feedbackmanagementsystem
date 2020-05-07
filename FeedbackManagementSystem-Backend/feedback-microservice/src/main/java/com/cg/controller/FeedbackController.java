/**
 * @author Shivani
 * @data May 5, 2020
 * @time 10:03:03 AM
 */
package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.beans.Feedback;
import com.cg.service.FeedbackService;

/**
 * @author Shivani
 *
 */

@RestController
@RequestMapping("/feedback")
public class FeedbackController {
	
	@Autowired
	FeedbackService feedbackService;
	
	/**
	 * Add Feedback
	 * @param feedback
	 * @return
	 */
	//localhost:5053/feedback/addFeedback
	@PostMapping("/addFeedback")
	public Feedback addFeedback(@RequestBody Feedback feedback) {
		return feedbackService.addFeedback(feedback);
	}
	
	//localhost:5053/feedback/allFeedback
	@GetMapping("/allFeedback")
	public List<Feedback> showAllFeedback(){
		return feedbackService.getAllFeedback();
	}
	
	//localhost:5053/feedback/forEachFaculty/{facultyId}
	@GetMapping("forEachFaculty/{facultyId}")
	public List<Feedback> getFeedbackByFacultyId(@PathVariable Integer facultyId){
		return feedbackService.getFeedbackByFacultyId(facultyId);
	}
	
	//localhost:5053/feedback/forEachTrainingProgram/{trainingCode}
	@GetMapping("forEachTrainingProgram/{trainingCode}")
	public List<Feedback> getFeedbackByTrainingCode(@PathVariable Integer trainingCode){
		return feedbackService.getFeedbackByTrainingProgram(trainingCode);
	}
	
}

/**
 * Add Feedback -Json
 * {	
	"trainingCode":
	{	
		"trainingCode":1,
		"course":{
			"courseId":1,
			"courseName":"JAVA",
			"noOfDays":50
			},
		"faculty":{
			"facultyId":1,
			"facultyName":"ABC",
			"listOfSkillSet":[{
				"skillName":"abc"
				
			}]
			},
		"startDate":"2020-02-02",
		"endDate":"2020-04-04"
	},
	"participantId":{"employeeId":1,"employeeName":"Shivani","password":"1234","role":"Participant"},
	"fbPrsComm":5,
	"fbClrfyDbts":5,
	"fbTm":5,
	"fbHndOut":5,
	"fbHwSwNtwrk":5,
	"comments":"what's up",
	"suggestions":"Pls work this time",
	"feedbackDate":"2020-02-02"
}
 */
