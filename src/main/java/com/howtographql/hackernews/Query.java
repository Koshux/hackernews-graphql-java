package com.howtographql.hackernews;

import com.coxautodev.graphql.tools.GraphQLResolver;

import java.util.List;

/**
 * Created by James-Main on 23/06/2018.
 */
public class Query implements GraphQLResolver {

    private final LinkRepository linkRepository;

    public Query(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    public List<Link> allLinks() { return linkRepository.getLinks(); }
}
