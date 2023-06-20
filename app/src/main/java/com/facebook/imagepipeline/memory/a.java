package com.facebook.imagepipeline.memory;

import android.annotation.TargetApi;
import android.os.SharedMemory;
import android.system.ErrnoException;
import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* compiled from: AshmemMemoryChunk.java */
@TargetApi(27)
/* loaded from: classes.dex */
public class a implements h, Closeable {

    /* renamed from: a  reason: collision with root package name */
    private SharedMemory f14821a;

    /* renamed from: b  reason: collision with root package name */
    private ByteBuffer f14822b;

    /* renamed from: c  reason: collision with root package name */
    private final long f14823c;

    public a(int i10) {
        y3.k.b(Boolean.valueOf(i10 > 0));
        try {
            SharedMemory create = SharedMemory.create("AshmemMemoryChunk", i10);
            this.f14821a = create;
            this.f14822b = create.mapReadWrite();
            this.f14823c = System.identityHashCode(this);
        } catch (ErrnoException e10) {
            throw new RuntimeException("Fail to create AshmemMemory", e10);
        }
    }

    private void l(int i10, h hVar, int i11, int i12) {
        if (hVar instanceof a) {
            y3.k.i(!isClosed());
            y3.k.i(!hVar.isClosed());
            j.b(i10, hVar.getSize(), i11, i12, getSize());
            this.f14822b.position(i10);
            hVar.d().position(i11);
            byte[] bArr = new byte[i12];
            this.f14822b.get(bArr, 0, i12);
            hVar.d().put(bArr, 0, i12);
            return;
        }
        throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
    }

    @Override // com.facebook.imagepipeline.memory.h
    public long a() {
        return this.f14823c;
    }

    @Override // com.facebook.imagepipeline.memory.h
    public synchronized int b(int i10, byte[] bArr, int i11, int i12) {
        int a10;
        y3.k.g(bArr);
        y3.k.i(!isClosed());
        a10 = j.a(i10, i12, getSize());
        j.b(i10, bArr.length, i11, a10, getSize());
        this.f14822b.position(i10);
        this.f14822b.put(bArr, i11, a10);
        return a10;
    }

    @Override // com.facebook.imagepipeline.memory.h
    public synchronized int c(int i10, byte[] bArr, int i11, int i12) {
        int a10;
        y3.k.g(bArr);
        y3.k.i(!isClosed());
        a10 = j.a(i10, i12, getSize());
        j.b(i10, bArr.length, i11, a10, getSize());
        this.f14822b.position(i10);
        this.f14822b.get(bArr, i11, a10);
        return a10;
    }

    @Override // com.facebook.imagepipeline.memory.h, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (!isClosed()) {
            SharedMemory.unmap(this.f14822b);
            this.f14821a.close();
            this.f14822b = null;
            this.f14821a = null;
        }
    }

    @Override // com.facebook.imagepipeline.memory.h
    public ByteBuffer d() {
        return this.f14822b;
    }

    @Override // com.facebook.imagepipeline.memory.h
    public void e(int i10, h hVar, int i11, int i12) {
        y3.k.g(hVar);
        if (hVar.a() == a()) {
            Log.w("AshmemMemoryChunk", "Copying from AshmemMemoryChunk " + Long.toHexString(a()) + " to AshmemMemoryChunk " + Long.toHexString(hVar.a()) + " which are the same ");
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
        if (i10 >= getSize()) {
            z10 = false;
        }
        y3.k.b(Boolean.valueOf(z10));
        return this.f14822b.get(i10);
    }

    @Override // com.facebook.imagepipeline.memory.h
    public int getSize() {
        y3.k.i(!isClosed());
        return this.f14821a.getSize();
    }

    @Override // com.facebook.imagepipeline.memory.h
    public long h() {
        throw new UnsupportedOperationException("Cannot get the pointer of an  AshmemMemoryChunk");
    }

    @Override // com.facebook.imagepipeline.memory.h
    public synchronized boolean isClosed() {
        boolean z10;
        if (this.f14822b != null) {
            z10 = this.f14821a == null;
        }
        return z10;
    }
}
