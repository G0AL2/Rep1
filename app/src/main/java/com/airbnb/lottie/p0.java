package com.airbnb.lottie;

/* compiled from: RenderMode.java */
/* loaded from: classes.dex */
public enum p0 {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    /* compiled from: RenderMode.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f5880a;

        static {
            int[] iArr = new int[p0.values().length];
            f5880a = iArr;
            try {
                iArr[p0.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5880a[p0.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5880a[p0.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public boolean a(int i10, boolean z10, int i11) {
        int i12 = a.f5880a[ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                return (z10 && i10 < 28) || i11 > 4 || i10 <= 25;
            }
            return true;
        }
        return false;
    }
}
