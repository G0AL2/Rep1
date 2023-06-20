package o1;

import java.util.List;
import java.util.Set;

/* compiled from: WorkTagDao.kt */
/* loaded from: classes.dex */
public interface z {

    /* compiled from: WorkTagDao.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static void a(z zVar, String str, Set<String> set) {
            qe.k.f(str, "id");
            qe.k.f(set, "tags");
            for (String str2 : set) {
                zVar.a(new y(str2, str));
            }
        }
    }

    void a(y yVar);

    List<String> b(String str);

    void c(String str, Set<String> set);
}
