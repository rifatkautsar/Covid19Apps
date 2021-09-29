package com.rifat.covid19app.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.rifat.covid19app.R;
import com.rifat.covid19app.Adapter.HomeModel.ScreenIntroItem;

import java.util.List;

public class IntroScreenAdapter extends PagerAdapter {

    Context mContext;

    List<ScreenIntroItem> screenIntroItemList;

    public IntroScreenAdapter(Context mContext, List<ScreenIntroItem> screenIntroItemList) {
        this.mContext = mContext;
        this.screenIntroItemList = screenIntroItemList;
    }


    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layoutScreen = inflater.inflate(R.layout.item_intro,null);

        ImageView imgSlide = layoutScreen.findViewById(R.id.imgsplash);
        TextView tvIntro = layoutScreen.findViewById(R.id.tvIntro);

        tvIntro.setText(screenIntroItemList.get(position).getIntrotext());
        imgSlide.setImageResource(screenIntroItemList.get(position).getImg());

        container.addView(layoutScreen);
        return layoutScreen;
    }

    @Override
    public int getCount() {
        return screenIntroItemList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
