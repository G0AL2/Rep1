package com.bytedance.sdk.component.e;

import java.io.File;
import java.util.Map;

/* compiled from: NetResponse.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    final int f10298a;

    /* renamed from: b  reason: collision with root package name */
    final String f10299b;

    /* renamed from: c  reason: collision with root package name */
    final Map<String, String> f10300c;

    /* renamed from: d  reason: collision with root package name */
    final String f10301d;

    /* renamed from: e  reason: collision with root package name */
    final long f10302e;

    /* renamed from: f  reason: collision with root package name */
    final long f10303f;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f10305h;

    /* renamed from: g  reason: collision with root package name */
    private File f10304g = null;

    /* renamed from: i  reason: collision with root package name */
    private byte[] f10306i = null;

    public b(boolean z10, int i10, String str, Map<String, String> map, String str2, long j10, long j11) {
        this.f10305h = z10;
        this.f10298a = i10;
        this.f10299b = str;
        this.f10300c = map;
        this.f10301d = str2;
        this.f10302e = j10;
        this.f10303f = j11;
    }

    public int a() {
        return this.f10298a;
    }

    public void a(File file) {
        this.f10304g = file;
    }

    public String b() {
        return this.f10299b;
    }

    public Map<String, String> c() {
        return this.f10300c;
    }

    public String d() {
        return this.f10301d;
    }

    public File e() {
        return this.f10304g;
    }

    public boolean f() {
        return this.f10305h;
    }

    public long g() {
        return this.f10302e - this.f10303f;
    }
}
