package com.gtv.comment.model.mapper;

import com.gtv.comment.model.dto.CommentDTO;
import com.gtv.comment.model.entity.CommentEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-20T18:58:31-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.9 (Oracle Corporation)"
)
@Component
public class CommentMapperImpl implements CommentMapper {

    @Override
    public CommentEntity toEntity(CommentDTO commentDTO) {
        if ( commentDTO == null ) {
            return null;
        }

        CommentEntity.CommentEntityBuilder commentEntity = CommentEntity.builder();

        commentEntity.email( commentDTO.getUsername() );
        commentEntity.id( commentDTO.getId() );
        commentEntity.details( commentDTO.getDetails() );
        commentEntity.section( commentDTO.getSection() );

        commentEntity.username( "laotse" );
        commentEntity.day( new java.util.Date() );

        return commentEntity.build();
    }

    @Override
    public CommentDTO toDTO(CommentEntity commentEntity) {
        if ( commentEntity == null ) {
            return null;
        }

        CommentDTO.CommentDTOBuilder commentDTO = CommentDTO.builder();

        commentDTO.username( commentEntity.getEmail() );
        commentDTO.id( commentEntity.getId() );
        commentDTO.details( commentEntity.getDetails() );
        commentDTO.section( commentEntity.getSection() );

        return commentDTO.build();
    }
}
