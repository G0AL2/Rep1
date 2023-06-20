package kotlinx.coroutines.sync;

import qe.k;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Mutex.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Object f33606a;

    public a(Object obj) {
        k.g(obj, "locked");
        this.f33606a = obj;
    }

    public String toString() {
        return "Empty[" + this.f33606a + ']';
    }
}
