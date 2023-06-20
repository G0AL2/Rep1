package com.inmobi.media;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.pm.ResolveInfo;
import java.net.URISyntaxException;
import java.util.List;

/* compiled from: DeeplinkHandler.java */
/* loaded from: classes3.dex */
public final class hl {

    /* renamed from: a  reason: collision with root package name */
    private static hl f25676a;

    private hl() {
    }

    public static synchronized hl a() {
        hl hlVar;
        synchronized (hl.class) {
            if (f25676a == null) {
                f25676a = new hl();
            }
            hlVar = f25676a;
        }
        return hlVar;
    }

    private static boolean b(Context context, String str) {
        try {
            hs.b(context, str);
            return true;
        } catch (ActivityNotFoundException unused) {
            try {
                hs.a(context, str, (ResolveInfo) null);
                return true;
            } catch (ActivityNotFoundException | URISyntaxException unused2) {
                return false;
            }
        } catch (URISyntaxException unused3) {
            return false;
        }
    }

    public static boolean a(Context context, String str) {
        if (str.isEmpty()) {
            return false;
        }
        List<ResolveInfo> c10 = hs.c(context, str);
        if (!c10.isEmpty()) {
            String str2 = c10.get(0).activityInfo.name;
            try {
                hs.a(context, str, c10.get(0));
                return true;
            } catch (URISyntaxException unused) {
                return false;
            }
        }
        return b(context, str);
    }
}
