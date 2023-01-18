package org.example3;


import org.example3.services.Comment;
import org.example3.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context =
                new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        var comment = new Comment();
        comment.setAuthor("Koko");
        comment.setText("Demo comment2");

        var commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}