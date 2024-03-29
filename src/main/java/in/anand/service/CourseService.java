package in.anand.service;

import java.util.List;

import in.anand.binding.Course;

public interface CourseService {
	
	public String upsert(Course course);
	
	public Course getById(Integer cid);
	
	public List<Course> getALLCourses();
	
	public String deleteById(Integer cid);

}
