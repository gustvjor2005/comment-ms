package com.gtv.comment.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class CommentDTO {

    public Long id;
    public String name;
    public String details;
    public String section;
}
