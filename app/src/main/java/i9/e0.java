package i9;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import k8.o1;

/* compiled from: ProgressiveMediaExtractor.java */
/* loaded from: classes2.dex */
public interface e0 {

    /* compiled from: ProgressiveMediaExtractor.java */
    /* loaded from: classes2.dex */
    public interface a {
        e0 a(o1 o1Var);
    }

    void a(long j10, long j11);

    void b();

    void c(da.i iVar, Uri uri, Map<String, List<String>> map, long j10, long j11, p8.k kVar) throws IOException;

    long d();

    int e(p8.w wVar) throws IOException;

    void release();
}
