package g2;

import android.graphics.Color;
import h2.c;
import java.io.IOException;

/* compiled from: ColorParser.java */
/* loaded from: classes.dex */
public class g implements n0<Integer> {

    /* renamed from: a  reason: collision with root package name */
    public static final g f30477a = new g();

    private g() {
    }

    @Override // g2.n0
    /* renamed from: b */
    public Integer a(h2.c cVar, float f10) throws IOException {
        boolean z10 = cVar.L() == c.b.BEGIN_ARRAY;
        if (z10) {
            cVar.b();
        }
        double w10 = cVar.w();
        double w11 = cVar.w();
        double w12 = cVar.w();
        double w13 = cVar.L() == c.b.NUMBER ? cVar.w() : 1.0d;
        if (z10) {
            cVar.e();
        }
        if (w10 <= 1.0d && w11 <= 1.0d && w12 <= 1.0d) {
            w10 *= 255.0d;
            w11 *= 255.0d;
            w12 *= 255.0d;
            if (w13 <= 1.0d) {
                w13 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) w13, (int) w10, (int) w11, (int) w12));
    }
}
