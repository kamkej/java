/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loadjson;

import java.io.Serializable;

/**
 *
 * @author G0006185
 */
public class Card implements Serializable {
    
    private String id;
    private String layout;
    private String name;
    private String names;
    private String manaCost;
    private float cmc;
    private int color;
    private int colorIdentity;
    private String type;
    private String supertypes;
    private String types;
    private String subtypes;
    private String rarity;
    private String text;
    private String flavor;
    private String artist;
    private String number;
    private String power;
    private String toughness;
    private String loyalty;
    private String multiverseid;
    private String variations;
    private String imageName;
    private String watermark;
    private String border;
    private String timeshifted;
    private String hand;
    private String life;
    private String reserved;
    private String releaseDate;
    private String starter;

    @Override
    public String toString() {
        return "Card{" + "id=" + id + ", layout=" + layout + ", name=" + name + ", names=" + names + ", manaCost=" + manaCost + ", cmc=" + cmc + ", color=" + color + ", colorIdentity=" + colorIdentity + ", type=" + type + ", supertypes=" + supertypes + ", types=" + types + ", subtypes=" + subtypes + ", rarity=" + rarity + ", text=" + text + ", flavor=" + flavor + ", artist=" + artist + ", number=" + number + ", power=" + power + ", toughness=" + toughness + ", loyalty=" + loyalty + ", multiverseid=" + multiverseid + ", variations=" + variations + ", imageName=" + imageName + ", watermark=" + watermark + ", border=" + border + ", timeshifted=" + timeshifted + ", hand=" + hand + ", life=" + life + ", reserved=" + reserved + ", releaseDate=" + releaseDate + ", starter=" + starter + '}';
    }
    
    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getManaCost() {
        return manaCost;
    }

    public void setManaCost(String manaCost) {
        this.manaCost = manaCost;
    }

    public float getCmc() {
        return cmc;
    }

    public void setCmc(float cmc) {
        this.cmc = cmc;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getColorIdentity() {
        return colorIdentity;
    }

    public void setColorIdentity(int colorIdentity) {
        this.colorIdentity = colorIdentity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSupertypes() {
        return supertypes;
    }

    public void setSupertypes(String supertypes) {
        this.supertypes = supertypes;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public String getSubtypes() {
        return subtypes;
    }

    public void setSubtypes(String subtypes) {
        this.subtypes = subtypes;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getToughness() {
        return toughness;
    }

    public void setToughness(String toughness) {
        this.toughness = toughness;
    }

    public String getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(String loyalty) {
        this.loyalty = loyalty;
    }

    public String getMultiverseid() {
        return multiverseid;
    }

    public void setMultiverseid(String multiverseid) {
        this.multiverseid = multiverseid;
    }

    public String getVariations() {
        return variations;
    }

    public void setVariations(String variations) {
        this.variations = variations;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getWatermark() {
        return watermark;
    }

    public void setWatermark(String watermark) {
        this.watermark = watermark;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public String getTimeshifted() {
        return timeshifted;
    }

    public void setTimeshifted(String timeshifted) {
        this.timeshifted = timeshifted;
    }

    public String getHand() {
        return hand;
    }

    public void setHand(String hand) {
        this.hand = hand;
    }

    public String getLife() {
        return life;
    }

    public void setLife(String life) {
        this.life = life;
    }

    public String getReserved() {
        return reserved;
    }

    public void setReserved(String reserved) {
        this.reserved = reserved;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getStarter() {
        return starter;
    }

    public void setStarter(String starter) {
        this.starter = starter;
    }
    
    
    
}
