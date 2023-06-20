package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.io.Closeable;
import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class M3 implements Closeable {
    @Nullable
    public M2 A00;
    public boolean A01;
    public final M1 A02;
    public final Runnable A03;

    public M3(long j10, Runnable runnable) {
        this.A02 = new M1(j10);
        this.A02.A02();
        this.A03 = runnable;
        this.A01 = false;
    }

    private final synchronized void A03() {
        if (this.A00 == null && !this.A01) {
            this.A00 = new M2(this);
        }
    }

    public final M1 A04() {
        return this.A02;
    }

    public final synchronized void A05() {
        if (this.A01) {
            return;
        }
        if (this.A00 == null) {
            this.A00 = new M2(this);
        }
        this.A00.A00();
    }

    public final synchronized void A06() {
        if (this.A02.A05() && !this.A01) {
            A03();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        M2 m22;
        synchronized (this) {
            this.A01 = true;
            m22 = this.A00;
        }
        if (m22 != null) {
            m22.close();
        }
    }
}
