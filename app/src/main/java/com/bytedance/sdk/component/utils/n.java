package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: MimeDetector.java */
/* loaded from: classes.dex */
public class n {

    /* renamed from: c  reason: collision with root package name */
    private static volatile n f10461c;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, String> f10462a;

    /* renamed from: b  reason: collision with root package name */
    private volatile boolean f10463b = false;

    /* renamed from: d  reason: collision with root package name */
    private Context f10464d;

    private n(Context context) {
        if (context != null && this.f10464d == null) {
            this.f10464d = context.getApplicationContext();
            a();
        }
        this.f10464d = context;
    }

    private static String b(String str) {
        String substring;
        int indexOf = str.indexOf(47);
        int indexOf2 = str.indexOf(59);
        if (indexOf < 0) {
            return null;
        }
        String trim = str.substring(0, indexOf).trim();
        Locale locale = Locale.ENGLISH;
        String lowerCase = trim.toLowerCase(locale);
        if (c(lowerCase)) {
            int i10 = indexOf + 1;
            if (indexOf2 < 0) {
                substring = str.substring(i10);
            } else {
                substring = str.substring(i10, indexOf2);
            }
            String lowerCase2 = substring.trim().toLowerCase(locale);
            if (c(lowerCase2)) {
                StringBuilder sb2 = new StringBuilder(lowerCase.length() + lowerCase2.length() + 1);
                sb2.append(lowerCase);
                sb2.append('/');
                sb2.append(lowerCase2);
                return sb2.toString();
            }
            return null;
        }
        return null;
    }

    private static boolean c(String str) {
        int length = str.length();
        if (length == 0) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10++) {
            if (!a(str.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    private String d(String str) {
        String str2;
        String e10 = e(str);
        if (e10.isEmpty()) {
            return null;
        }
        a();
        Map<String, String> map = this.f10462a;
        if (map == null || map.isEmpty()) {
            return null;
        }
        do {
            str2 = this.f10462a.get(e10);
            if (str2 == null) {
                e10 = e(e10);
            }
            if (str2 != null) {
                break;
            }
        } while (!e10.isEmpty());
        return str2;
    }

    private static String e(String str) {
        int indexOf;
        return (str == null || str.isEmpty() || (indexOf = str.indexOf(46)) < 0 || indexOf >= str.length() + (-1)) ? "" : str.substring(indexOf + 1);
    }

    private void f(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return;
        }
        if (trim.charAt(0) == '#') {
            return;
        }
        String replaceAll = trim.replaceAll("\\s*#.*", "");
        if (replaceAll.indexOf(61) > 0) {
            Matcher matcher = Pattern.compile("\\btype=(\"\\p{Graph}+?/\\p{Graph}+?\"|\\p{Graph}+/\\p{Graph}+\\b)").matcher(replaceAll);
            if (matcher.find()) {
                String substring = matcher.group().substring(5);
                if (substring.charAt(0) == '\"') {
                    substring = substring.substring(1, substring.length() - 1);
                }
                Matcher matcher2 = Pattern.compile("\\bexts=(\"[\\p{Graph}|\\p{Blank}]+?\"|\\p{Graph}+\\b)").matcher(replaceAll);
                if (matcher2.find()) {
                    String substring2 = matcher2.group().substring(5);
                    if (substring2.charAt(0) == '\"') {
                        substring2 = substring2.substring(1, substring2.length() - 1);
                    }
                    for (String str2 : substring2.split("[\\p{Blank}|\\p{Punct}]+")) {
                        a(str2, substring);
                    }
                    return;
                }
                return;
            }
            return;
        }
        String[] split = replaceAll.split("\\s+");
        for (int i10 = 1; i10 < split.length; i10++) {
            a(split[i10], split[0]);
        }
    }

    public static String a(Context context, String str) {
        if (str != null) {
            try {
                if (str.startsWith("http") && str.contains("?")) {
                    str = str.split("\\?")[0];
                    if (str.endsWith("/")) {
                        str = str.substring(0, str.length() - 1);
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return a(context).a(str);
    }

    static n a(Context context) {
        if (f10461c == null) {
            synchronized (n.class) {
                if (f10461c == null) {
                    f10461c = new n(context);
                }
            }
        }
        return f10461c;
    }

    public final String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String d10 = d(str);
        if (TextUtils.isEmpty(d10)) {
            return null;
        }
        return b(d10);
    }

    private static boolean a(char c10) {
        return c10 > ' ' && c10 < 127 && "()<>@,;:/[]?=\\\"".indexOf(c10) < 0;
    }

    private void a() {
        if (this.f10464d == null || this.f10463b) {
            return;
        }
        synchronized (this) {
            if (!this.f10463b) {
                List list = (List) AccessController.doPrivileged(new PrivilegedAction<List<String>>() { // from class: com.bytedance.sdk.component.utils.n.1
                    @Override // java.security.PrivilegedAction
                    /* renamed from: a */
                    public List<String> run() {
                        BufferedReader bufferedReader;
                        InputStream inputStream = null;
                        try {
                            ArrayList arrayList = new ArrayList();
                            InputStream open = n.this.f10464d.getAssets().open("tt_mime_type.pro");
                            try {
                                bufferedReader = new BufferedReader(new InputStreamReader(open));
                                while (true) {
                                    try {
                                        String readLine = bufferedReader.readLine();
                                        if (readLine == null) {
                                            break;
                                        } else if (!TextUtils.isEmpty(readLine)) {
                                            arrayList.add(readLine);
                                        }
                                    } catch (Throwable unused) {
                                        inputStream = open;
                                        try {
                                            List<String> emptyList = Collections.emptyList();
                                            if (bufferedReader != null) {
                                                try {
                                                    bufferedReader.close();
                                                } catch (Throwable unused2) {
                                                }
                                            }
                                            return emptyList;
                                        } finally {
                                            if (inputStream != null) {
                                                try {
                                                    inputStream.close();
                                                } catch (Throwable unused3) {
                                                }
                                            }
                                            if (bufferedReader != null) {
                                                try {
                                                    bufferedReader.close();
                                                } catch (Throwable unused4) {
                                                }
                                            }
                                        }
                                    }
                                }
                                if (open != null) {
                                    try {
                                        open.close();
                                    } catch (Throwable unused5) {
                                    }
                                }
                                try {
                                    bufferedReader.close();
                                } catch (Throwable unused6) {
                                }
                                return arrayList;
                            } catch (Throwable unused7) {
                                bufferedReader = null;
                            }
                        } catch (Throwable unused8) {
                            bufferedReader = null;
                        }
                    }
                });
                this.f10462a = new HashMap(list.size());
                String str = "";
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str2 = str + ((String) it.next());
                    if (str2.endsWith("\\")) {
                        str = str2.substring(0, str2.length() - 1);
                    } else {
                        f(str2);
                        str = "";
                    }
                }
                if (!str.isEmpty()) {
                    f(str);
                }
                this.f10463b = true;
            }
        }
    }

    private void a(String str, String str2) {
        if (str == null || str.isEmpty() || str2 == null || str2.isEmpty() || this.f10462a.containsKey(str)) {
            return;
        }
        this.f10462a.put(str, str2);
    }
}
