package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.cache.h;
import com.fyber.inneractive.sdk.player.exoplayer2.source.l;
import java.io.IOException;

/* loaded from: classes2.dex */
public class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ IOException f19312a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i f19313b;

    public k(i iVar, IOException iOException) {
        this.f19313b = iVar;
        this.f19312a = iOException;
    }

    @Override // java.lang.Runnable
    public void run() {
        l.a aVar = this.f19313b.f19271e;
        IOException iOException = this.f19312a;
        com.fyber.inneractive.sdk.player.controller.r rVar = (com.fyber.inneractive.sdk.player.controller.r) aVar;
        if (rVar.f17943a != null && (iOException.getCause() instanceof h.f) && rVar.f17943a.get().B) {
            rVar.f17943a.get().a(rVar.f17943a.get().E, rVar.f17943a.get().D, false);
        }
    }
}
