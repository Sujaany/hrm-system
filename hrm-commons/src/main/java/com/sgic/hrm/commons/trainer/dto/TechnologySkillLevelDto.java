package com.sgic.hrm.commons.trainer.dto;

//done by_Sujaany
public class TechnologySkillLevelDto {
	private Integer id;
	private String technology;
	private SkillData skill;
	private Integer level;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public SkillData getSkill() {
		return skill;
	}

	public void setSkill(SkillData skill) {
		this.skill = skill;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}
}
