package k9;

import j8.p1;

/* compiled from: BaseMediaChunk.java */
/* loaded from: classes2.dex */
public abstract class a extends n {

    /* renamed from: k  reason: collision with root package name */
    public final long f33357k;

    /* renamed from: l  reason: collision with root package name */
    public final long f33358l;

    /* renamed from: m  reason: collision with root package name */
    private c f33359m;

    /* renamed from: n  reason: collision with root package name */
    private int[] f33360n;

    public a(da.l lVar, da.p pVar, p1 p1Var, int i10, Object obj, long j10, long j11, long j12, long j13, long j14) {
        super(lVar, pVar, p1Var, i10, obj, j10, j11, j14);
        this.f33357k = j12;
        this.f33358l = j13;
    }

    public final int h(int i10) {
        return ((int[]) ea.a.h(this.f33360n))[i10];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final c i() {
        return (c) ea.a.h(this.f33359m);
    }

    public void j(c cVar) {
        this.f33359m = cVar;
        this.f33360n = cVar.a();
    }
}
