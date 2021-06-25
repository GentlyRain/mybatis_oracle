package com.benjamin.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@Accessors(chain = true)
public class President {

    private Integer id;
    private String name;
    private String gender;
    private Integer age;
    private String brithday;
    private String term;
    private String party;



    @Override
    public String toString() {
        return "President{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", brithday=" + brithday +
                ", term='" + term + '\'' +
                ", party='" + party + '\'' +
                '}';
    }
}
