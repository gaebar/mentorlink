// MentorRepository.java
package com.gaebar.mentorlink.repository;

import com.gaebar.mentorlink.entity.Mentor;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 * Repository interface for Mentor entities.
 *
 * Extends JpaRepository to inherit basic CRUD operations,
 * pagination, sorting, and support for custom finder methods
 * based on method naming conventions.
 *
 * Example inherited methods:
 * - save(), findById(), findAll(), deleteById(), count()
 *
 * Custom methods can be added, like:
 * - findByNumberOfProjectsMentored(Integer count)
 */
public interface MentorRepository extends JpaRepository<Mentor, Integer> {

    /**
     * Custom finder method to retrieve mentors by number of projects mentored.
     * Automatically implemented by Spring Data JPA based on method name.
     *
     * Example: findByNumberOfProjectsMentored(3)
     * → returns all mentors who have mentored exactly 3 projects.
     *
     * @param count the number of projects mentored
     * @return a list of mentors with the specified number of projects
     */
    List<Mentor> findByNumberOfProjectsMentored(Integer count);
}

