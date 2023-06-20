package com.ironsource.sdk.controller;

import com.inmobi.media.fq;
import java.security.MessageDigest;

/* loaded from: classes3.dex */
final class t {

    /* renamed from: a  reason: collision with root package name */
    String f27873a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(String str) {
        this.f27873a = str;
    }

    private String a(String str) {
        try {
            return com.ironsource.sdk.utils.c.a(str);
        } catch (Exception e10) {
            e10.printStackTrace();
            return c(str);
        }
    }

    private String c(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : digest) {
                String hexString = Integer.toHexString(b10 & fq.i.NETWORK_LOAD_LIMIT_DISABLED);
                if (hexString.length() < 2) {
                    hexString = "0" + hexString;
                }
                sb2.append(hexString);
            }
            return sb2.toString();
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b(String str, String str2, String str3) {
        try {
            return str3.equalsIgnoreCase(a(str + str2 + this.f27873a));
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }
}
