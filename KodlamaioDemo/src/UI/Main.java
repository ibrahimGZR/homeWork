package UI;

import business.abstracts.CourseService;
import business.concretes.CourseManager;
import dataAccess.concretes.sql.SqlCourseDao;
import entities.concretes.Category;
import entities.concretes.Course;
import entities.concretes.Teacher;

public class Main {

	public static void main(String[] args) {

		Teacher teacher1 = new Teacher(1, "MVP", "Frontend developer", 1, "Vladimir", "Kalashinkov", "4551256635",
				"vladvlad@gmail.com", "www.img.com.de");
		Teacher teacher2 = new Teacher(2, "MVP", "Frontend developer", 1, "Putin", "Kalashinkov", "4551256635",
				"vladvlad@gmail.com", "www.img.com.de");
		Teacher teacher3 = new Teacher(3, "MVP", "Frontend developer", 1, "Obama", "Kalashinkov", "4551256635",
				"vladvlad@gmail.com", "www.img.com.de");
		Teacher teacher4 = new Teacher(4, "MVP", "Frontend developer", 1, "Merkel", "Kalashinkov", "4551256635",
				"vladvlad@gmail.com", "www.img.com.de");

		Category category1 = new Category(1, "Algorithm");
		Category category2 = new Category(2, "DataBase");

		Course course1 = new Course(1, category1, "Java", "Java BootCamp", "mr.img", teacher1, 10);
		Course course2 = new Course(2, category2, "C#", "C# BootCamp", "mr.img", teacher1, 10);
		Course course3 = new Course(3, category1, "JavaScript", "JavaScript BootCamp", "mr.img", teacher3, 10);
		Course course4 = new Course(4, category1, "Kotlin", "Kotlin BootCamp", "mr.img", teacher4, 10);

		CourseService courseService = new CourseManager(new SqlCourseDao());
		courseService.add(course1);
		courseService.add(course2);
		courseService.add(course3);
		courseService.add(course4);

//		for (Course course : courseManager.search("Ja")) {
//			System.out.println(course.getCourseName());
//		}

		for (Course course : courseService.selectedFilterByTeacher(1)) {
			System.out.println(course.getCourseName());
		}

		for (Course course : courseService.selectedFilterByCategory(1)) {
			System.out.println(course.getCourseName());
		}

	}

}
