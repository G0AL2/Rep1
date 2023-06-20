package i9;

import android.os.Handler;
import j8.j3;
import j8.x1;
import java.io.IOException;
import k8.o1;

/* compiled from: MediaSource.java */
/* loaded from: classes2.dex */
public interface u {

    /* compiled from: MediaSource.java */
    /* loaded from: classes2.dex */
    public interface a {
    }

    /* compiled from: MediaSource.java */
    /* loaded from: classes2.dex */
    public static final class b extends s {
        public b(Object obj) {
            super(obj);
        }

        public b c(Object obj) {
            return new b(super.a(obj));
        }

        public b(Object obj, long j10, int i10) {
            super(obj, j10, i10);
        }

        public b(Object obj, int i10, int i11, long j10) {
            super(obj, i10, i11, j10);
        }

        public b(s sVar) {
            super(sVar);
        }
    }

    /* compiled from: MediaSource.java */
    /* loaded from: classes2.dex */
    public interface c {
        void a(u uVar, j3 j3Var);
    }

    void a(Handler handler, b0 b0Var);

    void b(c cVar, da.m0 m0Var, o1 o1Var);

    void c(b0 b0Var);

    x1 d();

    r f(b bVar, da.b bVar2, long j10);

    void g(c cVar);

    void h(c cVar);

    void i(r rVar);

    void k(c cVar);

    void n(Handler handler, com.google.android.exoplayer2.drm.k kVar);

    void o(com.google.android.exoplayer2.drm.k kVar);

    void p() throws IOException;

    boolean q();

    j3 r();
}
