package org.example6.services;


import org.example6.repositories.CommentRepository;
import org.springframework.stereotype.Service;

//преимущества внедрения в конструктор - возможность сделать экземпляры неизменяемыми(пометив поля бина как final)

@Service
public class CommentService {
    private final CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public CommentRepository getCommentRepository() {
        return commentRepository;
    }
}
