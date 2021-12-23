package com.solid.principles.singleresponsibiltyprinciple.good;

public class Resume {

  /**
   * Resume class is holding single responsibility of getting and setting employer technologies and
   * experience
   */
  String technology;

  Integer yearsOfExperience;

  public String getTechnology() {

    return technology;
  }

  public void setTechnology(String technology) {

    this.technology = technology;
  }

  public Integer getYearsOfExperience() {

    return yearsOfExperience;
  }

  public void setYearsOfExperience(Integer yearsOfExperience) {

    this.yearsOfExperience = yearsOfExperience;
  }
}
