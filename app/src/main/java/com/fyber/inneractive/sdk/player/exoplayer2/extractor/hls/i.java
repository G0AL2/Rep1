package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.d;
import com.fyber.inneractive.sdk.player.exoplayer2.source.f;
import com.fyber.inneractive.sdk.player.exoplayer2.source.o;
import java.io.IOException;

/* loaded from: classes.dex */
public final class i implements o {

    /* renamed from: a  reason: collision with root package name */
    public final int f18275a;

    /* renamed from: b  reason: collision with root package name */
    public final j f18276b;

    public i(j jVar, int i10) {
        this.f18276b = jVar;
        this.f18275a = i10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.o
    public void a() throws IOException {
        this.f18276b.j();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.o
    public boolean isReady() {
        j jVar = this.f18276b;
        return jVar.f18301y || !(jVar.h() || jVar.f18286j.valueAt(this.f18275a).f());
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.o
    public int a(com.fyber.inneractive.sdk.player.exoplayer2.j jVar, com.fyber.inneractive.sdk.player.exoplayer2.decoder.b bVar, boolean z10) {
        j jVar2 = this.f18276b;
        int i10 = this.f18275a;
        if (jVar2.h()) {
            return -3;
        }
        while (true) {
            boolean z11 = true;
            if (jVar2.f18287k.size() <= 1) {
                break;
            }
            int i11 = jVar2.f18287k.getFirst().f18237j;
            int i12 = 0;
            while (true) {
                if (i12 >= jVar2.f18286j.size()) {
                    break;
                }
                if (jVar2.f18298v[i12]) {
                    d.c cVar = jVar2.f18286j.valueAt(i12).f18151c;
                    if ((cVar.f18175i == 0 ? cVar.f18184r : cVar.f18168b[cVar.f18177k]) == i11) {
                        z11 = false;
                        break;
                    }
                }
                i12++;
            }
            if (!z11) {
                break;
            }
            jVar2.f18287k.removeFirst();
        }
        f first = jVar2.f18287k.getFirst();
        com.fyber.inneractive.sdk.player.exoplayer2.i iVar = first.f19245c;
        if (!iVar.equals(jVar2.f18293q)) {
            f.a aVar = jVar2.f18284h;
            int i13 = jVar2.f18277a;
            int i14 = first.f19246d;
            Object obj = first.f19247e;
            long j10 = first.f19248f;
            if (aVar.f19264b != null) {
                aVar.f19263a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.e(aVar, i13, iVar, i14, obj, j10));
            }
        }
        jVar2.f18293q = iVar;
        return jVar2.f18286j.valueAt(i10).a(jVar, bVar, z10, jVar2.f18301y, jVar2.f18299w);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.o
    public void a(long j10) {
        j jVar = this.f18276b;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.d valueAt = jVar.f18286j.valueAt(this.f18275a);
        if (jVar.f18301y && j10 > valueAt.d()) {
            valueAt.g();
        } else {
            valueAt.a(j10, true);
        }
    }
}
