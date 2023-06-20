package com.bytedance.sdk.component.e.d;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* compiled from: ProcessUtils.java */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private static String f10398a;

    public static boolean a(Context context) {
        String c10 = c(context);
        return c10 != null && (c10.endsWith(":push") || c10.endsWith(":pushservice"));
    }

    public static boolean b(Context context) {
        String c10 = c(context);
        return (c10 == null || !c10.contains(":")) && c10 != null && c10.equals(context.getPackageName());
    }

    public static String c(Context context) {
        String str = f10398a;
        if (TextUtils.isEmpty(str)) {
            try {
                int myPid = Process.myPid();
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                    if (runningAppProcessInfo.pid == myPid) {
                        String str2 = runningAppProcessInfo.processName;
                        f10398a = str2;
                        return str2;
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            String a10 = a();
            f10398a = a10;
            return a10;
        }
        return str;
    }

    private static String a() {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + Process.myPid() + "/cmdline"), "iso-8859-1"));
        } catch (Throwable unused) {
            bufferedReader = null;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                int read = bufferedReader.read();
                if (read <= 0) {
                    break;
                }
                sb2.append((char) read);
            }
            String sb3 = sb2.toString();
            try {
                bufferedReader.close();
            } catch (Exception unused2) {
            }
            return sb3;
        } catch (Throwable unused3) {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (Exception unused4) {
                }
            }
            return null;
        }
    }
}
