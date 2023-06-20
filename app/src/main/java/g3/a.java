package g3;

import g3.c;

/* compiled from: AbstractMediaPlayer.java */
/* loaded from: classes.dex */
public abstract class a implements c {

    /* renamed from: a  reason: collision with root package name */
    private c.e f30529a;

    /* renamed from: b  reason: collision with root package name */
    private c.b f30530b;

    /* renamed from: c  reason: collision with root package name */
    private c.a f30531c;

    /* renamed from: d  reason: collision with root package name */
    private c.f f30532d;

    /* renamed from: e  reason: collision with root package name */
    private c.g f30533e;

    /* renamed from: f  reason: collision with root package name */
    private c.InterfaceC0392c f30534f;

    /* renamed from: g  reason: collision with root package name */
    private c.d f30535g;

    /* renamed from: h  reason: collision with root package name */
    protected boolean f30536h = false;

    @Override // g3.c
    public final void a(c.f fVar) {
        this.f30532d = fVar;
    }

    @Override // g3.c
    public final void b(c.g gVar) {
        this.f30533e = gVar;
    }

    @Override // g3.c
    public final void d(c.a aVar) {
        this.f30531c = aVar;
    }

    @Override // g3.c
    public final void e(c.b bVar) {
        this.f30530b = bVar;
    }

    @Override // g3.c
    public final void f(c.InterfaceC0392c interfaceC0392c) {
        this.f30534f = interfaceC0392c;
    }

    @Override // g3.c
    public final void g(c.d dVar) {
        this.f30535g = dVar;
    }

    @Override // g3.c
    public final void i(c.e eVar) {
        this.f30529a = eVar;
    }

    public void o() {
        this.f30529a = null;
        this.f30531c = null;
        this.f30530b = null;
        this.f30532d = null;
        this.f30533e = null;
        this.f30534f = null;
        this.f30535g = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void p(int i10) {
        try {
            c.a aVar = this.f30531c;
            if (aVar != null) {
                aVar.h(this, i10);
            }
        } catch (Throwable th) {
            o3.c.m("AbstractMediaPlayer", "AbstractMediaPlayer.notifyOnBufferingUpdate error: ", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void q(int i10, int i11, int i12, int i13) {
        try {
            c.g gVar = this.f30533e;
            if (gVar != null) {
                gVar.i(this, i10, i11, i12, i13);
            }
        } catch (Throwable th) {
            o3.c.m("AbstractMediaPlayer", "AbstractMediaPlayer.notifyOnVideoSizeChanged error: ", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean r(int i10, int i11) {
        try {
            c.InterfaceC0392c interfaceC0392c = this.f30534f;
            if (interfaceC0392c != null) {
                return interfaceC0392c.d(this, i10, i11);
            }
            return false;
        } catch (Throwable th) {
            o3.c.m("AbstractMediaPlayer", "AbstractMediaPlayer.notifyOnError error: ", th);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void s() {
        try {
            c.e eVar = this.f30529a;
            if (eVar != null) {
                eVar.e(this);
            }
        } catch (Throwable th) {
            o3.c.m("AbstractMediaPlayer", "AbstractMediaPlayer.notifyOnPrepared error: ", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean t(int i10, int i11) {
        try {
            c.d dVar = this.f30535g;
            if (dVar != null) {
                return dVar.f(this, i10, i11);
            }
            return false;
        } catch (Throwable th) {
            o3.c.m("AbstractMediaPlayer", "AbstractMediaPlayer.notifyOnInfo error: ", th);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void u() {
        try {
            c.b bVar = this.f30530b;
            if (bVar != null) {
                bVar.g(this);
            }
        } catch (Throwable th) {
            o3.c.m("AbstractMediaPlayer", "AbstractMediaPlayer.notifyOnCompletion error: ", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void v() {
        try {
            c.f fVar = this.f30532d;
            if (fVar != null) {
                fVar.c(this);
            }
        } catch (Throwable th) {
            o3.c.m("AbstractMediaPlayer", "AbstractMediaPlayer.notifyOnSeekComplete error: ", th);
        }
    }

    @Override // g3.c
    public void a(boolean z10) {
        this.f30536h = z10;
    }
}
