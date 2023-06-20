package o1;

import java.util.List;

/* compiled from: SystemIdInfoDao.kt */
/* loaded from: classes.dex */
public interface j {

    /* compiled from: SystemIdInfoDao.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static i a(j jVar, m mVar) {
            qe.k.f(mVar, "id");
            return jVar.c(mVar.b(), mVar.a());
        }

        public static void b(j jVar, m mVar) {
            qe.k.f(mVar, "id");
            jVar.e(mVar.b(), mVar.a());
        }
    }

    void a(m mVar);

    void b(i iVar);

    i c(String str, int i10);

    List<String> d();

    void e(String str, int i10);

    void f(String str);

    i g(m mVar);
}
