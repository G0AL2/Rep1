package e0;

import android.content.res.Configuration;
import android.os.Build;

/* compiled from: ConfigurationCompat.java */
/* loaded from: classes.dex */
public final class c {
    public static e a(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? e.d(configuration.getLocales()) : e.a(configuration.locale);
    }
}
