package s6;

import android.content.Context;
import android.content.SharedPreferences;
import g0.g;
import java.util.Locale;

/* compiled from: I18nUtil.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static a f36746a;

    private a() {
    }

    public static a d() {
        if (f36746a == null) {
            f36746a = new a();
        }
        return f36746a;
    }

    private boolean e() {
        return g.b(Locale.getDefault()) == 1;
    }

    private boolean f(Context context, String str, boolean z10) {
        return context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean(str, z10);
    }

    private boolean h(Context context) {
        return f(context, "RCTI18nUtil_allowRTL", true);
    }

    private boolean i(Context context) {
        return f(context, "RCTI18nUtil_forceRTL", false);
    }

    private void j(Context context, String str, boolean z10) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).edit();
        edit.putBoolean(str, z10);
        edit.apply();
    }

    public void a(Context context, boolean z10) {
        j(context, "RCTI18nUtil_allowRTL", z10);
    }

    public boolean b(Context context) {
        return f(context, "RCTI18nUtil_makeRTLFlipLeftAndRightStyles", true);
    }

    public void c(Context context, boolean z10) {
        j(context, "RCTI18nUtil_forceRTL", z10);
    }

    public boolean g(Context context) {
        if (i(context)) {
            return true;
        }
        return h(context) && e();
    }

    public void k(Context context, boolean z10) {
        j(context, "RCTI18nUtil_makeRTLFlipLeftAndRightStyles", z10);
    }
}
