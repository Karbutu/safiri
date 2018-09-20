package com.example.user.safiri;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class SliderAdapter extends PagerAdapter {

    static Resources res = null;
    Context context;
    LayoutInflater LayoutInflater;
    static Bitmap bitmap;

    public SliderAdapter(Context context) {
        this.context = context;
    }

    // Arrays
    public int[] slide_images = {

            R.drawable.thatguy,
            R.drawable.traffic,
    };

    public String[] slide_headings = {

            "Driver",
            "Traffic Police"
    };

    public String[] slide_descs = {

            "Please login to access your driving license details",
                    "Kindly login to scan driving license"
    };

    @Override
    public int getCount() {
        return slide_headings.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object O) {
        return view == ( RelativeLayout ) O;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        LayoutInflater = ( LayoutInflater ) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = LayoutInflater.inflate(R.layout.slide_layout, container, false);

        ImageView slideImageView = ( ImageView ) view.findViewById(R.id.slide_image);
        TextView slideHeading = ( TextView ) view.findViewById(R.id.slide_heading);
        TextView slideDescription = ( TextView ) view.findViewById(R.id.slide_desc);

        Log.e("Position", String.valueOf(position));

        slideImageView.setImageResource(slide_images[position]);
        slideHeading.setText(slide_headings[position]);
        slideDescription.setText(slide_descs[position]);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView(( RelativeLayout ) object);
        {

            container.removeView(( RelativeLayout ) object);
        }

    }
}
