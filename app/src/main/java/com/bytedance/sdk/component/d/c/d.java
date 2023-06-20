package com.bytedance.sdk.component.d.c;

import com.bytedance.sdk.component.d.j;
import java.util.Map;

/* compiled from: ImageResponse.java */
/* loaded from: classes.dex */
public class d<T> implements j {

    /* renamed from: a  reason: collision with root package name */
    private String f10232a;

    /* renamed from: b  reason: collision with root package name */
    private String f10233b;

    /* renamed from: c  reason: collision with root package name */
    private T f10234c;

    /* renamed from: d  reason: collision with root package name */
    private int f10235d;

    /* renamed from: e  reason: collision with root package name */
    private int f10236e;

    /* renamed from: f  reason: collision with root package name */
    private Map<String, String> f10237f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f10238g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f10239h;

    /* renamed from: i  reason: collision with root package name */
    private com.bytedance.sdk.component.d.g f10240i;

    /* renamed from: j  reason: collision with root package name */
    private int f10241j;

    public d a(c cVar, T t10) {
        this.f10234c = t10;
        this.f10232a = cVar.e();
        this.f10233b = cVar.a();
        this.f10235d = cVar.b();
        this.f10236e = cVar.c();
        this.f10239h = cVar.l();
        this.f10240i = cVar.m();
        this.f10241j = cVar.n();
        return this;
    }

    @Override // com.bytedance.sdk.component.d.j
    public T b() {
        return this.f10234c;
    }

    @Override // com.bytedance.sdk.component.d.j
    public Map<String, String> c() {
        return this.f10237f;
    }

    @Override // com.bytedance.sdk.component.d.j
    public boolean d() {
        return this.f10239h;
    }

    @Override // com.bytedance.sdk.component.d.j
    public com.bytedance.sdk.component.d.g e() {
        return this.f10240i;
    }

    @Override // com.bytedance.sdk.component.d.j
    public int f() {
        return this.f10241j;
    }

    public d a(c cVar, T t10, Map<String, String> map, boolean z10) {
        this.f10237f = map;
        this.f10238g = z10;
        return a(cVar, t10);
    }

    @Override // com.bytedance.sdk.component.d.j
    public String a() {
        return this.f10233b;
    }
}
