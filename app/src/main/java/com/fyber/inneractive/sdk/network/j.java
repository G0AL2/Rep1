package com.fyber.inneractive.sdk.network;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    public int f17569a;

    /* renamed from: b  reason: collision with root package name */
    public String f17570b;

    /* renamed from: c  reason: collision with root package name */
    public InputStream f17571c;

    /* renamed from: d  reason: collision with root package name */
    public Map<String, List<String>> f17572d;

    /* renamed from: e  reason: collision with root package name */
    public String f17573e;

    public j() {
    }

    public void a(InputStream inputStream) {
        this.f17571c = inputStream;
    }

    public j(InputStream inputStream, int i10, String str, Map<String, List<String>> map, String str2) {
        this.f17571c = inputStream;
        this.f17569a = i10;
        this.f17570b = str;
        this.f17572d = map;
        this.f17573e = str2;
    }

    public void a(int i10) {
        this.f17569a = i10;
    }

    public void a(Map<String, List<String>> map) {
        this.f17572d = map;
    }

    public void a(String str) {
        this.f17573e = str;
    }

    public void a() throws IOException {
        InputStream inputStream = this.f17571c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Throwable unused) {
            }
        }
    }
}
