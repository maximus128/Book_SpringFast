package org.example6;

import org.example6.services.CommentService;
import org.example6.services.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);

        var s1 = context.getBean(CommentService.class);
        var s2 = context.getBean(UserService.class);

        boolean b1 = s1.getCommentRepository() == s2.getCommentRepository();

        System.out.println(b1);
    }
}