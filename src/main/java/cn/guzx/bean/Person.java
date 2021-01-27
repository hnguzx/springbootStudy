package cn.guzx.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Arrays;
import java.util.Date;

@Component
@ConfigurationProperties(prefix = "person")
@Validated
public class Person {

    private String name;
    private Integer age;
    @Email
    private String address;
    private Date birthDay;
    private Family family;
    private String[] love;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", birthDay=" + birthDay +
                ", family=" + family +
                ", love=" + Arrays.toString(love) +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public String[] getLove() {
        return love;
    }

    public void setLove(String[] love) {
        this.love = love;
    }
}
