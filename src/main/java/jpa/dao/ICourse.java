package jpa.dao;

import java.util.List;

public interface ICourse {
    List<jpa.entitymodels.Course> getAllCourses();
    jpa.entitymodels.Course getCourseById(int id);
}
