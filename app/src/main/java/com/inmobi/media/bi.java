package com.inmobi.media;

import com.google.android.gms.common.api.Api;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Click.java */
/* loaded from: classes3.dex */
public final class bi {

    /* renamed from: a  reason: collision with root package name */
    int f24738a;

    /* renamed from: b  reason: collision with root package name */
    public String f24739b;

    /* renamed from: c  reason: collision with root package name */
    public Map<String, String> f24740c;

    /* renamed from: d  reason: collision with root package name */
    long f24741d;

    /* renamed from: e  reason: collision with root package name */
    long f24742e;

    /* renamed from: f  reason: collision with root package name */
    int f24743f;

    /* renamed from: g  reason: collision with root package name */
    AtomicBoolean f24744g;

    /* renamed from: h  reason: collision with root package name */
    boolean f24745h;

    /* renamed from: i  reason: collision with root package name */
    boolean f24746i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bi(String str, boolean z10, boolean z11, int i10) {
        this(new Random().nextInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER, str, new HashMap(), z10, z11, i10, System.currentTimeMillis(), System.currentTimeMillis());
    }

    public final boolean a(long j10) {
        return System.currentTimeMillis() - this.f24742e > j10 * 1000;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public bi(String str, Map<String, String> map, boolean z10, int i10) {
        this(new Random().nextInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER, str, map, z10, false, i10, System.currentTimeMillis(), System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public bi(int i10, String str, Map<String, String> map, boolean z10, boolean z11, int i11, long j10, long j11) {
        this.f24738a = i10;
        this.f24739b = str;
        this.f24740c = map;
        this.f24741d = j10;
        this.f24742e = j11;
        this.f24743f = i11;
        this.f24744g = new AtomicBoolean(false);
        this.f24746i = z10;
        this.f24745h = z11;
    }
}
