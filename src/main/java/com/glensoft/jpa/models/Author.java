package com.glensoft.jpa.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.List;


@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
public class Author extends BaseEntity{

    private String firstName;

    private String lastName;

    @Column(
            unique = true,
            nullable = false
    )
    private String email;
    private int age;

    @ManyToMany(mappedBy = "authorList")
    private List<Course> courseList;
}
