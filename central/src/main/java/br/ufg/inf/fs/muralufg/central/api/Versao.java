package br.ufg.inf.fs.muralufg.central.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.Length;

public class Versao {
    private long id;

    @Length(max = 3)
    private String content;

    public Versao() {
        // Jackson deserialization
    }

    public Versao(long id, String content) {
        this.id = id;
        this.content = content;
    }

    @JsonProperty
    public long getId() {
        return id;
    }

    @JsonProperty
    public String getContent() {
        return content;
    }
}