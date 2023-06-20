package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a;
import java.util.Comparator;
import java.util.TreeSet;

/* loaded from: classes2.dex */
public final class j implements f, Comparator<g> {

    /* renamed from: a  reason: collision with root package name */
    public final TreeSet<g> f19434a = new TreeSet<>(this);

    /* renamed from: b  reason: collision with root package name */
    public long f19435b;

    public j(long j10) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a.b
    public void a(a aVar, g gVar) {
        this.f19434a.remove(gVar);
        this.f19435b -= gVar.f19419c;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a.b
    public void b(a aVar, g gVar) {
        this.f19434a.add(gVar);
        this.f19435b += gVar.f19419c;
        a(aVar, 0L);
    }

    @Override // java.util.Comparator
    public int compare(g gVar, g gVar2) {
        g gVar3 = gVar;
        g gVar4 = gVar2;
        long j10 = gVar3.f19422f;
        long j11 = gVar4.f19422f;
        if (j10 - j11 == 0) {
            return gVar3.compareTo(gVar4);
        }
        return j10 < j11 ? -1 : 1;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a.b
    public void a(a aVar, g gVar, g gVar2) {
        this.f19434a.remove(gVar);
        this.f19435b -= gVar.f19419c;
        b(aVar, gVar2);
    }

    public final void a(a aVar, long j10) {
        while (this.f19435b + j10 > 10485760) {
            try {
                aVar.a(this.f19434a.first());
            } catch (a.C0261a unused) {
            }
        }
    }
}
