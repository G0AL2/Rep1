package kotlinx.coroutines.internal;

import we.z1;

/* compiled from: Scopes.kt */
/* loaded from: classes3.dex */
public class r<T> extends we.a<T> implements kotlin.coroutines.jvm.internal.e {

    /* renamed from: d  reason: collision with root package name */
    public final ie.d<T> f33530d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r(ie.g gVar, ie.d<? super T> dVar) {
        super(gVar, true);
        qe.k.g(gVar, "context");
        qe.k.g(dVar, "uCont");
        this.f33530d = dVar;
    }

    @Override // we.p1
    protected final boolean L() {
        return true;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public final kotlin.coroutines.jvm.internal.e getCallerFrame() {
        return (kotlin.coroutines.jvm.internal.e) this.f33530d;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // we.p1
    public void k(Object obj, int i10) {
        if (obj instanceof we.r) {
            Throwable th = ((we.r) obj).f38650a;
            if (i10 != 4) {
                th = t.j(th, this.f33530d);
            }
            z1.e(this.f33530d, th, i10);
            return;
        }
        z1.d(this.f33530d, obj, i10);
    }

    @Override // we.a
    public int n0() {
        return 2;
    }
}
