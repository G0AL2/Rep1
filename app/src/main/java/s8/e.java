package s8;

import j8.j2;
import p8.a0;

/* compiled from: TagPayloadReader.java */
/* loaded from: classes2.dex */
abstract class e {

    /* renamed from: a  reason: collision with root package name */
    protected final a0 f36816a;

    /* compiled from: TagPayloadReader.java */
    /* loaded from: classes2.dex */
    public static final class a extends j2 {
        public a(String str) {
            super(str, null, false, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public e(a0 a0Var) {
        this.f36816a = a0Var;
    }

    public final boolean a(ea.a0 a0Var, long j10) throws j2 {
        return b(a0Var) && c(a0Var, j10);
    }

    protected abstract boolean b(ea.a0 a0Var) throws j2;

    protected abstract boolean c(ea.a0 a0Var, long j10) throws j2;
}
