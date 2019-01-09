package com.sgic.hrm.commons.dto.mapper.trainee;

import com.sgic.hrm.commons.dto.trainee.TraineeDto;
import com.sgic.hrm.commons.dto.trainee.TraineeSaveDto;
import com.sgic.hrm.commons.entity.trainee.TraineeDepartment;
import com.sgic.hrm.commons.entity.trainee.Trainee;

public class TraineeDtoMapper {

	public static Trainee mapTraineeSaveDtoToTrainee(TraineeSaveDto traineeSaveDto) {
		Trainee trainee = new Trainee();
		TraineeDepartment traineeDepartment = new TraineeDepartment();

		traineeDepartment.setId(traineeSaveDto.getTraineeDepartment());

		trainee.setId(traineeSaveDto.getId());
		trainee.setTraineeDepartment(traineeDepartment);
		trainee.setDateOfBirth(traineeSaveDto.getDateOfBirth());
		trainee.setEmail(traineeSaveDto.getEmail());
		trainee.setFullName(traineeSaveDto.getFullName());
		trainee.setName(traineeSaveDto.getName());
		trainee.setEmployment(traineeSaveDto.getEmployment());
		trainee.setGender(traineeSaveDto.getGender());
		trainee.setJoinDate(traineeSaveDto.getJoinDate());
		trainee.setMaritalStatus(traineeSaveDto.getMaritalStatus());
		trainee.setMobileNumber(traineeSaveDto.getMobileNumber());
		trainee.setNationality(traineeSaveDto.getNationality());
		trainee.setNic(traineeSaveDto.getNic());
		trainee.setOccupation(traineeSaveDto.getOccupation());
		trainee.setPermenentAddress(traineeSaveDto.getPermenentAddress());
		trainee.setProfilePhoto(traineeSaveDto.getProfilePhoto());
		trainee.setReligion(traineeSaveDto.getReligion());
		trainee.setResidentialAddress(traineeSaveDto.getResidentialAddress());
		trainee.setServicePeriod(traineeSaveDto.getServicePeriod());
		trainee.setTelephoneNumber(traineeSaveDto.getTelephoneNumber());
		trainee.setUpdateAt(traineeSaveDto.getUpdateAt());
		trainee.setQualificationLevel(traineeSaveDto.getQualificationLevel());
		return trainee;
	}

	public static Trainee mapTraineeDtoToTrainee(TraineeDto traineeDto) {
		Trainee trainee=new Trainee();
		
		trainee.setId(traineeDto.getId());
		trainee.setTraineeDepartment(traineeDto.getTraineeDepartment());
		trainee.setDateOfBirth(traineeDto.getDateOfBirth());
		trainee.setEmail(traineeDto.getEmail());
		trainee.setEmployment(traineeDto.getEmployment());
		trainee.setFullName(traineeDto.getFullName());
		trainee.setGender(traineeDto.getGender());
		trainee.setJoinDate(traineeDto.getJoinDate());
		trainee.setMaritalStatus(traineeDto.getMaritalStatus());
		trainee.setMobileNumber(traineeDto.getMobileNumber());
		trainee.setName(traineeDto.getName());
		trainee.setNationality(traineeDto.getNationality());
		trainee.setNic(traineeDto.getNic());
		trainee.setOccupation(traineeDto.getOccupation());
		trainee.setPermenentAddress(traineeDto.getPermenentAddress());
		trainee.setProfilePhoto(traineeDto.getProfilePhoto());
		trainee.setReligion(traineeDto.getReligion());
		trainee.setResidentialAddress(traineeDto.getResidentialAddress());
		trainee.setServicePeriod(traineeDto.getServicePeriod());
		trainee.setTelephoneNumber(traineeDto.getTelephoneNumber());
		trainee.setUpdateAt(traineeDto.getUpdateAt());
		trainee.setQualificationLevel(traineeDto.getQualificationLevel());
		return trainee;
	}
}
