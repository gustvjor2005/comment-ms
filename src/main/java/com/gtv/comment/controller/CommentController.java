package com.gtv.comment.controller;

import com.gtv.comment.business.CommentService;
import com.gtv.comment.model.api.ResponseMessage;
import com.gtv.comment.model.dto.CommentDTO;
import com.gtv.comment.model.entity.CommentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommentController {

    @Autowired
    CommentService commentService;

    @GetMapping("/comments")
    public List<CommentDTO> getAll(){
        return commentService.getAllComments();
    }

    @GetMapping("/comment/{id}")
    public CommentDTO getComment(@PathVariable("id") Long id){
        return commentService.getComment(id);
    }

    @PostMapping("/comment")
    public void addComment(@RequestBody CommentDTO commentDTO){
        commentService.addComment(commentDTO);
    }

    @PostMapping("/comment2")
    public ResponseEntity<ResponseMessage> addComment2(@RequestBody CommentDTO commentDTO){
        commentService.addComment(commentDTO);
        ResponseMessage responseMessage = new ResponseMessage();
        responseMessage.setStatus("E002");
        responseMessage.setDetail("Comment added");
        return ResponseEntity.status(HttpStatus.OK).body(responseMessage);
    }

}
