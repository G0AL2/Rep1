package com.apm.insight.j;

import android.os.Handler;

/* loaded from: classes.dex */
public abstract class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private Handler f6377a;

    /* renamed from: b  reason: collision with root package name */
    private final long f6378b;

    /* renamed from: c  reason: collision with root package name */
    private final long f6379c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Handler handler, long j10, long j11) {
        this.f6377a = handler;
        this.f6378b = j10;
        this.f6379c = j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        int i10 = (b() > 0L ? 1 : (b() == 0L ? 0 : -1));
        Handler handler = this.f6377a;
        if (i10 > 0) {
            handler.postDelayed(this, b());
        } else {
            handler.post(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(long j10) {
        if (j10 > 0) {
            this.f6377a.postDelayed(this, j10);
        } else {
            this.f6377a.post(this);
        }
    }

    long b() {
        return this.f6378b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long c() {
        return this.f6379c;
    }
}
