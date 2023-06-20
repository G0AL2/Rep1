package com.chartboost.sdk.Networking.requests.models;

/* loaded from: classes.dex */
public class ShowParamsModel {
    private final String adId;
    private final String location;
    private final int videoCached;

    public ShowParamsModel(String str, String str2, int i10) {
        this.adId = str;
        this.location = str2;
        this.videoCached = i10;
    }

    public String getAdId() {
        return this.adId;
    }

    public String getLocation() {
        return this.location;
    }

    public int getVideoCached() {
        return this.videoCached;
    }
}
