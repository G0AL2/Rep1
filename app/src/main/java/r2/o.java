package r2;

import java.io.UnsupportedEncodingException;
import q2.p;

/* compiled from: StringRequest.java */
/* loaded from: classes.dex */
public class o extends q2.n<String> {

    /* renamed from: q  reason: collision with root package name */
    private final Object f36162q;

    /* renamed from: r  reason: collision with root package name */
    private p.b<String> f36163r;

    public o(int i10, String str, p.b<String> bVar, p.a aVar) {
        super(i10, str, aVar);
        this.f36162q = new Object();
        this.f36163r = bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // q2.n
    public q2.p<String> F(q2.k kVar) {
        String str;
        try {
            str = new String(kVar.f35809a, g.f(kVar.f35810b));
        } catch (UnsupportedEncodingException unused) {
            str = new String(kVar.f35809a);
        }
        return q2.p.c(str, g.e(kVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // q2.n
    /* renamed from: P */
    public void e(String str) {
        p.b<String> bVar;
        synchronized (this.f36162q) {
            bVar = this.f36163r;
        }
        if (bVar != null) {
            bVar.a(str);
        }
    }
}
