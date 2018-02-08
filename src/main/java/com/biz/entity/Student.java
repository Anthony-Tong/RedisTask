package com.biz.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 学生实体类
 *
 * @author ChunjieTang
 * @create 2018-02-08 10:32
 */
public class Student {
    private String id;
    private String name;
    private Date birthday;
    private String description;
    private int avgScore;

    public Student() {
    }

    public Student(String id, String name, String birthday, String description, int avgScore) throws ParseException {
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        this.id = id;
        this.name = name;
        this.birthday = dateformat.parse(birthday);
        this.description = description;
        this.avgScore = avgScore;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(int avgScore) {
        this.avgScore = avgScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", description='" + description + '\'' +
                ", avgScore=" + avgScore +
                '}';
    }
}
