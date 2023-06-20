package cd;

import java.util.Iterator;
import java.util.Set;
import tb.q;

/* compiled from: DefaultUserAgentPublisher.java */
/* loaded from: classes3.dex */
public class c implements i {

    /* renamed from: a */
    private final String f5474a;

    /* renamed from: b */
    private final d f5475b;

    c(Set<f> set, d dVar) {
        this.f5474a = e(set);
        this.f5475b = dVar;
    }

    public static /* synthetic */ i b(tb.e eVar) {
        return d(eVar);
    }

    public static tb.d<i> c() {
        return tb.d.c(i.class).b(q.l(f.class)).f(new tb.h() { // from class: cd.b
            @Override // tb.h
            public final Object a(tb.e eVar) {
                return c.b(eVar);
            }
        }).d();
    }

    public static /* synthetic */ i d(tb.e eVar) {
        return new c(eVar.c(f.class), d.a());
    }

    private static String e(Set<f> set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<f> it = set.iterator();
        while (it.hasNext()) {
            f next = it.next();
            sb2.append(next.b());
            sb2.append('/');
            sb2.append(next.c());
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    @Override // cd.i
    public String a() {
        if (this.f5475b.b().isEmpty()) {
            return this.f5474a;
        }
        return this.f5474a + ' ' + e(this.f5475b.b());
    }
}
