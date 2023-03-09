package com.javatrail.videouploader.service;

import com.javatrail.videouploader.model.Video;
import com.javatrail.videouploader.repository.VideoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
@RequiredArgsConstructor
public class VideoService {
    private final S3Service s3Service;
    private final VideoRepository videoRepository;

    public void uploadVideo(MultipartFile file) {
        //upload to aws
        String videoUrl = s3Service.uploadFile(file);
        var video = new Video();
        video.setUrl(videoUrl);
        //save video metadata to database
        videoRepository.save(video);
    }
}
