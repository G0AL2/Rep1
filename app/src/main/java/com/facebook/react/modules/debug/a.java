package com.facebook.react.modules.debug;

import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import h6.d;

/* compiled from: DidJSUpdateUiDuringFrameDetector.java */
/* loaded from: classes.dex */
public class a implements NotThreadSafeBridgeIdleDebugListener, y6.a {

    /* renamed from: a  reason: collision with root package name */
    private final d f15520a = d.b(20);

    /* renamed from: b  reason: collision with root package name */
    private final d f15521b = d.b(20);

    /* renamed from: c  reason: collision with root package name */
    private final d f15522c = d.b(20);

    /* renamed from: d  reason: collision with root package name */
    private final d f15523d = d.b(20);

    /* renamed from: e  reason: collision with root package name */
    private volatile boolean f15524e = true;

    private static void c(d dVar, long j10) {
        int g10 = dVar.g();
        int i10 = 0;
        for (int i11 = 0; i11 < g10; i11++) {
            if (dVar.d(i11) < j10) {
                i10++;
            }
        }
        if (i10 > 0) {
            for (int i12 = 0; i12 < g10 - i10; i12++) {
                dVar.f(i12, dVar.d(i12 + i10));
            }
            dVar.c(i10);
        }
    }

    private boolean d(long j10, long j11) {
        long f10 = f(this.f15520a, j10, j11);
        long f11 = f(this.f15521b, j10, j11);
        if (f10 == -1 && f11 == -1) {
            return this.f15524e;
        }
        return f10 > f11;
    }

    private static long f(d dVar, long j10, long j11) {
        long j12 = -1;
        for (int i10 = 0; i10 < dVar.g(); i10++) {
            long d10 = dVar.d(i10);
            if (d10 >= j10 && d10 < j11) {
                j12 = d10;
            } else if (d10 >= j11) {
                break;
            }
        }
        return j12;
    }

    private static boolean g(d dVar, long j10, long j11) {
        for (int i10 = 0; i10 < dVar.g(); i10++) {
            long d10 = dVar.d(i10);
            if (d10 >= j10 && d10 < j11) {
                return true;
            }
        }
        return false;
    }

    @Override // y6.a
    public synchronized void a() {
        this.f15523d.a(System.nanoTime());
    }

    @Override // y6.a
    public synchronized void b() {
        this.f15522c.a(System.nanoTime());
    }

    public synchronized boolean e(long j10, long j11) {
        boolean z10;
        boolean g10 = g(this.f15523d, j10, j11);
        boolean d10 = d(j10, j11);
        z10 = true;
        if (!g10 && (!d10 || g(this.f15522c, j10, j11))) {
            z10 = false;
        }
        c(this.f15520a, j11);
        c(this.f15521b, j11);
        c(this.f15522c, j11);
        c(this.f15523d, j11);
        this.f15524e = d10;
        return z10;
    }

    @Override // com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener
    public synchronized void onBridgeDestroyed() {
    }

    @Override // com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener
    public synchronized void onTransitionToBridgeBusy() {
        this.f15521b.a(System.nanoTime());
    }

    @Override // com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener
    public synchronized void onTransitionToBridgeIdle() {
        this.f15520a.a(System.nanoTime());
    }
}
