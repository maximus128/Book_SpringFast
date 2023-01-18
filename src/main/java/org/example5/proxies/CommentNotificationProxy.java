package org.example3.proxies;

import org.example3.services.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
