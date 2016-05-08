/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loadjson;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author G0006185
 */
public class Conn {
    private Connection c = null;
    private Statement stmt = null;
    
    public Conn() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
             c = DriverManager.getConnection("jdbc:sqlite:wastenot.db");
             c.setAutoCommit(false);
    }
    public void selectDb() throws SQLException{
        
       stmt = c.createStatement();
      ResultSet rs = stmt.executeQuery( "SELECT * FROM cards;" );
      
      while ( rs.next() ) {
         String id = rs.getString("id");
         String  name = rs.getString("name");
         String  text = rs.getString("text");
        String  cmc = rs.getString("cmc");
        String  msid   = rs.getString("multiverseid");
   
   
         System.out.print( "ID = " + id+ "-" );
         System.out.print( "NAME = " + name + "-" );
          System.out.println("cmc = " + cmc);
          System.out.println("msid = "+ msid+ "-");
        // System.out.print( "Text = " + text );

      }
      rs.close();
      stmt.close();
      c.close();
    }
    
    public void insertTb(Card card) throws SQLException{
        String sql  = "insert into cards (id,layout,name,names,manaCost,cmc,color,colorIdentity,type,supertypes,types ,subtypes ,rarity ,text ,flavor ,artist,number,power,toughness,loyalty,multiverseid ,variations ,imageName ,watermark ,border,timeshifted ,hand ,life ,reserved ,releaseDate,starter,setscode)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setString(1, card.getId());
        stmt.setString(2, card.getLayout());
        stmt.setString(3, card.getName());
        stmt.setString(4, card.getNames());
        stmt.setString(5, card.getManaCost());
        stmt.setString(6, String.valueOf(card.getCmc()));
        stmt.setString(7, String.valueOf(card.getColor()));
        stmt.setString(8, String.valueOf(card.getColorIdentity()));
        stmt.setString(9, card.getType());
        stmt.setString(10, card.getSupertypes());
        stmt.setString(11, card.getTypes());
        stmt.setString(12, card.getSubtypes());
        stmt.setString(13, card.getRarity());
        stmt.setString(14, card.getText());
        stmt.setString(15, card.getFlavor());
        stmt.setString(16, card.getArtist());
        stmt.setString(17, card.getNumber());
        stmt.setString(18, card.getPower());
        stmt.setString(19, card.getToughness());
        stmt.setString(20, card.getLoyalty());
        stmt.setString(21, card.getMultiverseid());
        stmt.setString(22, card.getVariations());
        stmt.setString(23, card.getImageName());
        stmt.setString(24, card.getWatermark());
        stmt.setString(25, card.getBorder());
        stmt.setString(26, card.getTimeshifted());
        stmt.setString(27, card.getHand());
        stmt.setString(28, card.getLife());
        stmt.setString(29, card.getReserved());
        stmt.setString(30, card.getReleaseDate());
        stmt.setString(31, card.getStarter());
        stmt.setString(32, card.getSetsCode());

        stmt.execute();
        
        stmt.close();
        c.commit();
        //c.close();
     // System.out.println("Records created successfully");

    }
    public void delete() throws SQLException{
        
       stmt = c.createStatement();
      String sql = "DELETE from cards;";
      stmt.executeUpdate(sql);
      c.commit();
    }
 
    
}
