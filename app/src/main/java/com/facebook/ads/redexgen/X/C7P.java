package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.facebook.ads.redexgen.X.7P  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C7P implements Callable<Boolean> {
    public final BlockingQueue<Boolean> A00 = new LinkedBlockingQueue();
    public final /* synthetic */ C7U A01;

    public C7P(C7U c7u, C7Q c7q) {
        this.A01 = c7u;
        new Handler(Looper.getMainLooper()).post(new Y0(this, c7u, c7q));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: A00 */
    public final Boolean call() throws Exception {
        return this.A00.take();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(C7Q c7q) {
        C8U c8u;
        C8U c8u2;
        long currentTimeMillis = System.currentTimeMillis();
        c8u = this.A01.A04;
        C1208Qk A05 = C1208Qk.A05(c8u.A00());
        Uri A00 = C1070La.A00(c7q.A08);
        long j10 = c7q.A00;
        if (j10 == -1) {
            c8u2 = this.A01.A04;
            j10 = JR.A0M(c8u2);
        }
        A05.A0G(A00, new C1401Xz(this, c7q, j10, currentTimeMillis), j10);
    }
}
