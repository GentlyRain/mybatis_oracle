package com.benjamin.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class SalGrade implements Serializable {

    private Integer GRADE;
    private Integer LOSAL;
    private Integer HISAL;
}
