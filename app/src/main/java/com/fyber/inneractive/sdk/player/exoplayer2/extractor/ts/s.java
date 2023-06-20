package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final List<com.fyber.inneractive.sdk.player.exoplayer2.i> f18984a;

    /* renamed from: b  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.n[] f18985b;

    public s(List<com.fyber.inneractive.sdk.player.exoplayer2.i> list) {
        this.f18984a = list;
        this.f18985b = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.n[list.size()];
    }

    public void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.h hVar, v.d dVar) {
        for (int i10 = 0; i10 < this.f18985b.length; i10++) {
            dVar.a();
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n a10 = hVar.a(dVar.c(), 3);
            com.fyber.inneractive.sdk.player.exoplayer2.i iVar = this.f18984a.get(i10);
            String str = iVar.f19119f;
            boolean z10 = "application/cea-608".equals(str) || "application/cea-708".equals(str);
            com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(z10, "Invalid closed caption mime type provided: " + str);
            String str2 = iVar.f19114a;
            if (str2 == null) {
                str2 = dVar.b();
            }
            a10.a(com.fyber.inneractive.sdk.player.exoplayer2.i.a(str2, str, null, -1, iVar.f19137x, iVar.f19138y, iVar.f19139z, null, Long.MAX_VALUE, Collections.emptyList()));
            this.f18985b[i10] = a10;
        }
    }
}
