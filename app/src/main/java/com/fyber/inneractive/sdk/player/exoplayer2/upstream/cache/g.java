package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import java.io.File;

/* loaded from: classes2.dex */
public class g implements Comparable<g> {

    /* renamed from: a  reason: collision with root package name */
    public final String f19417a;

    /* renamed from: b  reason: collision with root package name */
    public final long f19418b;

    /* renamed from: c  reason: collision with root package name */
    public final long f19419c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f19420d;

    /* renamed from: e  reason: collision with root package name */
    public final File f19421e;

    /* renamed from: f  reason: collision with root package name */
    public final long f19422f;

    public g(String str, long j10, long j11, long j12, File file) {
        this.f19417a = str;
        this.f19418b = j10;
        this.f19419c = j11;
        this.f19420d = file != null;
        this.f19421e = file;
        this.f19422f = j12;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(g gVar) {
        if (!this.f19417a.equals(gVar.f19417a)) {
            return this.f19417a.compareTo(gVar.f19417a);
        }
        int i10 = ((this.f19418b - gVar.f19418b) > 0L ? 1 : ((this.f19418b - gVar.f19418b) == 0L ? 0 : -1));
        if (i10 == 0) {
            return 0;
        }
        return i10 < 0 ? -1 : 1;
    }
}
