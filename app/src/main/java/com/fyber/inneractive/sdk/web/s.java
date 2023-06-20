package com.fyber.inneractive.sdk.web;

import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import java.io.ByteArrayInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class s {

    /* renamed from: g  reason: collision with root package name */
    public static final Pattern f20449g = Pattern.compile("max-age=(\\d+)");

    /* renamed from: h  reason: collision with root package name */
    public static final SimpleDateFormat f20450h = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.ENGLISH);

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f20451a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, String> f20452b;

    /* renamed from: c  reason: collision with root package name */
    public final String f20453c;

    /* renamed from: d  reason: collision with root package name */
    public final String f20454d;

    /* renamed from: e  reason: collision with root package name */
    public final int f20455e;

    /* renamed from: f  reason: collision with root package name */
    public final String f20456f;

    public s(byte[] bArr, Map<String, String> map, String str, String str2, int i10, String str3) {
        this.f20451a = bArr;
        this.f20452b = map;
        this.f20453c = str;
        this.f20454d = str2;
        this.f20455e = i10;
        this.f20456f = str3;
    }

    public boolean a() {
        boolean z10;
        String str;
        if (TextUtils.isEmpty(this.f20456f)) {
            return false;
        }
        loop0: while (true) {
            z10 = true;
            for (String str2 : this.f20452b.keySet()) {
                if (!z10) {
                    break loop0;
                } else if (str2 != null && str2.equalsIgnoreCase("Cache-Control")) {
                    String str3 = this.f20452b.get(str2);
                    if (str3 != null) {
                        Pattern pattern = f20449g;
                        Locale locale = Locale.ENGLISH;
                        Matcher matcher = pattern.matcher(str3.toLowerCase(locale));
                        int a10 = (matcher.find() && matcher.groupCount() == 1) ? com.fyber.inneractive.sdk.util.s.a(matcher.group(1), 0) : 0;
                        if ((str3.toLowerCase(locale).contains("public") || str3.toLowerCase(locale).contains("private") || a10 > TimeUnit.SECONDS.convert(1L, TimeUnit.HOURS)) && !str3.toLowerCase(locale).contains("no-") && !str3.toLowerCase(locale).contains("must-")) {
                            break;
                        }
                        z10 = false;
                    } else {
                        continue;
                    }
                } else {
                    if (str2 == null || !str2.equalsIgnoreCase("Vary")) {
                        if (str2 != null && str2.equalsIgnoreCase("Pragma")) {
                            String str4 = this.f20452b.get(str2);
                            if (str4 != null) {
                                z10 = !str4.equalsIgnoreCase("no-cache");
                            }
                        } else if (str2 != null && str2.equalsIgnoreCase("Expires") && (str = this.f20452b.get(str2)) != null) {
                            try {
                                Date parse = f20450h.parse(str);
                                if (parse != null && parse.getTime() + TimeUnit.MILLISECONDS.convert(1L, TimeUnit.HOURS) > System.currentTimeMillis()) {
                                    break;
                                }
                            } catch (ParseException unused) {
                            }
                        }
                    }
                    z10 = false;
                }
            }
        }
        return z10;
    }

    public WebResourceResponse b() {
        return new WebResourceResponse(this.f20453c, this.f20454d, this.f20455e, this.f20456f, this.f20452b, new ByteArrayInputStream(this.f20451a));
    }
}
