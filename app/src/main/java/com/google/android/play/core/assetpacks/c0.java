package com.google.android.play.core.assetpacks;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
final class c0 extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    private final InputStream f22780a;

    /* renamed from: b  reason: collision with root package name */
    private long f22781b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c0(InputStream inputStream, long j10) {
        this.f22780a = inputStream;
        this.f22781b = j10;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        this.f22780a.close();
        this.f22781b = 0L;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        long j10 = this.f22781b;
        if (j10 <= 0) {
            return -1;
        }
        this.f22781b = j10 - 1;
        return this.f22780a.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        long j10 = this.f22781b;
        if (j10 <= 0) {
            return -1;
        }
        int read = this.f22780a.read(bArr, i10, (int) Math.min(i11, j10));
        if (read != -1) {
            this.f22781b -= read;
        }
        return read;
    }
}
