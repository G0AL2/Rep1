package com.facebook.imagepipeline.memory;

import z5.o;
import z5.s;
import z5.t;

/* compiled from: FlexByteArrayPool.java */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private final c4.h<byte[]> f14844a;

    /* renamed from: b  reason: collision with root package name */
    final b f14845b;

    /* compiled from: FlexByteArrayPool.java */
    /* loaded from: classes.dex */
    class a implements c4.h<byte[]> {
        a() {
        }

        @Override // c4.h
        /* renamed from: b */
        public void a(byte[] bArr) {
            f.this.b(bArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FlexByteArrayPool.java */
    /* loaded from: classes.dex */
    public static class b extends g {
        public b(b4.c cVar, s sVar, t tVar) {
            super(cVar, sVar, tVar);
        }

        @Override // com.facebook.imagepipeline.memory.b
        c<byte[]> w(int i10) {
            return new m(o(i10), this.f14826c.f40059e, 0);
        }
    }

    public f(b4.c cVar, s sVar) {
        y3.k.b(Boolean.valueOf(sVar.f40059e > 0));
        this.f14845b = new b(cVar, sVar, o.h());
        this.f14844a = new a();
    }

    public c4.a<byte[]> a(int i10) {
        return c4.a.T(this.f14845b.get(i10), this.f14844a);
    }

    public void b(byte[] bArr) {
        this.f14845b.a(bArr);
    }
}
