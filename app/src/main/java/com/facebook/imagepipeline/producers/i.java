package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;

/* compiled from: BitmapPrepareProducer.java */
/* loaded from: classes.dex */
public class i implements o0<c4.a<w5.c>> {

    /* renamed from: a  reason: collision with root package name */
    private final o0<c4.a<w5.c>> f14972a;

    /* renamed from: b  reason: collision with root package name */
    private final int f14973b;

    /* renamed from: c  reason: collision with root package name */
    private final int f14974c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f14975d;

    /* compiled from: BitmapPrepareProducer.java */
    /* loaded from: classes.dex */
    private static class a extends p<c4.a<w5.c>, c4.a<w5.c>> {

        /* renamed from: c  reason: collision with root package name */
        private final int f14976c;

        /* renamed from: d  reason: collision with root package name */
        private final int f14977d;

        a(l<c4.a<w5.c>> lVar, int i10, int i11) {
            super(lVar);
            this.f14976c = i10;
            this.f14977d = i11;
        }

        private void q(c4.a<w5.c> aVar) {
            w5.c y10;
            Bitmap l10;
            int rowBytes;
            if (aVar == null || !aVar.A() || (y10 = aVar.y()) == null || y10.isClosed() || !(y10 instanceof w5.d) || (l10 = ((w5.d) y10).l()) == null || (rowBytes = l10.getRowBytes() * l10.getHeight()) < this.f14976c || rowBytes > this.f14977d) {
                return;
            }
            l10.prepareToDraw();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: r */
        public void i(c4.a<w5.c> aVar, int i10) {
            q(aVar);
            p().c(aVar, i10);
        }
    }

    public i(o0<c4.a<w5.c>> o0Var, int i10, int i11, boolean z10) {
        y3.k.b(Boolean.valueOf(i10 <= i11));
        this.f14972a = (o0) y3.k.g(o0Var);
        this.f14973b = i10;
        this.f14974c = i11;
        this.f14975d = z10;
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public void b(l<c4.a<w5.c>> lVar, p0 p0Var) {
        if (p0Var.m() && !this.f14975d) {
            this.f14972a.b(lVar, p0Var);
        } else {
            this.f14972a.b(new a(lVar, this.f14973b, this.f14974c), p0Var);
        }
    }
}
