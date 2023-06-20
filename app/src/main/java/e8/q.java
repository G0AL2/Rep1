package e8;

import android.content.Context;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* compiled from: Uploader_Factory.java */
/* loaded from: classes2.dex */
public final class q implements z7.b<p> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<Context> f29625a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<x7.b> f29626b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider<f8.d> f29627c;

    /* renamed from: d  reason: collision with root package name */
    private final Provider<v> f29628d;

    /* renamed from: e  reason: collision with root package name */
    private final Provider<Executor> f29629e;

    /* renamed from: f  reason: collision with root package name */
    private final Provider<g8.b> f29630f;

    /* renamed from: g  reason: collision with root package name */
    private final Provider<h8.a> f29631g;

    /* renamed from: h  reason: collision with root package name */
    private final Provider<h8.a> f29632h;

    /* renamed from: i  reason: collision with root package name */
    private final Provider<f8.c> f29633i;

    public q(Provider<Context> provider, Provider<x7.b> provider2, Provider<f8.d> provider3, Provider<v> provider4, Provider<Executor> provider5, Provider<g8.b> provider6, Provider<h8.a> provider7, Provider<h8.a> provider8, Provider<f8.c> provider9) {
        this.f29625a = provider;
        this.f29626b = provider2;
        this.f29627c = provider3;
        this.f29628d = provider4;
        this.f29629e = provider5;
        this.f29630f = provider6;
        this.f29631g = provider7;
        this.f29632h = provider8;
        this.f29633i = provider9;
    }

    public static q a(Provider<Context> provider, Provider<x7.b> provider2, Provider<f8.d> provider3, Provider<v> provider4, Provider<Executor> provider5, Provider<g8.b> provider6, Provider<h8.a> provider7, Provider<h8.a> provider8, Provider<f8.c> provider9) {
        return new q(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static p c(Context context, x7.b bVar, f8.d dVar, v vVar, Executor executor, g8.b bVar2, h8.a aVar, h8.a aVar2, f8.c cVar) {
        return new p(context, bVar, dVar, vVar, executor, bVar2, aVar, aVar2, cVar);
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public p get() {
        return c(this.f29625a.get(), this.f29626b.get(), this.f29627c.get(), this.f29628d.get(), this.f29629e.get(), this.f29630f.get(), this.f29631g.get(), this.f29632h.get(), this.f29633i.get());
    }
}
