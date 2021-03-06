package com.team3s.lostpropertyse.MainPage;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.team3s.lostpropertyse.Chat.Users;
import com.team3s.lostpropertyse.R;
import com.team3s.lostpropertyse.Utils.CircleTransform;

import java.util.ArrayList;


public class CategoryAdapter extends BaseAdapter {
    private LayoutInflater mInflater;
    private ArrayList<Category> categoryArrayList;
    Context context;
    public CategoryAdapter(Context context, ArrayList<Category> categoryArrayList) {
        this.context = context;
        this.mInflater = LayoutInflater.from(context);
        this.categoryArrayList = categoryArrayList;
        notifyDataSetChanged();

    }

    @Override
    public int getCount() {
        return categoryArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return categoryArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = mInflater.inflate(R.layout.category_row, null);
        TextView categoryName = (TextView) convertView.findViewById(R.id.categoryName);
        Category category = categoryArrayList.get(position);
        categoryName.setText(category.getCategory());
        Typeface type = Typeface.createFromAsset(context.getAssets(),
                "fonts/Righteous-Regular.ttf");
        categoryName.setTypeface(type);


        return convertView;
    }

}