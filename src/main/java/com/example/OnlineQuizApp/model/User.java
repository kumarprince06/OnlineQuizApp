package com.example.OnlineQuizApp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Entity class representing a user in the system.
 */
@Entity(name = "users")
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    /**
     * Unique identifier for the user.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Name of the user.
     */
    private String name;

    /**
     * Unique username for the user.
     * The username cannot be null and must be unique.
     */
    @Column(unique = true, nullable = false)
    private String username;

    /**
     * Unique email address of the user.
     * The email cannot be null and must be unique.
     */
    @Column(unique = true, nullable = false)
    private String email;

    /**
     * Encrypted password of the user.
     */
    private String password;

    /**
     * Profile image URL of the user.
     */
    private String profileImg;

    /**
     * Gender of the user (e.g., Male, Female, etc.).
     */
    private String gender;

    /**
     * Date of birth of the user.
     */
    private String dob;
}
