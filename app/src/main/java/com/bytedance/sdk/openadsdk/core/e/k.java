package com.bytedance.sdk.openadsdk.core.e;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTImage;

/* compiled from: Image.java */
/* loaded from: classes.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private String f12114a;

    /* renamed from: b  reason: collision with root package name */
    private int f12115b;

    /* renamed from: c  reason: collision with root package name */
    private int f12116c;

    /* renamed from: d  reason: collision with root package name */
    private double f12117d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f12118e;

    /* renamed from: f  reason: collision with root package name */
    private String f12119f;

    public static TTImage a(k kVar) {
        if (kVar == null || !kVar.e()) {
            return null;
        }
        return new TTImage(kVar.c(), kVar.b(), kVar.a(), kVar.d());
    }

    public String a() {
        return this.f12114a;
    }

    public void a(int i10) {
        this.f12115b = i10;
    }

    public void a(String str) {
        this.f12114a = str;
    }

    public void a(boolean z10) {
        this.f12118e = z10;
    }

    public int b() {
        return this.f12115b;
    }

    public void b(int i10) {
        this.f12116c = i10;
    }

    public void b(String str) {
        this.f12119f = str;
    }

    public int c() {
        return this.f12116c;
    }

    public double d() {
        return this.f12117d;
    }

    public boolean e() {
        return !TextUtils.isEmpty(this.f12114a) && this.f12115b > 0 && this.f12116c > 0;
    }

    public boolean f() {
        return this.f12118e;
    }

    public String g() {
        return this.f12119f;
    }
}
