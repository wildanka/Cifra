package com.example.dan.myapplication.model;

import android.os.Parcel;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

/**
 * Created by DAN on 11/7/2017.
 */

public class FamiliMateri extends ExpandableGroup{

    public FamiliMateri(String title, List items) {
        super(title, items);
    }

}
