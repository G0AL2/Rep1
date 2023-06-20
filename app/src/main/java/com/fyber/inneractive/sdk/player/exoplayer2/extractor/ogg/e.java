package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.l;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: h  reason: collision with root package name */
    public static final int f18731h = u.a("OggS");

    /* renamed from: a  reason: collision with root package name */
    public int f18732a;

    /* renamed from: b  reason: collision with root package name */
    public long f18733b;

    /* renamed from: c  reason: collision with root package name */
    public int f18734c;

    /* renamed from: d  reason: collision with root package name */
    public int f18735d;

    /* renamed from: e  reason: collision with root package name */
    public int f18736e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f18737f = new int[255];

    /* renamed from: g  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.k f18738g = new com.fyber.inneractive.sdk.player.exoplayer2.util.k(255);

    public void a() {
        this.f18732a = 0;
        this.f18733b = 0L;
        this.f18734c = 0;
        this.f18735d = 0;
        this.f18736e = 0;
    }

    public boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar, boolean z10) throws IOException, InterruptedException {
        int i10;
        this.f18738g.r();
        a();
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar;
        long j10 = bVar.f18143b;
        if ((j10 == -1 || j10 - (bVar.f18144c + ((long) bVar.f18146e)) >= 27) && bVar.a(this.f18738g.f19579a, 0, 27, true)) {
            if (this.f18738g.m() != f18731h) {
                if (z10) {
                    return false;
                }
                throw new l("expected OggS capture pattern at begin of page");
            } else if (this.f18738g.l() != 0) {
                if (z10) {
                    return false;
                }
                throw new l("unsupported bit stream revision");
            } else {
                this.f18732a = this.f18738g.l();
                com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar = this.f18738g;
                byte[] bArr = kVar.f19579a;
                int i11 = kVar.f19580b + 1;
                kVar.f19580b = i11;
                int i12 = i11 + 1;
                kVar.f19580b = i12;
                int i13 = i12 + 1;
                kVar.f19580b = i13;
                int i14 = i13 + 1;
                kVar.f19580b = i14;
                int i15 = i14 + 1;
                kVar.f19580b = i15;
                int i16 = i15 + 1;
                kVar.f19580b = i16;
                int i17 = i16 + 1;
                kVar.f19580b = i17;
                kVar.f19580b = i17 + 1;
                this.f18733b = (bArr[i10] & 255) | ((bArr[i11] & 255) << 8) | ((bArr[i12] & 255) << 16) | ((bArr[i13] & 255) << 24) | ((bArr[i14] & 255) << 32) | ((bArr[i15] & 255) << 40) | ((bArr[i16] & 255) << 48) | ((bArr[i17] & 255) << 56);
                kVar.f();
                this.f18738g.f();
                this.f18738g.f();
                int l10 = this.f18738g.l();
                this.f18734c = l10;
                this.f18735d = l10 + 27;
                this.f18738g.r();
                bVar.a(this.f18738g.f19579a, 0, this.f18734c, false);
                for (int i18 = 0; i18 < this.f18734c; i18++) {
                    this.f18737f[i18] = this.f18738g.l();
                    this.f18736e += this.f18737f[i18];
                }
                return true;
            }
        }
        if (z10) {
            return false;
        }
        throw new EOFException();
    }
}
