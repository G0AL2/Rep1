package kotlin.coroutines.jvm.internal;

/* compiled from: ContinuationImpl.kt */
/* loaded from: classes3.dex */
public abstract class j extends a {
    public j(ie.d<Object> dVar) {
        super(dVar);
        if (dVar != null) {
            if (!(dVar.getContext() == ie.h.f31938a)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    @Override // ie.d
    public ie.g getContext() {
        return ie.h.f31938a;
    }
}
