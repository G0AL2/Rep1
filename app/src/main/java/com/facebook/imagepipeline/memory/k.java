package com.facebook.imagepipeline.memory;

import java.io.IOException;
import java.io.InputStream;
import y3.p;
import z5.n;

/* compiled from: MemoryPooledByteBufferFactory.java */
/* loaded from: classes.dex */
public class k implements b4.h {

    /* renamed from: a  reason: collision with root package name */
    private final b4.k f14849a;

    /* renamed from: b  reason: collision with root package name */
    private final i f14850b;

    public k(i iVar, b4.k kVar) {
        this.f14850b = iVar;
        this.f14849a = kVar;
    }

    n f(InputStream inputStream, l lVar) throws IOException {
        this.f14849a.a(inputStream, lVar);
        return lVar.a();
    }

    @Override // b4.h
    /* renamed from: g */
    public n a(InputStream inputStream) throws IOException {
        l lVar = new l(this.f14850b);
        try {
            return f(inputStream, lVar);
        } finally {
            lVar.close();
        }
    }

    @Override // b4.h
    /* renamed from: h */
    public n b(InputStream inputStream, int i10) throws IOException {
        l lVar = new l(this.f14850b, i10);
        try {
            return f(inputStream, lVar);
        } finally {
            lVar.close();
        }
    }

    @Override // b4.h
    /* renamed from: i */
    public n d(byte[] bArr) {
        l lVar = new l(this.f14850b, bArr.length);
        try {
            try {
                lVar.write(bArr, 0, bArr.length);
                return lVar.a();
            } catch (IOException e10) {
                throw p.a(e10);
            }
        } finally {
            lVar.close();
        }
    }

    @Override // b4.h
    /* renamed from: j */
    public l c() {
        return new l(this.f14850b);
    }

    @Override // b4.h
    /* renamed from: k */
    public l e(int i10) {
        return new l(this.f14850b, i10);
    }
}
