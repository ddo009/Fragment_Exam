package com.choinisae.donghaechoi.exam_fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class Add_Fragment extends Fragment {

    private ImageView mImageView;

    public Add_Fragment() {
        // Required empty public constructor
    }

    public static Add_Fragment newInstance(int color) {
        Add_Fragment fragment = new Add_Fragment();
        Bundle bundle = new Bundle();
        bundle.putInt("color", color);

        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_, container, false);
    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mImageView = (ImageView) view.findViewById(R.id.new_imageview);
        Bundle bundle = getArguments();
        if (bundle != null) {
            int color = bundle.getInt("color");
            mImageView.setBackgroundColor(color);
        }

    }

    public void setColor(int color) {
        mImageView.setBackgroundColor(color);
    }


}
