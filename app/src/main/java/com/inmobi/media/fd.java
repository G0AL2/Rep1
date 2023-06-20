package com.inmobi.media;

import android.media.MediaPlayer;

/* compiled from: NativeMediaPlayer.java */
/* loaded from: classes3.dex */
public final class fd extends MediaPlayer {

    /* renamed from: d  reason: collision with root package name */
    private static final Object f25378d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private static fd f25379e;

    /* renamed from: f  reason: collision with root package name */
    private static int f25380f;

    /* renamed from: a  reason: collision with root package name */
    public int f25381a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f25382b = 0;

    /* renamed from: c  reason: collision with root package name */
    private fd f25383c;

    public static fd a() {
        synchronized (f25378d) {
            fd fdVar = f25379e;
            if (fdVar != null) {
                f25379e = fdVar.f25383c;
                fdVar.f25383c = null;
                f25380f--;
                return fdVar;
            }
            return new fd();
        }
    }

    public final void b() {
        if (3 == this.f25381a) {
            return;
        }
        synchronized (f25378d) {
            int i10 = f25380f;
            if (i10 < 5) {
                this.f25383c = f25379e;
                f25379e = this;
                f25380f = i10 + 1;
            }
        }
    }
}
