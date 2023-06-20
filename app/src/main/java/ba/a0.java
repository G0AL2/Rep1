package ba;

import i9.u;
import i9.y0;
import j8.j3;
import j8.y2;

/* compiled from: TrackSelector.java */
/* loaded from: classes2.dex */
public abstract class a0 {

    /* renamed from: a  reason: collision with root package name */
    private a f5040a;

    /* renamed from: b  reason: collision with root package name */
    private da.f f5041b;

    /* compiled from: TrackSelector.java */
    /* loaded from: classes2.dex */
    public interface a {
        void b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final da.f a() {
        return (da.f) ea.a.e(this.f5041b);
    }

    public final void b(a aVar, da.f fVar) {
        this.f5040a = aVar;
        this.f5041b = fVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c() {
        a aVar = this.f5040a;
        if (aVar != null) {
            aVar.b();
        }
    }

    public boolean d() {
        return false;
    }

    public abstract void e(Object obj);

    public abstract b0 f(y2[] y2VarArr, y0 y0Var, u.b bVar, j3 j3Var) throws j8.n;
}
