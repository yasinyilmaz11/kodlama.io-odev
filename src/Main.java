import bussiness.CourseManager;
import core.Logging.DatabaseLogger;
import core.Logging.FileLogger;
import core.Logging.Logger;
import core.Logging.MailLogger;
import dataAccess.HibernateDao;
import dataAccess.JdbcDao;
import entities.Course;

public class Main {
    public static void main(String[] args) throws Exception {
        Course course1 = new Course("Java", 100);
        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};

        CourseManager courseManager = new CourseManager(new HibernateDao(), loggers);
        courseManager.add(course1);
    }
}