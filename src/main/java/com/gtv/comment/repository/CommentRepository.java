package com.gtv.comment.repository;

import com.gtv.comment.model.entity.CommentEntity;
import com.gtv.comment.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface CommentRepository extends JpaRepository<CommentEntity,Long> {

    @Query("select c from CommentEntity c inner join fetch c.userEntity where c.id= :id ")
    CommentEntity findCommentWithUserById(Long id);

    @Query("select u from UserEntity u inner join fetch u.commentEntities where u.id= :id ")
    UserEntity findCommentsofUser(Long id);
}
