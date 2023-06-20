package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.g;
import com.fyber.inneractive.sdk.player.exoplayer2.util.k;
import com.inmobi.media.fq;
import java.io.IOException;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final k f18477a = new k(8);

    /* renamed from: b  reason: collision with root package name */
    public int f18478b;

    public final long a(g gVar) throws IOException, InterruptedException {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar;
        int i10 = 0;
        bVar.a(this.f18477a.f19579a, 0, 1, false);
        int i11 = this.f18477a.f19579a[0] & fq.i.NETWORK_LOAD_LIMIT_DISABLED;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = 128;
        int i13 = 0;
        while ((i11 & i12) == 0) {
            i12 >>= 1;
            i13++;
        }
        int i14 = i11 & (~i12);
        bVar.a(this.f18477a.f19579a, 1, i13, false);
        while (i10 < i13) {
            i10++;
            i14 = (this.f18477a.f19579a[i10] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) + (i14 << 8);
        }
        this.f18478b += i13 + 1;
        return i14;
    }
}
