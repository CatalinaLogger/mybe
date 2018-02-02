package com.core.user.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import java.util.Date;

@Entity
public class User {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String sex;
    @Min(value=18,message = "未满18岁禁止入内")
    private Integer age;
    private Date brithDay;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBrithDay() {
        return brithDay;
    }

    public void setBrithDay(Date brithDay) {
        this.brithDay = brithDay;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", brithDay=" + brithDay +
                '}';
    }
}
