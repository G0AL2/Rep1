package aa;

import ea.a0;
import ea.n0;
import java.util.ArrayList;
import java.util.Collections;
import r9.b;

/* compiled from: Mp4WebvttDecoder.java */
/* loaded from: classes2.dex */
public final class a extends r9.e {

    /* renamed from: n  reason: collision with root package name */
    private final a0 f160n;

    public a() {
        super("Mp4WebvttDecoder");
        this.f160n = new a0();
    }

    private static r9.b B(a0 a0Var, int i10) throws r9.h {
        CharSequence charSequence = null;
        b.C0490b c0490b = null;
        while (i10 > 0) {
            if (i10 >= 8) {
                int n10 = a0Var.n();
                int n11 = a0Var.n();
                int i11 = n10 - 8;
                String E = n0.E(a0Var.d(), a0Var.e(), i11);
                a0Var.Q(i11);
                i10 = (i10 - 8) - i11;
                if (n11 == 1937011815) {
                    c0490b = f.o(E);
                } else if (n11 == 1885436268) {
                    charSequence = f.q(null, E.trim(), Collections.emptyList());
                }
            } else {
                throw new r9.h("Incomplete vtt cue box header found.");
            }
        }
        if (charSequence == null) {
            charSequence = "";
        }
        if (c0490b != null) {
            return c0490b.o(charSequence).a();
        }
        return f.l(charSequence);
    }

    @Override // r9.e
    protected r9.f z(byte[] bArr, int i10, boolean z10) throws r9.h {
        this.f160n.N(bArr, i10);
        ArrayList arrayList = new ArrayList();
        while (this.f160n.a() > 0) {
            if (this.f160n.a() >= 8) {
                int n10 = this.f160n.n();
                if (this.f160n.n() == 1987343459) {
                    arrayList.add(B(this.f160n, n10 - 8));
                } else {
                    this.f160n.Q(n10 - 8);
                }
            } else {
                throw new r9.h("Incomplete Mp4Webvtt Top Level box header found.");
            }
        }
        return new b(arrayList);
    }
}
