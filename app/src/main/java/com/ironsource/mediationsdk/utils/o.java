package com.ironsource.mediationsdk.utils;

import com.ironsource.mediationsdk.IronSource;

/* loaded from: classes3.dex */
public final class o {

    /* renamed from: f  reason: collision with root package name */
    private static o f27526f;

    /* renamed from: a  reason: collision with root package name */
    private int f27527a = 1;

    /* renamed from: b  reason: collision with root package name */
    private int f27528b = 1;

    /* renamed from: c  reason: collision with root package name */
    private int f27529c = 1;

    /* renamed from: d  reason: collision with root package name */
    private int f27530d = 1;

    /* renamed from: e  reason: collision with root package name */
    private com.ironsource.sdk.a.e f27531e = new com.ironsource.sdk.a.e();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.mediationsdk.utils.o$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f27532a;

        static {
            int[] iArr = new int[IronSource.AD_UNIT.values().length];
            f27532a = iArr;
            try {
                iArr[IronSource.AD_UNIT.OFFERWALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27532a[IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27532a[IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27532a[IronSource.AD_UNIT.BANNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private o() {
        d(this.f27527a);
        e(this.f27528b);
        f(this.f27530d);
    }

    public static synchronized o a() {
        o oVar;
        synchronized (o.class) {
            if (f27526f == null) {
                f27526f = new o();
            }
            oVar = f27526f;
        }
        return oVar;
    }

    private static IronSource.AD_UNIT c(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return null;
                    }
                    return IronSource.AD_UNIT.BANNER;
                }
                return IronSource.AD_UNIT.INTERSTITIAL;
            }
            return IronSource.AD_UNIT.REWARDED_VIDEO;
        }
        return IronSource.AD_UNIT.OFFERWALL;
    }

    private void d(int i10) {
        this.f27527a = i10;
        this.f27531e.b(i10);
    }

    private void e(int i10) {
        this.f27528b = i10;
        this.f27531e.a(i10);
    }

    private void f(int i10) {
        this.f27530d = i10;
        this.f27531e.c(i10);
    }

    public final synchronized void a(int i10) {
        a(c(i10));
    }

    public final synchronized void a(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == null) {
            return;
        }
        int i10 = AnonymousClass1.f27532a[ad_unit.ordinal()];
        if (i10 == 1) {
            this.f27529c++;
        } else if (i10 == 2) {
            d(this.f27527a + 1);
        } else if (i10 == 3) {
            e(this.f27528b + 1);
        } else {
            if (i10 == 4) {
                f(this.f27530d + 1);
            }
        }
    }

    public final synchronized int b(int i10) {
        return b(c(i10));
    }

    public final synchronized int b(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == null) {
            return -1;
        }
        int i10 = AnonymousClass1.f27532a[ad_unit.ordinal()];
        if (i10 == 1) {
            return this.f27529c;
        } else if (i10 == 2) {
            return this.f27527a;
        } else if (i10 == 3) {
            return this.f27528b;
        } else if (i10 != 4) {
            return -1;
        } else {
            return this.f27530d;
        }
    }
}
