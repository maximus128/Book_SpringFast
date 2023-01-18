package org.example5.repositories;

import org.example5.services.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
