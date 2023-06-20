package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final e f18726a = new e();

    /* renamed from: b  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.k f18727b = new com.fyber.inneractive.sdk.player.exoplayer2.util.k(new byte[65025], 0);

    /* renamed from: c  reason: collision with root package name */
    public int f18728c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f18729d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f18730e;

    public boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar) throws IOException, InterruptedException {
        int i10;
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(gVar != null);
        if (this.f18730e) {
            this.f18730e = false;
            this.f18727b.r();
        }
        while (!this.f18730e) {
            if (this.f18728c < 0) {
                if (!this.f18726a.a(gVar, true)) {
                    return false;
                }
                e eVar = this.f18726a;
                int i11 = eVar.f18735d;
                if ((eVar.f18732a & 1) == 1 && this.f18727b.f19581c == 0) {
                    i11 += a(0);
                    i10 = this.f18729d + 0;
                } else {
                    i10 = 0;
                }
                ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar).c(i11);
                this.f18728c = i10;
            }
            int a10 = a(this.f18728c);
            int i12 = this.f18728c + this.f18729d;
            if (a10 > 0) {
                int b10 = this.f18727b.b();
                com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar = this.f18727b;
                int i13 = kVar.f19581c + a10;
                if (b10 < i13) {
                    kVar.f19579a = Arrays.copyOf(kVar.f19579a, i13);
                }
                com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar2 = this.f18727b;
                ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar).b(kVar2.f19579a, kVar2.f19581c, a10, false);
                com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar3 = this.f18727b;
                kVar3.d(kVar3.f19581c + a10);
                this.f18730e = this.f18726a.f18737f[i12 + (-1)] != 255;
            }
            if (i12 == this.f18726a.f18734c) {
                i12 = -1;
            }
            this.f18728c = i12;
        }
        return true;
    }

    public final int a(int i10) {
        int i11;
        int i12 = 0;
        this.f18729d = 0;
        do {
            int i13 = this.f18729d;
            int i14 = i10 + i13;
            e eVar = this.f18726a;
            if (i14 >= eVar.f18734c) {
                break;
            }
            int[] iArr = eVar.f18737f;
            this.f18729d = i13 + 1;
            i11 = iArr[i14];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }
}
