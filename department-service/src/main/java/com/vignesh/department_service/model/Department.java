package com.vignesh.department_service.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Department {

    private long id;

    private String departmentName;

}
