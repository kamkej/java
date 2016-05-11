package loadjson;


import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Iterator;
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
           
          //  System.out.println(s.get("border"));
            
            Conn conn = new Conn();
          
            while (iterator.hasNext()) {
                
                JSONObject lJson = iterator.next(); 
                JSONArray cards = (JSONArray) lJson.get("cards");
                 String code = String.valueOf(lJson.get("code"));
                 String border = String.valueOf(lJson.get("border"));

                for (Object card : cards) {
                  Card c = new Card();
                    
                    JSONObject js = (JSONObject) card;
                    c.setId(String.valueOf(js.get("id")));
                    try{
                    c.setName(js.get("name").toString());
                    }catch(NullPointerException e ){
                        c.setName("");
                    }
                    c.setNames(String.valueOf(js.get("names")).replaceAll("[\\[\\\"\\]]", ""));
                   
                    try{
                    c.setManaCost(js.get("manaCost").toString());
                    }catch(NullPointerException e){
                        c.setManaCost("");
                    }
                    try {
                    c.setCmc(Float.parseFloat(String.valueOf(js.get("cmc"))));
                    }catch(NumberFormatException e){
                        c.setCmc(0);
                    }
                    c.setColor( String.valueOf(js.get("colors")).replaceAll("[\\[\\\"\\]]", ""));
                    c.setColorIdentity(String.valueOf(js.get("colorIdentity")).replaceAll("[\\[\\\"\\]]", ""));
                    try{
                    c.setType(js.get("type").toString());
                    }catch(NullPointerException e){
                       c.setType("");
                    }
                    try{
                    c.setSupertypes(js.get("supertypes").toString());
                    }catch(NullPointerException e){
                       c.setSupertypes("");
                    }
                    try{
                    c.setTypes(js.get("types").toString());
                    }catch(NullPointerException e){
                        c.setTypes("");
                    }
                    try{
                    c.setSubtypes(js.get("subtypes").toString());
                    }catch(NullPointerException e){
                        c.setSubtypes("");
                    }
                    try{
                    c.setRarity(js.get("rarity").toString());
                    }catch(NullPointerException e){
                        c.setRarity("");
                    }
                    try{
                    c.setText(js.get("text").toString());
                    }catch(NullPointerException e){
                       c.setText("");
                    }
                    try{
                    c.setFlavor(js.get("flavor").toString());
                    }catch(NullPointerException e){
                        c.setFlavor("");
                    }
                    try{
                    c.setArtist(js.get("artist").toString());
                    }catch(NullPointerException e){
                      c.setArtist("");
                    }
                    try{
                    c.setNumber(js.get("number").toString());
                    }catch(NullPointerException e){
                        c.setNumber("");
                    }
                    try{
                    c.setPower(js.get("power").toString());
                    }catch(NullPointerException e){
                        c.setPower("");
                    }
                    try{
                    c.setToughness(js.get("toughness").toString());
                    }catch(NullPointerException e){
                         c.setToughness("");
                    }
                    try{
                    c.setLoyalty(js.get("loyalty").toString());
                    }catch(NullPointerException e){
                        c.setLoyalty("");
                    }
                    c.setMultiverseid(String.valueOf(js.get("multiverseid")));
                    try{
                    c.setVariations(js.get("variations").toString());
                    }catch(NullPointerException e){
                        c.setVariations("");
                    }
                    c.setImageName(String.valueOf(js.get("imageName")));
                    try{
                    c.setWatermark(js.get("watermark").toString());
                    }catch(NullPointerException e){
                        c.setWatermark("");
                    }
                    c.setBorder(border);
                    try{
                    c.setTimeshifted(js.get("timeshifted").toString());
                    }catch(NullPointerException e){
                       c.setTimeshifted("");
                    }
                    try{
                    c.setHand(js.get("hand").toString());
                    }catch(NullPointerException e){
                        c.setHand("");
                    }
                    try{
                    c.setReserved(String.valueOf(js.get("reserved")));
                    }
                        catch(NullPointerException e){
                    }
                    try{
                    c.setReleaseDate(js.get("releaseDate").toString());
                    }catch(NullPointerException e){
                        c.setReleaseDate("");
                    }
                    try{
                    c.setStarter(js.get("starter").toString());
                    }catch(NullPointerException e){
                        c.setStarter("");
                    }
                   
                    c.setSetsCode(code);
                    
                    //System.out.println(c.getPower());
                   conn.insertTb(c);
                   
                   /* if(!String.valueOf(js.get("names")).equalsIgnoreCase("null")){
                       System.out.println(String.valueOf(js.get("names")));
                    }
                    
                   String color =   String.valueOf(js.get("colorIdentity")).replaceAll("[\\[\\\"\\]]", "");
             
                
                      System.out.println(code+" - "+js.get("name")+" - "+js.get("name")+" - "+color);*/
                  
                    
                   
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
