package com.gtv.comment.exception;

public class CommentException extends Exception{

    private long comment_id;

    public CommentException(long comment_id){

        super(String.format("Comentario no encontrado tiene id : '%s'", comment_id));

    }
}
