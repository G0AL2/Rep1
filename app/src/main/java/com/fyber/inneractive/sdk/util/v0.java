package com.fyber.inneractive.sdk.util;

/* loaded from: classes2.dex */
public class v0 {
    public static boolean a(String str, com.fyber.inneractive.sdk.model.vast.h hVar) {
        String substring = str != null ? str.substring(str.lastIndexOf(".") + 1) : "";
        String str2 = hVar.toString();
        if (str2.equalsIgnoreCase(substring)) {
            return true;
        }
        if (substring.equals("jpeg") || substring.equals("jpg")) {
            return str2.equals("Jpeg") || str2.equals("Jpg");
        }
        return false;
    }
}
