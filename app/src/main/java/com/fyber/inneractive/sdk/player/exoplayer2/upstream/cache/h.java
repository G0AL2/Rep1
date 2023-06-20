package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import java.util.TreeSet;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final int f19423a;

    /* renamed from: b  reason: collision with root package name */
    public final String f19424b;

    /* renamed from: c  reason: collision with root package name */
    public final TreeSet<l> f19425c = new TreeSet<>();

    /* renamed from: d  reason: collision with root package name */
    public long f19426d;

    public h(int i10, String str, long j10) {
        this.f19423a = i10;
        this.f19424b = str;
        this.f19426d = j10;
    }

    public int a() {
        long j10 = this.f19426d;
        return (((this.f19423a * 31) + this.f19424b.hashCode()) * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }
}
