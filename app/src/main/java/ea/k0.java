package ea;

import android.os.Trace;

/* compiled from: TraceUtil.java */
/* loaded from: classes2.dex */
public final class k0 {
    public static void a(String str) {
        if (n0.f29709a >= 18) {
            b(str);
        }
    }

    private static void b(String str) {
        Trace.beginSection(str);
    }

    public static void c() {
        if (n0.f29709a >= 18) {
            d();
        }
    }

    private static void d() {
        Trace.endSection();
    }
}
