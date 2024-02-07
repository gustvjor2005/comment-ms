package com.gtv.comment.model.mapper;

import com.gtv.comment.model.dto.CommentDTO;
import com.gtv.comment.model.entity.CommentEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CommentMapper {

    //@Mapping(source = "username", target = "email")
    //@Mapping(constant = "laotse", target = "username")
    @Mapping(expression = "java(new java.util.Date())", target = "day")
    CommentEntity toEntity(CommentDTO commentDTO);

    @Mapping(source = "userEntity.nombre", target = "name")
    CommentDTO toDTO(CommentEntity commentEntity);


}
