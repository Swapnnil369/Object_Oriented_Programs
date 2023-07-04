package com.bridgelabz;

public class Stock {
    private String shareName;
    private int numberOfShare;
    private int sharePrice;
    private int numberOfStock;

    public String getShareName() {
        return shareName;
    }

    public void setShareName(String shareName) {
        this.shareName = shareName;
    }

    public int getNumberofShare() {
        return numberOfShare;
    }

    public void setNumberofShare(int numberofShare) {
        this.numberOfShare = numberofShare;
    }

    public int getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(int sharePrice) {
        this.sharePrice = sharePrice;
    }

    public int getNumberofStock() {
        return numberOfStock;
    }

    public void setNumberofStock(int numberofStock) {
        this.numberOfStock = numberofStock;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "shareName='" + shareName + '\'' +
                ", numberofShare=" + numberOfShare +
                ", sharePrice=" + sharePrice +
                ", numberofStock=" + numberOfStock +
                '}';
    }
}
