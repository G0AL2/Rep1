package com.facebook.react.modules.network;

/* compiled from: HeaderUtil.java */
/* loaded from: classes.dex */
public class d {
    public static String a(String str) {
        StringBuilder sb2 = new StringBuilder(str.length());
        int length = str.length();
        boolean z10 = false;
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (charAt <= ' ' || charAt >= 127) {
                z10 = true;
            } else {
                sb2.append(charAt);
            }
        }
        return z10 ? sb2.toString() : str;
    }

    public static String b(String str) {
        StringBuilder sb2 = new StringBuilder(str.length());
        int length = str.length();
        boolean z10 = false;
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if ((charAt <= 31 || charAt >= 127) && charAt != '\t') {
                z10 = true;
            } else {
                sb2.append(charAt);
            }
        }
        return z10 ? sb2.toString() : str;
    }
}
