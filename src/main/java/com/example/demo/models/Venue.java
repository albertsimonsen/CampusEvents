package com.example.demo.models;

public class Venue {
    private int venueID;
    private String venueName;
    private String venueAddress;


    public Venue(int venueID, String venueName, String venueAddress){
        this.venueID = venueID;
        this.venueName = venueName;
        this.venueAddress = venueAddress;
    }

    public int getVenueID() {
        return venueID;
    }

    public void setVenueID(int venueID) {
        this.venueID = venueID;
    }

    public String getVenueName() {
        return venueName;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    public String getVenueAddress() {
        return venueAddress;
    }

    public void setVenueAddress(String venueAddress) {
        this.venueAddress = venueAddress;
    }


}
