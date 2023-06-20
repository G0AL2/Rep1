package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* loaded from: classes3.dex */
public class ISBannerSize {

    /* renamed from: b  reason: collision with root package name */
    private int f26282b;

    /* renamed from: c  reason: collision with root package name */
    private int f26283c;

    /* renamed from: d  reason: collision with root package name */
    private String f26284d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f26285e;
    public static final ISBannerSize BANNER = new ISBannerSize("BANNER", 320, 50);
    public static final ISBannerSize LARGE = new ISBannerSize("LARGE", 320, 90);
    public static final ISBannerSize RECTANGLE = new ISBannerSize("RECTANGLE", ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED);

    /* renamed from: a  reason: collision with root package name */
    protected static final ISBannerSize f26281a = new ISBannerSize("LEADERBOARD", 728, 90);
    public static final ISBannerSize SMART = new ISBannerSize("SMART", 0, 0);

    public ISBannerSize(int i10, int i11) {
        this("CUSTOM", i10, i11);
    }

    public ISBannerSize(String str, int i10, int i11) {
        this.f26284d = str;
        this.f26282b = i10;
        this.f26283c = i11;
    }

    public String getDescription() {
        return this.f26284d;
    }

    public int getHeight() {
        return this.f26283c;
    }

    public int getWidth() {
        return this.f26282b;
    }

    public boolean isAdaptive() {
        return this.f26285e;
    }

    public boolean isSmart() {
        return this.f26284d.equals("SMART");
    }

    public void setAdaptive(boolean z10) {
        this.f26285e = z10;
    }
}
