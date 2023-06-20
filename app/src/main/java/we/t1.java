package we;

/* compiled from: JobSupport.kt */
/* loaded from: classes3.dex */
public final class t1 extends kotlinx.coroutines.internal.h implements d1 {
    @Override // we.d1
    public boolean a() {
        return true;
    }

    @Override // we.d1
    public t1 d() {
        return this;
    }

    @Override // kotlinx.coroutines.internal.j
    public String toString() {
        return i0.c() ? z("Active") : super.toString();
    }

    public final String z(String str) {
        qe.k.g(str, "state");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("List{");
        sb2.append(str);
        sb2.append("}[");
        Object m10 = m();
        if (m10 != null) {
            boolean z10 = true;
            for (kotlinx.coroutines.internal.j jVar = (kotlinx.coroutines.internal.j) m10; !qe.k.a(jVar, this); jVar = jVar.n()) {
                if (jVar instanceof o1) {
                    o1 o1Var = (o1) jVar;
                    if (z10) {
                        z10 = false;
                    } else {
                        sb2.append(", ");
                    }
                    sb2.append(o1Var);
                }
            }
            sb2.append("]");
            String sb3 = sb2.toString();
            qe.k.b(sb3, "StringBuilder().apply(builderAction).toString()");
            return sb3;
        }
        throw new ee.r("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }
}
