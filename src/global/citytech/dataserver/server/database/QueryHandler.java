package global.citytech.dataserver.server.database;

import global.citytech.dataserver.server.database.createdb.DatabaseCreation;

import java.io.File;
import java.util.regex.Pattern;

public class QueryHandler {

    public QueryHandler(String userQuery){

        String [] queryCommand = userQuery.split("\s");

        if(queryCommand[0].equals("apple")){
            System.out.println("This is apple");
        }
//        System.out.println("a : " +queryCommand[0]);
//        System.out.println("b : "+queryCommand[1]);

//
//
//        if(queryCommand[0].equals("create") && queryCommand[1].equals("database")
//                && queryCommand[2].matches("^[a-zA-z]*$]")){
//            String database = queryCommand[3];
//            new DatabaseCreation(database);
//        }else{
//            System.out.println("Invalid Query");
//        }


//        String query = "create database apple";
//        String [] qcmd = query.split("\s",2);
//        for (String a: qcmd) {
//            System.out.println(a);
//        }

//        if(userQuery.equals("create database")){
//            new DatabaseCreation(userQuery);
//        }else{
//            System.out.println("Invalid Operation");
//        }


    }


}
