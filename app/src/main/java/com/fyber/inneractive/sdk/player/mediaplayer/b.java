package com.fyber.inneractive.sdk.player.mediaplayer;

import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes2.dex */
public class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f19741a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f19742b;

    public b(a aVar, int i10) {
        this.f19742b = aVar;
        this.f19741a = i10;
    }

    @Override // java.lang.Runnable
    public void run() {
        a aVar = this.f19742b;
        int i10 = this.f19741a;
        String c10 = aVar.c();
        long currentTimeMillis = System.currentTimeMillis();
        aVar.seekTo(i10);
        IAlog.d(c10 + "timelog: seekTo took " + (System.currentTimeMillis() - currentTimeMillis) + " msec", new Object[0]);
    }
}
