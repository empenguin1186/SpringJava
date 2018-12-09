package com.example.QiitaClientJava.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NonNull;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@JsonIgnoreProperties(ignoreUnknown=true)
public class Item implements Serializable {

    @NonNull
    @JsonProperty("rendered_body")
    private String renderedBody;

    @NonNull
    @JsonProperty("body")
    private String body;

    @NonNull
    @JsonProperty("coediting")
    private Boolean coediting;

    @NonNull
    @JsonProperty("comments_count")
    private Integer commentsCount;

    @NonNull
    @JsonProperty("created_at")
    private String createdAt;

    // modified?
    @NonNull
    @JsonProperty("group")
    private String group;

    @NonNull
    @JsonProperty("id")
    private String id;

    @NonNull
    @JsonProperty("likes_count")
    private Integer likesCount;

    @NonNull
    @JsonProperty("private")
    private Boolean isPrivate;

    @NonNull
    @JsonProperty("reactions_count")
    private Integer reactionsCount;

    @NonNull
    @JsonProperty("tags")
    private Tag[] tags;

    @NonNull
    @JsonProperty("title")
    private String title;

    @NonNull
    @JsonProperty("updated_at")
    private String updatedAt;

    @NonNull
    @JsonProperty("url")
    private String url;

    @NonNull
    @JsonProperty("user")
    private User user;

    @JsonProperty("page_views_count")
    private Integer pageViewsCount;

    public String getId(){
        return id;
    }
}
