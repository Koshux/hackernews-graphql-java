package com.howtographql.hackernews;

/**
 * Created by James-Main on 23/06/2018.
 */
public class Link {
    private final String url;
    private final String description;

    public Link(String url, String description) {
        this.url = url;
        this.description = description;
    }

    public String getUrl() { return url; }

    public String getDescription () { return description; }
}
