package com.gtv.comment.business.impl;

import com.gtv.comment.business.CommentService;
import com.gtv.comment.model.dto.CommentDTO;
import com.gtv.comment.model.dto.UserDTO;
import com.gtv.comment.model.entity.CommentEntity;
import com.gtv.comment.model.entity.UserEntity;
import com.gtv.comment.model.mapper.CommentMapper;
import com.gtv.comment.model.mapper.UserMapper;
import com.gtv.comment.model.mapper.impl.UserMapperImpl;
import com.gtv.comment.repository.CommentRepository;
import com.gtv.comment.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    CommentRepository commentRepository;

    @Autowired
    UserRepository userRepository;

    //final CommentMapper commentMapper;
    UserMapper userMapper;

    /*@Autowired
    public CommentServiceImpl(CommentMapper commentMapper, UserMapper userMapper){
        this.commentMapper = commentMapper;
        this.userMapper = userMapper;
    }*/


    @Override
    public void saveUser(UserDTO userDTO) {
        userMapper = new UserMapperImpl();
        UserEntity userEntity = userMapper.toEntity(userDTO);
        //userEntity.addComment("using add", userDTO.getId());
        userRepository.save(userEntity);

    }

/*    @Override
    public UserDTO getCommentsofUser(Long id) {
        UserEntity  userEntity = commentRepository.findCommentsofUser(id);
        userMapper = new UserMapperImpl() ;
        return userMapper.map(userEntity.getNombre(), userEntity.getEmail(), userEntity.getCommentEntities());
    }*/



    /*
    @Override
    public CommentDTO getCommentDetail(Long id) {

        CommentEntity comment = commentRepository.findCommentWithUserById(id);
        return commentMapper.toDTO(comment);
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
    }*/
}
