package com.facebook.react.views.text;

import java.text.BreakIterator;

/* compiled from: TextTransform.java */
/* loaded from: classes.dex */
public enum z {
    NONE,
    UPPERCASE,
    LOWERCASE,
    CAPITALIZE,
    UNSET;

    /* compiled from: TextTransform.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f16300a;

        static {
            int[] iArr = new int[z.values().length];
            f16300a = iArr;
            try {
                iArr[z.UPPERCASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16300a[z.LOWERCASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16300a[z.CAPITALIZE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static String a(String str, z zVar) {
        if (str == null) {
            return null;
        }
        int i10 = a.f16300a[zVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return i10 != 3 ? str : b(str);
            }
            return str.toLowerCase();
        }
        return str.toUpperCase();
    }

    private static String b(String str) {
        BreakIterator wordInstance = BreakIterator.getWordInstance();
        wordInstance.setText(str);
        StringBuilder sb2 = new StringBuilder(str.length());
        int first = wordInstance.first();
        while (true) {
            int i10 = first;
            first = wordInstance.next();
            if (first != -1) {
                String substring = str.substring(i10, first);
                if (Character.isLetterOrDigit(substring.charAt(0))) {
                    sb2.append(Character.toUpperCase(substring.charAt(0)));
                    sb2.append(substring.substring(1).toLowerCase());
                } else {
                    sb2.append(substring);
                }
            } else {
                return sb2.toString();
            }
        }
    }
}
