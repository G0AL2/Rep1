package com.facebook.yoga;

/* compiled from: YogaEdge.java */
/* loaded from: classes.dex */
public enum j {
    LEFT(0),
    TOP(1),
    RIGHT(2),
    BOTTOM(3),
    START(4),
    END(5),
    HORIZONTAL(6),
    VERTICAL(7),
    ALL(8);
    

    /* renamed from: a  reason: collision with root package name */
    private final int f16619a;

    j(int i10) {
        this.f16619a = i10;
    }

    public static j a(int i10) {
        switch (i10) {
            case 0:
                return LEFT;
            case 1:
                return TOP;
            case 2:
                return RIGHT;
            case 3:
                return BOTTOM;
            case 4:
                return START;
            case 5:
                return END;
            case 6:
                return HORIZONTAL;
            case 7:
                return VERTICAL;
            case 8:
                return ALL;
            default:
                throw new IllegalArgumentException("Unknown enum value: " + i10);
        }
    }

    public int f() {
        return this.f16619a;
    }
}
