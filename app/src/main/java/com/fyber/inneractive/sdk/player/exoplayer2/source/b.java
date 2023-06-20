package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.exoplayer2.source.f;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes2.dex */
public class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f19235a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f19236b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f19237c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ f.a f19238d;

    public b(f.a aVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.j jVar, int i10, int i11, com.fyber.inneractive.sdk.player.exoplayer2.i iVar, int i12, Object obj, long j10, long j11, long j12, long j13, long j14) {
        this.f19238d = aVar;
        this.f19235a = obj;
        this.f19236b = j10;
        this.f19237c = j11;
    }

    @Override // java.lang.Runnable
    public void run() {
        f.a aVar = this.f19238d;
        f fVar = aVar.f19264b;
        f.a.a(aVar, this.f19236b);
        f.a.a(this.f19238d, this.f19237c);
        IAlog.a("%s AdaptiveMediaSourceEventListener onLoadCompleted called.", ((com.fyber.inneractive.sdk.player.controller.r) fVar).b());
    }
}
