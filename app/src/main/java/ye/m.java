package ye;

import com.chartboost.sdk.impl.o3;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: Cookie.kt */
/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final String f39716a;

    /* renamed from: b  reason: collision with root package name */
    private final String f39717b;

    /* renamed from: c  reason: collision with root package name */
    private final long f39718c;

    /* renamed from: d  reason: collision with root package name */
    private final String f39719d;

    /* renamed from: e  reason: collision with root package name */
    private final String f39720e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f39721f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f39722g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f39723h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f39724i;

    /* renamed from: n  reason: collision with root package name */
    public static final b f39715n = new b(null);

    /* renamed from: j  reason: collision with root package name */
    private static final Pattern f39711j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k  reason: collision with root package name */
    private static final Pattern f39712k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l  reason: collision with root package name */
    private static final Pattern f39713l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m  reason: collision with root package name */
    private static final Pattern f39714m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* compiled from: Cookie.kt */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private String f39725a;

        /* renamed from: b  reason: collision with root package name */
        private String f39726b;

        /* renamed from: d  reason: collision with root package name */
        private String f39728d;

        /* renamed from: f  reason: collision with root package name */
        private boolean f39730f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f39731g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f39732h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f39733i;

        /* renamed from: c  reason: collision with root package name */
        private long f39727c = 253402300799999L;

        /* renamed from: e  reason: collision with root package name */
        private String f39729e = "/";

        private final a c(String str, boolean z10) {
            String e10 = ze.a.e(str);
            if (e10 != null) {
                this.f39728d = e10;
                this.f39733i = z10;
                return this;
            }
            throw new IllegalArgumentException("unexpected domain: " + str);
        }

        public final m a() {
            String str = this.f39725a;
            Objects.requireNonNull(str, "builder.name == null");
            String str2 = this.f39726b;
            Objects.requireNonNull(str2, "builder.value == null");
            long j10 = this.f39727c;
            String str3 = this.f39728d;
            Objects.requireNonNull(str3, "builder.domain == null");
            return new m(str, str2, j10, str3, this.f39729e, this.f39730f, this.f39731g, this.f39732h, this.f39733i, null);
        }

        public final a b(String str) {
            qe.k.f(str, "domain");
            return c(str, false);
        }

        public final a d(String str) {
            CharSequence x02;
            qe.k.f(str, "name");
            x02 = ve.q.x0(str);
            if (qe.k.a(x02.toString(), str)) {
                this.f39725a = str;
                return this;
            }
            throw new IllegalArgumentException("name is not trimmed".toString());
        }

        public final a e(String str) {
            CharSequence x02;
            qe.k.f(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            x02 = ve.q.x0(str);
            if (qe.k.a(x02.toString(), str)) {
                this.f39726b = str;
                return this;
            }
            throw new IllegalArgumentException("value is not trimmed".toString());
        }
    }

    /* compiled from: Cookie.kt */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        private final int a(String str, int i10, int i11, boolean z10) {
            while (i10 < i11) {
                char charAt = str.charAt(i10);
                if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && '9' >= charAt) || (('a' <= charAt && 'z' >= charAt) || (('A' <= charAt && 'Z' >= charAt) || charAt == ':'))) == (!z10)) {
                    return i10;
                }
                i10++;
            }
            return i11;
        }

        private final boolean b(String str, String str2) {
            boolean k10;
            if (qe.k.a(str, str2)) {
                return true;
            }
            k10 = ve.p.k(str, str2, false, 2, null);
            return k10 && str.charAt((str.length() - str2.length()) - 1) == '.' && !ze.c.f(str);
        }

        private final String f(String str) {
            boolean k10;
            String c02;
            k10 = ve.p.k(str, ".", false, 2, null);
            if (!k10) {
                c02 = ve.q.c0(str, ".");
                String e10 = ze.a.e(c02);
                if (e10 != null) {
                    return e10;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        private final long g(String str, int i10, int i11) {
            int O;
            int a10 = a(str, i10, i11, false);
            Matcher matcher = m.f39714m.matcher(str);
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            while (a10 < i11) {
                int a11 = a(str, a10 + 1, i11, true);
                matcher.region(a10, a11);
                if (i13 != -1 || !matcher.usePattern(m.f39714m).matches()) {
                    if (i14 != -1 || !matcher.usePattern(m.f39713l).matches()) {
                        if (i15 != -1 || !matcher.usePattern(m.f39712k).matches()) {
                            if (i12 == -1 && matcher.usePattern(m.f39711j).matches()) {
                                String group = matcher.group(1);
                                qe.k.e(group, "matcher.group(1)");
                                i12 = Integer.parseInt(group);
                            }
                        } else {
                            String group2 = matcher.group(1);
                            qe.k.e(group2, "matcher.group(1)");
                            Locale locale = Locale.US;
                            qe.k.e(locale, "Locale.US");
                            Objects.requireNonNull(group2, "null cannot be cast to non-null type java.lang.String");
                            String lowerCase = group2.toLowerCase(locale);
                            qe.k.e(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                            String pattern = m.f39712k.pattern();
                            qe.k.e(pattern, "MONTH_PATTERN.pattern()");
                            O = ve.q.O(pattern, lowerCase, 0, false, 6, null);
                            i15 = O / 4;
                        }
                    } else {
                        String group3 = matcher.group(1);
                        qe.k.e(group3, "matcher.group(1)");
                        i14 = Integer.parseInt(group3);
                    }
                } else {
                    String group4 = matcher.group(1);
                    qe.k.e(group4, "matcher.group(1)");
                    i13 = Integer.parseInt(group4);
                    String group5 = matcher.group(2);
                    qe.k.e(group5, "matcher.group(2)");
                    i16 = Integer.parseInt(group5);
                    String group6 = matcher.group(3);
                    qe.k.e(group6, "matcher.group(3)");
                    i17 = Integer.parseInt(group6);
                }
                a10 = a(str, a11 + 1, i11, false);
            }
            if (70 <= i12 && 99 >= i12) {
                i12 += 1900;
            }
            if (i12 >= 0 && 69 >= i12) {
                i12 += 2000;
            }
            if (i12 >= 1601) {
                if (i15 != -1) {
                    if (1 <= i14 && 31 >= i14) {
                        if (i13 >= 0 && 23 >= i13) {
                            if (i16 >= 0 && 59 >= i16) {
                                if (i17 >= 0 && 59 >= i17) {
                                    GregorianCalendar gregorianCalendar = new GregorianCalendar(ze.c.f40523e);
                                    gregorianCalendar.setLenient(false);
                                    gregorianCalendar.set(1, i12);
                                    gregorianCalendar.set(2, i15 - 1);
                                    gregorianCalendar.set(5, i14);
                                    gregorianCalendar.set(11, i13);
                                    gregorianCalendar.set(12, i16);
                                    gregorianCalendar.set(13, i17);
                                    gregorianCalendar.set(14, 0);
                                    return gregorianCalendar.getTimeInMillis();
                                }
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        private final long h(String str) {
            boolean y10;
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong <= 0) {
                    return Long.MIN_VALUE;
                }
                return parseLong;
            } catch (NumberFormatException e10) {
                if (new ve.f("-?\\d+").a(str)) {
                    y10 = ve.p.y(str, Constants.FILENAME_SEQUENCE_SEPARATOR, false, 2, null);
                    return y10 ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e10;
            }
        }

        public final m c(u uVar, String str) {
            qe.k.f(uVar, ImagesContract.URL);
            qe.k.f(str, "setCookie");
            return d(System.currentTimeMillis(), uVar, str);
        }

        /* JADX WARN: Code restructure failed: missing block: B:56:0x0103, code lost:
            if (r1 > 253402300799999L) goto L86;
         */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0115  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0118  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x013f  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x015b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final ye.m d(long r26, ye.u r28, java.lang.String r29) {
            /*
                Method dump skipped, instructions count: 374
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ye.m.b.d(long, ye.u, java.lang.String):ye.m");
        }

        public final List<m> e(u uVar, t tVar) {
            List<m> h10;
            qe.k.f(uVar, ImagesContract.URL);
            qe.k.f(tVar, "headers");
            List<String> i10 = tVar.i("Set-Cookie");
            int size = i10.size();
            ArrayList arrayList = null;
            for (int i11 = 0; i11 < size; i11++) {
                m c10 = c(uVar, i10.get(i11));
                if (c10 != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c10);
                }
            }
            if (arrayList != null) {
                List<m> unmodifiableList = Collections.unmodifiableList(arrayList);
                qe.k.e(unmodifiableList, "Collections.unmodifiableList(cookies)");
                return unmodifiableList;
            }
            h10 = fe.p.h();
            return h10;
        }

        public /* synthetic */ b(qe.g gVar) {
            this();
        }
    }

    private m(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f39716a = str;
        this.f39717b = str2;
        this.f39718c = j10;
        this.f39719d = str3;
        this.f39720e = str4;
        this.f39721f = z10;
        this.f39722g = z11;
        this.f39723h = z12;
        this.f39724i = z13;
    }

    public final String e() {
        return this.f39716a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (qe.k.a(mVar.f39716a, this.f39716a) && qe.k.a(mVar.f39717b, this.f39717b) && mVar.f39718c == this.f39718c && qe.k.a(mVar.f39719d, this.f39719d) && qe.k.a(mVar.f39720e, this.f39720e) && mVar.f39721f == this.f39721f && mVar.f39722g == this.f39722g && mVar.f39723h == this.f39723h && mVar.f39724i == this.f39724i) {
                return true;
            }
        }
        return false;
    }

    public final String f(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f39716a);
        sb2.append('=');
        sb2.append(this.f39717b);
        if (this.f39723h) {
            if (this.f39718c == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                sb2.append(ef.c.b(new Date(this.f39718c)));
            }
        }
        if (!this.f39724i) {
            sb2.append("; domain=");
            if (z10) {
                sb2.append(".");
            }
            sb2.append(this.f39719d);
        }
        sb2.append("; path=");
        sb2.append(this.f39720e);
        if (this.f39721f) {
            sb2.append("; secure");
        }
        if (this.f39722g) {
            sb2.append("; httponly");
        }
        String sb3 = sb2.toString();
        qe.k.e(sb3, "toString()");
        return sb3;
    }

    public final String g() {
        return this.f39717b;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return ((((((((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f39716a.hashCode()) * 31) + this.f39717b.hashCode()) * 31) + o3.a(this.f39718c)) * 31) + this.f39719d.hashCode()) * 31) + this.f39720e.hashCode()) * 31) + androidx.work.d.a(this.f39721f)) * 31) + androidx.work.d.a(this.f39722g)) * 31) + androidx.work.d.a(this.f39723h)) * 31) + androidx.work.d.a(this.f39724i);
    }

    public String toString() {
        return f(false);
    }

    public /* synthetic */ m(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, qe.g gVar) {
        this(str, str2, j10, str3, str4, z10, z11, z12, z13);
    }
}
