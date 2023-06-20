package com.bytedance.sdk.component.b.a;

import com.inmobi.media.fq;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: HttpUrl.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: d  reason: collision with root package name */
    private static final char[] f10027d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a  reason: collision with root package name */
    final String f10028a;

    /* renamed from: b  reason: collision with root package name */
    final String f10029b;

    /* renamed from: c  reason: collision with root package name */
    final int f10030c;

    /* renamed from: e  reason: collision with root package name */
    private final String f10031e;

    /* renamed from: f  reason: collision with root package name */
    private final String f10032f;

    /* renamed from: g  reason: collision with root package name */
    private final List<String> f10033g;

    /* renamed from: h  reason: collision with root package name */
    private final List<String> f10034h;

    /* renamed from: i  reason: collision with root package name */
    private final String f10035i;

    /* renamed from: j  reason: collision with root package name */
    private final String f10036j;

    /* compiled from: HttpUrl.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        String f10037a;

        /* renamed from: d  reason: collision with root package name */
        String f10040d;

        /* renamed from: f  reason: collision with root package name */
        final List<String> f10042f;

        /* renamed from: g  reason: collision with root package name */
        List<String> f10043g;

        /* renamed from: h  reason: collision with root package name */
        String f10044h;

        /* renamed from: b  reason: collision with root package name */
        String f10038b = "";

        /* renamed from: c  reason: collision with root package name */
        String f10039c = "";

        /* renamed from: e  reason: collision with root package name */
        int f10041e = -1;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: HttpUrl.java */
        /* renamed from: com.bytedance.sdk.component.b.a.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public enum EnumC0155a {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f10042f = arrayList;
            arrayList.add("");
        }

        private boolean e(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        private boolean f(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        public a a(String str) {
            Objects.requireNonNull(str, "scheme == null");
            if (str.equalsIgnoreCase("http")) {
                this.f10037a = "http";
            } else if (str.equalsIgnoreCase("https")) {
                this.f10037a = "https";
            } else {
                throw new IllegalArgumentException("unexpected scheme: " + str);
            }
            return this;
        }

        public a b(String str) {
            Objects.requireNonNull(str, "host == null");
            String e10 = e(str, 0, str.length());
            if (e10 != null) {
                this.f10040d = e10;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + str);
        }

        public a c(String str) {
            Objects.requireNonNull(str, "encodedPathSegments == null");
            return a(str, true);
        }

        public a d(String str) {
            this.f10043g = str != null ? f.b(f.a(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f10037a);
            sb2.append("://");
            if (!this.f10038b.isEmpty() || !this.f10039c.isEmpty()) {
                sb2.append(this.f10038b);
                if (!this.f10039c.isEmpty()) {
                    sb2.append(':');
                    sb2.append(this.f10039c);
                }
                sb2.append('@');
            }
            if (this.f10040d.indexOf(58) != -1) {
                sb2.append('[');
                sb2.append(this.f10040d);
                sb2.append(']');
            } else {
                sb2.append(this.f10040d);
            }
            int a10 = a();
            if (a10 != f.a(this.f10037a)) {
                sb2.append(':');
                sb2.append(a10);
            }
            f.a(sb2, this.f10042f);
            if (this.f10043g != null) {
                sb2.append('?');
                f.b(sb2, this.f10043g);
            }
            if (this.f10044h != null) {
                sb2.append('#');
                sb2.append(this.f10044h);
            }
            return sb2.toString();
        }

        private static String e(String str, int i10, int i11) {
            return com.bytedance.sdk.component.b.a.b.i.a(f.a(str, i10, i11, false));
        }

        private void c() {
            List<String> list = this.f10042f;
            if (list.remove(list.size() - 1).isEmpty() && !this.f10042f.isEmpty()) {
                List<String> list2 = this.f10042f;
                list2.set(list2.size() - 1, "");
                return;
            }
            this.f10042f.add("");
        }

        private static int d(String str, int i10, int i11) {
            while (i10 < i11) {
                char charAt = str.charAt(i10);
                if (charAt == ':') {
                    return i10;
                }
                if (charAt == '[') {
                    do {
                        i10++;
                        if (i10 < i11) {
                        }
                    } while (str.charAt(i10) != ']');
                }
                i10++;
            }
            return i11;
        }

        private static int f(String str, int i10, int i11) {
            int parseInt;
            try {
                parseInt = Integer.parseInt(f.a(str, i10, i11, "", false, false, false, true, null));
            } catch (NumberFormatException unused) {
            }
            if (parseInt <= 0 || parseInt > 65535) {
                return -1;
            }
            return parseInt;
        }

        public f b() {
            if (this.f10037a != null) {
                if (this.f10040d != null) {
                    return new f(this);
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        private static int c(String str, int i10, int i11) {
            int i12 = 0;
            while (i10 < i11) {
                char charAt = str.charAt(i10);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i12++;
                i10++;
            }
            return i12;
        }

        int a() {
            int i10 = this.f10041e;
            return i10 != -1 ? i10 : f.a(this.f10037a);
        }

        private a a(String str, boolean z10) {
            int i10 = 0;
            do {
                int a10 = com.bytedance.sdk.component.b.a.b.i.a(str, i10, str.length(), "/\\");
                a(str, i10, a10, a10 < str.length(), z10);
                i10 = a10 + 1;
            } while (i10 <= str.length());
            return this;
        }

        private static int b(String str, int i10, int i11) {
            if (i11 - i10 < 2) {
                return -1;
            }
            char charAt = str.charAt(i10);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                while (true) {
                    i10++;
                    if (i10 >= i11) {
                        break;
                    }
                    char charAt2 = str.charAt(i10);
                    if (charAt2 < 'a' || charAt2 > 'z') {
                        if (charAt2 < 'A' || charAt2 > 'Z') {
                            if (charAt2 < '0' || charAt2 > '9') {
                                if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                    if (charAt2 == ':') {
                                        return i10;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        public a a(String str, String str2) {
            Objects.requireNonNull(str, "encodedName == null");
            if (this.f10043g == null) {
                this.f10043g = new ArrayList();
            }
            this.f10043g.add(f.a(str, " \"'<>#&=", true, false, true, true));
            this.f10043g.add(str2 != null ? f.a(str2, " \"'<>#&=", true, false, true, true) : null);
            return this;
        }

        EnumC0155a a(f fVar, String str) {
            int a10;
            int i10;
            int a11 = com.bytedance.sdk.component.b.a.b.i.a(str, 0, str.length());
            int b10 = com.bytedance.sdk.component.b.a.b.i.b(str, a11, str.length());
            if (b(str, a11, b10) != -1) {
                if (str.regionMatches(true, a11, "https:", 0, 6)) {
                    this.f10037a = "https";
                    a11 += 6;
                } else if (str.regionMatches(true, a11, "http:", 0, 5)) {
                    this.f10037a = "http";
                    a11 += 5;
                } else {
                    return EnumC0155a.UNSUPPORTED_SCHEME;
                }
            } else if (fVar != null) {
                this.f10037a = fVar.f10028a;
            } else {
                return EnumC0155a.MISSING_SCHEME;
            }
            int c10 = c(str, a11, b10);
            char c11 = '?';
            char c12 = '#';
            if (c10 < 2 && fVar != null && fVar.f10028a.equals(this.f10037a)) {
                this.f10038b = fVar.b();
                this.f10039c = fVar.c();
                this.f10040d = fVar.f10029b;
                this.f10041e = fVar.f10030c;
                this.f10042f.clear();
                this.f10042f.addAll(fVar.d());
                if (a11 == b10 || str.charAt(a11) == '#') {
                    d(fVar.e());
                }
            } else {
                int i11 = a11 + c10;
                boolean z10 = false;
                boolean z11 = false;
                while (true) {
                    a10 = com.bytedance.sdk.component.b.a.b.i.a(str, i11, b10, "@/\\?#");
                    char charAt = a10 != b10 ? str.charAt(a10) : (char) 65535;
                    if (charAt == 65535 || charAt == c12 || charAt == '/' || charAt == '\\' || charAt == c11) {
                        break;
                    }
                    if (charAt == '@') {
                        if (!z10) {
                            int a12 = com.bytedance.sdk.component.b.a.b.i.a(str, i11, a10, ':');
                            i10 = a10;
                            String a13 = f.a(str, i11, a12, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z11) {
                                a13 = this.f10038b + "%40" + a13;
                            }
                            this.f10038b = a13;
                            if (a12 != i10) {
                                this.f10039c = f.a(str, a12 + 1, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z10 = true;
                            }
                            z11 = true;
                        } else {
                            i10 = a10;
                            this.f10039c += "%40" + f.a(str, i11, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                        }
                        i11 = i10 + 1;
                    }
                    c11 = '?';
                    c12 = '#';
                }
                int d10 = d(str, i11, a10);
                int i12 = d10 + 1;
                if (i12 < a10) {
                    this.f10040d = e(str, i11, d10);
                    int f10 = f(str, i12, a10);
                    this.f10041e = f10;
                    if (f10 == -1) {
                        return EnumC0155a.INVALID_PORT;
                    }
                } else {
                    this.f10040d = e(str, i11, d10);
                    this.f10041e = f.a(this.f10037a);
                }
                if (this.f10040d == null) {
                    return EnumC0155a.INVALID_HOST;
                }
                a11 = a10;
            }
            int a14 = com.bytedance.sdk.component.b.a.b.i.a(str, a11, b10, "?#");
            a(str, a11, a14);
            if (a14 < b10 && str.charAt(a14) == '?') {
                int a15 = com.bytedance.sdk.component.b.a.b.i.a(str, a14, b10, '#');
                this.f10043g = f.b(f.a(str, a14 + 1, a15, " \"'<>#", true, false, true, true, null));
                a14 = a15;
            }
            if (a14 < b10 && str.charAt(a14) == '#') {
                this.f10044h = f.a(str, 1 + a14, b10, "", true, false, false, false, null);
            }
            return EnumC0155a.SUCCESS;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
            */
        /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0044 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0041 -> B:11:0x0029). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void a(java.lang.String r11, int r12, int r13) {
            /*
                r10 = this;
                if (r12 != r13) goto L3
                return
            L3:
                char r0 = r11.charAt(r12)
                r1 = 47
                java.lang.String r2 = ""
                r3 = 1
                if (r0 == r1) goto L1e
                r1 = 92
                if (r0 != r1) goto L13
                goto L1e
            L13:
                java.util.List<java.lang.String> r0 = r10.f10042f
                int r1 = r0.size()
                int r1 = r1 - r3
                r0.set(r1, r2)
                goto L29
            L1e:
                java.util.List<java.lang.String> r0 = r10.f10042f
                r0.clear()
                java.util.List<java.lang.String> r0 = r10.f10042f
                r0.add(r2)
                goto L41
            L29:
                r6 = r12
                if (r6 >= r13) goto L44
                java.lang.String r12 = "/\\"
                int r12 = com.bytedance.sdk.component.b.a.b.i.a(r11, r6, r13, r12)
                if (r12 >= r13) goto L36
                r0 = 1
                goto L37
            L36:
                r0 = 0
            L37:
                r9 = 1
                r4 = r10
                r5 = r11
                r7 = r12
                r8 = r0
                r4.a(r5, r6, r7, r8, r9)
                if (r0 == 0) goto L29
            L41:
                int r12 = r12 + 1
                goto L29
            L44:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.b.a.f.a.a(java.lang.String, int, int):void");
        }

        private void a(String str, int i10, int i11, boolean z10, boolean z11) {
            String a10 = f.a(str, i10, i11, " \"<>^`{}|/\\?#", z11, false, false, true, null);
            if (e(a10)) {
                return;
            }
            if (f(a10)) {
                c();
                return;
            }
            List<String> list = this.f10042f;
            if (list.get(list.size() - 1).isEmpty()) {
                List<String> list2 = this.f10042f;
                list2.set(list2.size() - 1, a10);
            } else {
                this.f10042f.add(a10);
            }
            if (z10) {
                this.f10042f.add("");
            }
        }
    }

    f(a aVar) {
        this.f10028a = aVar.f10037a;
        this.f10031e = a(aVar.f10038b, false);
        this.f10032f = a(aVar.f10039c, false);
        this.f10029b = aVar.f10040d;
        this.f10030c = aVar.a();
        this.f10033g = a(aVar.f10042f, false);
        List<String> list = aVar.f10043g;
        this.f10034h = list != null ? a(list, true) : null;
        String str = aVar.f10044h;
        this.f10035i = str != null ? a(str, false) : null;
        this.f10036j = aVar.toString();
    }

    public URL a() {
        try {
            return new URL(this.f10036j);
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }

    public String b() {
        if (this.f10031e.isEmpty()) {
            return "";
        }
        int length = this.f10028a.length() + 3;
        String str = this.f10036j;
        return this.f10036j.substring(length, com.bytedance.sdk.component.b.a.b.i.a(str, length, str.length(), ":@"));
    }

    public String c() {
        if (this.f10032f.isEmpty()) {
            return "";
        }
        int indexOf = this.f10036j.indexOf(64);
        return this.f10036j.substring(this.f10036j.indexOf(58, this.f10028a.length() + 3) + 1, indexOf);
    }

    public List<String> d() {
        int indexOf = this.f10036j.indexOf(47, this.f10028a.length() + 3);
        String str = this.f10036j;
        int a10 = com.bytedance.sdk.component.b.a.b.i.a(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < a10) {
            int i10 = indexOf + 1;
            int a11 = com.bytedance.sdk.component.b.a.b.i.a(this.f10036j, i10, a10, '/');
            arrayList.add(this.f10036j.substring(i10, a11));
            indexOf = a11;
        }
        return arrayList;
    }

    public String e() {
        if (this.f10034h == null) {
            return null;
        }
        int indexOf = this.f10036j.indexOf(63) + 1;
        String str = this.f10036j;
        return this.f10036j.substring(indexOf, com.bytedance.sdk.component.b.a.b.i.a(str, indexOf, str.length(), '#'));
    }

    public boolean equals(Object obj) {
        return (obj instanceof f) && ((f) obj).f10036j.equals(this.f10036j);
    }

    public int hashCode() {
        return this.f10036j.hashCode();
    }

    public String toString() {
        return this.f10036j;
    }

    public static int a(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    static void a(StringBuilder sb2, List<String> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append('/');
            sb2.append(list.get(i10));
        }
    }

    static void b(StringBuilder sb2, List<String> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10 += 2) {
            String str = list.get(i10);
            String str2 = list.get(i10 + 1);
            if (i10 > 0) {
                sb2.append('&');
            }
            sb2.append(str);
            if (str2 != null) {
                sb2.append('=');
                sb2.append(str2);
            }
        }
    }

    public static f c(String str) {
        a aVar = new a();
        if (aVar.a((f) null, str) == a.EnumC0155a.SUCCESS) {
            return aVar.b();
        }
        return null;
    }

    static String a(String str, boolean z10) {
        return a(str, 0, str.length(), z10);
    }

    private List<String> a(List<String> list, boolean z10) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            String str = list.get(i10);
            arrayList.add(str != null ? a(str, z10) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    static List<String> b(String str) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 <= str.length()) {
            int indexOf = str.indexOf(38, i10);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i10);
            if (indexOf2 != -1 && indexOf2 <= indexOf) {
                arrayList.add(str.substring(i10, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            } else {
                arrayList.add(str.substring(i10, indexOf));
                arrayList.add(null);
            }
            i10 = indexOf + 1;
        }
        return arrayList;
    }

    static String a(String str, int i10, int i11, boolean z10) {
        for (int i12 = i10; i12 < i11; i12++) {
            char charAt = str.charAt(i12);
            if (charAt == '%' || (charAt == '+' && z10)) {
                com.bytedance.sdk.component.b.a.b.a aVar = new com.bytedance.sdk.component.b.a.b.a();
                aVar.a(str, i10, i12);
                a(aVar, str, i12, i11, z10);
                return aVar.c();
            }
        }
        return str.substring(i10, i11);
    }

    static void a(com.bytedance.sdk.component.b.a.b.a aVar, String str, int i10, int i11, boolean z10) {
        int i12;
        while (i10 < i11) {
            int codePointAt = str.codePointAt(i10);
            if (codePointAt == 37 && (i12 = i10 + 2) < i11) {
                int a10 = com.bytedance.sdk.component.b.a.b.i.a(str.charAt(i10 + 1));
                int a11 = com.bytedance.sdk.component.b.a.b.i.a(str.charAt(i12));
                if (a10 != -1 && a11 != -1) {
                    aVar.b((a10 << 4) + a11);
                    i10 = i12;
                }
                aVar.a(codePointAt);
            } else {
                if (codePointAt == 43 && z10) {
                    aVar.b(32);
                }
                aVar.a(codePointAt);
            }
            i10 += Character.charCount(codePointAt);
        }
    }

    static boolean a(String str, int i10, int i11) {
        int i12 = i10 + 2;
        return i12 < i11 && str.charAt(i10) == '%' && com.bytedance.sdk.component.b.a.b.i.a(str.charAt(i10 + 1)) != -1 && com.bytedance.sdk.component.b.a.b.i.a(str.charAt(i12)) != -1;
    }

    static String a(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
        int i12 = i10;
        while (i12 < i11) {
            int codePointAt = str.codePointAt(i12);
            if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || !z13)) {
                if (str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z10 && (!z11 || a(str, i12, i11)))) && (codePointAt != 43 || !z12))) {
                    i12 += Character.charCount(codePointAt);
                }
            }
            com.bytedance.sdk.component.b.a.b.a aVar = new com.bytedance.sdk.component.b.a.b.a();
            aVar.a(str, i10, i12);
            a(aVar, str, i12, i11, str2, z10, z11, z12, z13, charset);
            return aVar.c();
        }
        return str.substring(i10, i11);
    }

    static void a(com.bytedance.sdk.component.b.a.b.a aVar, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
        com.bytedance.sdk.component.b.a.b.a aVar2 = null;
        while (i10 < i11) {
            int codePointAt = str.codePointAt(i10);
            if (!z10 || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (codePointAt == 43 && z12) {
                    aVar.a(z10 ? "+" : "%2B");
                } else if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || !z13) && str2.indexOf(codePointAt) == -1 && (codePointAt != 37 || (z10 && (!z11 || a(str, i10, i11)))))) {
                    aVar.a(codePointAt);
                } else {
                    if (aVar2 == null) {
                        aVar2 = new com.bytedance.sdk.component.b.a.b.a();
                    }
                    if (charset != null && !charset.equals(com.bytedance.sdk.component.b.a.b.i.f10025a)) {
                        aVar2.a(str, i10, Character.charCount(codePointAt) + i10, charset);
                    } else {
                        aVar2.a(codePointAt);
                    }
                    while (!aVar2.a()) {
                        int b10 = aVar2.b() & fq.i.NETWORK_LOAD_LIMIT_DISABLED;
                        aVar.b(37);
                        char[] cArr = f10027d;
                        aVar.b((int) cArr[(b10 >> 4) & 15]);
                        aVar.b((int) cArr[b10 & 15]);
                    }
                }
            }
            i10 += Character.charCount(codePointAt);
        }
    }

    static String a(String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13) {
        return a(str, 0, str.length(), str2, z10, z11, z12, z13, null);
    }
}
