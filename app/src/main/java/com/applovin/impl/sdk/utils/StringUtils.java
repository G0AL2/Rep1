package com.applovin.impl.sdk.utils;

import android.net.Uri;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class StringUtils {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f8803a = "0123456789abcdef".toCharArray();

    private static String a(String str, Integer num) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(str.getBytes("UTF-8"));
            String hexString = toHexString(messageDigest.digest());
            return num.intValue() > 0 ? hexString.substring(0, Math.min(num.intValue(), hexString.length())) : hexString;
        } catch (Throwable th) {
            throw new RuntimeException("SHA-1 for \"" + str + "\" failed.", th);
        }
    }

    public static String appendQueryParameter(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter(str2, str3);
        return buildUpon.build().toString();
    }

    public static String appendQueryParameters(String str, Map<String, String> map, boolean z10) {
        if (TextUtils.isEmpty(str) || map == null || map.isEmpty()) {
            return str;
        }
        if (z10) {
            TreeMap treeMap = new TreeMap(new Comparator<String>() { // from class: com.applovin.impl.sdk.utils.StringUtils.1
                @Override // java.util.Comparator
                /* renamed from: a */
                public int compare(String str2, String str3) {
                    return str2.compareToIgnoreCase(str3);
                }
            });
            treeMap.putAll(map);
            map = treeMap;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        return buildUpon.build().toString();
    }

    public static boolean containsIgnoreCase(String str, String str2) {
        return isValidString(str) && isValidString(str2) && str.toLowerCase().contains(str2.toLowerCase());
    }

    public static SpannedString createListItemDetailSpannedString(String str, int i10) {
        return createSpannedString(str, i10, 16);
    }

    public static SpannedString createListItemDetailSubSpannedString(String str, int i10) {
        return createSpannedString(str, i10, 12, 1);
    }

    public static SpannedString createSpannedString(String str, int i10, int i11) {
        return createSpannedString(str, i10, i11, 0);
    }

    public static SpannedString createSpannedString(String str, int i10, int i11, int i12) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(i10), 0, spannableString.length(), 33);
        spannableString.setSpan(new AbsoluteSizeSpan(i11, true), 0, spannableString.length(), 33);
        spannableString.setSpan(new StyleSpan(i12), 0, spannableString.length(), 33);
        return new SpannedString(spannableString);
    }

    public static String emptyIfNull(String str) {
        return str == null ? "" : str;
    }

    public static String encodeUriString(String str, com.applovin.impl.sdk.m mVar) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (((Boolean) mVar.a(com.applovin.impl.sdk.c.b.eO)).booleanValue()) {
            return Uri.encode(str);
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            throw new UnsupportedOperationException(e10);
        }
    }

    public static Boolean endsWith(String str, List<String> list) {
        for (String str2 : list) {
            if (str.endsWith(str2)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public static String getHostAndPath(String str) {
        Uri parse = Uri.parse(str);
        return parse.getHost() + parse.getPath();
    }

    public static boolean isAlphaNumeric(String str) {
        if (isValidString(str)) {
            return str.matches("^[a-zA-Z0-9]*$");
        }
        return false;
    }

    public static boolean isNumeric(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        char charAt = str.charAt(0);
        int i10 = (charAt == '-' || charAt == '+') ? 1 : 0;
        int length = str.length();
        if (i10 == 1 && length == 1) {
            return false;
        }
        while (i10 < length) {
            if (!Character.isDigit(str.charAt(i10))) {
                return false;
            }
            i10++;
        }
        return true;
    }

    public static boolean isValidString(String str) {
        return !TextUtils.isEmpty(str);
    }

    public static int parseInt(String str) {
        return parseInt(str, 0);
    }

    public static int parseInt(String str, int i10) {
        return isNumeric(str) ? Integer.parseInt(str) : i10;
    }

    public static String prefixToIndex(int i10, String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (i10 > str.length()) {
            i10 = str.length();
        }
        return str.substring(0, i10);
    }

    public static String replace(String str, String str2, String str3) {
        if (str3 != null) {
            if (str == null || str.length() < 1 || str2 == null || str2.length() < 1) {
                return str;
            }
            StringBuilder sb2 = new StringBuilder(str);
            int indexOf = sb2.indexOf(str2);
            while (indexOf != -1) {
                sb2.replace(indexOf, str2.length() + indexOf, str3);
                indexOf = sb2.indexOf(str2, indexOf + str3.length());
            }
            return sb2.toString();
        }
        throw new IllegalArgumentException("No replacement target specified");
    }

    public static String replace(String str, Map<String, String> map) {
        if (str != null && map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                str = str.replace(entry.getKey(), entry.getValue());
            }
        }
        return str;
    }

    public static String toDigitsOnlyVersionString(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String[] split = str.split("\\.");
        ArrayList arrayList = new ArrayList(split.length);
        for (String str2 : split) {
            if (isValidString(str2)) {
                String[] split2 = str2.split("[^0-9]+");
                if (split2.length > 0) {
                    arrayList.add(split2[0]);
                }
            }
        }
        return TextUtils.join(".", arrayList);
    }

    public static String toFullSHA1Hash(String str) {
        return a(str, -1);
    }

    public static String toHexString(byte[] bArr) {
        if (bArr != null) {
            char[] cArr = new char[bArr.length * 2];
            for (int i10 = 0; i10 < bArr.length; i10++) {
                int i11 = i10 * 2;
                char[] cArr2 = f8803a;
                cArr[i11] = cArr2[(bArr[i10] & 240) >>> 4];
                cArr[i11 + 1] = cArr2[bArr[i10] & 15];
            }
            return new String(cArr);
        }
        throw new IllegalArgumentException("No data specified");
    }

    public static String toHumanReadableString(String str) {
        String[] split;
        String lowerCase;
        if (isValidString(str)) {
            StringBuilder sb2 = new StringBuilder(str.length());
            for (String str2 : str.split("_")) {
                if (isValidString(str2)) {
                    if (str2.equals("id")) {
                        lowerCase = str2.toUpperCase(Locale.ENGLISH);
                    } else {
                        String substring = str2.substring(0, 1);
                        Locale locale = Locale.ENGLISH;
                        sb2.append(substring.toUpperCase(locale));
                        lowerCase = str2.substring(1).toLowerCase(locale);
                    }
                    sb2.append(lowerCase);
                    sb2.append(" ");
                }
            }
            return sb2.deleteCharAt(sb2.length() - 1).toString();
        }
        return "";
    }

    public static String toShortSHA1Hash(String str) {
        return a(str, 16);
    }
}
