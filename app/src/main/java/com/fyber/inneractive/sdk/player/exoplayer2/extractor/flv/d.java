package com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.n;
import com.fyber.inneractive.sdk.player.exoplayer2.l;
import com.fyber.inneractive.sdk.player.exoplayer2.util.k;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public final n f18204a;

    /* loaded from: classes.dex */
    public static final class a extends l {
        public a(String str) {
            super(str);
        }
    }

    public d(n nVar) {
        this.f18204a = nVar;
    }

    public final void a(k kVar, long j10) throws l {
        if (a(kVar)) {
            b(kVar, j10);
        }
    }

    public abstract boolean a(k kVar) throws l;

    public abstract void b(k kVar, long j10) throws l;
}
