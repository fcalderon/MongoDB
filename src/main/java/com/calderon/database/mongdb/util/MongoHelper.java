package com.calderon.database.mongdb.util;

import com.mongodb.client.MongoCollection;

/**
 * Created on 12/7/16.
 */
public class MongoHelper {
    public static final String BOOK_COLLECTION_NAME = "books";
    public static final String USER_COLLECTION_NAME = "user";
    public static final String PUBLISHER_COLLECTION_NAME = "publisher";
    public static final String AUTHOR_COLLECTION_NAME = "author";
    public static MongoCollection getBookCollection(){
        return null;
    }

    public static MongoCollection getUserCollection(){
        return null;
    }

    public static MongoCollection getAuthorCollection() {
        return null;
    }

    public static MongoCollection getPublisherCollection() {
        return null;
    }

    private static MongoCollection getCollection(String collectionName) {
        return null;
    }
}
