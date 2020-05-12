/**
 * @author Shivani
 * @data May 4, 2020
 * @time 10:34:43 PM
 */
package com.cg.service;

import java.util.List;

import com.cg.beans.Feedback;

/**
 * @author Shivani
 *
 */

/**
 * Participant will give feedback 
 * 	for his particular training program
 * 
 * Get All Feedbacks
 * Get Feedback By FacultyId
 * 
 */
public interface FeedbackService {
	
	 Feedback addFeedback(Feedback feedback);
	 List<Feedback> getAllFeedback();
	 Feedback getFeedbackByFacultyId(Integer facultyId);
	 Feedback getFeedbackByTrainingProgram(Integer trainingCode);
	
}
