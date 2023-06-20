package com.google.ads.mediation.inmobi;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.ads.formats.NativeAd;

/* compiled from: InMobiNativeMappedImage.java */
/* loaded from: classes2.dex */
class f extends NativeAd.Image {

    /* renamed from: a  reason: collision with root package name */
    private final Drawable f20634a;

    /* renamed from: b  reason: collision with root package name */
    private final Uri f20635b;

    /* renamed from: c  reason: collision with root package name */
    private final double f20636c;

    public f(Drawable drawable, Uri uri, double d10) {
        this.f20634a = drawable;
        this.f20635b = uri;
        this.f20636c = d10;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public Drawable getDrawable() {
        return this.f20634a;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public double getScale() {
        return this.f20636c;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public Uri getUri() {
        return this.f20635b;
    }
}
