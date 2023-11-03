package dataAccess;

import entities.Category;
import entities.Course;
import entities.Educator;

public class JdbcDao implements CategoryDao, CourseDao, EducatorDao{
    @Override
    public void add(Category category) {
        System.out.println("JDBC ile veritabanına eklendi");
    }

    @Override
    public void add(Course course) {
        System.out.println("JDBC ile veritabanına eklendi");
    }

    @Override
    public void add(Educator educator) {
        System.out.println("JDBC ile veritabanına eklendi");
    }
}
