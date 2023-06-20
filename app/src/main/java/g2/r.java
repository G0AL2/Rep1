package g2;

import java.io.IOException;

/* compiled from: IntegerParser.java */
/* loaded from: classes.dex */
public class r implements n0<Integer> {

    /* renamed from: a  reason: collision with root package name */
    public static final r f30512a = new r();

    private r() {
    }

    @Override // g2.n0
    /* renamed from: b */
    public Integer a(h2.c cVar, float f10) throws IOException {
        return Integer.valueOf(Math.round(s.g(cVar) * f10));
    }
}
