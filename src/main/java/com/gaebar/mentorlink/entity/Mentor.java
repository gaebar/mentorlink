package com.gaebar.mentorlink.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "mentors")
public class Mentor {

    // === FIELDS ===

    /** Primary key: auto-generated mentor ID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mentor_id")
    private Integer mentorId;

    /** Mentor's full name (max 50 characters, cannot be null) */
    @Column(name = "mentor_name", nullable = false, length = 50)
    private String mentorName;

    /** Number of projects the mentor has mentored (cannot be null) */
    @Column(name = "projects_mentored", nullable = false)
    private Integer numberOfProjectsMentored;

    // === CONSTRUCTORS ===

    /** All-args constructor for quick instantiation */
    public Mentor() {
    }

    public Mentor(String mentorName, Integer numberOfProjectsMentored) {
        this.mentorName = mentorName;
        this.numberOfProjectsMentored = numberOfProjectsMentored;
    }

    // === GETTERS AND SETTERS ===

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

    // === OPTIONAL: toString(), equals(), hashCode() ===
}
