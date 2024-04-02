package com.atlas.blogapp_springboot.comments;

import com.atlas.blogapp_springboot.articles.ArticleEntity;
import com.atlas.blogapp_springboot.users.UserEntity;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.util.Date;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CommentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    private Long id;
    @Nullable
    private String title;
    @NonNull
    private String body;
    private Date createdAt;
    @ManyToOne
    @JoinColumn(name = "articleId", nullable = false)
    private ArticleEntity article;
    @ManyToOne
    @JoinColumn(name = "author", nullable = false)
    private UserEntity author;

}
