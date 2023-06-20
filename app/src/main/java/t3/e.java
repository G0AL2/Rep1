package t3;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CacheKeyUtil.java */
/* loaded from: classes.dex */
public final class e {
    public static String a(d dVar) {
        try {
            if (dVar instanceof f) {
                return c(((f) dVar).d().get(0));
            }
            return c(dVar);
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static List<String> b(d dVar) {
        ArrayList arrayList;
        try {
            if (dVar instanceof f) {
                List<d> d10 = ((f) dVar).d();
                arrayList = new ArrayList(d10.size());
                for (int i10 = 0; i10 < d10.size(); i10++) {
                    arrayList.add(c(d10.get(i10)));
                }
            } else {
                arrayList = new ArrayList(1);
                arrayList.add(dVar.c() ? dVar.a() : c(dVar));
            }
            return arrayList;
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static String c(d dVar) throws UnsupportedEncodingException {
        return g4.c.a(dVar.a().getBytes("UTF-8"));
    }
}
