package com.bytedance.sdk.component.adexpress.a.a;

import com.bytedance.sdk.component.d.m;

/* compiled from: AdapterInstance.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: e  reason: collision with root package name */
    private static volatile a f9320e;

    /* renamed from: a  reason: collision with root package name */
    private volatile b f9321a;

    /* renamed from: b  reason: collision with root package name */
    private volatile d f9322b;

    /* renamed from: c  reason: collision with root package name */
    private volatile c f9323c;

    /* renamed from: d  reason: collision with root package name */
    private volatile m f9324d;

    private a() {
    }

    public static a a() {
        if (f9320e == null) {
            synchronized (a.class) {
                if (f9320e == null) {
                    f9320e = new a();
                }
            }
        }
        return f9320e;
    }

    public b b() {
        return this.f9321a;
    }

    public c c() {
        return this.f9323c;
    }

    public d d() {
        return this.f9322b;
    }

    public m e() {
        return this.f9324d;
    }

    public void a(b bVar) {
        this.f9321a = bVar;
    }

    public void a(c cVar) {
        this.f9323c = cVar;
    }

    public void a(d dVar) {
        this.f9322b = dVar;
    }

    public void a(m mVar) {
        this.f9324d = mVar;
    }
}
