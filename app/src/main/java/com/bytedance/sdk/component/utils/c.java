package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.pm.Signature;
import com.inmobi.media.fq;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: AppSigning.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static HashMap<String, ArrayList<String>> f10446a = new HashMap<>();

    public static ArrayList<String> a(Context context, String str) {
        Signature[] b10;
        ArrayList<String> arrayList = null;
        if (context != null && str != null) {
            String packageName = context.getPackageName();
            if (packageName == null) {
                return null;
            }
            if (f10446a.get(str) != null) {
                return f10446a.get(str);
            }
            arrayList = new ArrayList<>();
            try {
                for (Signature signature : b(context, packageName)) {
                    String str2 = "error!";
                    if ("MD5".equals(str)) {
                        str2 = a(signature, "MD5");
                    } else if ("SHA1".equals(str)) {
                        str2 = a(signature, "SHA1");
                    } else if ("SHA256".equals(str)) {
                        str2 = a(signature, "SHA256");
                    }
                    arrayList.add(str2);
                }
            } catch (Exception e10) {
                l.b(e10.toString());
            }
            f10446a.put(str, arrayList);
        }
        return arrayList;
    }

    private static Signature[] b(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 64).signatures;
        } catch (Exception e10) {
            l.b(e10.toString());
            return null;
        }
    }

    public static String a(Context context) {
        StringBuilder sb2 = new StringBuilder();
        ArrayList<String> a10 = a(context, "SHA1");
        if (a10 != null && a10.size() != 0) {
            for (int i10 = 0; i10 < a10.size(); i10++) {
                sb2.append(a10.get(i10));
                if (i10 < a10.size() - 1) {
                    sb2.append(",");
                }
            }
        }
        return sb2.toString();
    }

    private static String a(Signature signature, String str) {
        byte[] byteArray = signature.toByteArray();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            if (messageDigest != null) {
                byte[] digest = messageDigest.digest(byteArray);
                StringBuilder sb2 = new StringBuilder();
                for (byte b10 : digest) {
                    sb2.append(Integer.toHexString((b10 & fq.i.NETWORK_LOAD_LIMIT_DISABLED) | 256).substring(1, 3).toUpperCase());
                    sb2.append(":");
                }
                return sb2.substring(0, sb2.length() - 1).toString();
            }
            return "error!";
        } catch (Exception e10) {
            l.b(e10.toString());
            return "error!";
        }
    }
}
