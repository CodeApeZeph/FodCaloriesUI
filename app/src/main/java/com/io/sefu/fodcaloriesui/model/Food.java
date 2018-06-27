package com.io.sefu.fodcaloriesui.model;

public class Food {

    public String foodName;
    public String foodContent;
    //include image id
    public int foodImage;


    public Food() {
    }

    public Food(String foodName, String foodContent, int foodImage) {
        this.foodName = foodName;
        this.foodContent = foodContent;
        this.foodImage = foodImage;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodContent() {
        return foodContent;
    }

    public void setFoodContent(String foodContent) {
        this.foodContent = foodContent;
    }

    public int getFoodImage() {
        return foodImage;
    }

    public void setFoodImage(int foodImage) {
        this.foodImage = foodImage;
    }
}


