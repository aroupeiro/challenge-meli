
package com.init.items.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Child {

    @SerializedName("id")
    @Expose
    private String itemId;
    @SerializedName("stop_time")
    @Expose
    private String stopTime;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Child() {
    }

    /**
     * 
     * @param itemId
     * @param stopTime
     */
    public Child(String itemId, String stopTime) {
        super();
        this.itemId = itemId;
        this.stopTime = stopTime;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getStopTime() {
        return stopTime;
    }

    public void setStopTime(String stopTime) {
        this.stopTime = stopTime;
    }

}
