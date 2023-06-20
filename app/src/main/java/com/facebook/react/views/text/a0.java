package com.facebook.react.views.text;

import android.graphics.Typeface;
import android.os.Build;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;

/* compiled from: TypefaceStyle.java */
/* loaded from: classes.dex */
class a0 {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f16184a;

    /* renamed from: b  reason: collision with root package name */
    private final int f16185b;

    public a0(int i10) {
        i10 = i10 == -1 ? 0 : i10;
        this.f16184a = (i10 & 2) != 0;
        this.f16185b = (i10 & 1) != 0 ? 700 : DownloadResource.STATUS_BAD_REQUEST;
    }

    public Typeface a(Typeface typeface) {
        if (Build.VERSION.SDK_INT < 28) {
            return Typeface.create(typeface, b());
        }
        return Typeface.create(typeface, this.f16185b, this.f16184a);
    }

    public int b() {
        return this.f16185b < 700 ? this.f16184a ? 2 : 0 : this.f16184a ? 3 : 1;
    }

    public a0(int i10, int i11) {
        i10 = i10 == -1 ? 0 : i10;
        this.f16184a = (i10 & 2) != 0;
        this.f16185b = i11 == -1 ? (i10 & 1) != 0 ? 700 : DownloadResource.STATUS_BAD_REQUEST : i11;
    }
}
