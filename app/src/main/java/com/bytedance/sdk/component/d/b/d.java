package com.bytedance.sdk.component.d.b;

import com.bytedance.sdk.component.d.f;
import com.bytedance.sdk.component.d.g;
import java.util.Map;

/* compiled from: HttpResponse.java */
/* loaded from: classes.dex */
public class d<T> implements f {

    /* renamed from: a  reason: collision with root package name */
    Map<String, String> f10090a;

    /* renamed from: b  reason: collision with root package name */
    private int f10091b;

    /* renamed from: c  reason: collision with root package name */
    private T f10092c;

    /* renamed from: d  reason: collision with root package name */
    private String f10093d;

    /* renamed from: e  reason: collision with root package name */
    private g f10094e;

    public d(int i10, T t10, String str) {
        this.f10091b = i10;
        this.f10092c = t10;
        this.f10093d = str;
    }

    @Override // com.bytedance.sdk.component.d.f
    public g a() {
        return this.f10094e;
    }

    @Override // com.bytedance.sdk.component.d.f
    public int b() {
        return this.f10091b;
    }

    @Override // com.bytedance.sdk.component.d.f
    public T c() {
        return this.f10092c;
    }

    @Override // com.bytedance.sdk.component.d.f
    public String d() {
        return this.f10093d;
    }

    @Override // com.bytedance.sdk.component.d.f
    public Map<String, String> e() {
        return this.f10090a;
    }

    public void a(g gVar) {
        this.f10094e = gVar;
    }

    public d(int i10, T t10, String str, Map<String, String> map) {
        this(i10, t10, str);
        this.f10090a = map;
    }
}
