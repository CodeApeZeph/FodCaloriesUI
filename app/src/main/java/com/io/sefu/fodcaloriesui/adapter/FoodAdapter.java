package com.io.sefu.fodcaloriesui.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.io.sefu.fodcaloriesui.MenuDetail;
import com.io.sefu.fodcaloriesui.R;
import com.io.sefu.fodcaloriesui.model.Food;

import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ViewHolder> {


    // ... view holder defined above...

    // Store a member variable for the contacts
    private List<Food> mFoods;

    // Pass in the food array into the constructor
    public FoodAdapter(List<Food> foods) {
        mFoods = foods;
    }


    // Usually involves inflating a layout from XML and returning the holder
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        // Inflate the custom layout
        View foodView = inflater.inflate(R.layout.food_list_item, parent, false);
        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(foodView);


        return viewHolder;
    }

    // Involves populating data into the item through holder
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        // Get the data model based on position
        Food food = mFoods.get(position);
        holder.textViewfoodName.setText(mFoods.get(position).getFoodName());
        holder.textViewFoodContent.setText(mFoods.get(position).getFoodContent());
        holder.foodImage.setImageResource(mFoods.get(position).getFoodImage());

    }

    // Returns the total count of items in the list
    @Override
    public int getItemCount() {
        return mFoods.size();
    }

    // Provide a direct reference to each of the views within a data item
    // Used to cache the views within the item layout for fast access
    public class ViewHolder extends RecyclerView.ViewHolder {
        // Your holder should contain a member variable
        // for any view that will be set as you render a row
        public TextView textViewfoodName, textViewFoodContent;
        public ImageView foodImage;

        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each subview
        public ViewHolder(final View itemView) {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            super(itemView);
            textViewfoodName = (TextView) itemView.findViewById(R.id.tvFoodName);
            textViewFoodContent = (TextView) itemView.findViewById(R.id.tvFoodContent);
            foodImage = (ImageView) itemView.findViewById(R.id.imageFood);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();

                    Toast.makeText(itemView.getContext(), "" + position, Toast.LENGTH_SHORT).show();
                    Intent openDetailsIntent = new Intent(itemView.getContext(), MenuDetail.class);
                    itemView.getContext().startActivity(openDetailsIntent);
                }
            });

        }
    }
}
