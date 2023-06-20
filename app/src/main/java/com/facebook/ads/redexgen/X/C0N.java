package com.facebook.ads.redexgen.X;

import com.google.android.gms.common.api.Api;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.facebook.ads.redexgen.X.0N  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C0N extends BufferedInputStream {
    public int A00;
    public int A01;
    public boolean A02;

    public C0N(InputStream inputStream) {
        super(inputStream);
        this.A00 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    public final boolean A00() {
        return this.A02;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i10) {
        this.A00 = i10;
        super.mark(i10);
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i10 = this.A01;
        if (i10 + 1 > this.A00) {
            this.A02 = true;
            return -1;
        }
        this.A01 = i10 + 1;
        return super.read();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        if (this.A01 + bArr.length > this.A00) {
            this.A02 = true;
            return -1;
        }
        return super.read(bArr);
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.A01 + i11 > this.A00) {
            this.A02 = true;
            return -1;
        }
        int read = super.read(bArr, i10, i11);
        this.A01 += read;
        return read;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
        this.A00 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        super.reset();
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j10) throws IOException {
        if (this.A01 + j10 > this.A00) {
            this.A02 = true;
            return 0L;
        }
        this.A01 = (int) (this.A01 + j10);
        return super.skip(j10);
    }
}
