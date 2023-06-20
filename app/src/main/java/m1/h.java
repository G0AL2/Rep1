package m1;

import o1.u;
import qe.k;

/* compiled from: ContraintControllers.kt */
/* loaded from: classes.dex */
public final class h extends c<Boolean> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(n1.h<Boolean> hVar) {
        super(hVar);
        k.f(hVar, "tracker");
    }

    @Override // m1.c
    public boolean b(u uVar) {
        k.f(uVar, "workSpec");
        return uVar.f34914j.i();
    }

    @Override // m1.c
    public /* bridge */ /* synthetic */ boolean c(Boolean bool) {
        return i(bool.booleanValue());
    }

    public boolean i(boolean z10) {
        return !z10;
    }
}
