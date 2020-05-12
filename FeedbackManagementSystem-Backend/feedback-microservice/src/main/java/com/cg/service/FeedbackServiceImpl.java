/**
 * @author Shivani
 * @data May 4, 2020
 * @time 10:34:22 PM
 */
package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.beans.Feedback;
import com.cg.dao.FeedbackDao;

/**
 * @author Shivani
 *
 */
@Service
public class FeedbackServiceImpl implements FeedbackService{
	
	
	
	@Autowired
	FeedbackDao feedbackDao;
	
	@Override
	public Feedback addFeedback(Feedback feedback) {
		return this.feedbackDao.save(feedback);
	}

	@Override
	public List<Feedback> getAllFeedback() {
		return this.feedbackDao.findAll();
	}

	//Needs to be corrected
	
	@Override
	public Feedback getFeedbackByFacultyId(Integer facultyId) {
		//return this.feedbackDao.findAll().stream().filter(f->f.==facultyId).findFirst().get();
//		String urll = "http://localhost:5053/faculty/getFacultyById/";
//		Faculty faculty = restTemplate.getForObject(urll+facultyId, Faculty.class);
//		
		
		//TrainingProgram tp = restTemplate.getForObject(url, responseType)
		//return
		return null;
	}

	@Override
	public Feedback getFeedbackByTrainingProgram(Integer trainingCode) {
		//return this.feedbackDao.findAll().stream().filter(f->f.getTrainingCode().getTrainingCode()==trainingCode).findFirst().get();
		return null;
	}

}
