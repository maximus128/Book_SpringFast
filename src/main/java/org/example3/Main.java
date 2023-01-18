package org.example2;


import org.example2.proxies.EmailCommentNotificationProxy;
import org.example2.repositories.DBCommentRepository;
import org.example2.services.Comment;
import org.example2.services.CommentService;

public class Main {
    public static void main(String[] args) {
        var commentRepository = new DBCommentRepository();
        var commentNotificationProxy = new EmailCommentNotificationProxy();
        var commentService = new CommentService(commentRepository, commentNotificationProxy);

        var comment = new Comment();
        comment.setAuthor("Koko");
        comment.setText("Demo comment");

        commentService.publishComment(comment);
    }
}