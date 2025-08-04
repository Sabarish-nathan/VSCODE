package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table (name = "users")
public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

        private Long user_id;
        private String user_name;

        @OneToMany
        (mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
        private List<Course> courses;

}
