package com.solid.principles.singleresponsibiltyprinciple.good;

import org.junit.jupiter.api.Test;

class ResumeSearchTest {

  @Test
  public void searchResumeTest() {

    Resume resume = new Resume();
    resume.technology = "java";
    resume.yearsOfExperience = 5;

    ResumeSearch resumeSearch = new ResumeSearch(resume);
    System.out.println(resumeSearch);
  }
}
