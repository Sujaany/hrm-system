package com.sgic.hrm.commons.entity.trainer;

//done by_Sujaany
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="skill", schema="trainer")
public class Skill implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3349090523142992809L;
	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)	
	private Integer id;
	private String skill;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	
	

}
