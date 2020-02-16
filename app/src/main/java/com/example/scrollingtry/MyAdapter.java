package com.example.scrollingtry;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    ArrayList<Cat> data;

    MyAdapter(ArrayList<Cat> data) {
        this.data = data;
    }

    //Создается ViewHolder для каждого предмета в списке (только 1 раз)
    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_cat, parent, false);

        return new MyViewHolder(view);
    }

    //Соединяем данные с ViewHolder
    //Кладем данные во View
    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {
        holder.bind(data.get(position));
    }

    //Сколько предметов в списке
    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView catNameTextView;
        ImageView catColorImageView;
        CheckBox catGenderCheckBox;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            catNameTextView = itemView.findViewById(R.id.textView);
            catColorImageView = itemView.findViewById(R.id.colorView);
            catGenderCheckBox = itemView.findViewById(R.id.checkBox);
        }

        public void bind(Cat cat) {
            catGenderCheckBox.setChecked(cat.gender);
            catNameTextView.setText(cat.name);
            catColorImageView.setColorFilter(cat.color);
        }
    }
}
