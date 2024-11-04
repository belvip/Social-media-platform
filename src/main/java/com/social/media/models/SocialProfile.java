package com.social.media.models;

import jakarta.persistence.*;  // Import for JPA annotations

/**
 * This class represents a social media profile associated with a user.
 * It's a JPA entity and maps to a database table.
 */
@Entity
public class SocialProfile {

    /**
     * Unique identifier for the social profile (auto-generated by the database).
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // Use lowercase 'id' for consistency

    /**
     * Reference to the associated social user.
     * A one-to-one relationship exists between a social profile and a social user.
     */
    @OneToOne
    @JoinColumn(name = "social_user")
    private SocialUser user;

}