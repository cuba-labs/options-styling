package com.company.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|title")
@Table(name = "DEMO_CLIENT")
@Entity(name = "demo$Client")
public class Client extends StandardEntity {
    private static final long serialVersionUID = 2697565402241786492L;

    @Column(name = "TITLE")
    protected String title;

    @Column(name = "COLOR")
    protected String color;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }


}