package com.chartboost.sdk.impl;

import android.content.SharedPreferences;
import java.util.UUID;

/* loaded from: classes.dex */
public class p2 {

    /* renamed from: a  reason: collision with root package name */
    private SharedPreferences f14249a;

    /* renamed from: b  reason: collision with root package name */
    private String f14250b;

    /* renamed from: d  reason: collision with root package name */
    private int f14252d;

    /* renamed from: c  reason: collision with root package name */
    private long f14251c = 0;

    /* renamed from: e  reason: collision with root package name */
    private int f14253e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f14254f = 0;

    /* renamed from: g  reason: collision with root package name */
    private int f14255g = 0;

    public p2(SharedPreferences sharedPreferences) {
        this.f14252d = 0;
        this.f14249a = sharedPreferences;
        this.f14252d = f();
    }

    private int f() {
        SharedPreferences sharedPreferences = this.f14249a;
        if (sharedPreferences != null) {
            return sharedPreferences.getInt("session_key", 0);
        }
        return -1;
    }

    private void g() {
        SharedPreferences.Editor edit;
        SharedPreferences sharedPreferences = this.f14249a;
        if (sharedPreferences == null || (edit = sharedPreferences.edit()) == null) {
            return;
        }
        edit.putInt("session_key", this.f14252d).apply();
    }

    public void a() {
        this.f14250b = b();
        this.f14251c = System.currentTimeMillis();
        this.f14253e = 0;
        this.f14254f = 0;
        this.f14255g = 0;
        this.f14252d++;
        g();
    }

    public int b(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return 0;
                }
                return this.f14255g;
            }
            return this.f14254f;
        }
        return this.f14253e;
    }

    public int c() {
        return this.f14252d;
    }

    public long d() {
        return System.currentTimeMillis() - this.f14251c;
    }

    public String e() {
        return this.f14250b;
    }

    private String b() {
        String uuid = UUID.randomUUID().toString();
        String a10 = l0.a(uuid);
        return a10 != null ? a10 : uuid;
    }

    public void a(int i10) {
        if (i10 == 0) {
            this.f14253e++;
        } else if (i10 == 1) {
            this.f14254f++;
        } else if (i10 != 2) {
        } else {
            this.f14255g++;
        }
    }
}
