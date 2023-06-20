package com.applovin.impl.sdk.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class r {

    /* renamed from: a  reason: collision with root package name */
    public static final r f8943a = new r();

    /* renamed from: b  reason: collision with root package name */
    protected String f8944b;

    /* renamed from: c  reason: collision with root package name */
    protected final List<r> f8945c;

    /* renamed from: d  reason: collision with root package name */
    private final r f8946d;

    /* renamed from: e  reason: collision with root package name */
    private final String f8947e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, String> f8948f;

    private r() {
        this.f8946d = null;
        this.f8947e = "";
        this.f8948f = Collections.emptyMap();
        this.f8944b = "";
        this.f8945c = Collections.emptyList();
    }

    public r(String str, Map<String, String> map, r rVar) {
        this.f8946d = rVar;
        this.f8947e = str;
        this.f8948f = Collections.unmodifiableMap(map);
        this.f8945c = new ArrayList();
    }

    public String a() {
        return this.f8947e;
    }

    public List<r> a(String str) {
        if (str != null) {
            ArrayList arrayList = new ArrayList(this.f8945c.size());
            for (r rVar : this.f8945c) {
                if (str.equalsIgnoreCase(rVar.a())) {
                    arrayList.add(rVar);
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException("No name specified.");
    }

    public r b(String str) {
        if (str != null) {
            for (r rVar : this.f8945c) {
                if (str.equalsIgnoreCase(rVar.a())) {
                    return rVar;
                }
            }
            return null;
        }
        throw new IllegalArgumentException("No name specified.");
    }

    public Map<String, String> b() {
        return this.f8948f;
    }

    public r c(String str) {
        if (str != null) {
            if (this.f8945c.size() > 0) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this);
                while (!arrayList.isEmpty()) {
                    r rVar = (r) arrayList.get(0);
                    arrayList.remove(0);
                    if (str.equalsIgnoreCase(rVar.a())) {
                        return rVar;
                    }
                    arrayList.addAll(rVar.d());
                }
                return null;
            }
            return null;
        }
        throw new IllegalArgumentException("No name specified.");
    }

    public String c() {
        return this.f8944b;
    }

    public List<r> d() {
        return Collections.unmodifiableList(this.f8945c);
    }

    public String toString() {
        return "XmlNode{elementName='" + this.f8947e + "', text='" + this.f8944b + "', attributes=" + this.f8948f + '}';
    }
}
