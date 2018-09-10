package com.remcarpediem.groovyengine.entity;

import lombok.Data;

@Data
public class GroovyEntity {
    private Long id;
    private String name;
    private String description;
    private int status;
    private String content;

}
