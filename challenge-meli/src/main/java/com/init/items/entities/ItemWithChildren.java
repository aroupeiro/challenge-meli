
package com.init.items.entities;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ItemWithChildren {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("category_id")
    @Expose
    private String categoryId;
    @SerializedName("price")
    @Expose
    private Double price;
    @SerializedName("start_time")
    @Expose
    private String startTime;
    @SerializedName("stop_time")
    @Expose
    private String stopTime;
    @SerializedName("children")
    @Expose
    private List<Child> children = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ItemWithChildren() {
    }

    /**
     * 
     * @param children
     * @param price
     * @param startTime
     * @param stopTime
     * @param id
     * @param title
     * @param categoryId
     */
    public ItemWithChildren(String id, String title, String categoryId, Double price, String startTime, String stopTime, List<Child> children) {
        super();
        this.id = id;
        this.title = title;
        this.categoryId = categoryId;
        this.price = price;
        this.startTime = startTime;
        this.stopTime = stopTime;
        this.children = children;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getStopTime() {
        return stopTime;
    }

    public void setStopTime(String stopTime) {
        this.stopTime = stopTime;
    }

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }

}
