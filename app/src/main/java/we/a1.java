package we;

/* compiled from: EventLoop.common.kt */
/* loaded from: classes3.dex */
public final class a1 {

    /* renamed from: a  reason: collision with root package name */
    private static final kotlinx.coroutines.internal.u f38587a = new kotlinx.coroutines.internal.u("REMOVED_TASK");

    /* renamed from: b  reason: collision with root package name */
    private static final kotlinx.coroutines.internal.u f38588b = new kotlinx.coroutines.internal.u("CLOSED_EMPTY");

    public static final long c(long j10) {
        if (j10 <= 0) {
            return 0L;
        }
        if (j10 >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j10;
    }
}
