package com.sgic.hrm.trainee.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.commons.entity.trainee.Trainee;
import com.sgic.hrm.commons.repository.trainee.TraineeRepository;
import com.sgic.hrm.trainee.service.TraineeService;

@Service
public class TraineeServiceImpl implements TraineeService {
	@Autowired
	private TraineeRepository traineeRepository;

	@Override
	public List<Trainee> getTrainee() {
		return traineeRepository.findAll();
	}

	@Override
	public boolean deleteTrainee(Integer id) {
		if (traineeRepository.getOne(id) != null) {
			traineeRepository.deleteById(id);
			return true;
		}
		return false;
	}

	@Override
	public Trainee findTraineeById(Integer id) {
		return traineeRepository.findTraineeById(id);

	}

	@Override
	public Trainee findByTraineeName(String fullName) {
		return traineeRepository.findByName(fullName);

	}

	@Override
	public boolean addTrainee(Trainee trainee, com.sgic.hrm.commons.entity.trainee.Department department) {
		trainee.setDepartment(department);
		traineeRepository.save(trainee);
		return true;
	}

	@Override
	public boolean editTrainee(Trainee trainee, com.sgic.hrm.commons.entity.trainee.Department department, Integer id) {
		if (traineeRepository.getOne(id) != null) {
			trainee.setDepartment(department);
			traineeRepository.save(trainee);
		}
		return false;
	}

	@Override
	public Trainee getTraineeById(Integer id) {
		return traineeRepository.findTraineeById(id);
	}

}
