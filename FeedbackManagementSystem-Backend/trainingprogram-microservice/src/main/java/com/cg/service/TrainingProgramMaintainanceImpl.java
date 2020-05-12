/**
 * 
 */
package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bean.Employee;
import com.cg.bean.ParticipantEnrolled;
import com.cg.bean.TrainingProgram;
import com.cg.dao.ParticipantEnrolledRepository;
import com.cg.dao.TrainingProgramRepository;

/**
 * @author Uma Shankar
 *
 * 04-May-2020 3:07:02 pm
 */
@Service
public class TrainingProgramMaintainanceImpl implements TrainingProgramMaintainance {
	
	
	@Autowired
	TrainingProgramRepository trainingProgramDao ;
	
	@Autowired
	ParticipantEnrolledRepository participantEnrolledDao ;

	@Override
	public List<TrainingProgram> getAllTrainingProgram() {
		return this.trainingProgramDao.findAll();
	}

	@Override
	public TrainingProgram getTrainingProgramById(Integer trainingCode) {
		return this.trainingProgramDao.findById(trainingCode).get();
		
	}

	@Override
	public TrainingProgram addTrainingProgram(TrainingProgram trainingProgram) {
		return this.trainingProgramDao.save(trainingProgram);
		
	}

	@Override
	public Boolean deleteTrainingProgram(Integer trainingCode) {
		this.trainingProgramDao.deleteById(trainingCode);
		return true;
	}

	@Override
	public TrainingProgram isTrainingProgram(Integer trainingCode) {
		List<TrainingProgram> trainingProgramList = this.trainingProgramDao.findAll();
		for(int i=0;i<=trainingProgramList.size();i++) {
			if(trainingProgramList.get(i).getTrainingCode()==trainingCode)
				return trainingProgramList.get(i);
		}
		return null;
	}

	@Override
	public ParticipantEnrolled enrollParticipant(Employee employee, TrainingProgram tp) {
		ParticipantEnrolled partEnrolled = new ParticipantEnrolled();
		partEnrolled.setPartEnrollNo(employee.getEmployeeId());
		partEnrolled.setParticipantName(employee.getEmployeeName());
		partEnrolled.setTrainingprogram(tp);
		return participantEnrolledDao.save(partEnrolled);
	}

	@Override
	public TrainingProgram getTrainingProgramByParticipantId(Integer participantId) {
		List<ParticipantEnrolled> enrollmentList = participantEnrolledDao.findAll();
		for (int i = 0; i < enrollmentList.size(); i++) {
			if(enrollmentList.get(i).getPartEnrollNo()==participantId) {
				return enrollmentList.get(i).getTrainingprogram();
			}
		}
		return null;
	}
	
	
	

	
}
