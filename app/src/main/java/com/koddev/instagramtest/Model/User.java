package com.koddev.instagramtest.Model;

public class User {
    private String id;
    private String username;
    private String fullname;
    private String imageurl;
    private String bio;
    private String relationship_status;
    private String email;
    private String institution;
    private String faculty;
    private String department;
    private String telephone_number;
    private String birthday;
    private String gender;

    public User(String id, String username, String fullname, String imageurl, String bio, String relationship_status, String email, String institution,
                String faculty, String department, String telephone_number, String birthday, String gender) {
        this.id = id;
        this.username = username;
        this.fullname = fullname;
        this.imageurl = imageurl;
        this.email = email;
        this.institution = institution;
        this.telephone_number = telephone_number;
        this.faculty = faculty;
        this.department = department;
        this.bio = bio;
        this.gender = gender;
        this.birthday = birthday;
        this.relationship_status = relationship_status;
    }

    public User() {
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullname() {
        return fullname;
    }
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getImageurl() {
        return imageurl;
    }
    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getBio() {
        return bio;
    }
    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getRelationship_status() {
        return relationship_status;
    }
    public void setRelationship_status(String relationship_status) {this.relationship_status = relationship_status;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getInstitution() {
        return institution;
    }
    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getFaculty() {
        return faculty;
    }
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTelephone_number() {
        return telephone_number;
    }
    public void setTelephone_number(String telephone_number) {this.telephone_number = telephone_number; }

    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {this.birthday = birthday;}

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {this.gender = gender;}
}
