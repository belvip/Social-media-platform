package com.social.media.model;

// Importing necessary JPA annotations for entity mapping.
import jakarta.persistence.*;

/**
 * Represents a social media profile for a user.
 */
@Entity // Marks this class as a JPA entity, representing a database table.
public class SocialProfile {

    @Id // Specifies the primary key of the entity.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Configures auto-generation of the primary key using the database identity column.
    private Long Id;

    @OneToOne // Defines a one-to-one relationship with the SocialUser entity.
    @JoinColumn(name = "social_user") // Specifies the foreign key column name in the SocialProfile table.
    private SocialUser user; // Represents the associated user for this profile.

    // Constructors, getters, and setters can be added here as needed.
}
