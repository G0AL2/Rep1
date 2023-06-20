package com.fyber.inneractive.sdk.player.exoplayer2.util;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final int f19552a;

    /* renamed from: b  reason: collision with root package name */
    public final int f19553b;

    /* renamed from: c  reason: collision with root package name */
    public final int f19554c;

    /* renamed from: d  reason: collision with root package name */
    public final long f19555d;

    public e(byte[] bArr, int i10) {
        j jVar = new j(bArr);
        jVar.b(i10 * 8);
        jVar.a(16);
        jVar.a(16);
        jVar.a(24);
        jVar.a(24);
        this.f19552a = jVar.a(20);
        this.f19553b = jVar.a(3) + 1;
        this.f19554c = jVar.a(5) + 1;
        this.f19555d = ((jVar.a(4) & 15) << 32) | (jVar.a(32) & 4294967295L);
    }
}
