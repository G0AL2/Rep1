package kotlinx.coroutines.sync;

import kotlinx.coroutines.internal.u;

/* compiled from: Mutex.kt */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final u f33616a;

    /* renamed from: b  reason: collision with root package name */
    private static final u f33617b;

    /* renamed from: c  reason: collision with root package name */
    private static final u f33618c;

    /* renamed from: d  reason: collision with root package name */
    private static final a f33619d;

    /* renamed from: e  reason: collision with root package name */
    private static final a f33620e;

    static {
        new u("LOCK_FAIL");
        new u("ENQUEUE_FAIL");
        f33616a = new u("UNLOCK_FAIL");
        new u("SELECT_SUCCESS");
        u uVar = new u("LOCKED");
        f33617b = uVar;
        u uVar2 = new u("UNLOCKED");
        f33618c = uVar2;
        f33619d = new a(uVar);
        f33620e = new a(uVar2);
    }

    public static final b a(boolean z10) {
        return new c(z10);
    }

    public static /* synthetic */ b b(boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return a(z10);
    }
}
