package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import com.fyber.inneractive.sdk.player.exoplayer2.o;
import com.fyber.inneractive.sdk.player.exoplayer2.source.s;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final s f19370a;

    /* renamed from: b  reason: collision with root package name */
    public final f f19371b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f19372c;

    /* renamed from: d  reason: collision with root package name */
    public final o[] f19373d;

    public h(s sVar, f fVar, Object obj, o[] oVarArr) {
        this.f19370a = sVar;
        this.f19371b = fVar;
        this.f19372c = obj;
        this.f19373d = oVarArr;
    }

    public boolean a(h hVar, int i10) {
        return hVar != null && u.a(this.f19371b.f19368b[i10], hVar.f19371b.f19368b[i10]) && u.a(this.f19373d[i10], hVar.f19373d[i10]);
    }
}
