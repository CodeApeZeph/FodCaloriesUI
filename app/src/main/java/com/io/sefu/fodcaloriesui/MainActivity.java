package com.io.sefu.fodcaloriesui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.io.sefu.fodcaloriesui.adapter.FoodAdapter;
import com.io.sefu.fodcaloriesui.model.Food;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Food> foodListItem = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeFoodItemList();


        // Create the recyclerview.
        RecyclerView foodRecyclerView = (RecyclerView) findViewById(R.id.recyclerViewFoodList);
        // Also supports `LinearLayoutManager.HORIZONTAL`
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        // Set layout manager.
        foodRecyclerView.setLayoutManager(layoutManager);

        // Create car recycler view data adapter with car item list.
        FoodAdapter foodDataAdapter = new FoodAdapter(foodListItem);
        // Set data adapter.
        foodRecyclerView.setAdapter(foodDataAdapter);


    }

    /* Initialise car items in list. */
    private void initializeFoodItemList() {
        if (foodListItem == null) {
            foodListItem = new ArrayList<Food>();
            foodListItem.add(new Food("Humburger", "Containing 120kcal of heat", R.drawable.humb));
            foodListItem.add(new Food("French Fries", "Containing 139kcal of heat", R.drawable.fries));
            foodListItem.add(new Food("Cafe", "Containing 73kcal of heat", R.drawable.cafe));
            foodListItem.add(new Food("Ice Cream", "Containing 89kcal of heat", R.drawable.ice_cream));
        }
    }
}
