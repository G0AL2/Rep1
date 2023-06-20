package com.facebook.react.views.scroll;

/* compiled from: ScrollEventType.java */
/* loaded from: classes.dex */
public enum b {
    BEGIN_DRAG,
    END_DRAG,
    SCROLL,
    MOMENTUM_BEGIN,
    MOMENTUM_END;

    /* compiled from: ScrollEventType.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f16167a;

        static {
            int[] iArr = new int[b.values().length];
            f16167a = iArr;
            try {
                iArr[b.BEGIN_DRAG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16167a[b.END_DRAG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16167a[b.SCROLL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16167a[b.MOMENTUM_BEGIN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16167a[b.MOMENTUM_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static String a(b bVar) {
        int i10 = a.f16167a[bVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5) {
                            return "topMomentumScrollEnd";
                        }
                        throw new IllegalArgumentException("Unsupported ScrollEventType: " + bVar);
                    }
                    return "topMomentumScrollBegin";
                }
                return "topScroll";
            }
            return "topScrollEndDrag";
        }
        return "topScrollBeginDrag";
    }
}
