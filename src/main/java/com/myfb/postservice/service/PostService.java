package com.myfb.postservice.service;

import com.myfb.postservice.dto.CommentDTO;
import com.myfb.postservice.dto.PostDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface PostService {
    public PostDTO createPost(PostDTO postDTO);
    PostDTO getPostDetail(Long postId);
    List<PostDTO> getAllPostByUser(Long userId);
    public ResponseEntity<CommentDTO[]> getAllCommentsForPostId(Long postId);
}
