package com.facebook.hermes.intl;

import android.icu.lang.UCharacter;
import android.icu.util.ULocale;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

@g6.a
/* loaded from: classes.dex */
public class Intl {
    private static List<String> a(List<String> list) throws i5.d {
        if (list.size() == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null) {
                if (!str.isEmpty()) {
                    String b10 = g.b(str);
                    if (!b10.isEmpty() && !arrayList.contains(b10)) {
                        arrayList.add(b10);
                    }
                } else {
                    throw new i5.d("Incorrect locale information provided");
                }
            } else {
                throw new i5.d("Incorrect locale information provided");
            }
        }
        return arrayList;
    }

    @g6.a
    public static List<String> getCanonicalLocales(List<String> list) throws i5.d {
        return a(list);
    }

    @g6.a
    public static String toLocaleLowerCase(List<String> list, String str) throws i5.d {
        String[] strArr = new String[list.size()];
        if (Build.VERSION.SDK_INT >= 24) {
            return UCharacter.toLowerCase((ULocale) h.c((String[]) list.toArray(strArr)).f14722a.h(), str);
        }
        return str.toLowerCase((Locale) h.f((String[]) list.toArray(strArr)).f14722a.h());
    }

    @g6.a
    public static String toLocaleUpperCase(List<String> list, String str) throws i5.d {
        String[] strArr = new String[list.size()];
        if (Build.VERSION.SDK_INT >= 24) {
            return UCharacter.toUpperCase((ULocale) h.c((String[]) list.toArray(strArr)).f14722a.h(), str);
        }
        return str.toUpperCase((Locale) h.f((String[]) list.toArray(strArr)).f14722a.h());
    }
}
