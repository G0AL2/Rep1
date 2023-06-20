package com.bytedance.sdk.component.b.a.a.a;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* compiled from: NetInputStram.java */
/* loaded from: classes.dex */
public class e extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    InputStream f9999a;

    /* renamed from: b  reason: collision with root package name */
    HttpURLConnection f10000b;

    public e(InputStream inputStream, HttpURLConnection httpURLConnection) {
        this.f9999a = inputStream;
        this.f10000b = httpURLConnection;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        InputStream inputStream = this.f9999a;
        if (inputStream != null) {
            return inputStream.available();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.f9999a;
        if (inputStream != null) {
            inputStream.close();
            this.f9999a = null;
        }
        HttpURLConnection httpURLConnection = this.f10000b;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            this.f10000b = null;
        }
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i10) {
        InputStream inputStream = this.f9999a;
        if (inputStream != null) {
            inputStream.mark(i10);
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        InputStream inputStream = this.f9999a;
        if (inputStream != null) {
            return inputStream.markSupported();
        }
        return false;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        InputStream inputStream = this.f9999a;
        if (inputStream != null) {
            return inputStream.read();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        InputStream inputStream = this.f9999a;
        if (inputStream != null) {
            inputStream.reset();
        }
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        InputStream inputStream = this.f9999a;
        if (inputStream != null) {
            return inputStream.skip(j10);
        }
        return 0L;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        InputStream inputStream = this.f9999a;
        if (inputStream != null) {
            return inputStream.read(bArr);
        }
        return 0;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        InputStream inputStream = this.f9999a;
        if (inputStream != null) {
            return inputStream.read(bArr, i10, i11);
        }
        return 0;
    }
}
