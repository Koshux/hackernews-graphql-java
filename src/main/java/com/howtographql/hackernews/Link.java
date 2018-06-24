package com.howtographql.hackernews;

import io.leangen.graphql.annotations.GraphQLQuery;

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

    @GraphQLQuery(name = "url", description = "Unique Resource Location.")
    public String getUrl() { return url; }

    @GraphQLQuery(name = "description", description = "URL Description.")
    public String getDescription () { return description; }
}
