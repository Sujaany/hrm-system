package com.sgic.hrm.commons.entity;

import java.io.Serializable;
import java.time.ZonedDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(schema = "employee", name = "self_service")
public class Response implements Serializable {

	private static final long serialVersionUID = -2454447182460465982L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "self_service_id")
	private SelfService selfService;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "relevant_department_id")
	private Department relevantDepartment;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "relevant_individual_id")
	private User relevantIndividual;
	private String attachment;
	private ZonedDateTime date;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public SelfService getSelfService() {
		return selfService;
	}

	public void setSelfService(SelfService selfService) {
		this.selfService = selfService;
	}

	public Department getRelevantDepartment() {
		return relevantDepartment;
	}

	public void setRelevantDepartment(Department relevantDepartment) {
		this.relevantDepartment = relevantDepartment;
	}

	public User getRelevantIndividual() {
		return relevantIndividual;
	}

	public void setRelevantIndividual(User relevantIndividual) {
		this.relevantIndividual = relevantIndividual;
	}

	public String getAttachment() {
		return attachment;
	}

	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}

	public ZonedDateTime getDate() {
		return date;
	}

	public void setDate(ZonedDateTime date) {
		this.date = date;
	}
}
