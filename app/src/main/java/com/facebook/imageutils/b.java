package com.facebook.imageutils;

import android.graphics.ColorSpace;
import android.util.Pair;

/* compiled from: ImageMetaData.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final Pair<Integer, Integer> f15179a;

    /* renamed from: b  reason: collision with root package name */
    private final ColorSpace f15180b;

    public b(int i10, int i11, ColorSpace colorSpace) {
        this.f15179a = (i10 == -1 || i11 == -1) ? null : new Pair<>(Integer.valueOf(i10), Integer.valueOf(i11));
        this.f15180b = colorSpace;
    }

    public ColorSpace a() {
        return this.f15180b;
    }

    public Pair<Integer, Integer> b() {
        return this.f15179a;
    }
}
