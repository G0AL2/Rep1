package e0;

import android.os.Build;
import android.os.LocaleList;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.util.Locale;

/* compiled from: LocaleListCompat.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private g f29477a;

    static {
        a(new Locale[0]);
    }

    private e(g gVar) {
        this.f29477a = gVar;
    }

    public static e a(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return d(new LocaleList(localeArr));
        }
        return new e(new f(localeArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Locale b(String str) {
        if (str.contains(Constants.FILENAME_SEQUENCE_SEPARATOR)) {
            String[] split = str.split(Constants.FILENAME_SEQUENCE_SEPARATOR, -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else if (str.contains("_")) {
            String[] split2 = str.split("_", -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        } else {
            return new Locale(str);
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    public static e d(LocaleList localeList) {
        return new e(new h(localeList));
    }

    public Locale c(int i10) {
        return this.f29477a.get(i10);
    }

    public boolean equals(Object obj) {
        return (obj instanceof e) && this.f29477a.equals(((e) obj).f29477a);
    }

    public int hashCode() {
        return this.f29477a.hashCode();
    }

    public String toString() {
        return this.f29477a.toString();
    }
}
