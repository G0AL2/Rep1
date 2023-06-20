package com.facebook.imagepipeline.memory;

import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;

@y3.d
/* loaded from: classes.dex */
public class NativeMemoryChunk implements h, Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final long f14818a;

    /* renamed from: b  reason: collision with root package name */
    private final int f14819b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f14820c;

    static {
        i7.a.d("imagepipeline");
    }

    public NativeMemoryChunk(int i10) {
        y3.k.b(Boolean.valueOf(i10 > 0));
        this.f14819b = i10;
        this.f14818a = nativeAllocate(i10);
        this.f14820c = false;
    }

    private void l(int i10, h hVar, int i11, int i12) {
        if (hVar instanceof NativeMemoryChunk) {
            y3.k.i(!isClosed());
            y3.k.i(!hVar.isClosed());
            j.b(i10, hVar.getSize(), i11, i12, this.f14819b);
            nativeMemcpy(hVar.h() + i11, this.f14818a + i10, i12);
            return;
        }
        throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
    }

    @y3.d
    private static native long nativeAllocate(int i10);

    @y3.d
    private static native void nativeCopyFromByteArray(long j10, byte[] bArr, int i10, int i11);

    @y3.d
    private static native void nativeCopyToByteArray(long j10, byte[] bArr, int i10, int i11);

    @y3.d
    private static native void nativeFree(long j10);

    @y3.d
    private static native void nativeMemcpy(long j10, long j11, int i10);

    @y3.d
    private static native byte nativeReadByte(long j10);

    @Override // com.facebook.imagepipeline.memory.h
    public long a() {
        return this.f14818a;
    }

    @Override // com.facebook.imagepipeline.memory.h
    public synchronized int b(int i10, byte[] bArr, int i11, int i12) {
        int a10;
        y3.k.g(bArr);
        y3.k.i(!isClosed());
        a10 = j.a(i10, i12, this.f14819b);
        j.b(i10, bArr.length, i11, a10, this.f14819b);
        nativeCopyFromByteArray(this.f14818a + i10, bArr, i11, a10);
        return a10;
    }

    @Override // com.facebook.imagepipeline.memory.h
    public synchronized int c(int i10, byte[] bArr, int i11, int i12) {
        int a10;
        y3.k.g(bArr);
        y3.k.i(!isClosed());
        a10 = j.a(i10, i12, this.f14819b);
        j.b(i10, bArr.length, i11, a10, this.f14819b);
        nativeCopyToByteArray(this.f14818a + i10, bArr, i11, a10);
        return a10;
    }

    @Override // com.facebook.imagepipeline.memory.h, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (!this.f14820c) {
            this.f14820c = true;
            nativeFree(this.f14818a);
        }
    }

    @Override // com.facebook.imagepipeline.memory.h
    public ByteBuffer d() {
        return null;
    }

    @Override // com.facebook.imagepipeline.memory.h
    public void e(int i10, h hVar, int i11, int i12) {
        y3.k.g(hVar);
        if (hVar.a() == a()) {
            Log.w("NativeMemoryChunk", "Copying from NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(this)) + " to NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(hVar)) + " which share the same address " + Long.toHexString(this.f14818a));
            y3.k.b(Boolean.FALSE);
        }
        if (hVar.a() < a()) {
            synchronized (hVar) {
                synchronized (this) {
                    l(i10, hVar, i11, i12);
                }
            }
            return;
        }
        synchronized (this) {
            synchronized (hVar) {
                l(i10, hVar, i11, i12);
            }
        }
    }

    @Override // com.facebook.imagepipeline.memory.h
    public synchronized byte f(int i10) {
        boolean z10 = true;
        y3.k.i(!isClosed());
        y3.k.b(Boolean.valueOf(i10 >= 0));
        if (i10 >= this.f14819b) {
            z10 = false;
        }
        y3.k.b(Boolean.valueOf(z10));
        return nativeReadByte(this.f14818a + i10);
    }

    protected void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        Log.w("NativeMemoryChunk", "finalize: Chunk " + Integer.toHexString(System.identityHashCode(this)) + " still active. ");
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // com.facebook.imagepipeline.memory.h
    public int getSize() {
        return this.f14819b;
    }

    @Override // com.facebook.imagepipeline.memory.h
    public long h() {
        return this.f14818a;
    }

    @Override // com.facebook.imagepipeline.memory.h
    public synchronized boolean isClosed() {
        return this.f14820c;
    }

    public NativeMemoryChunk() {
        this.f14819b = 0;
        this.f14818a = 0L;
        this.f14820c = true;
    }
}
