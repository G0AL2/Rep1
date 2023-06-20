package com.chartboost.sdk.impl;

import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public class l1 {

    /* renamed from: a  reason: collision with root package name */
    private int f14143a;

    /* renamed from: b  reason: collision with root package name */
    private int f14144b;

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, Long> f14145c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final HashMap<String, Integer> f14146d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    private final HashSet<String> f14147e = new HashSet<>();

    public l1(int i10, int i11) {
        this.f14143a = 10;
        this.f14144b = 30;
        this.f14143a = i10;
        this.f14144b = i11;
    }

    private long a(long j10, long j11) {
        return (j10 - j11) / 1000;
    }

    public synchronized com.chartboost.sdk.Tracking.d b(com.chartboost.sdk.Tracking.d dVar) {
        if (dVar == null) {
            return null;
        }
        String f10 = dVar.f();
        long g10 = dVar.g();
        long a10 = a(dVar);
        a(f10, g10);
        if (a(g10, a10) > this.f14144b) {
            this.f14145c.remove(f10);
            a(f10, g10);
            this.f14146d.remove(f10);
        }
        if (this.f14147e.contains(f10)) {
            return null;
        }
        if (a(f10, a(f10)) > this.f14143a) {
            this.f14147e.add(dVar.f());
            return new com.chartboost.sdk.Tracking.c("too_many_events", f10, "", "");
        }
        return dVar;
    }

    private void a(String str, long j10) {
        if (this.f14145c.containsKey(str)) {
            return;
        }
        this.f14145c.put(str, Long.valueOf(j10));
    }

    private int a(String str, int i10) {
        int i11 = i10 + 1;
        this.f14146d.put(str, Integer.valueOf(i11));
        return i11;
    }

    private int a(String str) {
        Integer num = this.f14146d.get(str);
        if (num == null) {
            num = 0;
        }
        return num.intValue();
    }

    private long a(com.chartboost.sdk.Tracking.d dVar) {
        Long l10 = this.f14145c.get(dVar.f());
        if (l10 == null) {
            l10 = Long.valueOf(dVar.g());
        }
        return l10.longValue();
    }
}
