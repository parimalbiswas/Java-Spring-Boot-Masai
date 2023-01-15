package com.parimal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.parimal.model.Course;

@Repository
public interface CourseDao extends JpaRepository<Course, Integer>
{
	public List<Course> findBycName(String cname);

}
