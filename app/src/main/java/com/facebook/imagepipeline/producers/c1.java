package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.image.EncodedImage;

/* compiled from: ThumbnailBranchProducer.java */
/* loaded from: classes.dex */
public class c1 implements o0<w5.e> {

    /* renamed from: a  reason: collision with root package name */
    private final d1<EncodedImage>[] f14917a;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ThumbnailBranchProducer.java */
    /* loaded from: classes.dex */
    public class a extends p<w5.e, w5.e> {

        /* renamed from: c  reason: collision with root package name */
        private final p0 f14918c;

        /* renamed from: d  reason: collision with root package name */
        private final int f14919d;

        /* renamed from: e  reason: collision with root package name */
        private final q5.e f14920e;

        public a(l<w5.e> lVar, p0 p0Var, int i10) {
            super(lVar);
            this.f14918c = p0Var;
            this.f14919d = i10;
            this.f14920e = p0Var.k().m();
        }

        @Override // com.facebook.imagepipeline.producers.p, com.facebook.imagepipeline.producers.b
        protected void h(Throwable th) {
            if (c1.this.e(this.f14919d + 1, p(), this.f14918c)) {
                return;
            }
            p().b(th);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: q */
        public void i(w5.e eVar, int i10) {
            if (eVar != null && (b.f(i10) || e1.c(eVar, this.f14920e))) {
                p().c(eVar, i10);
            } else if (b.e(i10)) {
                w5.e.d(eVar);
                if (c1.this.e(this.f14919d + 1, p(), this.f14918c)) {
                    return;
                }
                p().c(null, 1);
            }
        }
    }

    public c1(d1<EncodedImage>... d1VarArr) {
        d1<EncodedImage>[] d1VarArr2 = (d1[]) y3.k.g(d1VarArr);
        this.f14917a = d1VarArr2;
        y3.k.e(0, d1VarArr2.length);
    }

    private int d(int i10, q5.e eVar) {
        while (true) {
            d1<EncodedImage>[] d1VarArr = this.f14917a;
            if (i10 >= d1VarArr.length) {
                return -1;
            }
            if (d1VarArr[i10].a(eVar)) {
                return i10;
            }
            i10++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(int i10, l<w5.e> lVar, p0 p0Var) {
        int d10 = d(i10, p0Var.k().m());
        if (d10 == -1) {
            return false;
        }
        this.f14917a[d10].b(new a(lVar, p0Var, d10), p0Var);
        return true;
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public void b(l<w5.e> lVar, p0 p0Var) {
        if (p0Var.k().m() == null) {
            lVar.c(null, 1);
        } else if (e(0, lVar, p0Var)) {
        } else {
            lVar.c(null, 1);
        }
    }
}
