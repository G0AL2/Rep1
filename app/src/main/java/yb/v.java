package yb;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;

/* compiled from: IdManager.java */
/* loaded from: classes3.dex */
public class v implements w {

    /* renamed from: g  reason: collision with root package name */
    private static final Pattern f39505g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h  reason: collision with root package name */
    private static final String f39506h = Pattern.quote("/");

    /* renamed from: a  reason: collision with root package name */
    private final x f39507a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f39508b;

    /* renamed from: c  reason: collision with root package name */
    private final String f39509c;

    /* renamed from: d  reason: collision with root package name */
    private final tc.d f39510d;

    /* renamed from: e  reason: collision with root package name */
    private final r f39511e;

    /* renamed from: f  reason: collision with root package name */
    private String f39512f;

    public v(Context context, String str, tc.d dVar, r rVar) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str != null) {
            this.f39508b = context;
            this.f39509c = str;
            this.f39510d = dVar;
            this.f39511e = rVar;
            this.f39507a = new x();
            return;
        }
        throw new IllegalArgumentException("appIdentifier must not be null");
    }

    private synchronized String b(String str, SharedPreferences sharedPreferences) {
        String e10;
        e10 = e(UUID.randomUUID().toString());
        vb.f f10 = vb.f.f();
        f10.i("Created new Crashlytics installation ID: " + e10 + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", e10).putString("firebase.installation.id", str).apply();
        return e10;
    }

    static String c() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    private String d() {
        try {
            return (String) h0.d(this.f39510d.getId());
        } catch (Exception e10) {
            vb.f.f().l("Failed to retrieve Firebase Installations ID.", e10);
            return null;
        }
    }

    private static String e(String str) {
        if (str == null) {
            return null;
        }
        return f39505g.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    static boolean k(String str) {
        return str != null && str.startsWith("SYN_");
    }

    private String l(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    private String m(String str) {
        return str.replaceAll(f39506h, "");
    }

    @Override // yb.w
    public synchronized String a() {
        String str = this.f39512f;
        if (str != null) {
            return str;
        }
        vb.f.f().i("Determining Crashlytics installation ID...");
        SharedPreferences r10 = g.r(this.f39508b);
        String string = r10.getString("firebase.installation.id", null);
        vb.f f10 = vb.f.f();
        f10.i("Cached Firebase Installation ID: " + string);
        if (this.f39511e.d()) {
            String d10 = d();
            vb.f f11 = vb.f.f();
            f11.i("Fetched Firebase Installation ID: " + d10);
            if (d10 == null) {
                d10 = string == null ? c() : string;
            }
            if (d10.equals(string)) {
                this.f39512f = l(r10);
            } else {
                this.f39512f = b(d10, r10);
            }
        } else if (k(string)) {
            this.f39512f = l(r10);
        } else {
            this.f39512f = b(c(), r10);
        }
        if (this.f39512f == null) {
            vb.f.f().k("Unable to determine Crashlytics Install Id, creating a new one.");
            this.f39512f = b(c(), r10);
        }
        vb.f f12 = vb.f.f();
        f12.i("Crashlytics installation ID: " + this.f39512f);
        return this.f39512f;
    }

    public String f() {
        return this.f39509c;
    }

    public String g() {
        return this.f39507a.a(this.f39508b);
    }

    public String h() {
        return String.format(Locale.US, "%s/%s", m(Build.MANUFACTURER), m(Build.MODEL));
    }

    public String i() {
        return m(Build.VERSION.INCREMENTAL);
    }

    public String j() {
        return m(Build.VERSION.RELEASE);
    }
}
