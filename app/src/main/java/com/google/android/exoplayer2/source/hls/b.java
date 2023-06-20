package com.google.android.exoplayer2.source.hls;

import ea.j0;
import j8.p1;
import java.io.IOException;
import p8.w;
import z8.h0;

/* compiled from: BundledHlsMediaChunkExtractor.java */
/* loaded from: classes2.dex */
public final class b implements i {

    /* renamed from: d  reason: collision with root package name */
    private static final w f21438d = new w();

    /* renamed from: a  reason: collision with root package name */
    final p8.i f21439a;

    /* renamed from: b  reason: collision with root package name */
    private final p1 f21440b;

    /* renamed from: c  reason: collision with root package name */
    private final j0 f21441c;

    public b(p8.i iVar, p1 p1Var, j0 j0Var) {
        this.f21439a = iVar;
        this.f21440b = p1Var;
        this.f21441c = j0Var;
    }

    @Override // com.google.android.exoplayer2.source.hls.i
    public boolean a(p8.j jVar) throws IOException {
        return this.f21439a.g(jVar, f21438d) == 0;
    }

    @Override // com.google.android.exoplayer2.source.hls.i
    public void c(p8.k kVar) {
        this.f21439a.c(kVar);
    }

    @Override // com.google.android.exoplayer2.source.hls.i
    public void d() {
        this.f21439a.a(0L, 0L);
    }

    @Override // com.google.android.exoplayer2.source.hls.i
    public boolean e() {
        p8.i iVar = this.f21439a;
        return (iVar instanceof h0) || (iVar instanceof w8.g);
    }

    @Override // com.google.android.exoplayer2.source.hls.i
    public boolean f() {
        p8.i iVar = this.f21439a;
        return (iVar instanceof z8.h) || (iVar instanceof z8.b) || (iVar instanceof z8.e) || (iVar instanceof v8.f);
    }

    @Override // com.google.android.exoplayer2.source.hls.i
    public i g() {
        p8.i fVar;
        ea.a.f(!e());
        p8.i iVar = this.f21439a;
        if (iVar instanceof o) {
            fVar = new o(this.f21440b.f32700c, this.f21441c);
        } else if (iVar instanceof z8.h) {
            fVar = new z8.h();
        } else if (iVar instanceof z8.b) {
            fVar = new z8.b();
        } else if (iVar instanceof z8.e) {
            fVar = new z8.e();
        } else if (iVar instanceof v8.f) {
            fVar = new v8.f();
        } else {
            String simpleName = this.f21439a.getClass().getSimpleName();
            throw new IllegalStateException(simpleName.length() != 0 ? "Unexpected extractor type for recreation: ".concat(simpleName) : new String("Unexpected extractor type for recreation: "));
        }
        return new b(fVar, this.f21440b, this.f21441c);
    }
}
