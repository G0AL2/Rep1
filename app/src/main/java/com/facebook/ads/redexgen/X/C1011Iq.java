package com.facebook.ads.redexgen.X;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.facebook.ads.redexgen.X.Iq  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1011Iq extends BufferedOutputStream {
    public boolean A00;

    public C1011Iq(OutputStream outputStream) {
        super(outputStream);
    }

    public C1011Iq(OutputStream outputStream, int i10) {
        super(outputStream, i10);
    }

    public final void A00(OutputStream outputStream) {
        IK.A04(this.A00);
        this.out = outputStream;
        this.count = 0;
        this.A00 = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.A00 = true;
        Throwable th = null;
        try {
            flush();
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.out.close();
        } catch (Throwable e10) {
            if (th == null) {
                th = e10;
            }
        }
        if (th != null) {
            C1020Iz.A0Y(th);
        }
    }
}
