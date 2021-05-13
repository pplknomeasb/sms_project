package jpa.services;

import jpa.dao.ICourse;

import javax.persistence.EntityManager;

public class CourseService implements ICourse {

    publict List<Course> getAllCourses(){

        EntityManager em = SMSRunner.emf.createEntitymanager();
        em.getTransaction().begin();
        Query q = em.CreateNamedQuery("Find all courses");
        List<Course> c = q.getResultList();
        em.getTransaction().commit();
        em.close;
        return c;
    }
}
