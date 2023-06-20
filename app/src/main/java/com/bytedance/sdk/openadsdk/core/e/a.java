package com.bytedance.sdk.openadsdk.core.e;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: AdInfo.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private String f12009a;

    /* renamed from: b  reason: collision with root package name */
    private int f12010b;

    /* renamed from: c  reason: collision with root package name */
    private String f12011c;

    /* renamed from: d  reason: collision with root package name */
    private List<n> f12012d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private String f12013e;

    /* renamed from: f  reason: collision with root package name */
    private long f12014f;

    public static Map<String, n> a(a aVar) {
        if (aVar == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (n nVar : aVar.b()) {
            if (!TextUtils.isEmpty(nVar.af())) {
                hashMap.put(nVar.af(), nVar);
            }
        }
        if (hashMap.size() != 0) {
            return hashMap;
        }
        return null;
    }

    public int a() {
        return this.f12010b;
    }

    public void a(int i10) {
        this.f12010b = i10;
    }

    public void a(long j10) {
        this.f12014f = j10;
    }

    public void a(n nVar) {
        this.f12012d.add(nVar);
    }

    public void a(String str) {
        this.f12009a = str;
    }

    public List<n> b() {
        return this.f12012d;
    }

    public void b(String str) {
        this.f12011c = str;
    }

    public String c() {
        return this.f12013e;
    }

    public void c(String str) {
        this.f12013e = str;
    }
}
