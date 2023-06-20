package com.bytedance.sdk.openadsdk;

/* loaded from: classes.dex */
public class TTImage {

    /* renamed from: a  reason: collision with root package name */
    private int f10636a;

    /* renamed from: b  reason: collision with root package name */
    private int f10637b;

    /* renamed from: c  reason: collision with root package name */
    private String f10638c;

    /* renamed from: d  reason: collision with root package name */
    private double f10639d;

    public TTImage(int i10, int i11, String str, double d10) {
        this.f10639d = 0.0d;
        this.f10636a = i10;
        this.f10637b = i11;
        this.f10638c = str;
        this.f10639d = d10;
    }

    public double getDuration() {
        return this.f10639d;
    }

    public int getHeight() {
        return this.f10636a;
    }

    public String getImageUrl() {
        return this.f10638c;
    }

    public int getWidth() {
        return this.f10637b;
    }

    public boolean isValid() {
        String str;
        return this.f10636a > 0 && this.f10637b > 0 && (str = this.f10638c) != null && str.length() > 0;
    }

    public TTImage(int i10, int i11, String str) {
        this(i10, i11, str, 0.0d);
    }
}
