package com.google.android.datatransport.cct;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import w7.g;

/* compiled from: CCTDestination.java */
/* loaded from: classes2.dex */
public final class a implements g {

    /* renamed from: c  reason: collision with root package name */
    static final String f20967c;

    /* renamed from: d  reason: collision with root package name */
    static final String f20968d;

    /* renamed from: e  reason: collision with root package name */
    private static final String f20969e;

    /* renamed from: f  reason: collision with root package name */
    private static final Set<u7.b> f20970f;

    /* renamed from: g  reason: collision with root package name */
    public static final a f20971g;

    /* renamed from: a  reason: collision with root package name */
    private final String f20972a;

    /* renamed from: b  reason: collision with root package name */
    private final String f20973b;

    static {
        String a10 = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f20967c = a10;
        String a11 = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f20968d = a11;
        String a12 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f20969e = a12;
        f20970f = Collections.unmodifiableSet(new HashSet(Arrays.asList(u7.b.b("proto"), u7.b.b("json"))));
        new a(a10, null);
        f20971g = new a(a11, a12);
    }

    public a(String str, String str2) {
        this.f20972a = str;
        this.f20973b = str2;
    }

    public static a c(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    @Override // w7.g
    public Set<u7.b> a() {
        return f20970f;
    }

    public byte[] b() {
        String str = this.f20973b;
        if (str == null && this.f20972a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f20972a;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }

    public String d() {
        return this.f20973b;
    }

    public String e() {
        return this.f20972a;
    }

    @Override // w7.f
    public byte[] getExtras() {
        return b();
    }

    @Override // w7.f
    public String getName() {
        return "cct";
    }
}
