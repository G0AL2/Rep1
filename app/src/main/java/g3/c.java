package g3;

import android.view.Surface;
import android.view.SurfaceHolder;
import java.io.FileDescriptor;

/* compiled from: IMediaPlayer.java */
/* loaded from: classes.dex */
public interface c {

    /* compiled from: IMediaPlayer.java */
    /* loaded from: classes.dex */
    public interface a {
        void h(c cVar, int i10);
    }

    /* compiled from: IMediaPlayer.java */
    /* loaded from: classes.dex */
    public interface b {
        void g(c cVar);
    }

    /* compiled from: IMediaPlayer.java */
    /* renamed from: g3.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0392c {
        boolean d(c cVar, int i10, int i11);
    }

    /* compiled from: IMediaPlayer.java */
    /* loaded from: classes.dex */
    public interface d {
        boolean f(c cVar, int i10, int i11);
    }

    /* compiled from: IMediaPlayer.java */
    /* loaded from: classes.dex */
    public interface e {
        void e(c cVar);
    }

    /* compiled from: IMediaPlayer.java */
    /* loaded from: classes.dex */
    public interface f {
        void c(c cVar);
    }

    /* compiled from: IMediaPlayer.java */
    /* loaded from: classes.dex */
    public interface g {
        void i(c cVar, int i10, int i11, int i12, int i13);
    }

    void a(long j10) throws Throwable;

    void a(SurfaceHolder surfaceHolder) throws Throwable;

    void a(f fVar);

    void a(String str) throws Throwable;

    void a(l3.c cVar);

    void a(boolean z10);

    void b(g gVar);

    void b(boolean z10) throws Throwable;

    void c(FileDescriptor fileDescriptor) throws Throwable;

    void c(boolean z10) throws Throwable;

    void d(a aVar);

    void d(boolean z10) throws Throwable;

    void e() throws Throwable;

    void e(b bVar);

    void f() throws Throwable;

    void f(InterfaceC0392c interfaceC0392c);

    void g() throws Throwable;

    void g(d dVar);

    void h();

    void h(Surface surface) throws Throwable;

    long i() throws Throwable;

    void i(e eVar);

    long j() throws Throwable;

    void k() throws Throwable;

    void l() throws Throwable;

    int m();

    int n();
}
