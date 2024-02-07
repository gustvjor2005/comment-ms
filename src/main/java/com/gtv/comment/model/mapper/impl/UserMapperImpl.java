package com.gtv.comment.model.mapper.impl;

import com.gtv.comment.model.dto.CommentDTO;
import com.gtv.comment.model.dto.UserDTO;
import com.gtv.comment.model.entity.CommentEntity;
import com.gtv.comment.model.entity.UserEntity;
import com.gtv.comment.model.mapper.CommentMapper;
import com.gtv.comment.model.mapper.UserMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class UserMapperImpl implements UserMapper {

    @Override
    public UserDTO map(String name, String email, List<CommentEntity> commentEntities) {

        List<CommentDTO> commentDTOS= new ArrayList<>();
        UserDTO userDTO = new UserDTO(1L, name, email, commentDTOS);
        userDTO.setCommentDTOS(
        commentEntities.stream()
                .map(commentEntity -> this.toDTO(commentEntity))
                .collect(toList())
        );
        return userDTO;
    }

    @Override
    public UserEntity toEntity(UserDTO userDTO) {

        UserEntity userEntity = new UserEntity();
        userEntity.setId(userDTO.getId());
        userEntity.setNombre(userDTO.getName());
        //userEntity.setEmail(userDTO.getEmail());

        List<CommentEntity> commentEntities =
        userDTO.getCommentDTOS().stream()
                .map(commentDTO -> this.toEntity(commentDTO, userEntity))
                .collect(toList());

        userEntity.setCommentEntities(commentEntities);
        return userEntity;
    }

    public CommentDTO toDTO(CommentEntity commentEntity){

        CommentDTO c = new CommentDTO(commentEntity.getId()
                , ""
                , commentEntity.getDetails()
                , commentEntity.getSection());

        return c;
    }


    public CommentEntity toEntity(CommentDTO commentDTO, UserEntity userEntity){

        CommentEntity.CommentEntityBuilder commentEntity = CommentEntity.builder();
        commentEntity.userEntity(userEntity);
        commentEntity.details(commentDTO.getDetails());
        commentEntity.section(commentDTO.getSection());

        return commentEntity.build();
    }
}
