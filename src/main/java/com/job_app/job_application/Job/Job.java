package com.job_app.job_application.Job;

public class Job {
    private Long id;
    private String title;
    private String description;
    private Long minsalary;
    private Long maxsalary;
    private String location;

    public Job(String title, Long id, Long minsalary, String description, Long maxsalary, String location) {
        this.title = title;
        this.id = id;
        this.minsalary = minsalary;
        this.description = description;
        this.maxsalary = maxsalary;
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getMinsalary() {
        return minsalary;
    }

    public void setMinsalary(Long minsalary) {
        this.minsalary = minsalary;
    }

    public Long getMaxsalary() {
        return maxsalary;
    }

    public void setMaxsalary(Long maxsalary) {
        this.maxsalary = maxsalary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }



}
