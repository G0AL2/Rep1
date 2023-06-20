package com.facebook.hermes.intl;

import android.icu.text.NumberingSystem;
import android.icu.text.RuleBasedCollator;
import android.icu.util.Calendar;
import android.icu.util.ULocale;
import android.os.Build;
import com.applovin.sdk.AppLovinEventTypes;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: UnicodeExtensionKeys.java */
/* loaded from: classes.dex */
public class u {

    /* renamed from: a  reason: collision with root package name */
    public static String f14763a = "calendar";

    /* renamed from: b  reason: collision with root package name */
    public static String f14764b = "ca";

    /* renamed from: c  reason: collision with root package name */
    public static String f14765c = "numbers";

    /* renamed from: d  reason: collision with root package name */
    public static String f14766d = "nu";

    /* renamed from: e  reason: collision with root package name */
    public static String f14767e = "hours";

    /* renamed from: f  reason: collision with root package name */
    public static String f14768f = "hc";

    /* renamed from: g  reason: collision with root package name */
    public static String f14769g = "collation";

    /* renamed from: h  reason: collision with root package name */
    public static String f14770h = "co";

    /* renamed from: i  reason: collision with root package name */
    public static String f14771i = "colnumeric";

    /* renamed from: j  reason: collision with root package name */
    public static String f14772j = "kn";

    /* renamed from: k  reason: collision with root package name */
    public static String f14773k = "colcasefirst";

    /* renamed from: l  reason: collision with root package name */
    public static String f14774l = "kf";

    /* renamed from: m  reason: collision with root package name */
    private static HashMap<String, String> f14775m = new a();

    /* renamed from: n  reason: collision with root package name */
    private static HashMap<String, String> f14776n = new b();

    /* renamed from: o  reason: collision with root package name */
    private static final Map<String, String> f14777o = new c();

    /* renamed from: p  reason: collision with root package name */
    private static Map<String, String> f14778p = new d();

    /* renamed from: q  reason: collision with root package name */
    private static Map<String, String> f14779q = new e();

    /* renamed from: r  reason: collision with root package name */
    private static Map<String, String[]> f14780r = new f();

    /* compiled from: UnicodeExtensionKeys.java */
    /* loaded from: classes.dex */
    class a extends HashMap<String, String> {
        a() {
            put(u.f14764b, u.f14763a);
            put(u.f14766d, u.f14765c);
            put(u.f14768f, u.f14767e);
            put(u.f14770h, u.f14769g);
            put(u.f14772j, u.f14771i);
            put(u.f14774l, u.f14773k);
        }
    }

    /* compiled from: UnicodeExtensionKeys.java */
    /* loaded from: classes.dex */
    class b extends HashMap<String, String> {
        b() {
            put(u.f14763a, u.f14764b);
            put(u.f14765c, u.f14766d);
            put(u.f14767e, u.f14768f);
            put(u.f14769g, u.f14770h);
            put(u.f14771i, u.f14772j);
            put(u.f14773k, u.f14774l);
        }
    }

    /* compiled from: UnicodeExtensionKeys.java */
    /* loaded from: classes.dex */
    class c extends HashMap<String, String> {
        c() {
            put("dictionary", "dict");
            put("phonebook", "phonebk");
            put("traditional", "trad");
            put("gb2312han", "gb2312");
        }
    }

    /* compiled from: UnicodeExtensionKeys.java */
    /* loaded from: classes.dex */
    class d extends HashMap<String, String> {
        d() {
            put("gregorian", "gregory");
        }
    }

    /* compiled from: UnicodeExtensionKeys.java */
    /* loaded from: classes.dex */
    class e extends HashMap<String, String> {
        e() {
            put("traditional", "traditio");
        }
    }

    /* compiled from: UnicodeExtensionKeys.java */
    /* loaded from: classes.dex */
    class f extends HashMap<String, String[]> {
        f() {
            put("nu", new String[]{"adlm", "ahom", "arab", "arabext", "bali", "beng", "bhks", "brah", "cakm", "cham", "deva", "diak", "fullwide", "gong", "gonm", "gujr", "guru", "hanidec", "hmng", "hmnp", "java", "kali", "khmr", "knda", "lana", "lanatham", "laoo", "latn", "lepc", "limb", "mathbold", "mathdbl", "mathmono", "mathsanb", "mathsans", "mlym", "modi", "mong", "mroo", "mtei", "mymr", "mymrshan", "mymrtlng", "newa", "nkoo", "olck", "orya", "osma", "rohg", "saur", "segment", "shrd", "sind", "sinh", "sora", "sund", "takr", "talu", "tamldec", "telu", "thai", "tibt", "tirh", "vaii", "wara", "wcho"});
            put("co", new String[]{"big5han", "compat", "dict", "direct", "ducet", "emoji", "eor", "gb2312", "phonebk", "phonetic", "pinyin", "reformed", "searchjl", "stroke", "trad", "unihan", "zhuyin"});
            put("ca", new String[]{"buddhist", "chinese", "coptic", "dangi", "ethioaa", "ethiopic", "gregory", "hebrew", "indian", "islamic", "islamic-umalqura", "islamic-tbla", "islamic-civil", "islamic-rgsa", "iso8601", "japanese", "persian", "roc"});
        }
    }

    public static String a(String str) {
        return f14775m.containsKey(str) ? f14775m.get(str) : str;
    }

    public static String b(String str) {
        return f14776n.containsKey(str) ? f14776n.get(str) : str;
    }

    public static boolean c(String str, String str2, com.facebook.hermes.intl.a aVar) throws i5.d {
        if (Build.VERSION.SDK_INT >= 24) {
            ULocale uLocale = (ULocale) aVar.h();
            String[] strArr = new String[0];
            if (str.equals("co")) {
                if (str2.equals("standard") || str2.equals(AppLovinEventTypes.USER_EXECUTED_SEARCH)) {
                    return false;
                }
                strArr = RuleBasedCollator.getKeywordValuesForLocale("co", uLocale, false);
            } else if (str.equals("ca")) {
                strArr = Calendar.getKeywordValuesForLocale("ca", uLocale, false);
            } else if (str.equals("nu")) {
                strArr = NumberingSystem.getAvailableNames();
            }
            if (strArr.length == 0) {
                return true;
            }
            return Arrays.asList(strArr).contains(str2);
        } else if (f14780r.containsKey(str)) {
            return Arrays.asList(f14780r.get(str)).contains(str2);
        } else {
            return true;
        }
    }

    public static String d(String str) {
        return !f14778p.containsKey(str) ? str : f14778p.get(str);
    }

    public static String e(String str) {
        Map<String, String> map = f14777o;
        return !map.containsKey(str) ? str : map.get(str);
    }

    public static Object f(String str, Object obj) {
        if (str.equals("ca") && i5.c.m(obj)) {
            return d((String) obj);
        }
        if (str.equals("nu") && i5.c.m(obj)) {
            return g((String) obj);
        }
        if (str.equals("co") && i5.c.m(obj)) {
            return e((String) obj);
        }
        if (str.equals("kn") && i5.c.m(obj) && obj.equals("yes")) {
            return i5.c.r(InneractiveMediationDefs.SHOW_HOUSE_AD_YES);
        }
        return ((str.equals("kn") || str.equals("kf")) && i5.c.m(obj) && obj.equals("no")) ? i5.c.r("false") : obj;
    }

    public static String g(String str) {
        return !f14779q.containsKey(str) ? str : f14779q.get(str);
    }
}
