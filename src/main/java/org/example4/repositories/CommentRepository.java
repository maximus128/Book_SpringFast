package org.example3.repositories;

import org.example3.services.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
