package p5;

import p5.i;
import p5.s;

/* compiled from: CountingLruBitmapMemoryCacheFactory.java */
/* loaded from: classes.dex */
public class g implements p5.a {

    /* compiled from: CountingLruBitmapMemoryCacheFactory.java */
    /* loaded from: classes.dex */
    class a implements y<w5.c> {
        a(g gVar) {
        }

        @Override // p5.y
        /* renamed from: b */
        public int a(w5.c cVar) {
            return cVar.b();
        }
    }

    @Override // p5.a
    public i<t3.d, w5.c> a(y3.n<t> nVar, b4.c cVar, s.a aVar, i.b<t3.d> bVar) {
        r rVar = new r(new a(this), aVar, nVar, bVar);
        cVar.a(rVar);
        return rVar;
    }
}
