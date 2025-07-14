// MentorRepository.java
package com.gaebar.mentorlink.repository;

import com.gaebar.mentorlink.entity.Mentor;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface MentorRepository extends JpaRepository<Mentor, Integer> {

    // Custom query method: find mentors by number of projects
    List<Mentor> findByNumberOfProjectsMentored(Integer count);
}

