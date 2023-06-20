package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import com.inmobi.media.fq;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class i extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    public final g f19456a;

    /* renamed from: b  reason: collision with root package name */
    public final j f19457b;

    /* renamed from: f  reason: collision with root package name */
    public long f19461f;

    /* renamed from: d  reason: collision with root package name */
    public boolean f19459d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f19460e = false;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f19458c = new byte[1];

    public i(g gVar, j jVar) {
        this.f19456a = gVar;
        this.f19457b = jVar;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f19460e) {
            return;
        }
        this.f19456a.close();
        this.f19460e = true;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.f19458c) == -1) {
            return -1;
        }
        return this.f19458c[0] & fq.i.NETWORK_LOAD_LIMIT_DISABLED;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(!this.f19460e);
        if (!this.f19459d) {
            this.f19456a.a(this.f19457b);
            this.f19459d = true;
        }
        int a10 = this.f19456a.a(bArr, i10, i11);
        if (a10 == -1) {
            return -1;
        }
        this.f19461f += a10;
        return a10;
    }
}
