package g0;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* compiled from: BidiFormatter.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    static final e f30422d;

    /* renamed from: e  reason: collision with root package name */
    private static final String f30423e;

    /* renamed from: f  reason: collision with root package name */
    private static final String f30424f;

    /* renamed from: g  reason: collision with root package name */
    static final a f30425g;

    /* renamed from: h  reason: collision with root package name */
    static final a f30426h;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f30427a;

    /* renamed from: b  reason: collision with root package name */
    private final int f30428b;

    /* renamed from: c  reason: collision with root package name */
    private final e f30429c;

    /* compiled from: BidiFormatter.java */
    /* renamed from: g0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0389a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f30430a;

        /* renamed from: b  reason: collision with root package name */
        private int f30431b;

        /* renamed from: c  reason: collision with root package name */
        private e f30432c;

        public C0389a() {
            c(a.e(Locale.getDefault()));
        }

        private static a b(boolean z10) {
            return z10 ? a.f30426h : a.f30425g;
        }

        private void c(boolean z10) {
            this.f30430a = z10;
            this.f30432c = a.f30422d;
            this.f30431b = 2;
        }

        public a a() {
            if (this.f30431b == 2 && this.f30432c == a.f30422d) {
                return b(this.f30430a);
            }
            return new a(this.f30430a, this.f30431b, this.f30432c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BidiFormatter.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: f  reason: collision with root package name */
        private static final byte[] f30433f = new byte[1792];

        /* renamed from: a  reason: collision with root package name */
        private final CharSequence f30434a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f30435b;

        /* renamed from: c  reason: collision with root package name */
        private final int f30436c;

        /* renamed from: d  reason: collision with root package name */
        private int f30437d;

        /* renamed from: e  reason: collision with root package name */
        private char f30438e;

        static {
            for (int i10 = 0; i10 < 1792; i10++) {
                f30433f[i10] = Character.getDirectionality(i10);
            }
        }

        b(CharSequence charSequence, boolean z10) {
            this.f30434a = charSequence;
            this.f30435b = z10;
            this.f30436c = charSequence.length();
        }

        private static byte c(char c10) {
            return c10 < 1792 ? f30433f[c10] : Character.getDirectionality(c10);
        }

        private byte f() {
            char charAt;
            int i10 = this.f30437d;
            do {
                int i11 = this.f30437d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f30434a;
                int i12 = i11 - 1;
                this.f30437d = i12;
                charAt = charSequence.charAt(i12);
                this.f30438e = charAt;
                if (charAt == '&') {
                    return (byte) 12;
                }
            } while (charAt != ';');
            this.f30437d = i10;
            this.f30438e = ';';
            return (byte) 13;
        }

        private byte g() {
            char charAt;
            do {
                int i10 = this.f30437d;
                if (i10 >= this.f30436c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f30434a;
                this.f30437d = i10 + 1;
                charAt = charSequence.charAt(i10);
                this.f30438e = charAt;
            } while (charAt != ';');
            return (byte) 12;
        }

        private byte h() {
            char charAt;
            int i10 = this.f30437d;
            while (true) {
                int i11 = this.f30437d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f30434a;
                int i12 = i11 - 1;
                this.f30437d = i12;
                char charAt2 = charSequence.charAt(i12);
                this.f30438e = charAt2;
                if (charAt2 == '<') {
                    return (byte) 12;
                }
                if (charAt2 == '>') {
                    break;
                } else if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i13 = this.f30437d;
                        if (i13 > 0) {
                            CharSequence charSequence2 = this.f30434a;
                            int i14 = i13 - 1;
                            this.f30437d = i14;
                            charAt = charSequence2.charAt(i14);
                            this.f30438e = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
            this.f30437d = i10;
            this.f30438e = '>';
            return (byte) 13;
        }

        private byte i() {
            char charAt;
            int i10 = this.f30437d;
            while (true) {
                int i11 = this.f30437d;
                if (i11 < this.f30436c) {
                    CharSequence charSequence = this.f30434a;
                    this.f30437d = i11 + 1;
                    char charAt2 = charSequence.charAt(i11);
                    this.f30438e = charAt2;
                    if (charAt2 == '>') {
                        return (byte) 12;
                    }
                    if (charAt2 == '\"' || charAt2 == '\'') {
                        do {
                            int i12 = this.f30437d;
                            if (i12 < this.f30436c) {
                                CharSequence charSequence2 = this.f30434a;
                                this.f30437d = i12 + 1;
                                charAt = charSequence2.charAt(i12);
                                this.f30438e = charAt;
                            }
                        } while (charAt != charAt2);
                    }
                } else {
                    this.f30437d = i10;
                    this.f30438e = '<';
                    return (byte) 13;
                }
            }
        }

        byte a() {
            char charAt = this.f30434a.charAt(this.f30437d - 1);
            this.f30438e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f30434a, this.f30437d);
                this.f30437d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f30437d--;
            byte c10 = c(this.f30438e);
            if (this.f30435b) {
                char c11 = this.f30438e;
                if (c11 == '>') {
                    return h();
                }
                return c11 == ';' ? f() : c10;
            }
            return c10;
        }

        byte b() {
            char charAt = this.f30434a.charAt(this.f30437d);
            this.f30438e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f30434a, this.f30437d);
                this.f30437d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f30437d++;
            byte c10 = c(this.f30438e);
            if (this.f30435b) {
                char c11 = this.f30438e;
                if (c11 == '<') {
                    return i();
                }
                return c11 == '&' ? g() : c10;
            }
            return c10;
        }

        int d() {
            this.f30437d = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (this.f30437d < this.f30436c && i10 == 0) {
                byte b10 = b();
                if (b10 != 0) {
                    if (b10 == 1 || b10 == 2) {
                        if (i12 == 0) {
                            return 1;
                        }
                    } else if (b10 != 9) {
                        switch (b10) {
                            case 14:
                            case 15:
                                i12++;
                                i11 = -1;
                                break;
                            case 16:
                            case 17:
                                i12++;
                                i11 = 1;
                                break;
                            case 18:
                                i12--;
                                i11 = 0;
                                break;
                        }
                    }
                } else if (i12 == 0) {
                    return -1;
                }
                i10 = i12;
            }
            if (i10 == 0) {
                return 0;
            }
            if (i11 != 0) {
                return i11;
            }
            while (this.f30437d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i10 == i12) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i10 == i12) {
                            return 1;
                        }
                        break;
                    case 18:
                        i12++;
                        continue;
                }
                i12--;
            }
            return 0;
        }

        int e() {
            this.f30437d = this.f30436c;
            int i10 = 0;
            int i11 = 0;
            while (this.f30437d > 0) {
                byte a10 = a();
                if (a10 != 0) {
                    if (a10 == 1 || a10 == 2) {
                        if (i10 == 0) {
                            return 1;
                        }
                        if (i11 == 0) {
                            i11 = i10;
                        }
                    } else if (a10 != 9) {
                        switch (a10) {
                            case 14:
                            case 15:
                                if (i11 == i10) {
                                    return -1;
                                }
                                i10--;
                                break;
                            case 16:
                            case 17:
                                if (i11 == i10) {
                                    return 1;
                                }
                                i10--;
                                break;
                            case 18:
                                i10++;
                                break;
                            default:
                                if (i11 != 0) {
                                    break;
                                } else {
                                    i11 = i10;
                                    break;
                                }
                        }
                    } else {
                        continue;
                    }
                } else if (i10 == 0) {
                    return -1;
                } else {
                    if (i11 == 0) {
                        i11 = i10;
                    }
                }
            }
            return 0;
        }
    }

    static {
        e eVar = f.f30454c;
        f30422d = eVar;
        f30423e = Character.toString((char) 8206);
        f30424f = Character.toString((char) 8207);
        f30425g = new a(false, 2, eVar);
        f30426h = new a(true, 2, eVar);
    }

    a(boolean z10, int i10, e eVar) {
        this.f30427a = z10;
        this.f30428b = i10;
        this.f30429c = eVar;
    }

    private static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    private static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static a c() {
        return new C0389a().a();
    }

    static boolean e(Locale locale) {
        return g.b(locale) == 1;
    }

    private String f(CharSequence charSequence, e eVar) {
        boolean a10 = eVar.a(charSequence, 0, charSequence.length());
        if (this.f30427a || !(a10 || b(charSequence) == 1)) {
            return this.f30427a ? (!a10 || b(charSequence) == -1) ? f30424f : "" : "";
        }
        return f30423e;
    }

    private String g(CharSequence charSequence, e eVar) {
        boolean a10 = eVar.a(charSequence, 0, charSequence.length());
        if (this.f30427a || !(a10 || a(charSequence) == 1)) {
            return this.f30427a ? (!a10 || a(charSequence) == -1) ? f30424f : "" : "";
        }
        return f30423e;
    }

    public boolean d() {
        return (this.f30428b & 2) != 0;
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, this.f30429c, true);
    }

    public CharSequence i(CharSequence charSequence, e eVar, boolean z10) {
        if (charSequence == null) {
            return null;
        }
        boolean a10 = eVar.a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (d() && z10) {
            spannableStringBuilder.append((CharSequence) g(charSequence, a10 ? f.f30453b : f.f30452a));
        }
        if (a10 != this.f30427a) {
            spannableStringBuilder.append(a10 ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z10) {
            spannableStringBuilder.append((CharSequence) f(charSequence, a10 ? f.f30453b : f.f30452a));
        }
        return spannableStringBuilder;
    }
}
