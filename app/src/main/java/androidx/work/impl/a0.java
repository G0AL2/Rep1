package androidx.work.impl;

import android.content.Context;
import android.os.Build;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: WorkDatabasePathHelper.kt */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a0 f4473a = new a0();

    private a0() {
    }

    private final File c(Context context) {
        return new File(a.f4472a.a(context), "androidx.work.workdb");
    }

    public static final void d(Context context) {
        String str;
        String str2;
        String str3;
        qe.k.f(context, "context");
        a0 a0Var = f4473a;
        File b10 = a0Var.b(context);
        if (Build.VERSION.SDK_INT < 23 || !b10.exists()) {
            return;
        }
        androidx.work.l e10 = androidx.work.l.e();
        str = b0.f4474a;
        e10.a(str, "Migrating WorkDatabase to the no-backup directory");
        for (Map.Entry<File, File> entry : a0Var.e(context).entrySet()) {
            File key = entry.getKey();
            File value = entry.getValue();
            if (key.exists()) {
                if (value.exists()) {
                    androidx.work.l e11 = androidx.work.l.e();
                    str3 = b0.f4474a;
                    e11.k(str3, "Over-writing contents of " + value);
                }
                String str4 = key.renameTo(value) ? "Migrated " + key + "to " + value : "Renaming " + key + " to " + value + " failed";
                androidx.work.l e12 = androidx.work.l.e();
                str2 = b0.f4474a;
                e12.a(str2, str4);
            }
        }
    }

    public final File a(Context context) {
        qe.k.f(context, "context");
        if (Build.VERSION.SDK_INT < 23) {
            return b(context);
        }
        return c(context);
    }

    public final File b(Context context) {
        qe.k.f(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        qe.k.e(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        return databasePath;
    }

    public final Map<File, File> e(Context context) {
        Map<File, File> g10;
        String[] strArr;
        int d10;
        int b10;
        Map<File, File> k10;
        qe.k.f(context, "context");
        if (Build.VERSION.SDK_INT >= 23) {
            File b11 = b(context);
            File a10 = a(context);
            strArr = b0.f4475b;
            d10 = fe.g0.d(strArr.length);
            b10 = se.f.b(d10, 16);
            LinkedHashMap linkedHashMap = new LinkedHashMap(b10);
            for (String str : strArr) {
                ee.m a11 = ee.q.a(new File(b11.getPath() + str), new File(a10.getPath() + str));
                linkedHashMap.put(a11.c(), a11.d());
            }
            k10 = fe.h0.k(linkedHashMap, ee.q.a(b11, a10));
            return k10;
        }
        g10 = fe.h0.g();
        return g10;
    }
}
