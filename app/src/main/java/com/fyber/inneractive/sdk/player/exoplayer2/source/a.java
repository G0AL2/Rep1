package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.exoplayer2.source.f;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes2.dex */
public class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f19231a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f19232b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f19233c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ f.a f19234d;

    public a(f.a aVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.j jVar, int i10, int i11, com.fyber.inneractive.sdk.player.exoplayer2.i iVar, int i12, Object obj, long j10, long j11, long j12) {
        this.f19234d = aVar;
        this.f19231a = obj;
        this.f19232b = j10;
        this.f19233c = j11;
    }

    @Override // java.lang.Runnable
    public void run() {
        f.a aVar = this.f19234d;
        f fVar = aVar.f19264b;
        f.a.a(aVar, this.f19232b);
        f.a.a(this.f19234d, this.f19233c);
        IAlog.a("%s AdaptiveMediaSourceEventListener onLoadStarted called.", ((com.fyber.inneractive.sdk.player.controller.r) fVar).b());
    }
}
