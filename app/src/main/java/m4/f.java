package m4;

import android.content.Context;
import java.util.Set;
import r5.h;
import r5.l;
import y3.n;

/* compiled from: PipelineDraweeControllerBuilderSupplier.java */
/* loaded from: classes.dex */
public class f implements n<e> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f34223a;

    /* renamed from: b  reason: collision with root package name */
    private final h f34224b;

    /* renamed from: c  reason: collision with root package name */
    private final g f34225c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<r4.d> f34226d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<h5.b> f34227e;

    /* renamed from: f  reason: collision with root package name */
    private final o4.f f34228f;

    public f(Context context, b bVar) {
        this(context, l.l(), bVar);
    }

    @Override // y3.n
    /* renamed from: a */
    public e get() {
        return new e(this.f34223a, this.f34225c, this.f34224b, this.f34226d, this.f34227e).L(this.f34228f);
    }

    public f(Context context, l lVar, b bVar) {
        this(context, lVar, null, null, bVar);
    }

    public f(Context context, l lVar, Set<r4.d> set, Set<h5.b> set2, b bVar) {
        this.f34223a = context;
        h j10 = lVar.j();
        this.f34224b = j10;
        g gVar = new g();
        this.f34225c = gVar;
        gVar.a(context.getResources(), q4.a.b(), lVar.b(context), w3.h.g(), j10.i(), null, null);
        this.f34226d = set;
        this.f34227e = set2;
        this.f34228f = null;
    }
}
