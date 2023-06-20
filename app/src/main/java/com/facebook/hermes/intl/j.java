package com.facebook.hermes.intl;

import android.os.Build;
import android.text.TextUtils;
import com.facebook.hermes.intl.n;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: LocaleObjectAndroid.java */
/* loaded from: classes.dex */
public class j implements a<Locale> {

    /* renamed from: a  reason: collision with root package name */
    private Locale f14724a;

    /* renamed from: b  reason: collision with root package name */
    private n f14725b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f14726c;

    private j(Locale locale) {
        this.f14724a = null;
        this.f14725b = null;
        this.f14726c = false;
        this.f14724a = locale;
    }

    public static a<Locale> i() {
        return new j(Locale.getDefault());
    }

    public static a<Locale> j(String str) throws i5.d {
        return new j(str);
    }

    private void k() throws i5.d {
        if (this.f14726c) {
            try {
                o();
                this.f14726c = false;
            } catch (RuntimeException e10) {
                throw new i5.d(e10.getMessage());
            }
        }
    }

    private void l() throws i5.d {
        if (this.f14725b == null) {
            if (Build.VERSION.SDK_INT < 21) {
                this.f14725b = g.f("en");
            } else {
                this.f14725b = g.f(this.f14724a.toLanguageTag());
            }
        }
    }

    private void o() throws i5.d {
        if (Build.VERSION.SDK_INT < 21) {
            this.f14724a = Locale.ENGLISH;
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        StringBuffer stringBuffer3 = new StringBuffer();
        StringBuffer stringBuffer4 = new StringBuffer();
        String str = this.f14725b.f14733a.f14740a;
        if (str != null && !str.isEmpty()) {
            stringBuffer2.append(this.f14725b.f14733a.f14740a);
        }
        String str2 = this.f14725b.f14733a.f14741b;
        if (str2 != null && !str2.isEmpty()) {
            stringBuffer3.append(this.f14725b.f14733a.f14741b);
        }
        String str3 = this.f14725b.f14733a.f14742c;
        if (str3 != null && !str3.isEmpty()) {
            stringBuffer4.append(this.f14725b.f14733a.f14742c);
        }
        g.m(stringBuffer2, stringBuffer3, stringBuffer4);
        if (stringBuffer2.length() > 0) {
            stringBuffer.append(stringBuffer2.toString());
        }
        if (stringBuffer3.length() > 0) {
            stringBuffer.append(Constants.FILENAME_SEQUENCE_SEPARATOR);
            stringBuffer.append(stringBuffer3.toString());
        }
        if (stringBuffer4.length() > 0) {
            stringBuffer.append(Constants.FILENAME_SEQUENCE_SEPARATOR);
            stringBuffer.append(g.n(stringBuffer4));
        }
        ArrayList<String> arrayList = this.f14725b.f14733a.f14743d;
        if (arrayList != null && !arrayList.isEmpty()) {
            stringBuffer.append(Constants.FILENAME_SEQUENCE_SEPARATOR);
            stringBuffer.append(TextUtils.join(Constants.FILENAME_SEQUENCE_SEPARATOR, this.f14725b.f14733a.f14743d));
        }
        TreeMap<Character, ArrayList<String>> treeMap = this.f14725b.f14738f;
        if (treeMap != null) {
            for (Map.Entry<Character, ArrayList<String>> entry : treeMap.entrySet()) {
                stringBuffer.append(Constants.FILENAME_SEQUENCE_SEPARATOR);
                stringBuffer.append(entry.getKey());
                stringBuffer.append(Constants.FILENAME_SEQUENCE_SEPARATOR);
                stringBuffer.append(TextUtils.join(Constants.FILENAME_SEQUENCE_SEPARATOR, entry.getValue()));
            }
        }
        n nVar = this.f14725b;
        if (nVar.f14736d != null || nVar.f14737e != null) {
            stringBuffer.append(Constants.FILENAME_SEQUENCE_SEPARATOR);
            stringBuffer.append('t');
            stringBuffer.append(Constants.FILENAME_SEQUENCE_SEPARATOR);
            StringBuffer stringBuffer5 = new StringBuffer();
            n.a aVar = this.f14725b.f14736d;
            if (aVar != null) {
                stringBuffer5.append(aVar.f14740a);
                if (this.f14725b.f14736d.f14741b != null) {
                    stringBuffer5.append(Constants.FILENAME_SEQUENCE_SEPARATOR);
                    stringBuffer5.append(this.f14725b.f14736d.f14741b);
                }
                if (this.f14725b.f14736d.f14742c != null) {
                    stringBuffer5.append(Constants.FILENAME_SEQUENCE_SEPARATOR);
                    stringBuffer5.append(this.f14725b.f14736d.f14742c);
                }
                ArrayList<String> arrayList2 = this.f14725b.f14736d.f14743d;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    stringBuffer5.append(Constants.FILENAME_SEQUENCE_SEPARATOR);
                    stringBuffer5.append(TextUtils.join(Constants.FILENAME_SEQUENCE_SEPARATOR, this.f14725b.f14736d.f14743d));
                }
            }
            TreeMap<String, ArrayList<String>> treeMap2 = this.f14725b.f14737e;
            if (treeMap2 != null) {
                for (Map.Entry<String, ArrayList<String>> entry2 : treeMap2.entrySet()) {
                    stringBuffer5.append(Constants.FILENAME_SEQUENCE_SEPARATOR + entry2.getKey());
                    Iterator<String> it = entry2.getValue().iterator();
                    while (it.hasNext()) {
                        stringBuffer5.append(Constants.FILENAME_SEQUENCE_SEPARATOR + it.next());
                    }
                }
                if (stringBuffer5.length() > 0 && stringBuffer5.charAt(0) == '-') {
                    stringBuffer5.deleteCharAt(0);
                }
            }
            stringBuffer.append(stringBuffer5.toString());
        }
        n nVar2 = this.f14725b;
        if (nVar2.f14734b != null || nVar2.f14735c != null) {
            stringBuffer.append(Constants.FILENAME_SEQUENCE_SEPARATOR);
            stringBuffer.append('u');
            stringBuffer.append(Constants.FILENAME_SEQUENCE_SEPARATOR);
            StringBuffer stringBuffer6 = new StringBuffer();
            ArrayList<CharSequence> arrayList3 = this.f14725b.f14734b;
            if (arrayList3 != null) {
                stringBuffer6.append(TextUtils.join(Constants.FILENAME_SEQUENCE_SEPARATOR, arrayList3));
            }
            TreeMap<String, ArrayList<String>> treeMap3 = this.f14725b.f14735c;
            if (treeMap3 != null) {
                for (Map.Entry<String, ArrayList<String>> entry3 : treeMap3.entrySet()) {
                    stringBuffer6.append(Constants.FILENAME_SEQUENCE_SEPARATOR + entry3.getKey());
                    Iterator<String> it2 = entry3.getValue().iterator();
                    while (it2.hasNext()) {
                        stringBuffer6.append(Constants.FILENAME_SEQUENCE_SEPARATOR + it2.next());
                    }
                }
            }
            if (stringBuffer6.length() > 0 && stringBuffer6.charAt(0) == '-') {
                stringBuffer6.deleteCharAt(0);
            }
            stringBuffer.append(stringBuffer6.toString());
        }
        if (this.f14725b.f14739g != null) {
            stringBuffer.append(Constants.FILENAME_SEQUENCE_SEPARATOR);
            stringBuffer.append('x');
            stringBuffer.append(Constants.FILENAME_SEQUENCE_SEPARATOR);
            stringBuffer.append(TextUtils.join(Constants.FILENAME_SEQUENCE_SEPARATOR, this.f14725b.f14739g));
        }
        try {
            this.f14724a = Locale.forLanguageTag(stringBuffer.toString());
            this.f14726c = false;
        } catch (RuntimeException e10) {
            throw new i5.d(e10.getMessage());
        }
    }

    @Override // com.facebook.hermes.intl.a
    public HashMap<String, String> a() throws i5.d {
        HashMap<String, String> hashMap = new HashMap<>();
        TreeMap<String, ArrayList<String>> treeMap = this.f14725b.f14735c;
        if (treeMap != null) {
            for (String str : treeMap.keySet()) {
                hashMap.put(str, TextUtils.join(Constants.FILENAME_SEQUENCE_SEPARATOR, this.f14725b.f14735c.get(str)));
            }
        }
        return hashMap;
    }

    @Override // com.facebook.hermes.intl.a
    public ArrayList<String> b(String str) throws i5.d {
        ArrayList<String> arrayList;
        k();
        l();
        TreeMap<String, ArrayList<String>> treeMap = this.f14725b.f14735c;
        return (treeMap == null || (arrayList = treeMap.get(str)) == null) ? new ArrayList<>() : arrayList;
    }

    @Override // com.facebook.hermes.intl.a
    public a<Locale> d() throws i5.d {
        k();
        return new j(this.f14724a);
    }

    @Override // com.facebook.hermes.intl.a
    public String e() throws i5.d {
        return Build.VERSION.SDK_INT < 21 ? "en" : c().toLanguageTag();
    }

    @Override // com.facebook.hermes.intl.a
    public void f(String str, ArrayList<String> arrayList) throws i5.d {
        k();
        l();
        n nVar = this.f14725b;
        if (nVar.f14735c == null) {
            nVar.f14735c = new TreeMap<>();
        }
        if (!this.f14725b.f14735c.containsKey(str)) {
            this.f14725b.f14735c.put(str, new ArrayList<>());
        }
        this.f14725b.f14735c.get(str).clear();
        this.f14725b.f14735c.get(str).addAll(arrayList);
        this.f14726c = true;
    }

    @Override // com.facebook.hermes.intl.a
    public String g() throws i5.d {
        return Build.VERSION.SDK_INT < 21 ? "en" : h().toLanguageTag();
    }

    @Override // com.facebook.hermes.intl.a
    /* renamed from: m */
    public Locale h() throws i5.d {
        k();
        return this.f14724a;
    }

    @Override // com.facebook.hermes.intl.a
    /* renamed from: n */
    public Locale c() throws i5.d {
        k();
        l();
        n nVar = new n();
        nVar.f14733a = this.f14725b.f14733a;
        return new j(nVar).h();
    }

    private j(String str) throws i5.d {
        this.f14724a = null;
        this.f14725b = null;
        this.f14726c = false;
        this.f14725b = g.f(str);
        o();
    }

    private j(n nVar) throws i5.d {
        this.f14724a = null;
        this.f14725b = null;
        this.f14726c = false;
        this.f14725b = nVar;
        o();
    }
}
