package ea;

import android.os.Bundle;
import j8.g;
import java.util.List;
import jb.s;

/* compiled from: BundleableUtil.java */
/* loaded from: classes2.dex */
public final class b {
    private b() {
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) n0.j(b.class.getClassLoader()));
        }
    }

    public static <T extends j8.g> jb.s<T> b(g.a<T> aVar, List<Bundle> list) {
        s.a n10 = jb.s.n();
        for (int i10 = 0; i10 < list.size(); i10++) {
            n10.a(aVar.a((Bundle) a.e(list.get(i10))));
        }
        return n10.h();
    }

    public static <T extends j8.g> List<T> c(g.a<T> aVar, List<Bundle> list, List<T> list2) {
        return list == null ? list2 : b(aVar, list);
    }

    public static <T extends j8.g> T d(g.a<T> aVar, Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return aVar.a(bundle);
    }
}
