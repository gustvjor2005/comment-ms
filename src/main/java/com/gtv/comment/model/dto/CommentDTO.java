package com.gtv.comment.model.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CommentDTO {

    private Long id;
    private String details;
    private String section;
    private String username;
}
