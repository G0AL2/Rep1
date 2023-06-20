package g2;

import android.graphics.PointF;
import h2.c;
import java.io.IOException;

/* compiled from: PointFParser.java */
/* loaded from: classes.dex */
public class b0 implements n0<PointF> {

    /* renamed from: a  reason: collision with root package name */
    public static final b0 f30467a = new b0();

    private b0() {
    }

    @Override // g2.n0
    /* renamed from: b */
    public PointF a(h2.c cVar, float f10) throws IOException {
        c.b L = cVar.L();
        if (L == c.b.BEGIN_ARRAY) {
            return s.e(cVar, f10);
        }
        if (L == c.b.BEGIN_OBJECT) {
            return s.e(cVar, f10);
        }
        if (L == c.b.NUMBER) {
            PointF pointF = new PointF(((float) cVar.w()) * f10, ((float) cVar.w()) * f10);
            while (cVar.l()) {
                cVar.Z();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + L);
    }
}
