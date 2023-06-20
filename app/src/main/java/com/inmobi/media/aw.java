package com.inmobi.media;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: AdAssetBatch.java */
/* loaded from: classes3.dex */
public final class aw {

    /* renamed from: b  reason: collision with root package name */
    Set<bn> f24648b;

    /* renamed from: d  reason: collision with root package name */
    int f24650d;

    /* renamed from: e  reason: collision with root package name */
    int f24651e;

    /* renamed from: f  reason: collision with root package name */
    public String f24652f;

    /* renamed from: g  reason: collision with root package name */
    public String f24653g;

    /* renamed from: h  reason: collision with root package name */
    private String f24654h;

    /* renamed from: i  reason: collision with root package name */
    private String f24655i;

    /* renamed from: j  reason: collision with root package name */
    private final WeakReference<bh> f24656j;

    /* renamed from: a  reason: collision with root package name */
    public List<av> f24647a = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    Set<String> f24649c = new HashSet();

    public aw(String str, String str2, Set<bn> set, bh bhVar) {
        this.f24654h = str;
        this.f24655i = str2;
        this.f24648b = set;
        this.f24656j = new WeakReference<>(bhVar);
    }

    public final bh a() {
        return this.f24656j.get();
    }

    public final String toString() {
        return "AdAssetBatch{mRawAssets=" + this.f24648b + ", mBatchDownloadSuccessCount=" + this.f24650d + ", mBatchDownloadFailureCount=" + this.f24651e + '}';
    }

    public aw(String str, Set<bn> set, bh bhVar, String str2) {
        this.f24654h = str;
        this.f24653g = str2;
        this.f24648b = set;
        this.f24656j = new WeakReference<>(bhVar);
    }
}
