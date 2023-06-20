package com.inmobi.media;

import android.content.Context;

/* compiled from: MraidJsFetcher.java */
/* loaded from: classes3.dex */
public class da {

    /* renamed from: c  reason: collision with root package name */
    private static final String f25064c = "da";

    /* renamed from: a  reason: collision with root package name */
    public String f25065a;

    /* renamed from: b  reason: collision with root package name */
    public gx f25066b;

    /* renamed from: d  reason: collision with root package name */
    private int f25067d;

    /* renamed from: e  reason: collision with root package name */
    private int f25068e;

    /* renamed from: f  reason: collision with root package name */
    private long f25069f;

    public da(String str, int i10, int i11, long j10) {
        this.f25065a = str;
        this.f25067d = i10;
        this.f25068e = i11;
        this.f25069f = j10;
    }

    static /* synthetic */ boolean a(da daVar) {
        Context c10 = ho.c();
        if (c10 != null) {
            if ((System.currentTimeMillis() / 1000) - new hx(c10, "mraid_js_store").a() > daVar.f25069f) {
                return true;
            }
        }
        return false;
    }
}
