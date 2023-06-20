package com.facebook.hermes.intl;

import android.icu.util.ULocale;
import android.os.Build;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: LocaleMatcher.java */
/* loaded from: classes.dex */
public class h {

    /* compiled from: LocaleMatcher.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public com.facebook.hermes.intl.a<?> f14722a;

        /* renamed from: b  reason: collision with root package name */
        public HashMap<String, String> f14723b = new HashMap<>();
    }

    public static String a(String[] strArr, String str) {
        while (Arrays.asList(strArr).indexOf(str) <= -1) {
            int lastIndexOf = str.lastIndexOf(Constants.FILENAME_SEQUENCE_SEPARATOR);
            if (lastIndexOf < 0) {
                return "";
            }
            if (lastIndexOf >= 2 && str.charAt(lastIndexOf - 2) == '-') {
                lastIndexOf -= 2;
            }
            str = str.substring(0, lastIndexOf);
        }
        return str;
    }

    public static ULocale b(com.facebook.hermes.intl.a<?> aVar) throws i5.d {
        ULocale[] availableLocales = ULocale.getAvailableLocales();
        ULocale[] uLocaleArr = {(ULocale) aVar.c()};
        boolean[] zArr = new boolean[1];
        ULocale acceptLanguage = ULocale.acceptLanguage(uLocaleArr, availableLocales, zArr);
        if (zArr[0] || acceptLanguage == null) {
            return null;
        }
        return acceptLanguage;
    }

    public static a c(String[] strArr) throws i5.d {
        a aVar = new a();
        for (String str : strArr) {
            com.facebook.hermes.intl.a b10 = i.b(str);
            ULocale b11 = b(b10);
            if (b11 != null) {
                aVar.f14722a = k.k(b11);
                aVar.f14723b = b10.a();
                return aVar;
            }
        }
        aVar.f14722a = k.i();
        return aVar;
    }

    public static String[] d(String[] strArr) throws i5.d {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (b(i.b(str)) != null) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String[] e() {
        if (Build.VERSION.SDK_INT < 21) {
            return new String[]{"en"};
        }
        ArrayList arrayList = new ArrayList();
        for (Locale locale : Locale.getAvailableLocales()) {
            arrayList.add(locale.toLanguageTag());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static a f(String[] strArr) throws i5.d {
        return g(strArr, e());
    }

    public static a g(String[] strArr, String[] strArr2) throws i5.d {
        a aVar = new a();
        for (String str : strArr) {
            com.facebook.hermes.intl.a b10 = i.b(str);
            String a10 = a(strArr2, b10.e());
            if (!a10.isEmpty()) {
                aVar.f14722a = i.b(a10);
                aVar.f14723b = b10.a();
                return aVar;
            }
        }
        aVar.f14722a = i.a();
        return aVar;
    }

    public static String[] h(String[] strArr) throws i5.d {
        ArrayList arrayList = new ArrayList();
        String[] e10 = e();
        for (String str : strArr) {
            String a10 = a(e10, i.b(str).e());
            if (a10 != null && !a10.isEmpty()) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
