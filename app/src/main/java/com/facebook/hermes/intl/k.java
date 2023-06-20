package com.facebook.hermes.intl;

import android.icu.util.ULocale;
import android.text.TextUtils;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: LocaleObjectICU.java */
/* loaded from: classes.dex */
public class k implements a<ULocale> {

    /* renamed from: a  reason: collision with root package name */
    private ULocale f14727a;

    /* renamed from: b  reason: collision with root package name */
    private ULocale.Builder f14728b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f14729c;

    private k(ULocale uLocale) {
        this.f14727a = null;
        this.f14728b = null;
        this.f14729c = false;
        this.f14727a = uLocale;
    }

    public static a<ULocale> i() {
        return new k(ULocale.getDefault(ULocale.Category.FORMAT));
    }

    public static a<ULocale> j(String str) throws i5.d {
        return new k(str);
    }

    public static a<ULocale> k(ULocale uLocale) {
        return new k(uLocale);
    }

    private void l() throws i5.d {
        if (this.f14729c) {
            try {
                this.f14727a = this.f14728b.build();
                this.f14729c = false;
            } catch (RuntimeException e10) {
                throw new i5.d(e10.getMessage());
            }
        }
    }

    @Override // com.facebook.hermes.intl.a
    public HashMap<String, String> a() throws i5.d {
        l();
        HashMap<String, String> hashMap = new HashMap<>();
        Iterator<String> keywords = this.f14727a.getKeywords();
        if (keywords != null) {
            while (keywords.hasNext()) {
                String next = keywords.next();
                hashMap.put(u.b(next), this.f14727a.getKeywordValue(next));
            }
        }
        return hashMap;
    }

    @Override // com.facebook.hermes.intl.a
    public ArrayList<String> b(String str) throws i5.d {
        l();
        String a10 = u.a(str);
        ArrayList<String> arrayList = new ArrayList<>();
        String keywordValue = this.f14727a.getKeywordValue(a10);
        if (keywordValue != null && !keywordValue.isEmpty()) {
            Collections.addAll(arrayList, keywordValue.split("-|_"));
        }
        return arrayList;
    }

    @Override // com.facebook.hermes.intl.a
    public a<ULocale> d() throws i5.d {
        l();
        return new k(this.f14727a);
    }

    @Override // com.facebook.hermes.intl.a
    public String e() throws i5.d {
        return c().toLanguageTag();
    }

    @Override // com.facebook.hermes.intl.a
    public void f(String str, ArrayList<String> arrayList) throws i5.d {
        l();
        if (this.f14728b == null) {
            this.f14728b = new ULocale.Builder().setLocale(this.f14727a);
        }
        try {
            this.f14728b.setUnicodeLocaleKeyword(str, TextUtils.join(Constants.FILENAME_SEQUENCE_SEPARATOR, arrayList));
            this.f14729c = true;
        } catch (RuntimeException e10) {
            throw new i5.d(e10.getMessage());
        }
    }

    @Override // com.facebook.hermes.intl.a
    public String g() throws i5.d {
        return h().toLanguageTag();
    }

    @Override // com.facebook.hermes.intl.a
    /* renamed from: m */
    public ULocale h() throws i5.d {
        l();
        return this.f14727a;
    }

    @Override // com.facebook.hermes.intl.a
    /* renamed from: n */
    public ULocale c() throws i5.d {
        l();
        ULocale.Builder builder = new ULocale.Builder();
        builder.setLocale(this.f14727a);
        builder.clearExtensions();
        return builder.build();
    }

    private k(String str) throws i5.d {
        this.f14727a = null;
        this.f14728b = null;
        this.f14729c = false;
        ULocale.Builder builder = new ULocale.Builder();
        this.f14728b = builder;
        try {
            builder.setLanguageTag(str);
            this.f14729c = true;
        } catch (RuntimeException e10) {
            throw new i5.d(e10.getMessage());
        }
    }
}
