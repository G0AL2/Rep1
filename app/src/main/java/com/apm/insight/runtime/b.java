package com.apm.insight.runtime;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static long f6599a = -30000;

    /* renamed from: b  reason: collision with root package name */
    private static File f6600b;

    public static String a(long j10, String str) {
        try {
            String j11 = com.apm.insight.l.o.j(com.apm.insight.h.g());
            return com.apm.insight.l.i.c(new File(j11, "apminsight/TrackInfo/" + ((j10 - (j10 % 86400000)) / 86400000) + "/" + str));
        } catch (Throwable th) {
            return th.getMessage();
        }
    }

    public static void a() {
        File file = new File(com.apm.insight.l.o.j(com.apm.insight.h.g()), "apminsight/TrackInfo/");
        String[] list = file.list();
        if (list != null && list.length > 5) {
            Arrays.sort(list);
            for (int i10 = 0; i10 < list.length - 5; i10++) {
                com.apm.insight.l.i.a(new File(file, list[i10]));
            }
        }
    }

    public static void a(long j10) {
        if (j10 - f6599a < 30000) {
            return;
        }
        f6599a = j10;
        try {
            com.apm.insight.l.i.a(b(), String.valueOf(System.currentTimeMillis()), false);
        } catch (IOException unused) {
        }
    }

    private static File b() {
        if (f6600b == null) {
            long currentTimeMillis = System.currentTimeMillis();
            String j10 = com.apm.insight.l.o.j(com.apm.insight.h.g());
            f6600b = new File(j10, "apminsight/TrackInfo/" + ((currentTimeMillis - (currentTimeMillis % 86400000)) / 86400000) + "/" + com.apm.insight.h.f());
        }
        return f6600b;
    }
}
