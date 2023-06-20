package kotlinx.coroutines.scheduling;

import kotlinx.coroutines.scheduling.a;

/* loaded from: classes3.dex */
public final /* synthetic */ class b {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f33574a;

    static {
        int[] iArr = new int[a.c.values().length];
        f33574a = iArr;
        iArr[a.c.PARKING.ordinal()] = 1;
        iArr[a.c.BLOCKING.ordinal()] = 2;
        iArr[a.c.CPU_ACQUIRED.ordinal()] = 3;
        iArr[a.c.RETIRING.ordinal()] = 4;
        iArr[a.c.TERMINATED.ordinal()] = 5;
    }
}
