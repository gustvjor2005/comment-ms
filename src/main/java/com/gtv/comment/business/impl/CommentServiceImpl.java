package com.gtv.comment.business.impl;

import com.gtv.comment.business.CommentService;
import com.gtv.comment.model.dto.CommentDTO;
import com.gtv.comment.model.entity.CommentEntity;
import com.gtv.comment.model.mapper.CommentMapper;
import com.gtv.comment.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    CommentRepository commentRepository;

    final CommentMapper commentMapper;

    @Autowired
    public CommentServiceImpl(CommentMapper commentMapper){
        this.commentMapper = commentMapper;
    }

    @Override
    public List<CommentDTO> getAllComments() {

        List<CommentEntity> comments = commentRepository.findAll();
        return comments
                .stream()
                .map(c -> commentMapper.toDTO(c))
                .collect(Collectors.toList());
    }

    @Override
    public CommentDTO getComment(Long id) {

        CommentEntity comment = commentRepository.findById(id).get();
        return commentMapper.toDTO(comment);
    }

    @Override
    public void addComment(CommentDTO commentDTO) {

        CommentEntity commentEntity = commentMapper.toEntity(commentDTO);
        commentRepository.save(commentEntity);
    }
}
