package com.example.dan.myapplication.model;

/**
 * Created by DAN on 11/6/2017.
 */

public class ChannelTV {
    private String name;
    private String urlLink;

    public ChannelTV(String name, String urlLink) {
        this.name = name;
        this.urlLink = urlLink;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrlLink() {
        return urlLink;
    }

    public void setUrlLink(String urlLink) {
        this.urlLink = urlLink;
    }
}
