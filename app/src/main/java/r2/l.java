package r2;

import java.io.UnsupportedEncodingException;
import q2.p;
import q2.v;

/* compiled from: JsonRequest.java */
/* loaded from: classes.dex */
public abstract class l<T> extends q2.n<T> {

    /* renamed from: t  reason: collision with root package name */
    private static final String f36155t = String.format("application/json; charset=%s", "utf-8");

    /* renamed from: q  reason: collision with root package name */
    private final Object f36156q;

    /* renamed from: r  reason: collision with root package name */
    private p.b<T> f36157r;

    /* renamed from: s  reason: collision with root package name */
    private final String f36158s;

    public l(int i10, String str, String str2, p.b<T> bVar, p.a aVar) {
        super(i10, str, aVar);
        this.f36156q = new Object();
        this.f36157r = bVar;
        this.f36158s = str2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // q2.n
    public void e(T t10) {
        p.b<T> bVar;
        synchronized (this.f36156q) {
            bVar = this.f36157r;
        }
        if (bVar != null) {
            bVar.a(t10);
        }
    }

    @Override // q2.n
    public byte[] i() {
        try {
            String str = this.f36158s;
            if (str == null) {
                return null;
            }
            return str.getBytes("utf-8");
        } catch (UnsupportedEncodingException unused) {
            v.f("Unsupported Encoding while trying to get the bytes of %s using %s", this.f36158s, "utf-8");
            return null;
        }
    }

    @Override // q2.n
    public String j() {
        return f36155t;
    }

    @Override // q2.n
    @Deprecated
    public byte[] q() {
        return i();
    }

    @Override // q2.n
    @Deprecated
    public String r() {
        return j();
    }
}
