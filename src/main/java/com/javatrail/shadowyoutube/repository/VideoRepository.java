package com.javatrail.videouploader.repository;

import com.javatrail.videouploader.model.Video;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VideoRepository extends MongoRepository<Video, String> {
}
