package in.anand.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.anand.binding.Course;

//@Repository
public interface CourseRepository extends JpaRepository<Course, Serializable> {
	
	

}
