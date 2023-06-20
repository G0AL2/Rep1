package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.exoplayer2.source.f;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes2.dex */
public class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f19260a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f19261b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ f.a f19262c;

    public e(f.a aVar, int i10, com.fyber.inneractive.sdk.player.exoplayer2.i iVar, int i11, Object obj, long j10) {
        this.f19262c = aVar;
        this.f19260a = obj;
        this.f19261b = j10;
    }

    @Override // java.lang.Runnable
    public void run() {
        f.a aVar = this.f19262c;
        f fVar = aVar.f19264b;
        f.a.a(aVar, this.f19261b);
        IAlog.a("%s AdaptiveMediaSourceEventListener onDownstreamFormatChanged called.", ((com.fyber.inneractive.sdk.player.controller.r) fVar).b());
    }
}
