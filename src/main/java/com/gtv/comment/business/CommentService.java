package com.gtv.comment.business;

import com.gtv.comment.model.dto.CommentDTO;
import com.gtv.comment.model.entity.CommentEntity;

import java.util.List;

public interface CommentService {

    public List<CommentDTO> getAllComments();

    public CommentDTO getComment(Long id);

    public void addComment(CommentDTO commentDTO);
}
