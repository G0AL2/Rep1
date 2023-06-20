package com.facebook.yoga;

/* compiled from: YogaValue.java */
/* loaded from: classes.dex */
public class v {

    /* renamed from: a  reason: collision with root package name */
    public final float f16654a;

    /* renamed from: b  reason: collision with root package name */
    public final u f16655b;

    /* compiled from: YogaValue.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f16656a;

        static {
            int[] iArr = new int[u.values().length];
            f16656a = iArr;
            try {
                iArr[u.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16656a[u.POINT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16656a[u.PERCENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16656a[u.AUTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        new v(Float.NaN, u.UNDEFINED);
        new v(0.0f, u.POINT);
        new v(Float.NaN, u.AUTO);
    }

    public v(float f10, u uVar) {
        this.f16654a = f10;
        this.f16655b = uVar;
    }

    public boolean equals(Object obj) {
        if (obj instanceof v) {
            v vVar = (v) obj;
            u uVar = this.f16655b;
            if (uVar == vVar.f16655b) {
                return uVar == u.UNDEFINED || uVar == u.AUTO || Float.compare(this.f16654a, vVar.f16654a) == 0;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f16654a) + this.f16655b.f();
    }

    public String toString() {
        int i10 = a.f16656a[this.f16655b.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        return "auto";
                    }
                    throw new IllegalStateException();
                }
                return this.f16654a + "%";
            }
            return Float.toString(this.f16654a);
        }
        return "undefined";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(float f10, int i10) {
        this(f10, u.a(i10));
    }
}
