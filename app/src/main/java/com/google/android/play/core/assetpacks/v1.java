package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class v1 extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    private final Enumeration<File> f23074a;

    /* renamed from: b  reason: collision with root package name */
    private InputStream f23075b;

    public v1(Enumeration<File> enumeration) throws IOException {
        this.f23074a = enumeration;
        a();
    }

    final void a() throws IOException {
        InputStream inputStream = this.f23075b;
        if (inputStream != null) {
            inputStream.close();
        }
        this.f23075b = this.f23074a.hasMoreElements() ? new FileInputStream(this.f23074a.nextElement()) : null;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        InputStream inputStream = this.f23075b;
        if (inputStream != null) {
            inputStream.close();
            this.f23075b = null;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        while (true) {
            InputStream inputStream = this.f23075b;
            if (inputStream == null) {
                return -1;
            }
            int read = inputStream.read();
            if (read != -1) {
                return read;
            }
            a();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f23075b == null) {
            return -1;
        }
        Objects.requireNonNull(bArr);
        if (i10 < 0 || i11 < 0 || i11 > bArr.length - i10) {
            throw new IndexOutOfBoundsException();
        }
        if (i11 != 0) {
            do {
                int read = this.f23075b.read(bArr, i10, i11);
                if (read > 0) {
                    return read;
                }
                a();
            } while (this.f23075b != null);
            return -1;
        }
        return 0;
    }
}
