package com.adrian.springsecuritypodstawy.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Quotation {

    private String content;
    private String author;

    public Quotation(String content, String author) {
        this.content = content;
        this.author = author;
    }
}
