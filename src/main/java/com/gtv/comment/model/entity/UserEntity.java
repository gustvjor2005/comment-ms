package com.gtv.comment.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //private String email;
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userEntity")
    List<CommentEntity> commentEntities = new ArrayList<>();

    public void addComment(String detail, Long id){
        CommentEntity commentEntity = new CommentEntity();
        //commentEntity.setId(id);
        commentEntity.setDetails(detail);
        commentEntity.setSection(detail);
        commentEntity.setUserEntity(this);
        commentEntities.add(commentEntity);
    }

}
