package p4;

import o4.i;

/* compiled from: ImagePerfRequestListener.java */
/* loaded from: classes.dex */
public class c extends y5.a {

    /* renamed from: a  reason: collision with root package name */
    private final f4.b f35511a;

    /* renamed from: b  reason: collision with root package name */
    private final i f35512b;

    public c(f4.b bVar, i iVar) {
        this.f35511a = bVar;
        this.f35512b = iVar;
    }

    @Override // y5.a, y5.e
    public void a(b6.b bVar, Object obj, String str, boolean z10) {
        this.f35512b.s(this.f35511a.now());
        this.f35512b.q(bVar);
        this.f35512b.d(obj);
        this.f35512b.x(str);
        this.f35512b.w(z10);
    }

    @Override // y5.a, y5.e
    public void d(b6.b bVar, String str, Throwable th, boolean z10) {
        this.f35512b.r(this.f35511a.now());
        this.f35512b.q(bVar);
        this.f35512b.x(str);
        this.f35512b.w(z10);
    }

    @Override // y5.a, y5.e
    public void g(b6.b bVar, String str, boolean z10) {
        this.f35512b.r(this.f35511a.now());
        this.f35512b.q(bVar);
        this.f35512b.x(str);
        this.f35512b.w(z10);
    }

    @Override // y5.a, y5.e
    public void k(String str) {
        this.f35512b.r(this.f35511a.now());
        this.f35512b.x(str);
    }
}
