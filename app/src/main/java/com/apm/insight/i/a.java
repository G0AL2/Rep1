package com.apm.insight.i;

import android.annotation.SuppressLint;
import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.apm.insight.runtime.s;
import java.util.UUID;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile UUID f6364a = null;

    /* renamed from: b  reason: collision with root package name */
    private static String f6365b = "";

    @SuppressLint({"MissingPermission", "HardwareIds"})
    private a(Context context) {
        if (f6364a == null) {
            synchronized (a.class) {
                if (f6364a == null) {
                    String str = null;
                    String a10 = s.a().a((String) null);
                    if (a10 != null) {
                        f6364a = UUID.fromString(a10);
                    } else {
                        try {
                            str = Settings.Secure.getString(context.getContentResolver(), "android_id");
                        } catch (Throwable unused) {
                        }
                        try {
                            f6364a = str != null ? UUID.nameUUIDFromBytes(str.getBytes("utf8")) : UUID.randomUUID();
                        } catch (Throwable unused2) {
                        }
                        try {
                            s.a().c(f6364a.toString());
                        } catch (Throwable unused3) {
                        }
                    }
                }
            }
        }
    }

    public static synchronized String a(Context context) {
        String str;
        UUID a10;
        synchronized (a.class) {
            if (TextUtils.isEmpty(f6365b) && (a10 = new a(context).a()) != null) {
                f6365b = a10.toString();
            }
            str = f6365b;
        }
        return str;
    }

    public UUID a() {
        return f6364a;
    }
}
