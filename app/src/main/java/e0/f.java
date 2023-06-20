package e0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: LocaleListCompatWrapper.java */
/* loaded from: classes.dex */
final class f implements g {

    /* renamed from: b  reason: collision with root package name */
    private static final Locale[] f29478b = new Locale[0];

    /* renamed from: a  reason: collision with root package name */
    private final Locale[] f29479a;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        e.b("en-Latn");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f29479a = f29478b;
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < localeArr.length; i10++) {
            Locale locale = localeArr[i10];
            if (locale != null) {
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    b(sb2, locale2);
                    if (i10 < localeArr.length - 1) {
                        sb2.append(',');
                    }
                    hashSet.add(locale2);
                }
            } else {
                throw new NullPointerException("list[" + i10 + "] is null");
            }
        }
        this.f29479a = (Locale[]) arrayList.toArray(new Locale[arrayList.size()]);
    }

    static void b(StringBuilder sb2, Locale locale) {
        sb2.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country == null || country.isEmpty()) {
            return;
        }
        sb2.append('-');
        sb2.append(locale.getCountry());
    }

    @Override // e0.g
    public Object a() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        Locale[] localeArr = ((f) obj).f29479a;
        if (this.f29479a.length != localeArr.length) {
            return false;
        }
        int i10 = 0;
        while (true) {
            Locale[] localeArr2 = this.f29479a;
            if (i10 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i10].equals(localeArr[i10])) {
                return false;
            }
            i10++;
        }
    }

    @Override // e0.g
    public Locale get(int i10) {
        if (i10 >= 0) {
            Locale[] localeArr = this.f29479a;
            if (i10 < localeArr.length) {
                return localeArr[i10];
            }
        }
        return null;
    }

    public int hashCode() {
        int i10 = 1;
        int i11 = 0;
        while (true) {
            Locale[] localeArr = this.f29479a;
            if (i11 >= localeArr.length) {
                return i10;
            }
            i10 = (i10 * 31) + localeArr[i11].hashCode();
            i11++;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        int i10 = 0;
        while (true) {
            Locale[] localeArr = this.f29479a;
            if (i10 < localeArr.length) {
                sb2.append(localeArr[i10]);
                if (i10 < this.f29479a.length - 1) {
                    sb2.append(',');
                }
                i10++;
            } else {
                sb2.append("]");
                return sb2.toString();
            }
        }
    }
}
