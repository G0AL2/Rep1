package j8;

import com.google.android.exoplayer2.metadata.Metadata;
import i9.u;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PlaybackInfo.java */
/* loaded from: classes2.dex */
public final class n2 {

    /* renamed from: t  reason: collision with root package name */
    private static final u.b f32634t = new u.b(new Object());

    /* renamed from: a  reason: collision with root package name */
    public final j3 f32635a;

    /* renamed from: b  reason: collision with root package name */
    public final u.b f32636b;

    /* renamed from: c  reason: collision with root package name */
    public final long f32637c;

    /* renamed from: d  reason: collision with root package name */
    public final long f32638d;

    /* renamed from: e  reason: collision with root package name */
    public final int f32639e;

    /* renamed from: f  reason: collision with root package name */
    public final n f32640f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f32641g;

    /* renamed from: h  reason: collision with root package name */
    public final i9.y0 f32642h;

    /* renamed from: i  reason: collision with root package name */
    public final ba.b0 f32643i;

    /* renamed from: j  reason: collision with root package name */
    public final List<Metadata> f32644j;

    /* renamed from: k  reason: collision with root package name */
    public final u.b f32645k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f32646l;

    /* renamed from: m  reason: collision with root package name */
    public final int f32647m;

    /* renamed from: n  reason: collision with root package name */
    public final o2 f32648n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f32649o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f32650p;

    /* renamed from: q  reason: collision with root package name */
    public volatile long f32651q;

    /* renamed from: r  reason: collision with root package name */
    public volatile long f32652r;

    /* renamed from: s  reason: collision with root package name */
    public volatile long f32653s;

    public n2(j3 j3Var, u.b bVar, long j10, long j11, int i10, n nVar, boolean z10, i9.y0 y0Var, ba.b0 b0Var, List<Metadata> list, u.b bVar2, boolean z11, int i11, o2 o2Var, long j12, long j13, long j14, boolean z12, boolean z13) {
        this.f32635a = j3Var;
        this.f32636b = bVar;
        this.f32637c = j10;
        this.f32638d = j11;
        this.f32639e = i10;
        this.f32640f = nVar;
        this.f32641g = z10;
        this.f32642h = y0Var;
        this.f32643i = b0Var;
        this.f32644j = list;
        this.f32645k = bVar2;
        this.f32646l = z11;
        this.f32647m = i11;
        this.f32648n = o2Var;
        this.f32651q = j12;
        this.f32652r = j13;
        this.f32653s = j14;
        this.f32649o = z12;
        this.f32650p = z13;
    }

    public static n2 k(ba.b0 b0Var) {
        j3 j3Var = j3.f32506a;
        u.b bVar = f32634t;
        return new n2(j3Var, bVar, -9223372036854775807L, 0L, 1, null, false, i9.y0.f31861d, b0Var, jb.s.t(), bVar, false, 0, o2.f32663d, 0L, 0L, 0L, false, false);
    }

    public static u.b l() {
        return f32634t;
    }

    public n2 a(boolean z10) {
        return new n2(this.f32635a, this.f32636b, this.f32637c, this.f32638d, this.f32639e, this.f32640f, z10, this.f32642h, this.f32643i, this.f32644j, this.f32645k, this.f32646l, this.f32647m, this.f32648n, this.f32651q, this.f32652r, this.f32653s, this.f32649o, this.f32650p);
    }

    public n2 b(u.b bVar) {
        return new n2(this.f32635a, this.f32636b, this.f32637c, this.f32638d, this.f32639e, this.f32640f, this.f32641g, this.f32642h, this.f32643i, this.f32644j, bVar, this.f32646l, this.f32647m, this.f32648n, this.f32651q, this.f32652r, this.f32653s, this.f32649o, this.f32650p);
    }

    public n2 c(u.b bVar, long j10, long j11, long j12, long j13, i9.y0 y0Var, ba.b0 b0Var, List<Metadata> list) {
        return new n2(this.f32635a, bVar, j11, j12, this.f32639e, this.f32640f, this.f32641g, y0Var, b0Var, list, this.f32645k, this.f32646l, this.f32647m, this.f32648n, this.f32651q, j13, j10, this.f32649o, this.f32650p);
    }

    public n2 d(boolean z10) {
        return new n2(this.f32635a, this.f32636b, this.f32637c, this.f32638d, this.f32639e, this.f32640f, this.f32641g, this.f32642h, this.f32643i, this.f32644j, this.f32645k, this.f32646l, this.f32647m, this.f32648n, this.f32651q, this.f32652r, this.f32653s, z10, this.f32650p);
    }

    public n2 e(boolean z10, int i10) {
        return new n2(this.f32635a, this.f32636b, this.f32637c, this.f32638d, this.f32639e, this.f32640f, this.f32641g, this.f32642h, this.f32643i, this.f32644j, this.f32645k, z10, i10, this.f32648n, this.f32651q, this.f32652r, this.f32653s, this.f32649o, this.f32650p);
    }

    public n2 f(n nVar) {
        return new n2(this.f32635a, this.f32636b, this.f32637c, this.f32638d, this.f32639e, nVar, this.f32641g, this.f32642h, this.f32643i, this.f32644j, this.f32645k, this.f32646l, this.f32647m, this.f32648n, this.f32651q, this.f32652r, this.f32653s, this.f32649o, this.f32650p);
    }

    public n2 g(o2 o2Var) {
        return new n2(this.f32635a, this.f32636b, this.f32637c, this.f32638d, this.f32639e, this.f32640f, this.f32641g, this.f32642h, this.f32643i, this.f32644j, this.f32645k, this.f32646l, this.f32647m, o2Var, this.f32651q, this.f32652r, this.f32653s, this.f32649o, this.f32650p);
    }

    public n2 h(int i10) {
        return new n2(this.f32635a, this.f32636b, this.f32637c, this.f32638d, i10, this.f32640f, this.f32641g, this.f32642h, this.f32643i, this.f32644j, this.f32645k, this.f32646l, this.f32647m, this.f32648n, this.f32651q, this.f32652r, this.f32653s, this.f32649o, this.f32650p);
    }

    public n2 i(boolean z10) {
        return new n2(this.f32635a, this.f32636b, this.f32637c, this.f32638d, this.f32639e, this.f32640f, this.f32641g, this.f32642h, this.f32643i, this.f32644j, this.f32645k, this.f32646l, this.f32647m, this.f32648n, this.f32651q, this.f32652r, this.f32653s, this.f32649o, z10);
    }

    public n2 j(j3 j3Var) {
        return new n2(j3Var, this.f32636b, this.f32637c, this.f32638d, this.f32639e, this.f32640f, this.f32641g, this.f32642h, this.f32643i, this.f32644j, this.f32645k, this.f32646l, this.f32647m, this.f32648n, this.f32651q, this.f32652r, this.f32653s, this.f32649o, this.f32650p);
    }
}
