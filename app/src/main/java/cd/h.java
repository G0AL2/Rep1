package cd;

import android.content.Context;
import tb.q;

/* compiled from: LibraryVersionComponent.java */
/* loaded from: classes3.dex */
public class h {

    /* compiled from: LibraryVersionComponent.java */
    /* loaded from: classes3.dex */
    public interface a<T> {
        String a(T t10);
    }

    public static /* synthetic */ f a(String str, a aVar, tb.e eVar) {
        return d(str, aVar, eVar);
    }

    public static tb.d<?> b(String str, String str2) {
        return tb.d.i(f.a(str, str2), f.class);
    }

    public static tb.d<?> c(final String str, final a<Context> aVar) {
        return tb.d.j(f.class).b(q.j(Context.class)).f(new tb.h() { // from class: cd.g
            @Override // tb.h
            public final Object a(tb.e eVar) {
                return h.a(str, aVar, eVar);
            }
        }).d();
    }

    public static /* synthetic */ f d(String str, a aVar, tb.e eVar) {
        return f.a(str, aVar.a((Context) eVar.a(Context.class)));
    }
}
