package com.fyber.inneractive.sdk.player.exoplayer2.util;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class o extends BufferedOutputStream {

    /* renamed from: a  reason: collision with root package name */
    public boolean f19586a;

    public o(OutputStream outputStream) {
        super(outputStream);
    }

    public void a(OutputStream outputStream) {
        a.b(this.f19586a);
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.f19586a = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f19586a = true;
        try {
            flush();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            ((BufferedOutputStream) this).out.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th == null) {
            return;
        }
        int i10 = u.f19606a;
        throw th;
    }

    public o(OutputStream outputStream, int i10) {
        super(outputStream, i10);
    }
}
