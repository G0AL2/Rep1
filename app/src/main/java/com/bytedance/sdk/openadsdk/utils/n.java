package com.bytedance.sdk.openadsdk.utils;

import android.content.res.Configuration;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: SimUtils.java */
/* loaded from: classes.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    private static String f13588a = null;

    /* renamed from: b  reason: collision with root package name */
    private static String f13589b = null;

    /* renamed from: c  reason: collision with root package name */
    private static String f13590c = null;

    /* renamed from: d  reason: collision with root package name */
    private static volatile boolean f13591d = true;

    /* compiled from: SimUtils.java */
    /* loaded from: classes.dex */
    public static class a extends com.bytedance.sdk.component.f.g {

        /* renamed from: a  reason: collision with root package name */
        public static AtomicBoolean f13592a = new AtomicBoolean(false);

        /* renamed from: b  reason: collision with root package name */
        private static AtomicLong f13593b = new AtomicLong(0);

        public a(String str, int i10) {
            super(str, i10);
        }

        public static void c() {
            if (f13592a.get()) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - f13593b.get() < TTAdConstant.AD_MAX_EVENT_TIME) {
                return;
            }
            f13593b.set(currentTimeMillis);
            com.bytedance.sdk.component.f.e.a(new a("UpdateSimStatusTask", 5), 5);
        }

        @Override // java.lang.Runnable
        public void run() {
            f13592a.set(true);
            n.e();
            f13592a.set(false);
        }
    }

    public static String a() {
        a.c();
        return f13588a;
    }

    public static String b() {
        try {
            a.c();
            Configuration configuration = com.bytedance.sdk.openadsdk.core.m.a().getResources().getConfiguration();
            int i10 = configuration.mcc;
            String valueOf = i10 != 0 ? String.valueOf(i10) : f13589b;
            com.bytedance.sdk.component.utils.l.e("MCC", "config=" + configuration.mcc + ",sMCC=" + f13589b);
            if (f13591d) {
                return valueOf;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("getMCC");
            sb2.append(f13591d ? "Have SIM card" : "No SIM card, MCC returns null");
            com.bytedance.sdk.component.utils.l.e("MCC", sb2.toString());
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static String c() {
        a.c();
        return f13590c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e() {
        String str;
        String str2;
        String str3;
        if (com.bytedance.sdk.openadsdk.core.m.a() == null) {
            return;
        }
        f13591d = true;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) com.bytedance.sdk.openadsdk.core.m.a().getSystemService("phone");
            int simState = telephonyManager.getSimState();
            if (simState == 0) {
                f13591d = false;
            } else if (simState == 1) {
                f13591d = false;
            }
            com.bytedance.sdk.component.utils.l.e("MCC", f13591d ? "Have SIM card" : "No SIM card");
            String str4 = null;
            try {
                str = telephonyManager.getSimOperatorName();
            } catch (Throwable unused) {
                str = null;
            }
            try {
                str2 = telephonyManager.getNetworkOperator();
            } catch (Throwable unused2) {
                str2 = null;
            }
            if (str2 == null || str2.length() < 5) {
                try {
                    str2 = telephonyManager.getSimOperator();
                } catch (Throwable unused3) {
                }
            }
            if (TextUtils.isEmpty(str2) || str2.length() <= 4) {
                str3 = null;
            } else {
                String substring = str2.substring(0, 3);
                str3 = str2.substring(3);
                str4 = substring;
            }
            if (!TextUtils.isEmpty(str)) {
                f13588a = str;
            }
            if (!TextUtils.isEmpty(str4)) {
                f13589b = str4;
            }
            if (TextUtils.isEmpty(str3)) {
                return;
            }
            f13590c = str3;
        } catch (Throwable unused4) {
        }
    }
}
