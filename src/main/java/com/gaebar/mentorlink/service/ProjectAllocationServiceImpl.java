package com.gaebar.mentorlink.service;

import com.gaebar.mentorlink.dto.MentorDTO;
import com.gaebar.mentorlink.dto.ProjectDTO;
import com.gaebar.mentorlink.entity.Mentor;
import com.gaebar.mentorlink.entity.Project;
import com.gaebar.mentorlink.exception.MentorLinkException;
import com.gaebar.mentorlink.repository.MentorRepository;
import com.gaebar.mentorlink.repository.ProjectRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Service implementation for allocating projects to mentors and managing assignments.
 * Handles business logic for mentor availability, validation, and project reassignments.
 */
@Service("projectService") // registers the bean with the name "projectService" - Useful if in the future you need to use @Qualifier
@Transactional
public class ProjectAllocationServiceImpl implements ProjectAllocationService {

    private final MentorRepository mentorRepository;
    private final ProjectRepository projectRepository;

    /**
     * Constructor for dependency injection of repositories.
     *
     * @param mentorRepository  the repository for Mentor entities
     * @param projectRepository the repository for Project entities
     */
    public ProjectAllocationServiceImpl(MentorRepository mentorRepository,
                                        ProjectRepository projectRepository) {
        this.mentorRepository = mentorRepository;
        this.projectRepository = projectRepository;
    }

    /**
     * Allocates a new project to a mentor, if workload constraints allow.
     *
     * @param projectDTO the data transfer object containing project and mentor details
     * @return the ID of the newly allocated project
     * @throws MentorLinkException if allocation rules are violated
     */
    @Override
    public Integer allocateProject(ProjectDTO projectDTO) throws MentorLinkException {
        // Implementation coming soon
        return null;
    }

    /**
     * Retrieves a list of mentors based on how many projects they are mentoring.
     *
     * @param numberOfProjectsMentored the number of projects to filter mentors by
     * @return a list of matching mentors in DTO format
     * @throws MentorLinkException if retrieval fails or invalid input is provided
     */
    @Override
    public List<MentorDTO> getMentors(Integer numberOfProjectsMentored) throws MentorLinkException {
        return null;
    }

    /**
     * Updates the mentor assigned to a given project.
     *
     * @param projectId the ID of the project
     * @param mentorId  the ID of the new mentor
     * @throws MentorLinkException if update fails due to constraints or invalid data
     */
    @Override
    public void updateProjectMentor(Integer projectId, Integer mentorId) throws MentorLinkException {
    }

    /**
     * Deletes a project and updates the mentor's workload accordingly.
     *
     * @param projectId the ID of the project to delete
     * @throws MentorLinkException if deletion fails or project not found
     */
    @Override
    public void deleteProject(Integer projectId) throws MentorLinkException {
    }
}
