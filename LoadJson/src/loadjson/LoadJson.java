/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loadjson;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.parser.ParseException;

/**
 *
 * @author julio
 */
public class LoadJson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
         
            Conn conn = new Conn();
            JsonParse jp = new JsonParse();
            
            jp.LoadJson();
            
           
          //  conn.insertTb();
          //  conn.selectDb();

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException | ParseException ex) {
             System.out.println(ex.getMessage());
        }

    }
    
}
