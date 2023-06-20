package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.exoplayer2.source.f;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.IOException;

/* loaded from: classes2.dex */
public class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f19255a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f19256b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f19257c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ IOException f19258d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ f.a f19259e;

    public d(f.a aVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.j jVar, int i10, int i11, com.fyber.inneractive.sdk.player.exoplayer2.i iVar, int i12, Object obj, long j10, long j11, long j12, long j13, long j14, IOException iOException, boolean z10) {
        this.f19259e = aVar;
        this.f19255a = obj;
        this.f19256b = j10;
        this.f19257c = j11;
        this.f19258d = iOException;
    }

    @Override // java.lang.Runnable
    public void run() {
        f.a aVar = this.f19259e;
        f fVar = aVar.f19264b;
        f.a.a(aVar, this.f19256b);
        f.a.a(this.f19259e, this.f19257c);
        IAlog.a("%s AdaptiveMediaSourceEventListener onLoadError called. with exception %s", ((com.fyber.inneractive.sdk.player.controller.r) fVar).b(), this.f19258d);
    }
}
