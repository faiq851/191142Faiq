package com.faiqahmed.recycleview_191142.Student;

public class Student {
    String Name, Release, Version;

    public Student() {
    }

    public Student(String name, String release, String version) {
        Name = name;
        Release= release;
        Version=version;
    }

    public String getName() {
        return Name;
    }
    public String getVersion() {
        return Version;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getRoll_no() {
        return Release;
    }

    public void setRoll_no(String release) {
        Release = release;
    }
    public void setVersion(String version) {
        Version = version;
    }
}
