package ru.shiftuia.weatherapp.dao.model;


import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "user")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="n_id")
    private Long id;

    @Column(name = "c_name")
    private String name;


    public User() {
    }

    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }
}
