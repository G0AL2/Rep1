package k9;

import j8.p1;
import java.io.IOException;
import java.util.List;
import k8.o1;
import p8.a0;

/* compiled from: ChunkExtractor.java */
/* loaded from: classes2.dex */
public interface g {

    /* compiled from: ChunkExtractor.java */
    /* loaded from: classes2.dex */
    public interface a {
        g a(int i10, p1 p1Var, boolean z10, List<p1> list, a0 a0Var, o1 o1Var);
    }

    /* compiled from: ChunkExtractor.java */
    /* loaded from: classes2.dex */
    public interface b {
        a0 f(int i10, int i11);
    }

    boolean a(p8.j jVar) throws IOException;

    void b(b bVar, long j10, long j11);

    p8.d c();

    p1[] d();

    void release();
}
