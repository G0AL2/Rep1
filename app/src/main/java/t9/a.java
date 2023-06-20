package t9;

import ea.a0;
import java.util.List;
import r9.e;
import r9.f;

/* compiled from: DvbDecoder.java */
/* loaded from: classes2.dex */
public final class a extends e {

    /* renamed from: n  reason: collision with root package name */
    private final b f37186n;

    public a(List<byte[]> list) {
        super("DvbDecoder");
        a0 a0Var = new a0(list.get(0));
        this.f37186n = new b(a0Var.J(), a0Var.J());
    }

    @Override // r9.e
    protected f z(byte[] bArr, int i10, boolean z10) {
        if (z10) {
            this.f37186n.r();
        }
        return new c(this.f37186n.b(bArr, i10));
    }
}
