package com.facebook.react.modules.network;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: CountingOutputStream.java */
/* loaded from: classes.dex */
public class b extends FilterOutputStream {

    /* renamed from: a  reason: collision with root package name */
    private long f15581a;

    public b(OutputStream outputStream) {
        super(outputStream);
        this.f15581a = 0L;
    }

    public long a() {
        return this.f15581a;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i10, i11);
        this.f15581a += i11;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) throws IOException {
        ((FilterOutputStream) this).out.write(i10);
        this.f15581a++;
    }
}
