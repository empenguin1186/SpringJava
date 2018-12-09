package com.example.QiitaClientJava.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NonNull;

@Data
@JsonIgnoreProperties(ignoreUnknown=true)
public class Tag {
    @NonNull
    @JsonProperty("name")
    private String name;

    @JsonProperty("versions")
    private String[] versions;
}
