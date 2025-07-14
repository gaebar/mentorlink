package com.gaebar.mentorlink.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_id")
    private Integer projectId;

    @Column(name = "project_name", nullable = false, length = 50)
    private String projectName;

    @Column(name = "idea_owner", nullable = false)
    private Integer ideaOwner;

    @Column(name = "release_date", nullable = false)
    private LocalDate releaseDate;

    @ManyToOne
    @JoinColumn(name = "mentor_id")
    private Mentor mentor;

    public Project() {}

    public Project(String projectName, Integer ideaOwner, LocalDate releaseDate, Mentor mentor) {
        this.projectName = projectName;
        this.ideaOwner = ideaOwner;
        this.releaseDate = releaseDate;
        this.mentor = mentor;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Integer getIdeaOwner() {
        return ideaOwner;
    }

    public void setIdeaOwner(Integer ideaOwner) {
        this.ideaOwner = ideaOwner;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Mentor getMentor() {
        return mentor;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }
}

