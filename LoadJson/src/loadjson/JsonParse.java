package loadjson;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author julio
 */
public class JsonParse {
    
    public void LoadJson() throws IOException, ParseException{
          
      FileReader reader = new FileReader("allsets.json"); 
         JSONParser jsonParser = new JSONParser();
         JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
         Iterator<JSONObject> iterator = jsonObject.values().iterator();
            while (iterator.hasNext()) {
               // System.out.println(iterator.next());
                
                 JSONArray cards = (JSONArray) iterator.next().get("cards");
           System.out.println(iterator.next().get("code"));
          for (Object card : cards) {
              JSONObject js = (JSONObject) card;
              System.out.println(js.get("id"));
          }
                
               
            }

       
        
        
          //  JSONArray cards = (JSONArray) jsonObject.get("cards");
           // System.out.println(cards.size());
          /*  Iterator<String> iterator = cars.iterator();
            while (iterator.hasNext()) {
                System.out.print("--");
             System.out.println(iterator.next());
            }*/
    }
    
}
