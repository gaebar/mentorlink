package com.gaebar.mentorlink.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "mentors")
public class Mentor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mentor_id")
    private Integer mentorId;

    @Column(name = "mentor_name", nullable = false, length = 50)
    private String mentorName;

    @Column(name = "projects_mentored", nullable = false)
    private Integer numberOfProjectsMentored;

    public Mentor() {
    }

    public Mentor(String mentorName, Integer numberOfProjectsMentored) {
        this.mentorName = mentorName;
        this.numberOfProjectsMentored = numberOfProjectsMentored;
    }

    public Integer getMentorId() {
        return mentorId;
    }

    public void setMentorId(Integer mentorId) {
        this.mentorId = mentorId;
    }

    public String getMentorName() {
        return mentorName;
    }

    public void setMentorName(String mentorName) {
        this.mentorName = mentorName;
    }

    public Integer getNumberOfProjectsMentored() {
        return numberOfProjectsMentored;
    }

    public void setNumberOfProjectsMentored(Integer numberOfProjectsMentored) {
        this.numberOfProjectsMentored = numberOfProjectsMentored;
    }
}
