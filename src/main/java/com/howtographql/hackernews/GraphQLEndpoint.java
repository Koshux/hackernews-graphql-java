package com.howtographql.hackernews;

import com.coxautodev.graphql.tools.SchemaParser;
import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import graphql.servlet.SimpleGraphQLServlet;
import io.leangen.graphql.GraphQLSchemaGenerator;

import javax.servlet.annotation.WebServlet;

/**
 * Created by James-Main on 23/06/2018.
 */
@WebServlet(urlPatterns = "/graphql")
public class GraphQLEndpoint extends SimpleGraphQLServlet {

    public GraphQLEndpoint() {
        super(buildSchema());

    }

    private static GraphQLSchema buildSchema() {
        LinkRepository linkRepository = new LinkRepository();
        GraphQLSchema graphQLSchema = new GraphQLSchemaGenerator()
                .withOperationsFromSingleton(linkRepository)
                .generate();
        GraphQL graphQL = new GraphQL(graphQLSchema);

        return SchemaParser.newParser()
                .file("schema.graphqls") // parse the SDL file.
                .resolvers(new Query(linkRepository))
                .build()
                .makeExecutableSchema();
    }
}
