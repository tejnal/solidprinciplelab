package com.solid.principles.singleresponsibiltyprinciple.bad;

public class Resume {

  /**
   * Resume class is violating single responsibility by having responsibility for getting and
   * setting employer technologies and experience, and this class is also having additional
   * responsibility of search resume
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

  public void searchResume() {

    System.out.println("We can write search logic here");
  }
}
