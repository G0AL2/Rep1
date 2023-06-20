package com.iab.omid.library.applovin;

import com.iab.omid.library.applovin.d.e;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
class c {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f23944a = Pattern.compile("<(head)( [^>]*)?>", 2);

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f23945b = Pattern.compile("<(head)( [^>]*)?/>", 2);

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f23946c = Pattern.compile("<(body)( [^>]*?)?>", 2);

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f23947d = Pattern.compile("<(body)( [^>]*?)?/>", 2);

    /* renamed from: e  reason: collision with root package name */
    private static final Pattern f23948e = Pattern.compile("<(html)( [^>]*?)?>", 2);

    /* renamed from: f  reason: collision with root package name */
    private static final Pattern f23949f = Pattern.compile("<(html)( [^>]*?)?/>", 2);

    /* renamed from: g  reason: collision with root package name */
    private static final Pattern f23950g = Pattern.compile("<!DOCTYPE [^>]*>", 2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(String str, String str2) {
        return b(str2, "<script type=\"text/javascript\">" + str + "</script>");
    }

    private static boolean a(int i10, int[][] iArr) {
        if (iArr != null) {
            for (int[] iArr2 : iArr) {
                if (i10 >= iArr2[0] && i10 <= iArr2[1]) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean a(String str, StringBuilder sb2, Pattern pattern, String str2, int[][] iArr) {
        Matcher matcher = pattern.matcher(str);
        int i10 = 0;
        while (matcher.find(i10)) {
            int start = matcher.start();
            int end = matcher.end();
            if (!a(start, iArr)) {
                sb2.append(str.substring(0, matcher.end()));
                sb2.append(str2);
                sb2.append(str.substring(matcher.end()));
                return true;
            }
            i10 = end;
        }
        return false;
    }

    private static int[][] a(String str) {
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            int indexOf = str.indexOf("<!--", i10);
            if (indexOf >= 0) {
                int indexOf2 = str.indexOf("-->", indexOf);
                int[] iArr = new int[2];
                if (indexOf2 >= 0) {
                    iArr[0] = indexOf;
                    iArr[1] = indexOf2;
                    arrayList.add(iArr);
                    i10 = indexOf2 + 3;
                } else {
                    iArr[0] = indexOf;
                    iArr[1] = length;
                    arrayList.add(iArr);
                }
            }
            i10 = length;
        }
        return (int[][]) arrayList.toArray((int[][]) Array.newInstance(int.class, 0, 2));
    }

    static String b(String str, String str2) {
        e.a(str, "HTML is null or empty");
        int[][] a10 = a(str);
        StringBuilder sb2 = new StringBuilder(str.length() + str2.length() + 16);
        if (!b(str, sb2, f23945b, str2, a10) && !a(str, sb2, f23944a, str2, a10) && !b(str, sb2, f23947d, str2, a10) && !a(str, sb2, f23946c, str2, a10) && !b(str, sb2, f23949f, str2, a10) && !a(str, sb2, f23948e, str2, a10) && !a(str, sb2, f23950g, str2, a10)) {
            return str2 + str;
        }
        return sb2.toString();
    }

    private static boolean b(String str, StringBuilder sb2, Pattern pattern, String str2, int[][] iArr) {
        Matcher matcher = pattern.matcher(str);
        int i10 = 0;
        while (matcher.find(i10)) {
            int start = matcher.start();
            int end = matcher.end();
            if (!a(start, iArr)) {
                sb2.append(str.substring(0, matcher.end() - 2));
                sb2.append(">");
                sb2.append(str2);
                sb2.append("</");
                sb2.append(matcher.group(1));
                sb2.append(">");
                sb2.append(str.substring(matcher.end()));
                return true;
            }
            i10 = end;
        }
        return false;
    }
}
