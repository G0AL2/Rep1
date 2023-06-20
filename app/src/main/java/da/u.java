package da;

import android.content.Context;
import da.l;
import da.v;

/* compiled from: DefaultDataSourceFactory.java */
@Deprecated
/* loaded from: classes2.dex */
public final class u implements l.a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f29296a;

    /* renamed from: b  reason: collision with root package name */
    private final m0 f29297b;

    /* renamed from: c  reason: collision with root package name */
    private final l.a f29298c;

    public u(Context context, String str) {
        this(context, str, (m0) null);
    }

    @Override // da.l.a
    /* renamed from: b */
    public t a() {
        t tVar = new t(this.f29296a, this.f29298c.a());
        m0 m0Var = this.f29297b;
        if (m0Var != null) {
            tVar.l(m0Var);
        }
        return tVar;
    }

    public u(Context context, String str, m0 m0Var) {
        this(context, m0Var, new v.b().c(str));
    }

    public u(Context context, m0 m0Var, l.a aVar) {
        this.f29296a = context.getApplicationContext();
        this.f29297b = m0Var;
        this.f29298c = aVar;
    }
}
