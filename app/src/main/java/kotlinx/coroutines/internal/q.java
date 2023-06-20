package kotlinx.coroutines.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LockFreeLinkedList.kt */
/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final j f33529a;

    public q(j jVar) {
        qe.k.g(jVar, "ref");
        this.f33529a = jVar;
    }

    public String toString() {
        return "Removed[" + this.f33529a + ']';
    }
}
