package global.citytech.dataserver.server.database.createdb;

import java.io.File;

public class DatabaseCreation {


    public DatabaseCreation(String createDefinition){

        String folder = "database";
        String path = "/home/alish/Desktop/citytech/"+folder;
        File database = new File(path);

        if(!database.exists()){
            if (database.mkdir()){
                System.out.println("Database created");
            }else{
                System.out.println("Invalid path");
            }
        }else{
            System.out.println("Database exist");
        }
    }

}
