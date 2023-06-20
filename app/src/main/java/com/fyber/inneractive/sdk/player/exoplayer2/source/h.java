package com.fyber.inneractive.sdk.player.exoplayer2.source;

/* loaded from: classes2.dex */
public final class h implements p {

    /* renamed from: a  reason: collision with root package name */
    public final p[] f19266a;

    public h(p[] pVarArr) {
        this.f19266a = pVarArr;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.p
    public long a() {
        long j10 = Long.MAX_VALUE;
        for (p pVar : this.f19266a) {
            long a10 = pVar.a();
            if (a10 != Long.MIN_VALUE) {
                j10 = Math.min(j10, a10);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.p
    public boolean a(long j10) {
        p[] pVarArr;
        boolean z10;
        boolean z11 = false;
        do {
            long a10 = a();
            if (a10 == Long.MIN_VALUE) {
                break;
            }
            z10 = false;
            for (p pVar : this.f19266a) {
                if (pVar.a() == a10) {
                    z10 |= pVar.a(j10);
                }
            }
            z11 |= z10;
        } while (z10);
        return z11;
    }
}
