package com.inmobi.media;

import android.annotation.SuppressLint;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.inmobi.media.fq;
import java.security.MessageDigest;

/* compiled from: UidHelper.java */
/* loaded from: classes3.dex */
public class iq {

    /* renamed from: a */
    private static final String f25784a = "iq";

    /* renamed from: b */
    private static ip f25785b;

    /* compiled from: UidHelper.java */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        static final iq f25786a = new iq((byte) 0);
    }

    /* synthetic */ iq(byte b10) {
        this();
    }

    public static iq a() {
        return a.f25786a;
    }

    public static /* synthetic */ void a(iq iqVar) {
        iqVar.i();
    }

    @SuppressLint({"HardwareIds"})
    public static String d() {
        Context c10 = ho.c();
        if (c10 != null) {
            try {
                String string = Settings.Secure.getString(c10.getContentResolver(), "android_id");
                return string == null ? Settings.System.getString(c10.getContentResolver(), "android_id") : string;
            } catch (Exception unused) {
                return "";
            }
        }
        return "";
    }

    private static boolean h() {
        return true;
    }

    public void i() {
        try {
            Context c10 = ho.c();
            if (c10 != null) {
                ip ipVar = new ip();
                if (h()) {
                    AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(c10);
                    ipVar.f25782a = advertisingIdInfo.getId();
                    ipVar.a(Boolean.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled()));
                    f25785b = ipVar;
                    if (ig.b()) {
                        f25785b.f25782a = null;
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public void b() {
        try {
            i();
            c();
        } catch (Exception unused) {
        }
    }

    public void c() {
        try {
            ip e10 = e();
            if (e10 != null) {
                String b10 = e10.b();
                if (b10 != null) {
                    hu.a((byte) 2, f25784a, "Publisher device Id is ".concat(b10));
                    return;
                }
                return;
            }
            String d10 = d();
            String str = f25784a;
            hu.a((byte) 2, str, "Publisher device Id is " + a(d10, "SHA-1"));
        } catch (Exception unused) {
        }
    }

    public ip e() {
        return f25785b;
    }

    public void f() {
        if (f25785b != null) {
            if (ig.b()) {
                f25785b.f25782a = null;
            } else if (f25785b.b() == null) {
                ho.a(new Runnable() { // from class: com.inmobi.media.f0
                    @Override // java.lang.Runnable
                    public final void run() {
                        iq.a(iq.this);
                    }
                });
            }
        }
    }

    public Boolean g() {
        ip e10 = a().e();
        if (e10 == null) {
            return null;
        }
        return e10.a();
    }

    private iq() {
    }

    public static String a(String str, String str2) {
        if (str != null) {
            try {
                if ("".equals(str.trim())) {
                    return "TEST_EMULATOR";
                }
                MessageDigest messageDigest = MessageDigest.getInstance(str2);
                messageDigest.update(str.getBytes());
                byte[] digest = messageDigest.digest();
                StringBuilder sb2 = new StringBuilder();
                for (byte b10 : digest) {
                    sb2.append(Integer.toString((b10 & fq.i.NETWORK_LOAD_LIMIT_DISABLED) + 256, 16).substring(1));
                }
                return sb2.toString();
            } catch (Exception unused) {
                return null;
            }
        }
        return "TEST_EMULATOR";
    }
}
