package com.fyber.inneractive.sdk.player.exoplayer2.source;

import android.os.Handler;
import java.io.IOException;

/* loaded from: classes2.dex */
public interface f {

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Handler f19263a;

        /* renamed from: b  reason: collision with root package name */
        public final f f19264b;

        /* renamed from: c  reason: collision with root package name */
        public final long f19265c;

        public a(Handler handler, f fVar) {
            this(handler, fVar, 0L);
        }

        public static long a(a aVar, long j10) {
            aVar.getClass();
            long b10 = com.fyber.inneractive.sdk.player.exoplayer2.b.b(j10);
            if (b10 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return aVar.f19265c + b10;
        }

        public void b(com.fyber.inneractive.sdk.player.exoplayer2.upstream.j jVar, int i10, long j10, long j11, long j12) {
            if (this.f19264b != null) {
                this.f19263a.post(new b(this, jVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j10, j11, j12));
            }
        }

        public a(Handler handler, f fVar, long j10) {
            this.f19263a = fVar != null ? (Handler) com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(handler) : null;
            this.f19264b = fVar;
            this.f19265c = j10;
        }

        public void a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.j jVar, int i10, long j10, long j11, long j12) {
            if (this.f19264b != null) {
                this.f19263a.post(new c(this, jVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j10, j11, j12));
            }
        }

        public void a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.j jVar, int i10, long j10, long j11, long j12, IOException iOException, boolean z10) {
            if (this.f19264b != null) {
                this.f19263a.post(new d(this, jVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j10, j11, j12, iOException, z10));
            }
        }
    }
}
