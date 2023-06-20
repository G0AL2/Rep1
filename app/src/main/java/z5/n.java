package z5;

import b4.g;

/* compiled from: MemoryPooledByteBuffer.java */
/* loaded from: classes.dex */
public class n implements b4.g {

    /* renamed from: a  reason: collision with root package name */
    private final int f40017a;

    /* renamed from: b  reason: collision with root package name */
    c4.a<com.facebook.imagepipeline.memory.h> f40018b;

    public n(c4.a<com.facebook.imagepipeline.memory.h> aVar, int i10) {
        y3.k.g(aVar);
        y3.k.b(Boolean.valueOf(i10 >= 0 && i10 <= aVar.y().getSize()));
        this.f40018b = aVar.clone();
        this.f40017a = i10;
    }

    synchronized void a() {
        if (isClosed()) {
            throw new g.a();
        }
    }

    @Override // b4.g
    public synchronized int c(int i10, byte[] bArr, int i11, int i12) {
        a();
        y3.k.b(Boolean.valueOf(i10 + i12 <= this.f40017a));
        return this.f40018b.y().c(i10, bArr, i11, i12);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        c4.a.w(this.f40018b);
        this.f40018b = null;
    }

    @Override // b4.g
    public synchronized byte f(int i10) {
        a();
        boolean z10 = true;
        y3.k.b(Boolean.valueOf(i10 >= 0));
        if (i10 >= this.f40017a) {
            z10 = false;
        }
        y3.k.b(Boolean.valueOf(z10));
        return this.f40018b.y().f(i10);
    }

    @Override // b4.g
    public synchronized boolean isClosed() {
        return !c4.a.C(this.f40018b);
    }

    @Override // b4.g
    public synchronized int size() {
        a();
        return this.f40017a;
    }
}
