package gf;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.IOException;
import java.util.List;

/* compiled from: PushObserver.kt */
/* loaded from: classes3.dex */
public interface l {

    /* renamed from: a  reason: collision with root package name */
    public static final l f31044a;

    /* compiled from: PushObserver.kt */
    /* loaded from: classes3.dex */
    public static final class a {

        /* compiled from: PushObserver.kt */
        /* renamed from: gf.l$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        private static final class C0397a implements l {
            @Override // gf.l
            public void a(int i10, b bVar) {
                qe.k.f(bVar, IronSourceConstants.EVENTS_ERROR_CODE);
            }

            @Override // gf.l
            public boolean b(int i10, mf.h hVar, int i11, boolean z10) throws IOException {
                qe.k.f(hVar, "source");
                hVar.O0(i11);
                return true;
            }

            @Override // gf.l
            public boolean c(int i10, List<c> list) {
                qe.k.f(list, "requestHeaders");
                return true;
            }

            @Override // gf.l
            public boolean d(int i10, List<c> list, boolean z10) {
                qe.k.f(list, "responseHeaders");
                return true;
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
        f31044a = new a.C0397a();
    }

    void a(int i10, b bVar);

    boolean b(int i10, mf.h hVar, int i11, boolean z10) throws IOException;

    boolean c(int i10, List<c> list);

    boolean d(int i10, List<c> list, boolean z10);
}
