package com.facebook.imagepipeline.memory;

import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* compiled from: BufferMemoryChunk.java */
/* loaded from: classes.dex */
public class e implements h, Closeable {

    /* renamed from: a  reason: collision with root package name */
    private ByteBuffer f14841a;

    /* renamed from: b  reason: collision with root package name */
    private final int f14842b;

    /* renamed from: c  reason: collision with root package name */
    private final long f14843c = System.identityHashCode(this);

    public e(int i10) {
        this.f14841a = ByteBuffer.allocateDirect(i10);
        this.f14842b = i10;
    }

    private void l(int i10, h hVar, int i11, int i12) {
        if (hVar instanceof e) {
            y3.k.i(!isClosed());
            y3.k.i(!hVar.isClosed());
            j.b(i10, hVar.getSize(), i11, i12, this.f14842b);
            this.f14841a.position(i10);
            hVar.d().position(i11);
            byte[] bArr = new byte[i12];
            this.f14841a.get(bArr, 0, i12);
            hVar.d().put(bArr, 0, i12);
            return;
        }
        throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
    }

    @Override // com.facebook.imagepipeline.memory.h
    public long a() {
        return this.f14843c;
    }

    @Override // com.facebook.imagepipeline.memory.h
    public synchronized int b(int i10, byte[] bArr, int i11, int i12) {
        int a10;
        y3.k.g(bArr);
        y3.k.i(!isClosed());
        a10 = j.a(i10, i12, this.f14842b);
        j.b(i10, bArr.length, i11, a10, this.f14842b);
        this.f14841a.position(i10);
        this.f14841a.put(bArr, i11, a10);
        return a10;
    }

    @Override // com.facebook.imagepipeline.memory.h
    public synchronized int c(int i10, byte[] bArr, int i11, int i12) {
        int a10;
        y3.k.g(bArr);
        y3.k.i(!isClosed());
        a10 = j.a(i10, i12, this.f14842b);
        j.b(i10, bArr.length, i11, a10, this.f14842b);
        this.f14841a.position(i10);
        this.f14841a.get(bArr, i11, a10);
        return a10;
    }

    @Override // com.facebook.imagepipeline.memory.h, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f14841a = null;
    }

    @Override // com.facebook.imagepipeline.memory.h
    public synchronized ByteBuffer d() {
        return this.f14841a;
    }

    @Override // com.facebook.imagepipeline.memory.h
    public void e(int i10, h hVar, int i11, int i12) {
        y3.k.g(hVar);
        if (hVar.a() == a()) {
            Log.w("BufferMemoryChunk", "Copying from BufferMemoryChunk " + Long.toHexString(a()) + " to BufferMemoryChunk " + Long.toHexString(hVar.a()) + " which are the same ");
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
        if (i10 >= this.f14842b) {
            z10 = false;
        }
        y3.k.b(Boolean.valueOf(z10));
        return this.f14841a.get(i10);
    }

    @Override // com.facebook.imagepipeline.memory.h
    public int getSize() {
        return this.f14842b;
    }

    @Override // com.facebook.imagepipeline.memory.h
    public long h() {
        throw new UnsupportedOperationException("Cannot get the pointer of a BufferMemoryChunk");
    }

    @Override // com.facebook.imagepipeline.memory.h
    public synchronized boolean isClosed() {
        return this.f14841a == null;
    }
}
