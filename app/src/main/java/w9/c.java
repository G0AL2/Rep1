package w9;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import ea.n0;
import ea.r;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SsaStyle.java */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f38499a;

    /* renamed from: b  reason: collision with root package name */
    public final int f38500b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f38501c;

    /* renamed from: d  reason: collision with root package name */
    public final float f38502d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f38503e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f38504f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f38505g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f38506h;

    /* compiled from: SsaStyle.java */
    /* loaded from: classes2.dex */
    static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f38507a;

        /* renamed from: b  reason: collision with root package name */
        public final int f38508b;

        /* renamed from: c  reason: collision with root package name */
        public final int f38509c;

        /* renamed from: d  reason: collision with root package name */
        public final int f38510d;

        /* renamed from: e  reason: collision with root package name */
        public final int f38511e;

        /* renamed from: f  reason: collision with root package name */
        public final int f38512f;

        /* renamed from: g  reason: collision with root package name */
        public final int f38513g;

        /* renamed from: h  reason: collision with root package name */
        public final int f38514h;

        /* renamed from: i  reason: collision with root package name */
        public final int f38515i;

        private a(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            this.f38507a = i10;
            this.f38508b = i11;
            this.f38509c = i12;
            this.f38510d = i13;
            this.f38511e = i14;
            this.f38512f = i15;
            this.f38513g = i16;
            this.f38514h = i17;
            this.f38515i = i18;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public static a a(String str) {
            char c10;
            String[] split = TextUtils.split(str.substring(7), ",");
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            for (int i18 = 0; i18 < split.length; i18++) {
                String e10 = ib.b.e(split[i18].trim());
                e10.hashCode();
                switch (e10.hashCode()) {
                    case -1178781136:
                        if (e10.equals("italic")) {
                            c10 = 0;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1026963764:
                        if (e10.equals("underline")) {
                            c10 = 1;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -192095652:
                        if (e10.equals("strikeout")) {
                            c10 = 2;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -70925746:
                        if (e10.equals("primarycolour")) {
                            c10 = 3;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 3029637:
                        if (e10.equals("bold")) {
                            c10 = 4;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 3373707:
                        if (e10.equals("name")) {
                            c10 = 5;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 366554320:
                        if (e10.equals("fontsize")) {
                            c10 = 6;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1767875043:
                        if (e10.equals("alignment")) {
                            c10 = 7;
                            break;
                        }
                        c10 = 65535;
                        break;
                    default:
                        c10 = 65535;
                        break;
                }
                switch (c10) {
                    case 0:
                        i15 = i18;
                        break;
                    case 1:
                        i16 = i18;
                        break;
                    case 2:
                        i17 = i18;
                        break;
                    case 3:
                        i12 = i18;
                        break;
                    case 4:
                        i14 = i18;
                        break;
                    case 5:
                        i10 = i18;
                        break;
                    case 6:
                        i13 = i18;
                        break;
                    case 7:
                        i11 = i18;
                        break;
                }
            }
            if (i10 != -1) {
                return new a(i10, i11, i12, i13, i14, i15, i16, i17, split.length);
            }
            return null;
        }
    }

    /* compiled from: SsaStyle.java */
    /* loaded from: classes2.dex */
    static final class b {

        /* renamed from: c  reason: collision with root package name */
        private static final Pattern f38516c = Pattern.compile("\\{([^}]*)\\}");

        /* renamed from: d  reason: collision with root package name */
        private static final Pattern f38517d = Pattern.compile(n0.C("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: e  reason: collision with root package name */
        private static final Pattern f38518e = Pattern.compile(n0.C("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: f  reason: collision with root package name */
        private static final Pattern f38519f = Pattern.compile("\\\\an(\\d+)");

        /* renamed from: a  reason: collision with root package name */
        public final int f38520a;

        /* renamed from: b  reason: collision with root package name */
        public final PointF f38521b;

        private b(int i10, PointF pointF) {
            this.f38520a = i10;
            this.f38521b = pointF;
        }

        private static int a(String str) {
            Matcher matcher = f38519f.matcher(str);
            if (matcher.find()) {
                return c.d((String) ea.a.e(matcher.group(1)));
            }
            return -1;
        }

        public static b b(String str) {
            Matcher matcher = f38516c.matcher(str);
            PointF pointF = null;
            int i10 = -1;
            while (matcher.find()) {
                String str2 = (String) ea.a.e(matcher.group(1));
                try {
                    PointF c10 = c(str2);
                    if (c10 != null) {
                        pointF = c10;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int a10 = a(str2);
                    if (a10 != -1) {
                        i10 = a10;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new b(i10, pointF);
        }

        private static PointF c(String str) {
            String group;
            String group2;
            Matcher matcher = f38517d.matcher(str);
            Matcher matcher2 = f38518e.matcher(str);
            boolean find = matcher.find();
            boolean find2 = matcher2.find();
            if (find) {
                if (find2) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 82);
                    sb2.append("Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='");
                    sb2.append(str);
                    sb2.append("'");
                    r.f("SsaStyle.Overrides", sb2.toString());
                }
                group = matcher.group(1);
                group2 = matcher.group(2);
            } else if (!find2) {
                return null;
            } else {
                group = matcher2.group(1);
                group2 = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String) ea.a.e(group)).trim()), Float.parseFloat(((String) ea.a.e(group2)).trim()));
        }

        public static String d(String str) {
            return f38516c.matcher(str).replaceAll("");
        }
    }

    private c(String str, int i10, Integer num, float f10, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f38499a = str;
        this.f38500b = i10;
        this.f38501c = num;
        this.f38502d = f10;
        this.f38503e = z10;
        this.f38504f = z11;
        this.f38505g = z12;
        this.f38506h = z13;
    }

    public static c b(String str, a aVar) {
        ea.a.a(str.startsWith("Style:"));
        String[] split = TextUtils.split(str.substring(6), ",");
        int length = split.length;
        int i10 = aVar.f38515i;
        if (length != i10) {
            r.h("SsaStyle", n0.C("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i10), Integer.valueOf(split.length), str));
            return null;
        }
        try {
            String trim = split[aVar.f38507a].trim();
            int i11 = aVar.f38508b;
            int d10 = i11 != -1 ? d(split[i11].trim()) : -1;
            int i12 = aVar.f38509c;
            Integer f10 = i12 != -1 ? f(split[i12].trim()) : null;
            int i13 = aVar.f38510d;
            float g10 = i13 != -1 ? g(split[i13].trim()) : -3.4028235E38f;
            int i14 = aVar.f38511e;
            boolean z10 = i14 != -1 && e(split[i14].trim());
            int i15 = aVar.f38512f;
            boolean z11 = i15 != -1 && e(split[i15].trim());
            int i16 = aVar.f38513g;
            boolean z12 = i16 != -1 && e(split[i16].trim());
            int i17 = aVar.f38514h;
            return new c(trim, d10, f10, g10, z10, z11, z12, i17 != -1 && e(split[i17].trim()));
        } catch (RuntimeException e10) {
            StringBuilder sb2 = new StringBuilder(str.length() + 36);
            sb2.append("Skipping malformed 'Style:' line: '");
            sb2.append(str);
            sb2.append("'");
            r.i("SsaStyle", sb2.toString(), e10);
            return null;
        }
    }

    private static boolean c(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (c(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        String valueOf = String.valueOf(str);
        r.h("SsaStyle", valueOf.length() != 0 ? "Ignoring unknown alignment: ".concat(valueOf) : new String("Ignoring unknown alignment: "));
        return -1;
    }

    private static boolean e(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e10) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 33);
            sb2.append("Failed to parse boolean value: '");
            sb2.append(str);
            sb2.append("'");
            r.i("SsaStyle", sb2.toString(), e10);
            return false;
        }
    }

    public static Integer f(String str) {
        long parseLong;
        try {
            if (str.startsWith("&H")) {
                parseLong = Long.parseLong(str.substring(2), 16);
            } else {
                parseLong = Long.parseLong(str);
            }
            ea.a.a(parseLong <= 4294967295L);
            return Integer.valueOf(Color.argb(mb.d.d(((parseLong >> 24) & 255) ^ 255), mb.d.d(parseLong & 255), mb.d.d((parseLong >> 8) & 255), mb.d.d((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 36);
            sb2.append("Failed to parse color expression: '");
            sb2.append(str);
            sb2.append("'");
            r.i("SsaStyle", sb2.toString(), e10);
            return null;
        }
    }

    private static float g(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e10) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 29);
            sb2.append("Failed to parse font size: '");
            sb2.append(str);
            sb2.append("'");
            r.i("SsaStyle", sb2.toString(), e10);
            return -3.4028235E38f;
        }
    }
}
