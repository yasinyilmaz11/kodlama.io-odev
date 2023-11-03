package bussiness;

import core.Logging.Logger;
import dataAccess.CourseDao;
import entities.Course;

public class CourseManager {
    private CourseDao courseDao;
    private Logger[] loggers;

    public CourseManager(CourseDao courseDao, Logger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public void add(Course course) throws Exception {
        {
            if (course.getPrice() < 0 && course.getName().equals(course.getName())) {
                throw new Exception("Bir kursun fiyatı 0 dan küçük olamaz"+ "Kurs ismi tekrar edemez");
            }
        }
        courseDao.add(course);

        for (Logger logger : loggers) {
            logger.Log(course.getName());
        }
    }
}
