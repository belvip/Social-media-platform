package com.social.media.repositories;

import com.social.media.models.SocialGroup;
import com.social.media.models.SocialProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SocialGroupRepository extends JpaRepository<SocialGroup , Long> {
}
