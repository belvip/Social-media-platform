package com.social.media.model;

import jakarta.persistence.*;


@Entity
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @OneToOne
    private SocialUser user; // Relationship
}
