package com.example.DataBaseManager.users;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.context.annotation.Bean;

@Entity(name = "users")
@Table(
        name = "telegramBotUser"

)
public class DataModel {

    public DataModel(){

    }
    @Id
    @Column(
            name = "id",
            nullable = false,
            unique = true
    )
    private Long id;

    @Column(
            name = "username",
            columnDefinition = "TEXT"
    )
    private String username;
    @Column(
            name = "name",
            columnDefinition = "TEXT"
    )
    private String name;
    @Column(
            name = "userId",
            columnDefinition = "TEXT",
            nullable = false
    )

    private String userId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public DataModel( String username, String name, String userId) {
        this.username = username;
        this.name = name;
        this.userId = userId;
    }
}
