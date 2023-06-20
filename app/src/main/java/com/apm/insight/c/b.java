package com.apm.insight.c;

import com.apm.insight.h;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static AtomicBoolean f6258a = new AtomicBoolean(false);

    public static boolean a() {
        synchronized (f6258a) {
            if (f6258a.get()) {
                return false;
            }
            f6258a.set(true);
            return b();
        }
    }

    public static boolean b() {
        if (com.apm.insight.runtime.a.h()) {
            try {
                File file = new File(h.h().getFilesDir(), "apminsight/crashCommand");
                file.mkdirs();
                new File(file, "0_" + System.currentTimeMillis()).createNewFile();
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
        return false;
    }
}
