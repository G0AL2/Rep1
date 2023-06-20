package com.facebook.imagepipeline.memory;

import java.io.IOException;
import z5.n;

/* compiled from: MemoryPooledByteBufferOutputStream.java */
/* loaded from: classes.dex */
public class l extends b4.j {

    /* renamed from: a  reason: collision with root package name */
    private final i f14851a;

    /* renamed from: b  reason: collision with root package name */
    private c4.a<h> f14852b;

    /* renamed from: c  reason: collision with root package name */
    private int f14853c;

    /* compiled from: MemoryPooledByteBufferOutputStream.java */
    /* loaded from: classes.dex */
    public static class a extends RuntimeException {
        public a() {
            super("OutputStream no longer valid");
        }
    }

    public l(i iVar) {
        this(iVar, iVar.C());
    }

    private void b() {
        if (!c4.a.C(this.f14852b)) {
            throw new a();
        }
    }

    @Override // b4.j, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        c4.a.w(this.f14852b);
        this.f14852b = null;
        this.f14853c = -1;
        super.close();
    }

    void d(int i10) {
        b();
        y3.k.g(this.f14852b);
        if (i10 <= this.f14852b.y().getSize()) {
            return;
        }
        h hVar = this.f14851a.get(i10);
        y3.k.g(this.f14852b);
        this.f14852b.y().e(0, hVar, 0, this.f14853c);
        this.f14852b.close();
        this.f14852b = c4.a.T(hVar, this.f14851a);
    }

    @Override // b4.j
    /* renamed from: e */
    public n a() {
        b();
        return new n((c4.a) y3.k.g(this.f14852b), this.f14853c);
    }

    @Override // b4.j
    public int size() {
        return this.f14853c;
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        write(new byte[]{(byte) i10});
    }

    public l(i iVar, int i10) {
        y3.k.b(Boolean.valueOf(i10 > 0));
        i iVar2 = (i) y3.k.g(iVar);
        this.f14851a = iVar2;
        this.f14853c = 0;
        this.f14852b = c4.a.T(iVar2.get(i10), iVar2);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        if (i10 >= 0 && i11 >= 0 && i10 + i11 <= bArr.length) {
            b();
            d(this.f14853c + i11);
            ((h) ((c4.a) y3.k.g(this.f14852b)).y()).b(this.f14853c, bArr, i10, i11);
            this.f14853c += i11;
            return;
        }
        throw new ArrayIndexOutOfBoundsException("length=" + bArr.length + "; regionStart=" + i10 + "; regionLength=" + i11);
    }
}
