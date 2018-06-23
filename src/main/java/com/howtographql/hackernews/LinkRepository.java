package com.howtographql.hackernews;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by James-Main on 23/06/2018.
 */
public class LinkRepository {

    private final List<Link> links;

    public LinkRepository() {
        links = new ArrayList<>();
        links.add(new Link("http://howtographql.com", "Your favourite GraphQL page"));
        links.add(new Link("http://graphql.org/learn/", "The official docks"));
    }

    public List<Link> getLinks() { return links; }

    public void saveLink(Link link) { links.add(link); }
}
