package com.facebook.hermes.intl;

import android.icu.text.MeasureFormat;
import com.vehiclecloud.app.videofetch.rnbillingclient.Analytics;
import java.text.AttributedCharacterIterator;

/* compiled from: IPlatformNumberFormatter.java */
/* loaded from: classes.dex */
public interface d {

    /* compiled from: IPlatformNumberFormatter.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f14657a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f14658b;

        /* renamed from: c  reason: collision with root package name */
        static final /* synthetic */ int[] f14659c;

        /* renamed from: d  reason: collision with root package name */
        static final /* synthetic */ int[] f14660d;

        /* renamed from: e  reason: collision with root package name */
        static final /* synthetic */ int[] f14661e;

        /* renamed from: f  reason: collision with root package name */
        static final /* synthetic */ int[] f14662f;

        /* renamed from: g  reason: collision with root package name */
        static final /* synthetic */ int[] f14663g;

        static {
            int[] iArr = new int[EnumC0196d.values().length];
            f14663g = iArr;
            try {
                iArr[EnumC0196d.ACCOUNTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14663g[EnumC0196d.STANDARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[c.values().length];
            f14662f = iArr2;
            try {
                iArr2[c.SYMBOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14662f[c.NARROWSYMBOL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14662f[c.CODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14662f[c.NAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[i.values().length];
            f14661e = iArr3;
            try {
                iArr3[i.SHORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14661e[i.NARROW.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f14661e[i.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr4 = new int[g.values().length];
            f14660d = iArr4;
            try {
                iArr4[g.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f14660d[g.ALWAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f14660d[g.NEVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f14660d[g.EXCEPTZERO.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            int[] iArr5 = new int[b.values().length];
            f14659c = iArr5;
            try {
                iArr5[b.SHORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f14659c[b.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            int[] iArr6 = new int[e.values().length];
            f14658b = iArr6;
            try {
                iArr6[e.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f14658b[e.SCIENTIFIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f14658b[e.ENGINEERING.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f14658b[e.COMPACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
            int[] iArr7 = new int[h.values().length];
            f14657a = iArr7;
            try {
                iArr7[h.DECIMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f14657a[h.PERCENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f14657a[h.CURRENCY.ordinal()] = 3;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f14657a[h.UNIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused23) {
            }
        }
    }

    /* compiled from: IPlatformNumberFormatter.java */
    /* loaded from: classes.dex */
    public enum b {
        SHORT,
        LONG;

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f14659c[ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    return "long";
                }
                throw new IllegalArgumentException();
            }
            return "short";
        }
    }

    /* compiled from: IPlatformNumberFormatter.java */
    /* loaded from: classes.dex */
    public enum c {
        SYMBOL,
        NARROWSYMBOL,
        CODE,
        NAME;

        public int f() {
            return a.f14662f[ordinal()] != 4 ? 0 : 1;
        }

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f14662f[ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            return "name";
                        }
                        throw new IllegalArgumentException();
                    }
                    return Analytics.Param.CODE;
                }
                return "narrowSymbol";
            }
            return "symbol";
        }
    }

    /* compiled from: IPlatformNumberFormatter.java */
    /* renamed from: com.facebook.hermes.intl.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0196d {
        STANDARD,
        ACCOUNTING;

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f14663g[ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    return "standard";
                }
                throw new IllegalArgumentException();
            }
            return "accounting";
        }
    }

    /* compiled from: IPlatformNumberFormatter.java */
    /* loaded from: classes.dex */
    public enum e {
        STANDARD,
        SCIENTIFIC,
        ENGINEERING,
        COMPACT;

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f14658b[ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            return "compact";
                        }
                        throw new IllegalArgumentException();
                    }
                    return "engineering";
                }
                return "scientific";
            }
            return "standard";
        }
    }

    /* compiled from: IPlatformNumberFormatter.java */
    /* loaded from: classes.dex */
    public enum f {
        SIGNIFICANT_DIGITS,
        FRACTION_DIGITS,
        COMPACT_ROUNDING
    }

    /* compiled from: IPlatformNumberFormatter.java */
    /* loaded from: classes.dex */
    public enum g {
        AUTO,
        ALWAYS,
        NEVER,
        EXCEPTZERO;

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f14660d[ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            return "exceptZero";
                        }
                        throw new IllegalArgumentException();
                    }
                    return "never";
                }
                return "always";
            }
            return "auto";
        }
    }

    /* compiled from: IPlatformNumberFormatter.java */
    /* loaded from: classes.dex */
    public enum h {
        DECIMAL,
        PERCENT,
        CURRENCY,
        UNIT;

        public int a(e eVar, EnumC0196d enumC0196d) throws i5.d {
            int i10 = a.f14657a[ordinal()];
            if (i10 != 2) {
                if (i10 != 3) {
                    return (eVar == e.SCIENTIFIC || eVar == e.ENGINEERING) ? 3 : 0;
                } else if (enumC0196d == EnumC0196d.ACCOUNTING) {
                    return 7;
                } else {
                    if (enumC0196d == EnumC0196d.STANDARD) {
                        return 1;
                    }
                    throw new i5.d("Unrecognized formatting style requested.");
                }
            }
            return 2;
        }

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f14657a[ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            return "unit";
                        }
                        throw new IllegalArgumentException();
                    }
                    return "currency";
                }
                return "percent";
            }
            return "decimal";
        }
    }

    /* compiled from: IPlatformNumberFormatter.java */
    /* loaded from: classes.dex */
    public enum i {
        SHORT,
        NARROW,
        LONG;

        public MeasureFormat.FormatWidth f() {
            int i10 = a.f14661e[ordinal()];
            if (i10 != 2) {
                if (i10 != 3) {
                    return MeasureFormat.FormatWidth.SHORT;
                }
                return MeasureFormat.FormatWidth.WIDE;
            }
            return MeasureFormat.FormatWidth.NARROW;
        }

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f14661e[ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        return "long";
                    }
                    throw new IllegalArgumentException();
                }
                return "narrow";
            }
            return "short";
        }
    }

    String a(com.facebook.hermes.intl.a<?> aVar) throws i5.d;

    AttributedCharacterIterator b(double d10) throws i5.d;

    String c(double d10) throws i5.d;

    d d(String str, c cVar) throws i5.d;

    d e(f fVar, int i10, int i11) throws i5.d;

    d f(int i10);

    d g(boolean z10);

    d h(com.facebook.hermes.intl.a<?> aVar, String str, h hVar, EnumC0196d enumC0196d, e eVar, b bVar) throws i5.d;

    d i(f fVar, int i10, int i11);

    d j(String str, i iVar) throws i5.d;

    d k(g gVar);

    String l(AttributedCharacterIterator.Attribute attribute, double d10);
}
