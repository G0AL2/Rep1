package j8;

/* compiled from: ExoTimeoutException.java */
/* loaded from: classes2.dex */
public final class n1 extends RuntimeException {
    public n1(int i10) {
        super(a(i10));
    }

    private static String a(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.";
    }
}
