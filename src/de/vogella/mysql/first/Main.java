package de.vogella.mysql.first;

/**
 * Created by juan on 22/09/15.
 */
import de.vogella.mysql.first.MYSQLAcces;

public class Main {





        public static void main(String[] args) throws Exception {
            MYSQLAcces dao = new MYSQLAcces();
            dao.readDataBase();
        }


}
