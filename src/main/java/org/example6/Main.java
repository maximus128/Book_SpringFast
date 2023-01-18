package org.example5;

// @Qualifier("EMAIL") -
// @Primary - Spring внедряет реализацию, если есть выбор

import org.example5.services.Comment;
import org.example5.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context =
                new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        var comment = new Comment();
        comment.setAuthor("Koko");
        comment.setText("Demo comment5");

        var commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}