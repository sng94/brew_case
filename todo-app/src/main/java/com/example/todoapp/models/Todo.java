package com.example.todoapp.models;

import java.util.Date;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="todos")
@JsonIgnoreProperties(value = {"createdAt"}, allowGetters = true)
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @NotBlank
    @Size(max=100)
    @Indexed(unique=true)
    private String desc;
    private Boolean completed = false;

    private Date createdAt = new Date();

    public Todo() {
        super();
    }

    public Todo(String desc) {
        this.desc = desc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return String.format(
                "Todo[id=%s, desc='%s', completed='%s']",
                id, desc, completed);
    }
}