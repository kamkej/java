/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loadjson;

import java.sql.Connection;
import java.sql.DriverManager;
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
         int id = rs.getInt("id");
         String  name = rs.getString("name");
         String  text = rs.getString("text");
   
         System.out.print( "ID = " + id );
         System.out.print( "NAME = " + name );
         System.out.print( "Text = " + text );
         System.out.println();
      }
      rs.close();
      stmt.close();
      c.close();
    }
    
    public void insertTb() throws SQLException{
        stmt = c.createStatement();
        String sql  = "insert into cards (id,layout,name,names,manaCost,cmc,color,colorIdentity,type,supertypes,types ,subtypes ,rarity ,text ,flavor ,artist,number,power,toughness,loyalty,multiverseid ,variations ,imageName ,watermark ,border	,timeshifted ,hand ,life ,reserved ,releaseDate,starter)"+
                "values('926234c2fe8863f49220a878346c4c5ca79b6046','normal','','Air Elemental','{3}{U}{U}',5,1,1,'Creature — Elemental','Creature','Elemental','Uncommon','Flying','    These spirits of the air are winsome and wild, and cannot be truly contained. Only marginally intelligent, they often substitute whimsy for strategy, delighting in mischief and mayhem.\n" +
"','Richard Thomas','','4','4','','94','','','air elemental','','','','','','','','')";
        stmt.executeUpdate(sql);
        stmt.close();
        c.commit();
        c.close();
      System.out.println("Records created successfully");

    }
 
    
}
