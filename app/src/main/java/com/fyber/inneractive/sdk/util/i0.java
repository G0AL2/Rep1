package com.fyber.inneractive.sdk.util;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public class i0 extends BufferedInputStream {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f20289a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(InputStream inputStream, AtomicInteger atomicInteger) {
        super(inputStream);
        this.f20289a = atomicInteger;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) throws IOException {
        int read;
        read = super.read(bArr, i10, i11);
        if (read != -1) {
            this.f20289a.getAndAdd(read);
        }
        return read;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f20289a.set(0);
        super.reset();
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j10) throws IOException {
        long skip;
        skip = super.skip(j10);
        this.f20289a.addAndGet((int) skip);
        return skip;
    }
}
