package com.social.media.model;

// Importing JPA annotations for mapping this class to a database entity.
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Represents a user in the social media application.
 */
@Entity // Marks this class as a JPA entity, mapping it to a table in the database.
public class SocialUser {

    @Id // Specifies the primary key of the entity.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Configures the primary key to auto-increment using the database's identity column.
    private Long Id; // Unique identifier for each SocialUser in the database.

    // Constructors, getters, and setters can be added here if needed.
}
