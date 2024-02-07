package com.gtv.comment.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class UserDTO {

    public Long id;
    public String name;
    public String email;
    public List<CommentDTO> commentDTOS;

}
