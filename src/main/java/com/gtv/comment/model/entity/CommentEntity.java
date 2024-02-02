package com.gtv.comment.model.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "comment")
public class CommentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@Column(name = "email", length = 30)
    private String details;
    private String section;
    private String username;
    //@Column(name = "email", length = 30)
    private String email;
    private Date day;

}
