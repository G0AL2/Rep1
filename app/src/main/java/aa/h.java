package aa;

import android.text.TextUtils;
import ea.a0;
import j8.j2;
import java.util.ArrayList;

/* compiled from: WebvttDecoder.java */
/* loaded from: classes2.dex */
public final class h extends r9.e {

    /* renamed from: n  reason: collision with root package name */
    private final a0 f211n;

    /* renamed from: o  reason: collision with root package name */
    private final c f212o;

    public h() {
        super("WebvttDecoder");
        this.f211n = new a0();
        this.f212o = new c();
    }

    private static int B(a0 a0Var) {
        int i10 = -1;
        int i11 = 0;
        while (i10 == -1) {
            i11 = a0Var.e();
            String p10 = a0Var.p();
            if (p10 == null) {
                i10 = 0;
            } else if ("STYLE".equals(p10)) {
                i10 = 2;
            } else {
                i10 = p10.startsWith("NOTE") ? 1 : 3;
            }
        }
        a0Var.P(i11);
        return i10;
    }

    private static void C(a0 a0Var) {
        do {
        } while (!TextUtils.isEmpty(a0Var.p()));
    }

    @Override // r9.e
    protected r9.f z(byte[] bArr, int i10, boolean z10) throws r9.h {
        e m10;
        this.f211n.N(bArr, i10);
        ArrayList arrayList = new ArrayList();
        try {
            i.e(this.f211n);
            do {
            } while (!TextUtils.isEmpty(this.f211n.p()));
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int B = B(this.f211n);
                if (B == 0) {
                    return new k(arrayList2);
                }
                if (B == 1) {
                    C(this.f211n);
                } else if (B == 2) {
                    if (arrayList2.isEmpty()) {
                        this.f211n.p();
                        arrayList.addAll(this.f212o.d(this.f211n));
                    } else {
                        throw new r9.h("A style block was found after the first cue.");
                    }
                } else if (B == 3 && (m10 = f.m(this.f211n, arrayList)) != null) {
                    arrayList2.add(m10);
                }
            }
        } catch (j2 e10) {
            throw new r9.h(e10);
        }
    }
}
