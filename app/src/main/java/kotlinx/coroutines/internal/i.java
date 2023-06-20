package kotlinx.coroutines.internal;

/* compiled from: LockFreeLinkedList.kt */
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f33509a = new u("CONDITION_FALSE");

    static {
        new u("ALREADY_REMOVED");
        new u("LIST_EMPTY");
        new u("REMOVE_PREPARED");
    }

    public static final Object a() {
        return f33509a;
    }

    public static final j b(Object obj) {
        j jVar;
        qe.k.g(obj, "$this$unwrap");
        q qVar = (q) (!(obj instanceof q) ? null : obj);
        return (qVar == null || (jVar = qVar.f33529a) == null) ? (j) obj : jVar;
    }
}
