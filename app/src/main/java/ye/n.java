package ye;

import com.google.android.gms.common.internal.ImagesContract;
import java.util.List;

/* compiled from: CookieJar.kt */
/* loaded from: classes3.dex */
public interface n {

    /* renamed from: a  reason: collision with root package name */
    public static final n f39734a;

    /* compiled from: CookieJar.kt */
    /* loaded from: classes3.dex */
    public static final class a {

        /* compiled from: CookieJar.kt */
        /* renamed from: ye.n$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        private static final class C0554a implements n {
            @Override // ye.n
            public List<m> a(u uVar) {
                List<m> h10;
                qe.k.f(uVar, ImagesContract.URL);
                h10 = fe.p.h();
                return h10;
            }

            @Override // ye.n
            public void c(u uVar, List<m> list) {
                qe.k.f(uVar, ImagesContract.URL);
                qe.k.f(list, "cookies");
            }
        }

        private a() {
        }

        public /* synthetic */ a(qe.g gVar) {
            this();
        }
    }

    static {
        new a(null);
        f39734a = new a.C0554a();
    }

    List<m> a(u uVar);

    void c(u uVar, List<m> list);
}
