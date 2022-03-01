package com.jamaya.applaudo.entity;

import com.jamaya.applaudo.utilities.Status;

import java.io.Serializable;
import java.time.LocalDateTime;


public class Item implements Serializable {

    private Integer itemId;
    private String itemName;
    private String itemEnteredByUser;
    private LocalDateTime itemEnteredDate;
    private Double itemBuyingPrice;
    private Double itemSellingPrice;
    private LocalDateTime itemLastModifiedDate;
    private String itemLastModifiedByUser;
    private Status itemStatus;

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemEnteredByUser() {
        return itemEnteredByUser;
    }

    public void setItemEnteredByUser(String itemEnteredByUser) {
        this.itemEnteredByUser = itemEnteredByUser;
    }

    public LocalDateTime getItemEnteredDate() {
        return itemEnteredDate;
    }

    public void setItemEnteredDate(LocalDateTime itemEnteredDate) {
        this.itemEnteredDate = itemEnteredDate;
    }

    public Double getItemBuyingPrice() {
        return itemBuyingPrice;
    }

    public void setItemBuyingPrice(Double itemBuyingPrice) {
        this.itemBuyingPrice = itemBuyingPrice;
    }

    public Double getItemSellingPrice() {
        return itemSellingPrice;
    }

    public void setItemSellingPrice(Double itemSellingPrice) {
        this.itemSellingPrice = itemSellingPrice;
    }

    public LocalDateTime getItemLastModifiedDate() {
        return itemLastModifiedDate;
    }

    public void setItemLastModifiedDate(LocalDateTime itemLastModifiedDate) {
        this.itemLastModifiedDate = itemLastModifiedDate;
    }

    public String getItemLastModifiedByUser() {
        return itemLastModifiedByUser;
    }

    public void setItemLastModifiedByUser(String itemLastModifiedByUser) {
        this.itemLastModifiedByUser = itemLastModifiedByUser;
    }

    public Status getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(Status itemStatus) {
        this.itemStatus = itemStatus;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", itemEnteredByUser='" + itemEnteredByUser + '\'' +
                ", itemEnteredDate=" + itemEnteredDate +
                ", itemBuyingPrice=" + itemBuyingPrice +
                ", itemSellingPrice=" + itemSellingPrice +
                ", itemLastModifiedDate=" + itemLastModifiedDate +
                ", itemLastModifiedByUser='" + itemLastModifiedByUser + '\'' +
                ", itemStatus=" + itemStatus +
                '}';
    }
}
