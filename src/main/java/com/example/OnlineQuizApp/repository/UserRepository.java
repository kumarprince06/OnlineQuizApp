package com.example.OnlineQuizApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import com.example.OnlineQuizApp.model.User;

/**
 * Repository interface for performing CRUD operations on User entities.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * Find a user by their email.
     *
     * @param email the email of the user.
     * @return an Optional containing the user, if found.
     */
    Optional<User> findByEmail(String email);

    /**
     * Find a user by their username.
     *
     * @param username the username of the user.
     * @return an Optional containing the user, if found.
     */
    Optional<User> findByUsername(String username);
}
