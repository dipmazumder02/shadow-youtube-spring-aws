package com.javatrail.videouploader.controller;

import com.javatrail.videouploader.service.VideoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("api/videos")
@RequiredArgsConstructor
public class VideoController {
    private final VideoService videoService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void uploadVideos(@RequestParam("file")MultipartFile file){
        videoService.uploadVideo(file);
    }

}
