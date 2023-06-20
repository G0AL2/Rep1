package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes.dex */
public final class e implements n {
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.n
    public int a(g gVar, int i10, boolean z10) throws IOException, InterruptedException {
        int b10 = ((b) gVar).b(i10);
        if (b10 == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        return b10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.n
    public void a(long j10, int i10, int i11, int i12, byte[] bArr) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.n
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.i iVar) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.n
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, int i10) {
        kVar.e(kVar.f19580b + i10);
    }
}
