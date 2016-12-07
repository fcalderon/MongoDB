package com.calderon.database.mongdb;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.net.UnknownHostException;
import java.util.Date;

/**
 * Created on 12/7/16.
 */
public class Main {
    public static void main(String[] args) throws UnknownHostException {

        MongoClient mongo = new MongoClient( "localhost" , 27017 );
        MongoDatabase db = mongo.getDatabase("calderonhwk7");
        MongoCollection collection = db.getCollection("users");

        for(String coll :  db.listCollectionNames()){
            System.out.println(coll);
        }

        Document document = new Document();
        document.put("name", "mkyong");
        document.put("age", 30);
        document.put("createdDate", new Date());
        collection.insertOne(document);

        MongoCursor< Document > cursor = collection.find().iterator();

        while (cursor.hasNext()) {
            Document user = cursor.next();
            System.out.println(user);
        }

    }
}
