package dataAccess;

import entities.Category;
import entities.Course;
import entities.Educator;

public class HibernateDao implements CourseDao, CategoryDao, EducatorDao{
    @Override
    public void add(Category category) {
        System.out.println("Hibernate ile veritabanına eklendi");
    }

    @Override
    public void add(Course course) {
        System.out.println("Hibernate ile veritabanına eklendi");
    }

    @Override
    public void add(Educator educator) {
        System.out.println("Hibernate ile veritabanına eklendi");
    }
}
