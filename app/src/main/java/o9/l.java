package o9;

import android.net.Uri;
import da.d0;
import i9.b0;
import java.io.IOException;

/* compiled from: HlsPlaylistTracker.java */
/* loaded from: classes2.dex */
public interface l {

    /* compiled from: HlsPlaylistTracker.java */
    /* loaded from: classes2.dex */
    public interface a {
        l a(n9.b bVar, d0 d0Var, k kVar);
    }

    /* compiled from: HlsPlaylistTracker.java */
    /* loaded from: classes2.dex */
    public interface b {
        boolean a(Uri uri, d0.c cVar, boolean z10);

        void j();
    }

    /* compiled from: HlsPlaylistTracker.java */
    /* loaded from: classes2.dex */
    public static final class c extends IOException {
        public c(Uri uri) {
        }
    }

    /* compiled from: HlsPlaylistTracker.java */
    /* loaded from: classes2.dex */
    public static final class d extends IOException {
        public d(Uri uri) {
        }
    }

    /* compiled from: HlsPlaylistTracker.java */
    /* loaded from: classes2.dex */
    public interface e {
        void e(g gVar);
    }

    void a(Uri uri) throws IOException;

    long b();

    h c();

    void d(Uri uri);

    void e(b bVar);

    void f(b bVar);

    void g(Uri uri, b0.a aVar, e eVar);

    boolean h(Uri uri);

    boolean i();

    boolean k(Uri uri, long j10);

    void l() throws IOException;

    g n(Uri uri, boolean z10);

    void stop();
}
