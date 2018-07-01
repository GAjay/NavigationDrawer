package com.ajay.navigationdrawer.utils;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

import com.ajay.navigationdrawer.widget.AnimNavigationDrawer;

public class ViewFactory implements LayoutInflater.Factory {
        private static ViewFactory mInstance;

        public static ViewFactory getInstance () {
                if (mInstance == null) {
                        mInstance = new ViewFactory();
                }

                return mInstance;
        }

        private ViewFactory() {}

        @Override
        public View onCreateView (String name, Context context, AttributeSet attrs) {
                //Check if it's one of our custom classes, if so, return one using
                //the Context/AttributeSet constructor
                if (AnimNavigationDrawer.class.getSimpleName().equals(name)) {
                        return new AnimNavigationDrawer(context, attrs);
                }

                //Not one of ours; let the system handle it
                return null;
        }
}
