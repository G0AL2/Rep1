package com.inmobi.media;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: NativeAsset.java */
/* loaded from: classes3.dex */
public class bt {

    /* renamed from: z  reason: collision with root package name */
    private static final String f24808z = "bt";

    /* renamed from: a  reason: collision with root package name */
    String f24809a;

    /* renamed from: b  reason: collision with root package name */
    public String f24810b;

    /* renamed from: c  reason: collision with root package name */
    public bu f24811c;

    /* renamed from: d  reason: collision with root package name */
    public String f24812d;

    /* renamed from: e  reason: collision with root package name */
    public Object f24813e;

    /* renamed from: f  reason: collision with root package name */
    JSONObject f24814f;

    /* renamed from: g  reason: collision with root package name */
    String f24815g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f24816h;

    /* renamed from: i  reason: collision with root package name */
    public byte f24817i;

    /* renamed from: j  reason: collision with root package name */
    public String f24818j;

    /* renamed from: k  reason: collision with root package name */
    public byte f24819k;

    /* renamed from: l  reason: collision with root package name */
    public byte f24820l;

    /* renamed from: m  reason: collision with root package name */
    public byte f24821m;

    /* renamed from: n  reason: collision with root package name */
    byte f24822n;

    /* renamed from: o  reason: collision with root package name */
    public int f24823o;

    /* renamed from: p  reason: collision with root package name */
    public int f24824p;

    /* renamed from: q  reason: collision with root package name */
    String f24825q;

    /* renamed from: r  reason: collision with root package name */
    public String f24826r;

    /* renamed from: s  reason: collision with root package name */
    public String f24827s;

    /* renamed from: t  reason: collision with root package name */
    public bt f24828t;

    /* renamed from: u  reason: collision with root package name */
    public List<cf> f24829u;

    /* renamed from: v  reason: collision with root package name */
    public Map<String, Object> f24830v;

    /* renamed from: w  reason: collision with root package name */
    public Object f24831w;

    /* renamed from: x  reason: collision with root package name */
    public int f24832x;

    /* renamed from: y  reason: collision with root package name */
    public bt f24833y;

    public bt() {
        this("", "root", "CONTAINER", new bu());
    }

    public final void a(String str, Map<String, String> map) {
        if (this.f24829u.size() == 0) {
            return;
        }
        for (cf cfVar : this.f24829u) {
            if (str.equals(cfVar.f24922d)) {
                a(cfVar, map);
            }
        }
    }

    public final void b(String str) {
        this.f24827s = str.trim();
    }

    public bt(String str, String str2, String str3, bu buVar) {
        this(str, str2, str3, buVar, new LinkedList());
    }

    public bt(String str, String str2, String str3, bu buVar, List<cf> list) {
        this.f24809a = str;
        this.f24812d = str2;
        this.f24810b = str3;
        this.f24811c = buVar;
        this.f24813e = null;
        this.f24815g = "";
        this.f24816h = false;
        this.f24817i = (byte) 0;
        this.f24818j = "";
        this.f24820l = (byte) 0;
        this.f24819k = (byte) 0;
        this.f24821m = (byte) 0;
        this.f24822n = (byte) 2;
        this.f24832x = 0;
        this.f24823o = -1;
        this.f24825q = "";
        this.f24826r = "";
        this.f24814f = new JSONObject();
        LinkedList linkedList = new LinkedList();
        this.f24829u = linkedList;
        linkedList.addAll(list);
        this.f24830v = new HashMap();
    }

    public final void a(List<cf> list) {
        this.f24829u.addAll(list);
    }

    public final void a(String str) {
        this.f24826r = str.trim();
    }

    public static void a(cf cfVar, Map<String, String> map) {
        bk.a().a(hv.a(cfVar.f24920b, map), cfVar.f24923e, true);
    }
}
