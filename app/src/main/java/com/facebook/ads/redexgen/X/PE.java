package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: assets/audience_network.dex */
public final class PE extends InputStream {
    public int A00;
    public long A01;
    public InterfaceC0975He A02;
    public final Uri A03;
    public final C1399Xx A04;
    public final InterfaceC0974Hd A05;
    @Nullable
    public final String A06;

    public PE(C1399Xx c1399Xx, Uri uri, InterfaceC0974Hd interfaceC0974Hd) throws IOException {
        this.A04 = c1399Xx;
        this.A05 = interfaceC0974Hd;
        this.A03 = uri;
        this.A06 = C1208Qk.A08(this.A04, this.A03);
        A00(0);
    }

    private void A00(int i10) throws IOException {
        InterfaceC0975He interfaceC0975He = this.A02;
        if (interfaceC0975He != null) {
            interfaceC0975He.close();
        }
        this.A02 = this.A05.A4E();
        this.A01 = (int) this.A02.ACw(new C0979Hi(this.A03, i10, -1L, this.A06));
    }

    @Override // java.io.InputStream
    public final int available() {
        return ((int) this.A01) - this.A00;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.A02.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        return read(new byte[1]);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int read = this.A02.read(bArr, i10, i11);
        this.A00 += read;
        return read;
    }

    @Override // java.io.InputStream
    public final long skip(long j10) throws IOException {
        long j11 = this.A01 - this.A00;
        if (j11 <= 0) {
            return 0L;
        }
        if (j10 > j11) {
            j10 = j11;
        }
        this.A00 = (int) (this.A00 + j10);
        A00(this.A00);
        return j10;
    }
}
