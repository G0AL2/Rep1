package g2;

import h2.c;
import java.io.IOException;

/* compiled from: ScaleXYParser.java */
/* loaded from: classes.dex */
public class g0 implements n0<j2.d> {

    /* renamed from: a  reason: collision with root package name */
    public static final g0 f30478a = new g0();

    private g0() {
    }

    @Override // g2.n0
    /* renamed from: b */
    public j2.d a(h2.c cVar, float f10) throws IOException {
        boolean z10 = cVar.L() == c.b.BEGIN_ARRAY;
        if (z10) {
            cVar.b();
        }
        float w10 = (float) cVar.w();
        float w11 = (float) cVar.w();
        while (cVar.l()) {
            cVar.Z();
        }
        if (z10) {
            cVar.e();
        }
        return new j2.d((w10 / 100.0f) * f10, (w11 / 100.0f) * f10);
    }
}
