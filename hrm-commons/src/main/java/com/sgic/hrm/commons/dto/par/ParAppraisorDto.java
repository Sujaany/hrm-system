package com.sgic.hrm.commons.dto.par;

public class ParAppraisorDto {

	private String appraiserId;
	private String appraiserEmpId;
	private String appraiserName;
	
	
	public ParAppraisorDto(String appraiserId, String appraiserEmpId, String appraiserName) {
		this.appraiserId = appraiserId;
		this.appraiserEmpId = appraiserEmpId;
		this.appraiserName = appraiserName;
	}
	
	
	public ParAppraisorDto() {
	
	}


	public String getAppraiserId() {
		return appraiserId;
	}
	public void setAppraiserId(String appraiserId) {
		this.appraiserId = appraiserId;
	}
	public String getAppraiserEmpId() {
		return appraiserEmpId;
	}
	public void setAppraiserEmpId(String appraiserEmpId) {
		this.appraiserEmpId = appraiserEmpId;
	}
	public String getAppraiserName() {
		return appraiserName;
	}
	public void setAppraiserName(String appraiserName) {
		this.appraiserName = appraiserName;
	}
	
	
}
