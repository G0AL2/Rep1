package com.facebook.hermes.intl;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.text.AttributedCharacterIterator;

/* compiled from: IPlatformDateTimeFormatter.java */
/* loaded from: classes.dex */
public interface c {

    /* compiled from: IPlatformDateTimeFormatter.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f14596a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f14597b;

        /* renamed from: c  reason: collision with root package name */
        static final /* synthetic */ int[] f14598c;

        /* renamed from: d  reason: collision with root package name */
        static final /* synthetic */ int[] f14599d;

        /* renamed from: e  reason: collision with root package name */
        static final /* synthetic */ int[] f14600e;

        /* renamed from: f  reason: collision with root package name */
        static final /* synthetic */ int[] f14601f;

        /* renamed from: g  reason: collision with root package name */
        static final /* synthetic */ int[] f14602g;

        /* renamed from: h  reason: collision with root package name */
        static final /* synthetic */ int[] f14603h;

        /* renamed from: i  reason: collision with root package name */
        static final /* synthetic */ int[] f14604i;

        /* renamed from: j  reason: collision with root package name */
        static final /* synthetic */ int[] f14605j;

        /* renamed from: k  reason: collision with root package name */
        static final /* synthetic */ int[] f14606k;

        static {
            int[] iArr = new int[j.values().length];
            f14606k = iArr;
            try {
                iArr[j.LONG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14606k[j.SHORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14606k[j.UNDEFINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[i.values().length];
            f14605j = iArr2;
            try {
                iArr2[i.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14605j[i.DIGIT2.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14605j[i.UNDEFINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[g.values().length];
            f14604i = iArr3;
            try {
                iArr3[g.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14604i[g.DIGIT2.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f14604i[g.UNDEFINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr4 = new int[e.values().length];
            f14603h = iArr4;
            try {
                iArr4[e.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f14603h[e.DIGIT2.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f14603h[e.UNDEFINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            int[] iArr5 = new int[b.values().length];
            f14602g = iArr5;
            try {
                iArr5[b.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f14602g[b.DIGIT2.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f14602g[b.UNDEFINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            int[] iArr6 = new int[h.values().length];
            f14601f = iArr6;
            try {
                iArr6[h.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f14601f[h.DIGIT2.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f14601f[h.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f14601f[h.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f14601f[h.NARROW.ordinal()] = 5;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f14601f[h.UNDEFINED.ordinal()] = 6;
            } catch (NoSuchFieldError unused21) {
            }
            int[] iArr7 = new int[l.values().length];
            f14600e = iArr7;
            try {
                iArr7[l.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f14600e[l.DIGIT2.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f14600e[l.UNDEFINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            int[] iArr8 = new int[EnumC0195c.values().length];
            f14599d = iArr8;
            try {
                iArr8[EnumC0195c.LONG.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f14599d[EnumC0195c.SHORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f14599d[EnumC0195c.NARROW.ordinal()] = 3;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f14599d[EnumC0195c.UNDEFINED.ordinal()] = 4;
            } catch (NoSuchFieldError unused28) {
            }
            int[] iArr9 = new int[k.values().length];
            f14598c = iArr9;
            try {
                iArr9[k.LONG.ordinal()] = 1;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f14598c[k.SHORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f14598c[k.NARROW.ordinal()] = 3;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f14598c[k.UNDEFINED.ordinal()] = 4;
            } catch (NoSuchFieldError unused32) {
            }
            int[] iArr10 = new int[f.values().length];
            f14597b = iArr10;
            try {
                iArr10[f.H11.ordinal()] = 1;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f14597b[f.H12.ordinal()] = 2;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f14597b[f.H23.ordinal()] = 3;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f14597b[f.H24.ordinal()] = 4;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f14597b[f.UNDEFINED.ordinal()] = 5;
            } catch (NoSuchFieldError unused37) {
            }
            int[] iArr11 = new int[d.values().length];
            f14596a = iArr11;
            try {
                iArr11[d.BESTFIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f14596a[d.BASIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused39) {
            }
        }
    }

    /* compiled from: IPlatformDateTimeFormatter.java */
    /* loaded from: classes.dex */
    public enum b {
        NUMERIC,
        DIGIT2,
        UNDEFINED;

        public String f() {
            int i10 = a.f14602g[ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        return "";
                    }
                    throw new IllegalArgumentException();
                }
                return "dd";
            }
            return "d";
        }

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f14602g[ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        return "";
                    }
                    throw new IllegalArgumentException();
                }
                return "2-digit";
            }
            return "numeric";
        }
    }

    /* compiled from: IPlatformDateTimeFormatter.java */
    /* renamed from: com.facebook.hermes.intl.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0195c {
        LONG,
        SHORT,
        NARROW,
        UNDEFINED;

        public String f() {
            int i10 = a.f14599d[ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            return "";
                        }
                        throw new IllegalArgumentException();
                    }
                    return "G5";
                }
                return "GGG";
            }
            return "GGGG";
        }

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f14599d[ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            return "";
                        }
                        throw new IllegalArgumentException();
                    }
                    return "narrow";
                }
                return "short";
            }
            return "long";
        }
    }

    /* compiled from: IPlatformDateTimeFormatter.java */
    /* loaded from: classes.dex */
    public enum d {
        BESTFIT,
        BASIC;

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f14596a[ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    return "basic";
                }
                throw new IllegalArgumentException();
            }
            return "best fit";
        }
    }

    /* compiled from: IPlatformDateTimeFormatter.java */
    /* loaded from: classes.dex */
    public enum e {
        NUMERIC,
        DIGIT2,
        UNDEFINED;

        public String f() {
            int i10 = a.f14603h[ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        return "";
                    }
                    throw new IllegalArgumentException();
                }
                return "hh";
            }
            return "h";
        }

        public String g() {
            int i10 = a.f14603h[ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        return "";
                    }
                    throw new IllegalArgumentException();
                }
                return "kk";
            }
            return "k";
        }

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f14603h[ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        return "";
                    }
                    throw new IllegalArgumentException();
                }
                return "2-digit";
            }
            return "numeric";
        }
    }

    /* compiled from: IPlatformDateTimeFormatter.java */
    /* loaded from: classes.dex */
    public enum f {
        H11,
        H12,
        H23,
        H24,
        UNDEFINED;

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f14597b[ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 == 5) {
                                return "";
                            }
                            throw new IllegalArgumentException();
                        }
                        return "h24";
                    }
                    return "h23";
                }
                return "h12";
            }
            return "h11";
        }
    }

    /* compiled from: IPlatformDateTimeFormatter.java */
    /* loaded from: classes.dex */
    public enum g {
        NUMERIC,
        DIGIT2,
        UNDEFINED;

        public String f() {
            int i10 = a.f14604i[ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        return "";
                    }
                    throw new IllegalArgumentException();
                }
                return "mm";
            }
            return InneractiveMediationDefs.GENDER_MALE;
        }

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f14604i[ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        return "";
                    }
                    throw new IllegalArgumentException();
                }
                return "2-digit";
            }
            return "numeric";
        }
    }

    /* compiled from: IPlatformDateTimeFormatter.java */
    /* loaded from: classes.dex */
    public enum h {
        NUMERIC,
        DIGIT2,
        LONG,
        SHORT,
        NARROW,
        UNDEFINED;

        public String f() {
            switch (a.f14601f[ordinal()]) {
                case 1:
                    return "M";
                case 2:
                    return "MM";
                case 3:
                    return "MMMM";
                case 4:
                    return "MMM";
                case 5:
                    return "MMMMM";
                case 6:
                    return "";
                default:
                    throw new IllegalArgumentException();
            }
        }

        @Override // java.lang.Enum
        public String toString() {
            switch (a.f14601f[ordinal()]) {
                case 1:
                    return "numeric";
                case 2:
                    return "2-digit";
                case 3:
                    return "long";
                case 4:
                    return "short";
                case 5:
                    return "narrow";
                case 6:
                    return "";
                default:
                    throw new IllegalArgumentException();
            }
        }
    }

    /* compiled from: IPlatformDateTimeFormatter.java */
    /* loaded from: classes.dex */
    public enum i {
        NUMERIC,
        DIGIT2,
        UNDEFINED;

        public String f() {
            int i10 = a.f14605j[ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        return "";
                    }
                    throw new IllegalArgumentException();
                }
                return "ss";
            }
            return "s";
        }

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f14605j[ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        return "";
                    }
                    throw new IllegalArgumentException();
                }
                return "2-digit";
            }
            return "numeric";
        }
    }

    /* compiled from: IPlatformDateTimeFormatter.java */
    /* loaded from: classes.dex */
    public enum j {
        LONG,
        SHORT,
        UNDEFINED;

        public String f() {
            int i10 = a.f14606k[ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        return "";
                    }
                    throw new IllegalArgumentException();
                }
                return "O";
            }
            return "VV";
        }

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f14606k[ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        return "";
                    }
                    throw new IllegalArgumentException();
                }
                return "short";
            }
            return "long";
        }
    }

    /* compiled from: IPlatformDateTimeFormatter.java */
    /* loaded from: classes.dex */
    public enum k {
        LONG,
        SHORT,
        NARROW,
        UNDEFINED;

        public String f() {
            int i10 = a.f14598c[ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            return "";
                        }
                        throw new IllegalArgumentException();
                    }
                    return "EEEEE";
                }
                return "EEE";
            }
            return "EEEE";
        }

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f14598c[ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            return "";
                        }
                        throw new IllegalArgumentException();
                    }
                    return "narrow";
                }
                return "short";
            }
            return "long";
        }
    }

    /* compiled from: IPlatformDateTimeFormatter.java */
    /* loaded from: classes.dex */
    public enum l {
        NUMERIC,
        DIGIT2,
        UNDEFINED;

        public String f() {
            int i10 = a.f14600e[ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        return "";
                    }
                    throw new IllegalArgumentException();
                }
                return "yy";
            }
            return "yyyy";
        }

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f14600e[ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        return "";
                    }
                    throw new IllegalArgumentException();
                }
                return "2-digit";
            }
            return "numeric";
        }
    }

    String a(com.facebook.hermes.intl.a<?> aVar) throws i5.d;

    AttributedCharacterIterator b(double d10) throws i5.d;

    String c(double d10) throws i5.d;

    String d(com.facebook.hermes.intl.a<?> aVar) throws i5.d;

    String e(AttributedCharacterIterator.Attribute attribute, String str);

    String f(com.facebook.hermes.intl.a<?> aVar) throws i5.d;

    void g(com.facebook.hermes.intl.a<?> aVar, String str, String str2, d dVar, k kVar, EnumC0195c enumC0195c, l lVar, h hVar, b bVar, e eVar, g gVar, i iVar, j jVar, f fVar, Object obj) throws i5.d;

    f h(com.facebook.hermes.intl.a<?> aVar) throws i5.d;
}
