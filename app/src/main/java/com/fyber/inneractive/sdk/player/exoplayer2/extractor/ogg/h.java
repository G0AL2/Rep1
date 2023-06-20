package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.n;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public d f18742a;

    /* renamed from: b  reason: collision with root package name */
    public n f18743b;

    /* renamed from: c  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.h f18744c;

    /* renamed from: d  reason: collision with root package name */
    public f f18745d;

    /* renamed from: e  reason: collision with root package name */
    public long f18746e;

    /* renamed from: f  reason: collision with root package name */
    public long f18747f;

    /* renamed from: g  reason: collision with root package name */
    public long f18748g;

    /* renamed from: h  reason: collision with root package name */
    public int f18749h;

    /* renamed from: i  reason: collision with root package name */
    public int f18750i;

    /* renamed from: j  reason: collision with root package name */
    public a f18751j;

    /* renamed from: k  reason: collision with root package name */
    public long f18752k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f18753l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f18754m;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public com.fyber.inneractive.sdk.player.exoplayer2.i f18755a;

        /* renamed from: b  reason: collision with root package name */
        public f f18756b;
    }

    /* loaded from: classes.dex */
    public static final class b implements f {
        @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.f
        public long a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar) throws IOException, InterruptedException {
            return -1L;
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.f
        public m b() {
            return new m.a(-9223372036854775807L);
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.f
        public long c(long j10) {
            return 0L;
        }
    }

    public abstract long a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar);

    public void a(boolean z10) {
        if (z10) {
            this.f18751j = new a();
            this.f18747f = 0L;
            this.f18749h = 0;
        } else {
            this.f18749h = 1;
        }
        this.f18746e = -1L;
        this.f18748g = 0L;
    }

    public abstract boolean a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, long j10, a aVar) throws IOException, InterruptedException;

    public void b(long j10) {
        this.f18748g = j10;
    }

    public long a(long j10) {
        return (this.f18750i * j10) / 1000000;
    }
}
