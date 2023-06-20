package ye;

import com.applovin.sdk.AppLovinEventParameters;
import com.google.android.gms.common.internal.ImagesContract;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: HttpUrl.kt */
/* loaded from: classes3.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f39757a;

    /* renamed from: b  reason: collision with root package name */
    private final String f39758b;

    /* renamed from: c  reason: collision with root package name */
    private final String f39759c;

    /* renamed from: d  reason: collision with root package name */
    private final String f39760d;

    /* renamed from: e  reason: collision with root package name */
    private final String f39761e;

    /* renamed from: f  reason: collision with root package name */
    private final int f39762f;

    /* renamed from: g  reason: collision with root package name */
    private final List<String> f39763g;

    /* renamed from: h  reason: collision with root package name */
    private final List<String> f39764h;

    /* renamed from: i  reason: collision with root package name */
    private final String f39765i;

    /* renamed from: j  reason: collision with root package name */
    private final String f39766j;

    /* renamed from: l  reason: collision with root package name */
    public static final b f39756l = new b(null);

    /* renamed from: k  reason: collision with root package name */
    private static final char[] f39755k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* compiled from: HttpUrl.kt */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: i  reason: collision with root package name */
        public static final C0557a f39767i = new C0557a(null);

        /* renamed from: a  reason: collision with root package name */
        private String f39768a;

        /* renamed from: d  reason: collision with root package name */
        private String f39771d;

        /* renamed from: f  reason: collision with root package name */
        private final List<String> f39773f;

        /* renamed from: g  reason: collision with root package name */
        private List<String> f39774g;

        /* renamed from: h  reason: collision with root package name */
        private String f39775h;

        /* renamed from: b  reason: collision with root package name */
        private String f39769b = "";

        /* renamed from: c  reason: collision with root package name */
        private String f39770c = "";

        /* renamed from: e  reason: collision with root package name */
        private int f39772e = -1;

        /* compiled from: HttpUrl.kt */
        /* renamed from: ye.u$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0557a {
            private C0557a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int e(String str, int i10, int i11) {
                try {
                    int parseInt = Integer.parseInt(b.b(u.f39756l, str, i10, i11, "", false, false, false, false, null, 248, null));
                    if (1 <= parseInt && 65535 >= parseInt) {
                        return parseInt;
                    }
                    return -1;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int f(String str, int i10, int i11) {
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

            /* JADX INFO: Access modifiers changed from: private */
            public final int g(String str, int i10, int i11) {
                if (i11 - i10 < 2) {
                    return -1;
                }
                char charAt = str.charAt(i10);
                if ((qe.k.h(charAt, 97) < 0 || qe.k.h(charAt, 122) > 0) && (qe.k.h(charAt, 65) < 0 || qe.k.h(charAt, 90) > 0)) {
                    return -1;
                }
                while (true) {
                    i10++;
                    if (i10 >= i11) {
                        return -1;
                    }
                    char charAt2 = str.charAt(i10);
                    if ('a' > charAt2 || 'z' < charAt2) {
                        if ('A' > charAt2 || 'Z' < charAt2) {
                            if ('0' > charAt2 || '9' < charAt2) {
                                if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                    if (charAt2 == ':') {
                                        return i10;
                                    }
                                    return -1;
                                }
                            }
                        }
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int h(String str, int i10, int i11) {
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

            public /* synthetic */ C0557a(qe.g gVar) {
                this();
            }
        }

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f39773f = arrayList;
            arrayList.add("");
        }

        private final int b() {
            int i10 = this.f39772e;
            if (i10 != -1) {
                return i10;
            }
            b bVar = u.f39756l;
            String str = this.f39768a;
            qe.k.c(str);
            return bVar.c(str);
        }

        private final boolean f(String str) {
            boolean l10;
            if (qe.k.a(str, ".")) {
                return true;
            }
            l10 = ve.p.l(str, "%2e", true);
            return l10;
        }

        private final boolean g(String str) {
            boolean l10;
            boolean l11;
            boolean l12;
            if (qe.k.a(str, "..")) {
                return true;
            }
            l10 = ve.p.l(str, "%2e.", true);
            if (l10) {
                return true;
            }
            l11 = ve.p.l(str, ".%2e", true);
            if (l11) {
                return true;
            }
            l12 = ve.p.l(str, "%2e%2e", true);
            return l12;
        }

        private final void j() {
            List<String> list = this.f39773f;
            if ((list.remove(list.size() - 1).length() == 0) && (!this.f39773f.isEmpty())) {
                List<String> list2 = this.f39773f;
                list2.set(list2.size() - 1, "");
                return;
            }
            this.f39773f.add("");
        }

        private final void l(String str, int i10, int i11, boolean z10, boolean z11) {
            String b10 = b.b(u.f39756l, str, i10, i11, " \"<>^`{}|/\\?#", z11, false, false, false, null, 240, null);
            if (f(b10)) {
                return;
            }
            if (g(b10)) {
                j();
                return;
            }
            List<String> list = this.f39773f;
            if (list.get(list.size() - 1).length() == 0) {
                List<String> list2 = this.f39773f;
                list2.set(list2.size() - 1, b10);
            } else {
                this.f39773f.add(b10);
            }
            if (z10) {
                this.f39773f.add("");
            }
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
        private final void n(java.lang.String r11, int r12, int r13) {
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
                java.util.List<java.lang.String> r0 = r10.f39773f
                int r1 = r0.size()
                int r1 = r1 - r3
                r0.set(r1, r2)
                goto L29
            L1e:
                java.util.List<java.lang.String> r0 = r10.f39773f
                r0.clear()
                java.util.List<java.lang.String> r0 = r10.f39773f
                r0.add(r2)
                goto L41
            L29:
                r6 = r12
                if (r6 >= r13) goto L44
                java.lang.String r12 = "/\\"
                int r12 = ze.c.n(r11, r12, r6, r13)
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
                r4.l(r5, r6, r7, r8, r9)
                if (r0 == 0) goto L29
            L41:
                int r12 = r12 + 1
                goto L29
            L44:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ye.u.a.n(java.lang.String, int, int):void");
        }

        public final u a() {
            int p10;
            ArrayList arrayList;
            int p11;
            String str = this.f39768a;
            if (str != null) {
                b bVar = u.f39756l;
                String h10 = b.h(bVar, this.f39769b, 0, 0, false, 7, null);
                String h11 = b.h(bVar, this.f39770c, 0, 0, false, 7, null);
                String str2 = this.f39771d;
                if (str2 != null) {
                    int b10 = b();
                    List<String> list = this.f39773f;
                    p10 = fe.q.p(list, 10);
                    ArrayList arrayList2 = new ArrayList(p10);
                    for (String str3 : list) {
                        arrayList2.add(b.h(u.f39756l, str3, 0, 0, false, 7, null));
                    }
                    List<String> list2 = this.f39774g;
                    if (list2 != null) {
                        p11 = fe.q.p(list2, 10);
                        arrayList = new ArrayList(p11);
                        for (String str4 : list2) {
                            arrayList.add(str4 != null ? b.h(u.f39756l, str4, 0, 0, true, 3, null) : null);
                        }
                    } else {
                        arrayList = null;
                    }
                    String str5 = this.f39775h;
                    return new u(str, h10, h11, str2, b10, arrayList2, arrayList, str5 != null ? b.h(u.f39756l, str5, 0, 0, false, 7, null) : null, toString());
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        public final a c(String str) {
            List<String> list;
            if (str != null) {
                b bVar = u.f39756l;
                String b10 = b.b(bVar, str, 0, 0, " \"'<>#", true, false, true, false, null, 211, null);
                if (b10 != null) {
                    list = bVar.j(b10);
                    this.f39774g = list;
                    return this;
                }
            }
            list = null;
            this.f39774g = list;
            return this;
        }

        public final List<String> d() {
            return this.f39773f;
        }

        public final a e(String str) {
            qe.k.f(str, "host");
            String e10 = ze.a.e(b.h(u.f39756l, str, 0, 0, false, 7, null));
            if (e10 != null) {
                this.f39771d = e10;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + str);
        }

        public final a h(u uVar, String str) {
            int n10;
            int i10;
            int i11;
            String str2;
            int i12;
            String str3;
            int i13;
            boolean z10;
            boolean z11;
            boolean v10;
            boolean v11;
            qe.k.f(str, "input");
            int x10 = ze.c.x(str, 0, 0, 3, null);
            int z12 = ze.c.z(str, x10, 0, 2, null);
            C0557a c0557a = f39767i;
            int g10 = c0557a.g(str, x10, z12);
            String str4 = "(this as java.lang.Strin…ing(startIndex, endIndex)";
            char c10 = 65535;
            if (g10 != -1) {
                v10 = ve.p.v(str, "https:", x10, true);
                if (v10) {
                    this.f39768a = "https";
                    x10 += 6;
                } else {
                    v11 = ve.p.v(str, "http:", x10, true);
                    if (v11) {
                        this.f39768a = "http";
                        x10 += 5;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Expected URL scheme 'http' or 'https' but was '");
                        String substring = str.substring(0, g10);
                        qe.k.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        sb2.append(substring);
                        sb2.append("'");
                        throw new IllegalArgumentException(sb2.toString());
                    }
                }
            } else if (uVar != null) {
                this.f39768a = uVar.q();
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int h10 = c0557a.h(str, x10, z12);
            char c11 = '?';
            char c12 = '#';
            if (h10 < 2 && uVar != null && !(!qe.k.a(uVar.q(), this.f39768a))) {
                this.f39769b = uVar.g();
                this.f39770c = uVar.c();
                this.f39771d = uVar.h();
                this.f39772e = uVar.m();
                this.f39773f.clear();
                this.f39773f.addAll(uVar.e());
                if (x10 == z12 || str.charAt(x10) == '#') {
                    c(uVar.f());
                }
                i10 = z12;
            } else {
                int i14 = x10 + h10;
                boolean z13 = false;
                boolean z14 = false;
                while (true) {
                    n10 = ze.c.n(str, "@/\\?#", i14, z12);
                    char charAt = n10 != z12 ? str.charAt(n10) : (char) 65535;
                    if (charAt == c10 || charAt == c12 || charAt == '/' || charAt == '\\' || charAt == c11) {
                        break;
                    }
                    if (charAt != '@') {
                        str3 = str4;
                        i12 = z12;
                    } else {
                        if (!z13) {
                            int m10 = ze.c.m(str, ':', i14, n10);
                            b bVar = u.f39756l;
                            i12 = z12;
                            String str5 = str4;
                            String b10 = b.b(bVar, str, i14, m10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z14) {
                                b10 = this.f39769b + "%40" + b10;
                            }
                            this.f39769b = b10;
                            if (m10 != n10) {
                                this.f39770c = b.b(bVar, str, m10 + 1, n10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z11 = true;
                            } else {
                                z11 = z13;
                            }
                            z13 = z11;
                            str3 = str5;
                            z10 = true;
                            i13 = n10;
                        } else {
                            i12 = z12;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(this.f39770c);
                            sb3.append("%40");
                            str3 = str4;
                            i13 = n10;
                            sb3.append(b.b(u.f39756l, str, i14, n10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.f39770c = sb3.toString();
                            z10 = z14;
                        }
                        i14 = i13 + 1;
                        z14 = z10;
                    }
                    str4 = str3;
                    z12 = i12;
                    c12 = '#';
                    c11 = '?';
                    c10 = 65535;
                }
                String str6 = str4;
                i10 = z12;
                C0557a c0557a2 = f39767i;
                int f10 = c0557a2.f(str, i14, n10);
                int i15 = f10 + 1;
                if (i15 < n10) {
                    i11 = i14;
                    this.f39771d = ze.a.e(b.h(u.f39756l, str, i14, f10, false, 4, null));
                    int e10 = c0557a2.e(str, i15, n10);
                    this.f39772e = e10;
                    if (!(e10 != -1)) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Invalid URL port: \"");
                        String substring2 = str.substring(i15, n10);
                        qe.k.e(substring2, str6);
                        sb4.append(substring2);
                        sb4.append('\"');
                        throw new IllegalArgumentException(sb4.toString().toString());
                    }
                    str2 = str6;
                } else {
                    i11 = i14;
                    str2 = str6;
                    b bVar2 = u.f39756l;
                    this.f39771d = ze.a.e(b.h(bVar2, str, i11, f10, false, 4, null));
                    String str7 = this.f39768a;
                    qe.k.c(str7);
                    this.f39772e = bVar2.c(str7);
                }
                if (!(this.f39771d != null)) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Invalid URL host: \"");
                    String substring3 = str.substring(i11, f10);
                    qe.k.e(substring3, str2);
                    sb5.append(substring3);
                    sb5.append('\"');
                    throw new IllegalArgumentException(sb5.toString().toString());
                }
                x10 = n10;
            }
            int i16 = i10;
            int n11 = ze.c.n(str, "?#", x10, i16);
            n(str, x10, n11);
            if (n11 < i16 && str.charAt(n11) == '?') {
                int m11 = ze.c.m(str, '#', n11, i16);
                b bVar3 = u.f39756l;
                this.f39774g = bVar3.j(b.b(bVar3, str, n11 + 1, m11, " \"'<>#", true, false, true, false, null, 208, null));
                n11 = m11;
            }
            if (n11 < i16 && str.charAt(n11) == '#') {
                this.f39775h = b.b(u.f39756l, str, n11 + 1, i16, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        public final a i(String str) {
            qe.k.f(str, "password");
            this.f39770c = b.b(u.f39756l, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        public final a k(int i10) {
            boolean z10 = true;
            if ((1 > i10 || 65535 < i10) ? false : false) {
                this.f39772e = i10;
                return this;
            }
            throw new IllegalArgumentException(("unexpected port: " + i10).toString());
        }

        public final a m() {
            String str = this.f39771d;
            this.f39771d = str != null ? new ve.f("[\"<>^`{|}]").b(str, "") : null;
            int size = this.f39773f.size();
            for (int i10 = 0; i10 < size; i10++) {
                List<String> list = this.f39773f;
                list.set(i10, b.b(u.f39756l, list.get(i10), 0, 0, "[]", true, true, false, false, null, 227, null));
            }
            List<String> list2 = this.f39774g;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    String str2 = list2.get(i11);
                    list2.set(i11, str2 != null ? b.b(u.f39756l, str2, 0, 0, "\\^`{|}", true, true, true, false, null, DownloadResource.STATUS_WAITING_FOR_NETWORK, null) : null);
                }
            }
            String str3 = this.f39775h;
            this.f39775h = str3 != null ? b.b(u.f39756l, str3, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, 163, null) : null;
            return this;
        }

        public final a o(String str) {
            boolean l10;
            boolean l11;
            qe.k.f(str, "scheme");
            l10 = ve.p.l(str, "http", true);
            if (l10) {
                this.f39768a = "http";
            } else {
                l11 = ve.p.l(str, "https", true);
                if (!l11) {
                    throw new IllegalArgumentException("unexpected scheme: " + str);
                }
                this.f39768a = "https";
            }
            return this;
        }

        public final void p(String str) {
            this.f39775h = str;
        }

        public final void q(String str) {
            qe.k.f(str, "<set-?>");
            this.f39770c = str;
        }

        public final void r(String str) {
            qe.k.f(str, "<set-?>");
            this.f39769b = str;
        }

        public final void s(String str) {
            this.f39771d = str;
        }

        public final void t(int i10) {
            this.f39772e = i10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
            if ((r6.f39770c.length() > 0) != false) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0091, code lost:
            if (r1 != r3.c(r2)) goto L36;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r6.f39768a
                if (r1 == 0) goto L12
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L17
            L12:
                java.lang.String r1 = "//"
                r0.append(r1)
            L17:
                java.lang.String r1 = r6.f39769b
                int r1 = r1.length()
                r2 = 1
                r3 = 0
                if (r1 <= 0) goto L23
                r1 = 1
                goto L24
            L23:
                r1 = 0
            L24:
                r4 = 58
                if (r1 != 0) goto L35
                java.lang.String r1 = r6.f39770c
                int r1 = r1.length()
                if (r1 <= 0) goto L32
                r1 = 1
                goto L33
            L32:
                r1 = 0
            L33:
                if (r1 == 0) goto L53
            L35:
                java.lang.String r1 = r6.f39769b
                r0.append(r1)
                java.lang.String r1 = r6.f39770c
                int r1 = r1.length()
                if (r1 <= 0) goto L43
                goto L44
            L43:
                r2 = 0
            L44:
                if (r2 == 0) goto L4e
                r0.append(r4)
                java.lang.String r1 = r6.f39770c
                r0.append(r1)
            L4e:
                r1 = 64
                r0.append(r1)
            L53:
                java.lang.String r1 = r6.f39771d
                if (r1 == 0) goto L77
                qe.k.c(r1)
                r2 = 2
                r5 = 0
                boolean r1 = ve.g.C(r1, r4, r3, r2, r5)
                if (r1 == 0) goto L72
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.f39771d
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L77
            L72:
                java.lang.String r1 = r6.f39771d
                r0.append(r1)
            L77:
                int r1 = r6.f39772e
                r2 = -1
                if (r1 != r2) goto L80
                java.lang.String r1 = r6.f39768a
                if (r1 == 0) goto L99
            L80:
                int r1 = r6.b()
                java.lang.String r2 = r6.f39768a
                if (r2 == 0) goto L93
                ye.u$b r3 = ye.u.f39756l
                qe.k.c(r2)
                int r2 = r3.c(r2)
                if (r1 == r2) goto L99
            L93:
                r0.append(r4)
                r0.append(r1)
            L99:
                ye.u$b r1 = ye.u.f39756l
                java.util.List<java.lang.String> r2 = r6.f39773f
                r1.i(r2, r0)
                java.util.List<java.lang.String> r2 = r6.f39774g
                if (r2 == 0) goto Lb1
                r2 = 63
                r0.append(r2)
                java.util.List<java.lang.String> r2 = r6.f39774g
                qe.k.c(r2)
                r1.k(r2, r0)
            Lb1:
                java.lang.String r1 = r6.f39775h
                if (r1 == 0) goto Lbf
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.f39775h
                r0.append(r1)
            Lbf:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                qe.k.e(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ye.u.a.toString():java.lang.String");
        }

        public final void u(String str) {
            this.f39768a = str;
        }

        public final a v(String str) {
            qe.k.f(str, AppLovinEventParameters.USER_ACCOUNT_IDENTIFIER);
            this.f39769b = b.b(u.f39756l, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }
    }

    /* compiled from: HttpUrl.kt */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public static /* synthetic */ String b(b bVar, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset, int i12, Object obj) {
            return bVar.a(str, (i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? str.length() : i11, str2, (i12 & 8) != 0 ? false : z10, (i12 & 16) != 0 ? false : z11, (i12 & 32) != 0 ? false : z12, (i12 & 64) != 0 ? false : z13, (i12 & 128) != 0 ? null : charset);
        }

        private final boolean e(String str, int i10, int i11) {
            int i12 = i10 + 2;
            return i12 < i11 && str.charAt(i10) == '%' && ze.c.F(str.charAt(i10 + 1)) != -1 && ze.c.F(str.charAt(i12)) != -1;
        }

        public static /* synthetic */ String h(b bVar, String str, int i10, int i11, boolean z10, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = str.length();
            }
            if ((i12 & 4) != 0) {
                z10 = false;
            }
            return bVar.g(str, i10, i11, z10);
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x0065, code lost:
            if (e(r16, r5, r18) == false) goto L39;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void l(mf.f r15, java.lang.String r16, int r17, int r18, java.lang.String r19, boolean r20, boolean r21, boolean r22, boolean r23, java.nio.charset.Charset r24) {
            /*
                r14 = this;
                r0 = r15
                r1 = r16
                r2 = r18
                r3 = r24
                r4 = 0
                r5 = r17
                r6 = r4
            Lb:
                if (r5 >= r2) goto Lbf
                java.lang.String r7 = "null cannot be cast to non-null type java.lang.String"
                java.util.Objects.requireNonNull(r1, r7)
                int r7 = r1.codePointAt(r5)
                if (r20 == 0) goto L2e
                r8 = 9
                if (r7 == r8) goto L29
                r8 = 10
                if (r7 == r8) goto L29
                r8 = 12
                if (r7 == r8) goto L29
                r8 = 13
                if (r7 == r8) goto L29
                goto L2e
            L29:
                r8 = r14
                r12 = r19
                goto Lb8
            L2e:
                r8 = 43
                if (r7 != r8) goto L3f
                if (r22 == 0) goto L3f
                if (r20 == 0) goto L39
                java.lang.String r8 = "+"
                goto L3b
            L39:
                java.lang.String r8 = "%2B"
            L3b:
                r15.M(r8)
                goto L29
            L3f:
                r8 = 32
                r9 = 37
                if (r7 < r8) goto L6f
                r8 = 127(0x7f, float:1.78E-43)
                if (r7 == r8) goto L6f
                r8 = 128(0x80, float:1.8E-43)
                if (r7 < r8) goto L4f
                if (r23 == 0) goto L6f
            L4f:
                char r8 = (char) r7
                r10 = 0
                r11 = 2
                r12 = r19
                boolean r8 = ve.g.C(r12, r8, r10, r11, r4)
                if (r8 != 0) goto L6d
                if (r7 != r9) goto L68
                if (r20 == 0) goto L6d
                if (r21 == 0) goto L68
                r8 = r14
                boolean r10 = r14.e(r1, r5, r2)
                if (r10 != 0) goto L69
                goto L72
            L68:
                r8 = r14
            L69:
                r15.m1(r7)
                goto Lb8
            L6d:
                r8 = r14
                goto L72
            L6f:
                r8 = r14
                r12 = r19
            L72:
                if (r6 != 0) goto L79
                mf.f r6 = new mf.f
                r6.<init>()
            L79:
                if (r3 == 0) goto L8d
                java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8
                boolean r10 = qe.k.a(r3, r10)
                if (r10 == 0) goto L84
                goto L8d
            L84:
                int r10 = java.lang.Character.charCount(r7)
                int r10 = r10 + r5
                r6.j1(r1, r5, r10, r3)
                goto L90
            L8d:
                r6.m1(r7)
            L90:
                boolean r10 = r6.w0()
                if (r10 != 0) goto Lb8
                byte r10 = r6.readByte()
                r10 = r10 & 255(0xff, float:3.57E-43)
                r15.writeByte(r9)
                char[] r11 = ye.u.a()
                int r13 = r10 >> 4
                r13 = r13 & 15
                char r11 = r11[r13]
                r15.writeByte(r11)
                char[] r11 = ye.u.a()
                r10 = r10 & 15
                char r10 = r11[r10]
                r15.writeByte(r10)
                goto L90
            Lb8:
                int r7 = java.lang.Character.charCount(r7)
                int r5 = r5 + r7
                goto Lb
            Lbf:
                r8 = r14
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ye.u.b.l(mf.f, java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):void");
        }

        private final void m(mf.f fVar, String str, int i10, int i11, boolean z10) {
            int i12;
            while (i10 < i11) {
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                int codePointAt = str.codePointAt(i10);
                if (codePointAt == 37 && (i12 = i10 + 2) < i11) {
                    int F = ze.c.F(str.charAt(i10 + 1));
                    int F2 = ze.c.F(str.charAt(i12));
                    if (F != -1 && F2 != -1) {
                        fVar.writeByte((F << 4) + F2);
                        i10 = Character.charCount(codePointAt) + i12;
                    }
                    fVar.m1(codePointAt);
                    i10 += Character.charCount(codePointAt);
                } else {
                    if (codePointAt == 43 && z10) {
                        fVar.writeByte(32);
                        i10++;
                    }
                    fVar.m1(codePointAt);
                    i10 += Character.charCount(codePointAt);
                }
            }
        }

        public final String a(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
            boolean C;
            qe.k.f(str, "$this$canonicalize");
            qe.k.f(str2, "encodeSet");
            int i12 = i10;
            while (i12 < i11) {
                int codePointAt = str.codePointAt(i12);
                if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || z13)) {
                    C = ve.q.C(str2, (char) codePointAt, false, 2, null);
                    if (!C) {
                        if (codePointAt == 37) {
                            if (z10) {
                                if (z11) {
                                    if (!e(str, i12, i11)) {
                                        mf.f fVar = new mf.f();
                                        fVar.S(str, i10, i12);
                                        l(fVar, str, i12, i11, str2, z10, z11, z12, z13, charset);
                                        return fVar.r0();
                                    }
                                    if (codePointAt == 43 || !z12) {
                                        i12 += Character.charCount(codePointAt);
                                    } else {
                                        mf.f fVar2 = new mf.f();
                                        fVar2.S(str, i10, i12);
                                        l(fVar2, str, i12, i11, str2, z10, z11, z12, z13, charset);
                                        return fVar2.r0();
                                    }
                                }
                            }
                        }
                        if (codePointAt == 43) {
                        }
                        i12 += Character.charCount(codePointAt);
                    }
                }
                mf.f fVar22 = new mf.f();
                fVar22.S(str, i10, i12);
                l(fVar22, str, i12, i11, str2, z10, z11, z12, z13, charset);
                return fVar22.r0();
            }
            String substring = str.substring(i10, i11);
            qe.k.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        public final int c(String str) {
            qe.k.f(str, "scheme");
            int hashCode = str.hashCode();
            if (hashCode != 3213448) {
                if (hashCode == 99617003 && str.equals("https")) {
                    return 443;
                }
            } else if (str.equals("http")) {
                return 80;
            }
            return -1;
        }

        public final u d(String str) {
            qe.k.f(str, "$this$toHttpUrl");
            return new a().h(null, str).a();
        }

        public final u f(String str) {
            qe.k.f(str, "$this$toHttpUrlOrNull");
            try {
                return d(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final String g(String str, int i10, int i11, boolean z10) {
            qe.k.f(str, "$this$percentDecode");
            for (int i12 = i10; i12 < i11; i12++) {
                char charAt = str.charAt(i12);
                if (charAt == '%' || (charAt == '+' && z10)) {
                    mf.f fVar = new mf.f();
                    fVar.S(str, i10, i12);
                    m(fVar, str, i12, i11, z10);
                    return fVar.r0();
                }
            }
            String substring = str.substring(i10, i11);
            qe.k.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        public final void i(List<String> list, StringBuilder sb2) {
            qe.k.f(list, "$this$toPathString");
            qe.k.f(sb2, "out");
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append('/');
                sb2.append(list.get(i10));
            }
        }

        public final List<String> j(String str) {
            int N;
            int N2;
            qe.k.f(str, "$this$toQueryNamesAndValues");
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 <= str.length()) {
                N = ve.q.N(str, '&', i10, false, 4, null);
                if (N == -1) {
                    N = str.length();
                }
                int i11 = N;
                N2 = ve.q.N(str, '=', i10, false, 4, null);
                if (N2 != -1 && N2 <= i11) {
                    String substring = str.substring(i10, N2);
                    qe.k.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    String substring2 = str.substring(N2 + 1, i11);
                    qe.k.e(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                } else {
                    String substring3 = str.substring(i10, i11);
                    qe.k.e(substring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring3);
                    arrayList.add(null);
                }
                i10 = i11 + 1;
            }
            return arrayList;
        }

        public final void k(List<String> list, StringBuilder sb2) {
            qe.k.f(list, "$this$toQueryString");
            qe.k.f(sb2, "out");
            se.a h10 = se.d.h(se.d.i(0, list.size()), 2);
            int e10 = h10.e();
            int f10 = h10.f();
            int g10 = h10.g();
            if (g10 >= 0) {
                if (e10 > f10) {
                    return;
                }
            } else if (e10 < f10) {
                return;
            }
            while (true) {
                String str = list.get(e10);
                String str2 = list.get(e10 + 1);
                if (e10 > 0) {
                    sb2.append('&');
                }
                sb2.append(str);
                if (str2 != null) {
                    sb2.append('=');
                    sb2.append(str2);
                }
                if (e10 == f10) {
                    return;
                }
                e10 += g10;
            }
        }

        public /* synthetic */ b(qe.g gVar) {
            this();
        }
    }

    public u(String str, String str2, String str3, String str4, int i10, List<String> list, List<String> list2, String str5, String str6) {
        qe.k.f(str, "scheme");
        qe.k.f(str2, AppLovinEventParameters.USER_ACCOUNT_IDENTIFIER);
        qe.k.f(str3, "password");
        qe.k.f(str4, "host");
        qe.k.f(list, "pathSegments");
        qe.k.f(str6, ImagesContract.URL);
        this.f39758b = str;
        this.f39759c = str2;
        this.f39760d = str3;
        this.f39761e = str4;
        this.f39762f = i10;
        this.f39763g = list;
        this.f39764h = list2;
        this.f39765i = str5;
        this.f39766j = str6;
        this.f39757a = qe.k.a(str, "https");
    }

    public static final u l(String str) {
        return f39756l.f(str);
    }

    public final String b() {
        int N;
        if (this.f39765i == null) {
            return null;
        }
        N = ve.q.N(this.f39766j, '#', 0, false, 6, null);
        String str = this.f39766j;
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(N + 1);
        qe.k.e(substring, "(this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public final String c() {
        int N;
        int N2;
        if (this.f39760d.length() == 0) {
            return "";
        }
        N = ve.q.N(this.f39766j, ':', this.f39758b.length() + 3, false, 4, null);
        N2 = ve.q.N(this.f39766j, '@', 0, false, 6, null);
        String str = this.f39766j;
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(N + 1, N2);
        qe.k.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public final String d() {
        int N;
        N = ve.q.N(this.f39766j, '/', this.f39758b.length() + 3, false, 4, null);
        String str = this.f39766j;
        int n10 = ze.c.n(str, "?#", N, str.length());
        String str2 = this.f39766j;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String substring = str2.substring(N, n10);
        qe.k.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public final List<String> e() {
        int N;
        N = ve.q.N(this.f39766j, '/', this.f39758b.length() + 3, false, 4, null);
        String str = this.f39766j;
        int n10 = ze.c.n(str, "?#", N, str.length());
        ArrayList arrayList = new ArrayList();
        while (N < n10) {
            int i10 = N + 1;
            int m10 = ze.c.m(this.f39766j, '/', i10, n10);
            String str2 = this.f39766j;
            Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
            String substring = str2.substring(i10, m10);
            qe.k.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            arrayList.add(substring);
            N = m10;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof u) && qe.k.a(((u) obj).f39766j, this.f39766j);
    }

    public final String f() {
        int N;
        if (this.f39764h == null) {
            return null;
        }
        N = ve.q.N(this.f39766j, '?', 0, false, 6, null);
        int i10 = N + 1;
        String str = this.f39766j;
        int m10 = ze.c.m(str, '#', i10, str.length());
        String str2 = this.f39766j;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String substring = str2.substring(i10, m10);
        qe.k.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public final String g() {
        if (this.f39759c.length() == 0) {
            return "";
        }
        int length = this.f39758b.length() + 3;
        String str = this.f39766j;
        int n10 = ze.c.n(str, ":@", length, str.length());
        String str2 = this.f39766j;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String substring = str2.substring(length, n10);
        qe.k.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public final String h() {
        return this.f39761e;
    }

    public int hashCode() {
        return this.f39766j.hashCode();
    }

    public final boolean i() {
        return this.f39757a;
    }

    public final a j() {
        a aVar = new a();
        aVar.u(this.f39758b);
        aVar.r(g());
        aVar.q(c());
        aVar.s(this.f39761e);
        aVar.t(this.f39762f != f39756l.c(this.f39758b) ? this.f39762f : -1);
        aVar.d().clear();
        aVar.d().addAll(e());
        aVar.c(f());
        aVar.p(b());
        return aVar;
    }

    public final a k(String str) {
        qe.k.f(str, "link");
        try {
            return new a().h(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final int m() {
        return this.f39762f;
    }

    public final String n() {
        if (this.f39764h == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        f39756l.k(this.f39764h, sb2);
        return sb2.toString();
    }

    public final String o() {
        a k10 = k("/...");
        qe.k.c(k10);
        return k10.v("").i("").a().toString();
    }

    public final u p(String str) {
        qe.k.f(str, "link");
        a k10 = k(str);
        if (k10 != null) {
            return k10.a();
        }
        return null;
    }

    public final String q() {
        return this.f39758b;
    }

    public final URI r() {
        String aVar = j().m().toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e10) {
            try {
                URI create = URI.create(new ve.f("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").b(aVar, ""));
                qe.k.e(create, "try {\n        val stripp…e) // Unexpected!\n      }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final URL s() {
        try {
            return new URL(this.f39766j);
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }

    public String toString() {
        return this.f39766j;
    }
}
