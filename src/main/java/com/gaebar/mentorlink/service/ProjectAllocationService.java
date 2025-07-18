package com.gaebar.mentorlink.service;

import com.gaebar.mentorlink.dto.MentorDTO;
import com.gaebar.mentorlink.dto.ProjectDTO;
import com.gaebar.mentorlink.exception.MentorLinkException;

import java.util.List;

/**
 * Service interface for handling project allocation logic between mentors and projects.
 * Defines core operations such as assigning, updating, retrieving, and deleting project assignments.
 */
public interface ProjectAllocationService {

    /**
     * Allocates a new project to a mentor.
     *
     * @param projectDTO the project details including the mentor to assign
     * @return the ID of the newly created project
     * @throws MentorLinkException if allocation fails due to validation or business rules
     */
    Integer allocateProject(ProjectDTO projectDTO) throws MentorLinkException;

    /**
     * Retrieves a list of mentors filtered by the number of projects they are mentoring.
     *
     * @param numberOfProjectsMentored the number of projects to filter mentors by
     * @return a list of mentors matching the filter criteria
     * @throws MentorLinkException if retrieval fails or parameters are invalid
     */
    List<MentorDTO> getMentors(Integer numberOfProjectsMentored) throws MentorLinkException;

    /**
     * Updates the mentor assigned to a specific project.
     *
     * @param projectId the ID of the project to update
     * @param mentorId  the ID of the new mentor to assign
     * @throws MentorLinkException if the update fails due to validation or business rules
     */
    void updateProjectMentor(Integer projectId, Integer mentorId) throws MentorLinkException;

    /**
     * Deletes a project and updates the corresponding mentor workload.
     *
     * @param projectId the ID of the project to delete
     * @throws MentorLinkException if deletion fails or the project doesn't exist
     */
    void deleteProject(Integer projectId) throws MentorLinkException;
}
