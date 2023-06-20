package com.apm.insight.runtime;

import android.os.Build;
import android.system.Os;
import android.system.OsConstants;

/* loaded from: classes.dex */
public class q {

    /* renamed from: a  reason: collision with root package name */
    private static long f6653a = -1;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static long f6654a = -1;

        public static long a() {
            if (q.f6653a == -1) {
                long unused = q.f6653a = 1000 / b();
            }
            return q.f6653a;
        }

        public static long a(long j10) {
            long j11 = f6654a;
            if (j11 > 0) {
                return j11;
            }
            int i10 = Build.VERSION.SDK_INT;
            long sysconf = i10 >= 21 ? Os.sysconf(OsConstants._SC_CLK_TCK) : i10 >= 14 ? a("_SC_CLK_TCK", j10) : j10;
            if (sysconf > 0) {
                j10 = sysconf;
            }
            f6654a = j10;
            return j10;
        }

        private static long a(String str, long j10) {
            try {
                int i10 = Class.forName("libcore.io.OsConstants").getField(str).getInt(null);
                Class<?> cls = Class.forName("libcore.io.Libcore");
                Class<?> cls2 = Class.forName("libcore.io.Os");
                return ((Long) cls2.getMethod("sysconf", Integer.TYPE).invoke(cls.getField("os").get(null), Integer.valueOf(i10))).longValue();
            } catch (Throwable th) {
                th.printStackTrace();
                return j10;
            }
        }

        public static long b() {
            return a(100L);
        }
    }
}
