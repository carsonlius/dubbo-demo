package com.carsonlius.dubbo.poj;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {

    private static final long serialVersionUID = -1711950269068770407L;
    private Long id;
    private String username;
    private String password;
    private Integer age;

}
