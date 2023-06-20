package com.fyber.inneractive.sdk.player.exoplayer2.source.chunk;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.c;
import com.fyber.inneractive.sdk.player.exoplayer2.i;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.g;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.j;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class c extends a {

    /* renamed from: i  reason: collision with root package name */
    public byte[] f19251i;

    /* renamed from: j  reason: collision with root package name */
    public int f19252j;

    /* renamed from: k  reason: collision with root package name */
    public volatile boolean f19253k;

    public c(g gVar, j jVar, int i10, i iVar, int i11, Object obj, byte[] bArr) {
        super(gVar, jVar, i10, iVar, i11, obj, -9223372036854775807L, -9223372036854775807L);
        this.f19251i = bArr;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x.c
    public final boolean a() {
        return this.f19253k;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x.c
    public final void b() {
        this.f19253k = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a
    public long c() {
        return this.f19252j;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x.c
    public final void load() throws IOException, InterruptedException {
        try {
            this.f19250h.a(this.f19243a);
            int i10 = 0;
            this.f19252j = 0;
            while (i10 != -1 && !this.f19253k) {
                byte[] bArr = this.f19251i;
                if (bArr == null) {
                    this.f19251i = new byte[16384];
                } else if (bArr.length < this.f19252j + 16384) {
                    this.f19251i = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i10 = this.f19250h.a(this.f19251i, this.f19252j, 16384);
                if (i10 != -1) {
                    this.f19252j += i10;
                }
            }
            if (!this.f19253k) {
                ((c.a) this).f18232m = Arrays.copyOf(this.f19251i, this.f19252j);
            }
        } finally {
            u.a(this.f19250h);
        }
    }
}
