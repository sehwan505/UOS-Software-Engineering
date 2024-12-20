package uniCircle.backend.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;

import java.util.Set;

@Entity
@Getter
@Table(name = "hashtag")
public class Hashtag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hashtag_id")
    private Long hashtagId;

    @Column(nullable = false, unique = true)
    private String content;

    @OneToMany(mappedBy = "hashtag")
    private Set<CircleHashtag> circleHashtags;

    @Builder
    public Hashtag(Long hashtagId, String content, Set<CircleHashtag> circleHashtags) {
        this.hashtagId = hashtagId;
        this.content = content;
        this.circleHashtags = circleHashtags;
    }

    public Hashtag() {
    }
}