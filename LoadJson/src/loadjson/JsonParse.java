package loadjson;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
     JSONArray co;
    public void LoadJson() throws IOException, ParseException, SQLException, ClassNotFoundException{
          
      FileReader reader = new FileReader("allsets.json"); 
         JSONParser jsonParser = new JSONParser();
         JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
         Iterator<JSONObject> iterator = jsonObject.values().iterator();
  
            Conn conn = new Conn();
       
         
            while (iterator.hasNext()) {
                 JSONArray cards = (JSONArray) iterator.next().get("cards");
                 String code = String.valueOf(iterator.next().get("code"));
                for (Object card : cards) {
                  Card c = new Card();
                    
                    JSONObject js = (JSONObject) card;
              /*      c.setId(String.valueOf(js.get("id")));
                    c.setName(String.valueOf(js.get("name")));
                    c.setNames(String.valueOf(js.get("names")));
                    c.setManaCost(String.valueOf(js.get("manaCost")));
                    try {
                    c.setCmc(Float.parseFloat(String.valueOf(js.get("cmc"))));
                    }catch(NumberFormatException e){
                        c.setCmc(0);
                    }
                    c.setColor(Integer.parseInt(String.valueOf(js.get("colors"))));
                    c.setColorIdentity(Integer.parseInt(String.valueOf(js.get("colorIdentity"))));
                    c.setType(String.valueOf(js.get("type")));
                    c.setSupertypes(String.valueOf(js.get("supertypes")));
                    c.setTypes(String.valueOf(js.get("types")));
                    c.setSubtypes(String.valueOf(js.get("subtypes")));
                    c.setRarity(String.valueOf(js.get("rarity")));
                    c.setText(String.valueOf(js.get("text")));
                    c.setFlavor(String.valueOf(js.get("flavor")));
                    c.setArtist(String.valueOf(js.get("artist")));
                    c.setNames(String.valueOf(js.get("number")));
                    c.setPower(String.valueOf(js.get("power")));
                    c.setToughness(String.valueOf(js.get("toughness")));
                    c.setLoyalty(String.valueOf(js.get("loyalty")));
                    c.setMultiverseid(String.valueOf(js.get("multiverseid")));
                    c.setVariations(String.valueOf(js.get("variations")));
                    c.setImageName(String.valueOf(js.get("imageName")));
                    c.setWatermark(String.valueOf(js.get("watermark")));
                    c.setBorder(String.valueOf(js.get("border")));
                    c.setTimeshifted(String.valueOf(js.get("timeshifted")));
                    c.setHand(String.valueOf(js.get("hand")));
                    c.setReserved(String.valueOf(js.get("reserved")));
                    c.setReleaseDate(String.valueOf(js.get("releaseDate")));
                    c.setStarter(String.valueOf(js.get("starter")));
                    
                    //System.out.println(c.toString());
                   // conn.insertTb(c);*/
                   /* if(!String.valueOf(js.get("names")).equalsIgnoreCase("null")){
                       System.out.println(String.valueOf(js.get("names")));
                    }*/
                    
                   String color =   String.valueOf(js.get("colors")).replace("[\"", "");
             
                
                      System.out.println(code+" - "+js.get("name")+" - "+color+" - "+js.get("colorIdentity"));
                  
                    
                   
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
