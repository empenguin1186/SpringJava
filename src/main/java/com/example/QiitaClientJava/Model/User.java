package com.example.QiitaClientJava.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NonNull;

public class User {

    @JsonProperty("description")
    private String description;

    @JsonProperty("facebook_id")
    private String facebookId;

    @NonNull
    @JsonProperty("followees_count")
    private Integer followeesCount;

    @NonNull
    @JsonProperty("followers_count")
    private Integer followersCount;

    @JsonProperty("github_login_name")
    private String githubLoginName;

    @NonNull
    @JsonProperty("id")
    private String id;

    @NonNull
    @JsonProperty("items_count")
    private Integer itemsCount;

    @JsonProperty("linkedin_id")
    private String linkedinId;

    @JsonProperty("location")
    private String location;

    @NonNull
    @JsonProperty("name")
    private String name;

    @JsonProperty("organization")
    private String organization;

    @NonNull
    @JsonProperty("permanent_id")
    private Integer permanentId;

    @JsonProperty("profile_image_url")
    private String profileImageUrl;

    @NonNull
    @JsonProperty("team_only")
    private Boolean teamOnly;

    @JsonProperty("twitter_screen_name")
    private String twitterScreenName;

    @JsonProperty("website_url")
    private String websiteUrl;
}
