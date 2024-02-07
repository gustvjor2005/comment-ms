package com.gtv.comment.model.mapper;


import com.gtv.comment.model.dto.CommentDTO;
import com.gtv.comment.model.dto.UserDTO;
import com.gtv.comment.model.entity.CommentEntity;
import com.gtv.comment.model.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface UserMapper {

    /*
    * private int id;
      private String email;
      private String nombre;
      Set<CommentEntity> commentEntities;
      *
      *
      private Long id;
      private String name;
      private String email;
      private List<CommentDTO> commentDTOS;
    *
    *
    * */
    public UserDTO map(String name, String email, List<CommentEntity> commentEntities);

    public UserEntity toEntity(UserDTO userDTO);
}
