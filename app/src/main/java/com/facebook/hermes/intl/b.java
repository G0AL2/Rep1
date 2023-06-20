package com.facebook.hermes.intl;

import com.applovin.sdk.AppLovinEventTypes;

/* compiled from: IPlatformCollator.java */
/* loaded from: classes.dex */
public interface b {

    /* compiled from: IPlatformCollator.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f14580a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f14581b;

        /* renamed from: c  reason: collision with root package name */
        static final /* synthetic */ int[] f14582c;

        static {
            int[] iArr = new int[EnumC0194b.values().length];
            f14582c = iArr;
            try {
                iArr[EnumC0194b.UPPER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14582c[EnumC0194b.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14582c[EnumC0194b.FALSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[d.values().length];
            f14581b = iArr2;
            try {
                iArr2[d.SORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14581b[d.SEARCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[c.values().length];
            f14580a = iArr3;
            try {
                iArr3[c.BASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14580a[c.ACCENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14580a[c.CASE.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f14580a[c.VARIANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f14580a[c.LOCALE.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* compiled from: IPlatformCollator.java */
    /* renamed from: com.facebook.hermes.intl.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0194b {
        UPPER,
        LOWER,
        FALSE;

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f14582c[ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        return "false";
                    }
                    throw new IllegalArgumentException();
                }
                return "lower";
            }
            return "upper";
        }
    }

    /* compiled from: IPlatformCollator.java */
    /* loaded from: classes.dex */
    public enum c {
        BASE,
        ACCENT,
        CASE,
        VARIANT,
        LOCALE;

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f14580a[ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 == 5) {
                                return "";
                            }
                            throw new IllegalArgumentException();
                        }
                        return "variant";
                    }
                    return "case";
                }
                return "accent";
            }
            return "base";
        }
    }

    /* compiled from: IPlatformCollator.java */
    /* loaded from: classes.dex */
    public enum d {
        SORT,
        SEARCH;

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f14581b[ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    return AppLovinEventTypes.USER_EXECUTED_SEARCH;
                }
                throw new IllegalArgumentException();
            }
            return "sort";
        }
    }

    int a(String str, String str2);

    c b();

    b c(boolean z10);

    b d(com.facebook.hermes.intl.a<?> aVar) throws i5.d;

    b e(EnumC0194b enumC0194b);

    b f(boolean z10);

    b g(c cVar);
}
