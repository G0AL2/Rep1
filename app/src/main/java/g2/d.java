package g2;

import java.io.IOException;
import java.util.List;

/* compiled from: AnimatableValueParser.java */
/* loaded from: classes.dex */
public class d {
    private static <T> List<j2.a<T>> a(h2.c cVar, float f10, com.airbnb.lottie.h hVar, n0<T> n0Var) throws IOException {
        return u.a(cVar, hVar, f10, n0Var, false);
    }

    private static <T> List<j2.a<T>> b(h2.c cVar, com.airbnb.lottie.h hVar, n0<T> n0Var) throws IOException {
        return u.a(cVar, hVar, 1.0f, n0Var, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c2.a c(h2.c cVar, com.airbnb.lottie.h hVar) throws IOException {
        return new c2.a(b(cVar, hVar, g.f30477a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c2.j d(h2.c cVar, com.airbnb.lottie.h hVar) throws IOException {
        return new c2.j(b(cVar, hVar, i.f30482a));
    }

    public static c2.b e(h2.c cVar, com.airbnb.lottie.h hVar) throws IOException {
        return f(cVar, hVar, true);
    }

    public static c2.b f(h2.c cVar, com.airbnb.lottie.h hVar, boolean z10) throws IOException {
        return new c2.b(a(cVar, z10 ? i2.h.e() : 1.0f, hVar, l.f30499a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c2.c g(h2.c cVar, com.airbnb.lottie.h hVar, int i10) throws IOException {
        return new c2.c(b(cVar, hVar, new o(i10)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c2.d h(h2.c cVar, com.airbnb.lottie.h hVar) throws IOException {
        return new c2.d(b(cVar, hVar, r.f30512a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c2.f i(h2.c cVar, com.airbnb.lottie.h hVar) throws IOException {
        return new c2.f(u.a(cVar, hVar, i2.h.e(), b0.f30467a, true));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c2.g j(h2.c cVar, com.airbnb.lottie.h hVar) throws IOException {
        return new c2.g(b(cVar, hVar, g0.f30478a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c2.h k(h2.c cVar, com.airbnb.lottie.h hVar) throws IOException {
        return new c2.h(a(cVar, i2.h.e(), hVar, h0.f30480a));
    }
}
