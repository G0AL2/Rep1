package kotlin.coroutines.jvm.internal;

/* compiled from: ContinuationImpl.kt */
/* loaded from: classes3.dex */
public final class c implements ie.d<Object> {

    /* renamed from: a  reason: collision with root package name */
    public static final c f33468a = new c();

    private c() {
    }

    @Override // ie.d
    public ie.g getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // ie.d
    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
