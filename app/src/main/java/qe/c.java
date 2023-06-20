package qe;

import java.io.Serializable;

/* compiled from: CallableReference.java */
/* loaded from: classes3.dex */
public abstract class c implements te.a, Serializable {

    /* renamed from: g  reason: collision with root package name */
    public static final Object f36091g = a.f36098a;

    /* renamed from: a  reason: collision with root package name */
    private transient te.a f36092a;

    /* renamed from: b  reason: collision with root package name */
    protected final Object f36093b;

    /* renamed from: c  reason: collision with root package name */
    private final Class f36094c;

    /* renamed from: d  reason: collision with root package name */
    private final String f36095d;

    /* renamed from: e  reason: collision with root package name */
    private final String f36096e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f36097f;

    /* compiled from: CallableReference.java */
    /* loaded from: classes3.dex */
    private static class a implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        private static final a f36098a = new a();

        private a() {
        }
    }

    public c() {
        this(f36091g);
    }

    public te.a c() {
        te.a aVar = this.f36092a;
        if (aVar == null) {
            te.a d10 = d();
            this.f36092a = d10;
            return d10;
        }
        return aVar;
    }

    protected abstract te.a d();

    public Object e() {
        return this.f36093b;
    }

    public String f() {
        return this.f36095d;
    }

    public te.c g() {
        Class cls = this.f36094c;
        if (cls == null) {
            return null;
        }
        return this.f36097f ? t.c(cls) : t.b(cls);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public te.a i() {
        te.a c10 = c();
        if (c10 != this) {
            return c10;
        }
        throw new oe.b();
    }

    public String j() {
        return this.f36096e;
    }

    protected c(Object obj) {
        this(obj, null, null, null, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c(Object obj, Class cls, String str, String str2, boolean z10) {
        this.f36093b = obj;
        this.f36094c = cls;
        this.f36095d = str;
        this.f36096e = str2;
        this.f36097f = z10;
    }
}
