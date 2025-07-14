// ProjectRepository.java
package com.gaebar.mentorlink.repository;

import com.gaebar.mentorlink.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Integer> {
}
