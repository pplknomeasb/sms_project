package jpa.mainrunner;
import static java.lang.System.out;
import java.util.Scanner;
import javax.persistence.EntityManagerFactory

import jpa.models.Student;
import jpa.services.CourseService;
import jpa.util.JpaUtil;

public class SMSRunner{
    public static EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
    private Scanner sin;
    private StringBuilder sb;
    private CourseService courseService;
    private Student student;


    public static void main(String[] args) {
        SMSRunner sms= new SMSRunner();
        sms.run();
    }

}
