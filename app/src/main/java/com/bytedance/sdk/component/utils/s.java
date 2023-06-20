package com.bytedance.sdk.component.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* compiled from: ProcessUtils.java */
/* loaded from: classes.dex */
public class s {

    /* renamed from: a  reason: collision with root package name */
    private static String f10468a;

    public static String a(Context context) {
        String str = f10468a;
        if (TextUtils.isEmpty(str)) {
            try {
                int myPid = Process.myPid();
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                    if (runningAppProcessInfo.pid == myPid) {
                        if (l.a()) {
                            l.b("Process", "processName = " + runningAppProcessInfo.processName);
                        }
                        String str2 = runningAppProcessInfo.processName;
                        f10468a = str2;
                        return str2;
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            String a10 = a();
            f10468a = a10;
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
            if (l.a()) {
                l.b("Process", "get processName = " + sb2.toString());
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
