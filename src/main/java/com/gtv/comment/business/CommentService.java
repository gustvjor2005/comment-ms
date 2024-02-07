package com.gtv.comment.business;

import com.gtv.comment.model.dto.CommentDTO;
import com.gtv.comment.model.dto.UserDTO;
import com.gtv.comment.model.entity.CommentEntity;

import java.util.List;

public interface CommentService {

    public void saveUser(UserDTO userDTO);
/*
    public UserDTO getCommentsofUser(Long id);

   public CommentDTO getCommentDetail(Long id);

    public List<CommentDTO> getAllComments();

    public CommentDTO getComment(Long id);

    public void addComment(CommentDTO commentDTO);*/
}
