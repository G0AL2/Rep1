package com.bytedance.mobsec.metasec.ov;

import android.graphics.Point;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import ms.bd.o.Pgl.pblb;
import ms.bd.o.Pgl.r0;
import ms.bd.o.Pgl.t0;

/* loaded from: classes.dex */
public class pgla {

    /* loaded from: classes.dex */
    static class pblb extends pblb.pgla {
        pblb() {
        }

        @Override // ms.bd.o.Pgl.pblb.pgla
        public Object a(int i10, long j10, String str, Object obj) throws Throwable {
            return "";
        }
    }

    /* loaded from: classes.dex */
    static class pblc extends pblb.pgla {
        pblc() {
        }

        @Override // ms.bd.o.Pgl.pblb.pgla
        public Object a(int i10, long j10, String str, Object obj) throws Throwable {
            return t0.c();
        }
    }

    /* loaded from: classes.dex */
    static class pbld extends pblb.pgla {
        pbld() {
        }

        @Override // ms.bd.o.Pgl.pblb.pgla
        public Object a(int i10, long j10, String str, Object obj) throws Throwable {
            return "";
        }
    }

    /* renamed from: com.bytedance.mobsec.metasec.ov.pgla$pgla  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0142pgla extends pblb.pgla {
        C0142pgla() {
        }

        @Override // ms.bd.o.Pgl.pblb.pgla
        public Object a(int i10, long j10, String str, Object obj) throws Throwable {
            Display defaultDisplay;
            Point point;
            int i11;
            int height;
            try {
                defaultDisplay = ((WindowManager) ms.bd.o.Pgl.pgla.a().b().getSystemService("window")).getDefaultDisplay();
                point = new Point();
                i11 = Build.VERSION.SDK_INT;
            } catch (Throwable unused) {
            }
            if (i11 >= 17) {
                defaultDisplay.getRealSize(point);
            } else if (i11 < 13) {
                r0.f34572a = defaultDisplay.getWidth();
                height = defaultDisplay.getHeight();
                r0.f34573b = height;
                return r0.f34572a + "*" + r0.f34573b;
            } else {
                defaultDisplay.getSize(point);
            }
            r0.f34572a = point.x;
            height = point.y;
            r0.f34573b = height;
            return r0.f34572a + "*" + r0.f34573b;
        }
    }

    public static void a() {
        ms.bd.o.Pgl.pblb.a(268435457, new C0142pgla());
        ms.bd.o.Pgl.pblb.a(268435463, new pblb());
        ms.bd.o.Pgl.pblb.a(268435462, new pblc());
        ms.bd.o.Pgl.pblb.a(268435464, new pbld());
    }
}
