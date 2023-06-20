package d2;

import android.graphics.Path;
import com.airbnb.lottie.d0;

/* compiled from: GradientFill.java */
/* loaded from: classes.dex */
public class e implements c {

    /* renamed from: a  reason: collision with root package name */
    private final g f28935a;

    /* renamed from: b  reason: collision with root package name */
    private final Path.FillType f28936b;

    /* renamed from: c  reason: collision with root package name */
    private final c2.c f28937c;

    /* renamed from: d  reason: collision with root package name */
    private final c2.d f28938d;

    /* renamed from: e  reason: collision with root package name */
    private final c2.f f28939e;

    /* renamed from: f  reason: collision with root package name */
    private final c2.f f28940f;

    /* renamed from: g  reason: collision with root package name */
    private final String f28941g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f28942h;

    public e(String str, g gVar, Path.FillType fillType, c2.c cVar, c2.d dVar, c2.f fVar, c2.f fVar2, c2.b bVar, c2.b bVar2, boolean z10) {
        this.f28935a = gVar;
        this.f28936b = fillType;
        this.f28937c = cVar;
        this.f28938d = dVar;
        this.f28939e = fVar;
        this.f28940f = fVar2;
        this.f28941g = str;
        this.f28942h = z10;
    }

    @Override // d2.c
    public y1.c a(d0 d0Var, e2.b bVar) {
        return new y1.h(d0Var, bVar, this);
    }

    public c2.f b() {
        return this.f28940f;
    }

    public Path.FillType c() {
        return this.f28936b;
    }

    public c2.c d() {
        return this.f28937c;
    }

    public g e() {
        return this.f28935a;
    }

    public String f() {
        return this.f28941g;
    }

    public c2.d g() {
        return this.f28938d;
    }

    public c2.f h() {
        return this.f28939e;
    }

    public boolean i() {
        return this.f28942h;
    }
}
