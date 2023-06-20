package com.inmobi.media;

import android.graphics.Point;
import android.webkit.URLUtil;
import com.google.android.gms.common.internal.ImagesContract;
import com.inmobi.media.cc;
import com.inmobi.media.dm;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: NativeDataModel.java */
/* loaded from: classes3.dex */
public class bx {

    /* renamed from: m  reason: collision with root package name */
    private static final String f24848m = "bx";

    /* renamed from: a  reason: collision with root package name */
    public byte f24849a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f24850b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f24851c;

    /* renamed from: d  reason: collision with root package name */
    public bv f24852d;

    /* renamed from: e  reason: collision with root package name */
    public JSONArray f24853e;

    /* renamed from: f  reason: collision with root package name */
    public bx f24854f;

    /* renamed from: g  reason: collision with root package name */
    public Map<String, String> f24855g;

    /* renamed from: h  reason: collision with root package name */
    public ds f24856h;

    /* renamed from: i  reason: collision with root package name */
    public a f24857i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f24858j;

    /* renamed from: k  reason: collision with root package name */
    public ch f24859k;

    /* renamed from: l  reason: collision with root package name */
    HashMap<String, String> f24860l;

    /* renamed from: n  reason: collision with root package name */
    private JSONObject f24861n;

    /* renamed from: o  reason: collision with root package name */
    private JSONObject f24862o;

    /* renamed from: p  reason: collision with root package name */
    private Map<String, List<bt>> f24863p;

    /* renamed from: q  reason: collision with root package name */
    private Map<String, bt> f24864q;

    /* renamed from: r  reason: collision with root package name */
    private Map<String, String> f24865r;

    /* renamed from: s  reason: collision with root package name */
    private fq f24866s;

    /* renamed from: t  reason: collision with root package name */
    private int f24867t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f24868u;

    /* compiled from: NativeDataModel.java */
    /* loaded from: classes3.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public JSONObject f24869a;

        /* renamed from: b  reason: collision with root package name */
        public C0332a f24870b = new C0332a();

        /* renamed from: c  reason: collision with root package name */
        public bt f24871c;

        /* compiled from: NativeDataModel.java */
        /* renamed from: com.inmobi.media.bx$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0332a {

            /* renamed from: a  reason: collision with root package name */
            public String f24873a;

            /* renamed from: b  reason: collision with root package name */
            public String f24874b;

            /* renamed from: c  reason: collision with root package name */
            public String f24875c;

            /* renamed from: d  reason: collision with root package name */
            public String f24876d;

            /* renamed from: e  reason: collision with root package name */
            public float f24877e;

            /* renamed from: f  reason: collision with root package name */
            public String f24878f;

            /* renamed from: g  reason: collision with root package name */
            public boolean f24879g;

            public C0332a() {
            }
        }

        public a() {
        }
    }

    public bx() {
        this.f24854f = null;
    }

    private bv f() {
        Iterator<bt> it = this.f24852d.iterator();
        while (it.hasNext()) {
            bt next = it.next();
            if (next.f24812d.equalsIgnoreCase("card_scrollable")) {
                return (bv) next;
            }
        }
        return null;
    }

    private void g() {
        bt a10;
        byte b10;
        for (bt btVar : c("IMAGE")) {
            if (!URLUtil.isValidUrl((String) btVar.f24813e) && (a10 = a(this, btVar)) != null) {
                if (a10.f24810b.equals(btVar.f24810b)) {
                    btVar.f24813e = a10.f24813e;
                } else if ("VIDEO".equals(a10.f24810b) && 1 != (b10 = a10.f24821m) && 2 == b10) {
                    cg cgVar = (cg) a10;
                    dt b11 = cgVar.b();
                    dm a11 = dl.a(cgVar, btVar);
                    dm.a aVar = null;
                    List<dm.a> a12 = a11 == null ? null : a11.a(1);
                    if (a12 != null) {
                        Iterator<dm.a> it = a12.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            dm.a next = it.next();
                            if (URLUtil.isValidUrl(next.f25130b)) {
                                aVar = next;
                                break;
                            }
                        }
                    }
                    if (a11 != null && aVar != null) {
                        b11.a(a11);
                        btVar.f24813e = aVar.f25130b;
                        btVar.a(a11.a("creativeView"));
                        for (cf cfVar : cgVar.f24829u) {
                            if ("error".equals(cfVar.f24922d)) {
                                btVar.f24829u.add(cfVar);
                            }
                        }
                    } else if (b11.e().size() > 0) {
                        a(cgVar);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fd A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void h() {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.bx.h():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(25:1|(2:2|3)|(5:117|(2:119|(24:121|(22:132|(1:(1:127)(1:128))(1:129)|6|7|8|(1:10)|11|(1:15)|16|(10:18|19|20|21|(1:23)(1:32)|24|(1:26)|27|28|(1:30))|34|(1:36)|37|38|(1:40)|41|(1:43)|44|(4:47|(2:56|57)(12:64|65|66|67|68|69|70|71|72|(1:74)(4:77|(1:(1:(1:(1:83)(1:84))(1:85))(1:86))|87|(1:(1:(1:(1:93)(1:94))(1:95))(1:96)))|75|76)|58|45)|106|107|(2:109|110)(2:112|113))|124|(0)(0)|6|7|8|(0)|11|(2:13|15)|16|(0)|34|(0)|37|38|(0)|41|(0)|44|(1:45)|106|107|(0)(0))(24:133|(22:135|(0)(0)|6|7|8|(0)|11|(0)|16|(0)|34|(0)|37|38|(0)|41|(0)|44|(1:45)|106|107|(0)(0))|124|(0)(0)|6|7|8|(0)|11|(0)|16|(0)|34|(0)|37|38|(0)|41|(0)|44|(1:45)|106|107|(0)(0)))(24:136|(22:138|(0)(0)|6|7|8|(0)|11|(0)|16|(0)|34|(0)|37|38|(0)|41|(0)|44|(1:45)|106|107|(0)(0))|124|(0)(0)|6|7|8|(0)|11|(0)|16|(0)|34|(0)|37|38|(0)|41|(0)|44|(1:45)|106|107|(0)(0))|139|140|141)|5|6|7|8|(0)|11|(0)|16|(0)|34|(0)|37|38|(0)|41|(0)|44|(1:45)|106|107|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0180, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0181, code lost:
        com.inmobi.media.gg.a().a(new com.inmobi.media.hg(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0295 A[Catch: JSONException -> 0x02a6, TryCatch #2 {JSONException -> 0x02a6, blocks: (B:3:0x0014, B:28:0x0077, B:59:0x018d, B:61:0x0199, B:62:0x01a0, B:64:0x01a8, B:65:0x01ad, B:66:0x01bd, B:68:0x01c3, B:70:0x01de, B:72:0x01e3, B:74:0x01e8, B:76:0x01ec, B:78:0x01f7, B:80:0x0201, B:82:0x0213, B:84:0x021c, B:92:0x0237, B:113:0x027f, B:93:0x023b, B:99:0x024e, B:100:0x0253, B:101:0x0256, B:102:0x025c, B:103:0x0260, B:109:0x026d, B:110:0x0272, B:111:0x0275, B:112:0x027b, B:90:0x0228, B:115:0x028d, B:117:0x0295, B:119:0x029d, B:58:0x0181, B:6:0x002b, B:13:0x0050, B:16:0x005a, B:19:0x0064, B:29:0x00a1, B:31:0x00a9, B:32:0x00b3, B:34:0x00bb, B:36:0x00c3, B:37:0x010d, B:39:0x011a, B:49:0x0151, B:51:0x0157, B:52:0x0168, B:54:0x0172, B:55:0x017b), top: B:129:0x0014, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x029d A[Catch: JSONException -> 0x02a6, TRY_LEAVE, TryCatch #2 {JSONException -> 0x02a6, blocks: (B:3:0x0014, B:28:0x0077, B:59:0x018d, B:61:0x0199, B:62:0x01a0, B:64:0x01a8, B:65:0x01ad, B:66:0x01bd, B:68:0x01c3, B:70:0x01de, B:72:0x01e3, B:74:0x01e8, B:76:0x01ec, B:78:0x01f7, B:80:0x0201, B:82:0x0213, B:84:0x021c, B:92:0x0237, B:113:0x027f, B:93:0x023b, B:99:0x024e, B:100:0x0253, B:101:0x0256, B:102:0x025c, B:103:0x0260, B:109:0x026d, B:110:0x0272, B:111:0x0275, B:112:0x027b, B:90:0x0228, B:115:0x028d, B:117:0x0295, B:119:0x029d, B:58:0x0181, B:6:0x002b, B:13:0x0050, B:16:0x005a, B:19:0x0064, B:29:0x00a1, B:31:0x00a9, B:32:0x00b3, B:34:0x00bb, B:36:0x00c3, B:37:0x010d, B:39:0x011a, B:49:0x0151, B:51:0x0157, B:52:0x0168, B:54:0x0172, B:55:0x017b), top: B:129:0x0014, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a9 A[Catch: JSONException -> 0x0180, TryCatch #4 {JSONException -> 0x0180, blocks: (B:29:0x00a1, B:31:0x00a9, B:32:0x00b3, B:34:0x00bb, B:36:0x00c3, B:37:0x010d, B:39:0x011a, B:49:0x0151, B:51:0x0157, B:52:0x0168, B:54:0x0172, B:55:0x017b), top: B:132:0x00a1, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bb A[Catch: JSONException -> 0x0180, TryCatch #4 {JSONException -> 0x0180, blocks: (B:29:0x00a1, B:31:0x00a9, B:32:0x00b3, B:34:0x00bb, B:36:0x00c3, B:37:0x010d, B:39:0x011a, B:49:0x0151, B:51:0x0157, B:52:0x0168, B:54:0x0172, B:55:0x017b), top: B:132:0x00a1, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011a A[Catch: JSONException -> 0x0180, TRY_LEAVE, TryCatch #4 {JSONException -> 0x0180, blocks: (B:29:0x00a1, B:31:0x00a9, B:32:0x00b3, B:34:0x00bb, B:36:0x00c3, B:37:0x010d, B:39:0x011a, B:49:0x0151, B:51:0x0157, B:52:0x0168, B:54:0x0172, B:55:0x017b), top: B:132:0x00a1, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0172 A[Catch: JSONException -> 0x0180, TryCatch #4 {JSONException -> 0x0180, blocks: (B:29:0x00a1, B:31:0x00a9, B:32:0x00b3, B:34:0x00bb, B:36:0x00c3, B:37:0x010d, B:39:0x011a, B:49:0x0151, B:51:0x0157, B:52:0x0168, B:54:0x0172, B:55:0x017b), top: B:132:0x00a1, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0199 A[Catch: JSONException -> 0x02a6, TryCatch #2 {JSONException -> 0x02a6, blocks: (B:3:0x0014, B:28:0x0077, B:59:0x018d, B:61:0x0199, B:62:0x01a0, B:64:0x01a8, B:65:0x01ad, B:66:0x01bd, B:68:0x01c3, B:70:0x01de, B:72:0x01e3, B:74:0x01e8, B:76:0x01ec, B:78:0x01f7, B:80:0x0201, B:82:0x0213, B:84:0x021c, B:92:0x0237, B:113:0x027f, B:93:0x023b, B:99:0x024e, B:100:0x0253, B:101:0x0256, B:102:0x025c, B:103:0x0260, B:109:0x026d, B:110:0x0272, B:111:0x0275, B:112:0x027b, B:90:0x0228, B:115:0x028d, B:117:0x0295, B:119:0x029d, B:58:0x0181, B:6:0x002b, B:13:0x0050, B:16:0x005a, B:19:0x0064, B:29:0x00a1, B:31:0x00a9, B:32:0x00b3, B:34:0x00bb, B:36:0x00c3, B:37:0x010d, B:39:0x011a, B:49:0x0151, B:51:0x0157, B:52:0x0168, B:54:0x0172, B:55:0x017b), top: B:129:0x0014, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a8 A[Catch: JSONException -> 0x02a6, TryCatch #2 {JSONException -> 0x02a6, blocks: (B:3:0x0014, B:28:0x0077, B:59:0x018d, B:61:0x0199, B:62:0x01a0, B:64:0x01a8, B:65:0x01ad, B:66:0x01bd, B:68:0x01c3, B:70:0x01de, B:72:0x01e3, B:74:0x01e8, B:76:0x01ec, B:78:0x01f7, B:80:0x0201, B:82:0x0213, B:84:0x021c, B:92:0x0237, B:113:0x027f, B:93:0x023b, B:99:0x024e, B:100:0x0253, B:101:0x0256, B:102:0x025c, B:103:0x0260, B:109:0x026d, B:110:0x0272, B:111:0x0275, B:112:0x027b, B:90:0x0228, B:115:0x028d, B:117:0x0295, B:119:0x029d, B:58:0x0181, B:6:0x002b, B:13:0x0050, B:16:0x005a, B:19:0x0064, B:29:0x00a1, B:31:0x00a9, B:32:0x00b3, B:34:0x00bb, B:36:0x00c3, B:37:0x010d, B:39:0x011a, B:49:0x0151, B:51:0x0157, B:52:0x0168, B:54:0x0172, B:55:0x017b), top: B:129:0x0014, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c3 A[Catch: JSONException -> 0x02a6, TryCatch #2 {JSONException -> 0x02a6, blocks: (B:3:0x0014, B:28:0x0077, B:59:0x018d, B:61:0x0199, B:62:0x01a0, B:64:0x01a8, B:65:0x01ad, B:66:0x01bd, B:68:0x01c3, B:70:0x01de, B:72:0x01e3, B:74:0x01e8, B:76:0x01ec, B:78:0x01f7, B:80:0x0201, B:82:0x0213, B:84:0x021c, B:92:0x0237, B:113:0x027f, B:93:0x023b, B:99:0x024e, B:100:0x0253, B:101:0x0256, B:102:0x025c, B:103:0x0260, B:109:0x026d, B:110:0x0272, B:111:0x0275, B:112:0x027b, B:90:0x0228, B:115:0x028d, B:117:0x0295, B:119:0x029d, B:58:0x0181, B:6:0x002b, B:13:0x0050, B:16:0x005a, B:19:0x0064, B:29:0x00a1, B:31:0x00a9, B:32:0x00b3, B:34:0x00bb, B:36:0x00c3, B:37:0x010d, B:39:0x011a, B:49:0x0151, B:51:0x0157, B:52:0x0168, B:54:0x0172, B:55:0x017b), top: B:129:0x0014, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0237 A[Catch: JSONException -> 0x02a6, TryCatch #2 {JSONException -> 0x02a6, blocks: (B:3:0x0014, B:28:0x0077, B:59:0x018d, B:61:0x0199, B:62:0x01a0, B:64:0x01a8, B:65:0x01ad, B:66:0x01bd, B:68:0x01c3, B:70:0x01de, B:72:0x01e3, B:74:0x01e8, B:76:0x01ec, B:78:0x01f7, B:80:0x0201, B:82:0x0213, B:84:0x021c, B:92:0x0237, B:113:0x027f, B:93:0x023b, B:99:0x024e, B:100:0x0253, B:101:0x0256, B:102:0x025c, B:103:0x0260, B:109:0x026d, B:110:0x0272, B:111:0x0275, B:112:0x027b, B:90:0x0228, B:115:0x028d, B:117:0x0295, B:119:0x029d, B:58:0x0181, B:6:0x002b, B:13:0x0050, B:16:0x005a, B:19:0x0064, B:29:0x00a1, B:31:0x00a9, B:32:0x00b3, B:34:0x00bb, B:36:0x00c3, B:37:0x010d, B:39:0x011a, B:49:0x0151, B:51:0x0157, B:52:0x0168, B:54:0x0172, B:55:0x017b), top: B:129:0x0014, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x023b A[Catch: JSONException -> 0x02a6, TryCatch #2 {JSONException -> 0x02a6, blocks: (B:3:0x0014, B:28:0x0077, B:59:0x018d, B:61:0x0199, B:62:0x01a0, B:64:0x01a8, B:65:0x01ad, B:66:0x01bd, B:68:0x01c3, B:70:0x01de, B:72:0x01e3, B:74:0x01e8, B:76:0x01ec, B:78:0x01f7, B:80:0x0201, B:82:0x0213, B:84:0x021c, B:92:0x0237, B:113:0x027f, B:93:0x023b, B:99:0x024e, B:100:0x0253, B:101:0x0256, B:102:0x025c, B:103:0x0260, B:109:0x026d, B:110:0x0272, B:111:0x0275, B:112:0x027b, B:90:0x0228, B:115:0x028d, B:117:0x0295, B:119:0x029d, B:58:0x0181, B:6:0x002b, B:13:0x0050, B:16:0x005a, B:19:0x0064, B:29:0x00a1, B:31:0x00a9, B:32:0x00b3, B:34:0x00bb, B:36:0x00c3, B:37:0x010d, B:39:0x011a, B:49:0x0151, B:51:0x0157, B:52:0x0168, B:54:0x0172, B:55:0x017b), top: B:129:0x0014, inners: #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void i() {
        /*
            Method dump skipped, instructions count: 692
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.bx.i():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean j() {
        /*
            r5 = this;
            java.lang.String r0 = "VIDEO"
            java.util.List r0 = r5.c(r0)
            r1 = 1
            if (r0 == 0) goto L62
            int r2 = r0.size()
            if (r2 > 0) goto L10
            goto L62
        L10:
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L62
            java.lang.Object r2 = r0.next()
            com.inmobi.media.bt r2 = (com.inmobi.media.bt) r2
            java.lang.String r3 = r2.f24809a
            r3.length()
            com.inmobi.media.cg r2 = (com.inmobi.media.cg) r2
            com.inmobi.media.dt r3 = r2.b()
            r4 = 0
            if (r3 != 0) goto L2f
            return r4
        L2f:
            com.inmobi.media.dt r3 = r2.b()
            java.util.List r3 = r3.c()
            if (r3 == 0) goto L61
            int r3 = r3.size()
            if (r3 != 0) goto L40
            goto L61
        L40:
            com.inmobi.media.dt r3 = r2.b()
            java.lang.String r3 = r3.b()
            if (r3 == 0) goto L50
            int r3 = r3.length()
            if (r3 != 0) goto L14
        L50:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "[ERRORCODE]"
            java.lang.String r3 = "403"
            r0.put(r1, r3)
            java.lang.String r1 = "error"
            r2.a(r1, r0)
        L61:
            return r4
        L62:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.bx.j():boolean");
    }

    private Point k(JSONObject jSONObject) {
        JSONObject i10;
        Point point = new Point();
        try {
            i10 = i(jSONObject);
        } catch (JSONException e10) {
            gg.a().a(new hg(e10));
        }
        if (i10.isNull("geometry")) {
            return point;
        }
        JSONArray jSONArray = i10.getJSONArray("geometry");
        point.x = ic.a(jSONArray.getInt(2));
        point.y = ic.a(jSONArray.getInt(3));
        return point;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
        if (r0 == 3) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
        return 4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static byte l(org.json.JSONObject r6) {
        /*
            java.lang.String r0 = "type"
            r1 = 2
            org.json.JSONObject r6 = n(r6)     // Catch: org.json.JSONException -> L58
            boolean r2 = r6.isNull(r0)     // Catch: org.json.JSONException -> L58
            if (r2 == 0) goto Le
            return r1
        Le:
            java.lang.String r6 = r6.getString(r0)     // Catch: org.json.JSONException -> L58
            java.lang.String r6 = r6.trim()     // Catch: org.json.JSONException -> L58
            java.util.Locale r0 = java.util.Locale.US     // Catch: org.json.JSONException -> L58
            java.lang.String r6 = r6.toLowerCase(r0)     // Catch: org.json.JSONException -> L58
            r0 = -1
            int r2 = r6.hashCode()     // Catch: org.json.JSONException -> L58
            r3 = -921832806(0xffffffffc90df29a, float:-581417.6)
            r4 = 1
            r5 = 3
            if (r2 == r3) goto L47
            r3 = -284840886(0xffffffffef05ac4a, float:-4.136979E28)
            if (r2 == r3) goto L3d
            r3 = 1728122231(0x67010d77, float:6.0943366E23)
            if (r2 == r3) goto L33
            goto L50
        L33:
            java.lang.String r2 = "absolute"
            boolean r6 = r6.equals(r2)     // Catch: org.json.JSONException -> L58
            if (r6 == 0) goto L50
            r0 = 2
            goto L50
        L3d:
            java.lang.String r2 = "unknown"
            boolean r6 = r6.equals(r2)     // Catch: org.json.JSONException -> L58
            if (r6 == 0) goto L50
            r0 = 1
            goto L50
        L47:
            java.lang.String r2 = "percentage"
            boolean r6 = r6.equals(r2)     // Catch: org.json.JSONException -> L58
            if (r6 == 0) goto L50
            r0 = 3
        L50:
            if (r0 == r1) goto L57
            if (r0 == r5) goto L55
            return r4
        L55:
            r6 = 4
            return r6
        L57:
            return r5
        L58:
            r6 = move-exception
            com.inmobi.media.gg r0 = com.inmobi.media.gg.a()
            com.inmobi.media.hg r2 = new com.inmobi.media.hg
            r2.<init>(r6)
            r0.a(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.bx.l(org.json.JSONObject):byte");
    }

    private static String m(JSONObject jSONObject) {
        try {
            JSONObject n10 = n(jSONObject);
            return n10.isNull("reference") ? "" : n10.getString("reference");
        } catch (JSONException e10) {
            gg.a().a(new hg(e10));
            return "";
        }
    }

    private static JSONObject n(JSONObject jSONObject) {
        if (jSONObject.isNull("display")) {
            return new JSONObject();
        }
        try {
            return jSONObject.getJSONObject("display");
        } catch (JSONException e10) {
            gg.a().a(new hg(e10));
            return new JSONObject();
        }
    }

    private static JSONArray o(JSONObject jSONObject) {
        try {
            return jSONObject.getJSONArray("assetValue");
        } catch (JSONException e10) {
            gg.a().a(new hg(e10));
            return new JSONArray();
        }
    }

    private static boolean p(JSONObject jSONObject) {
        return !jSONObject.isNull("assetOnclick");
    }

    private cc.a q(JSONObject jSONObject) {
        return new cc.a(jSONObject.optLong("absolute"), jSONObject.optLong("percentage"), jSONObject.optString("reference"), this);
    }

    private cc.a r(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new cc.a(jSONObject.optLong("absolute"), jSONObject.optLong("percentage"), jSONObject.optString("reference"), this);
    }

    private cc s(JSONObject jSONObject) throws JSONException {
        return new cc(!jSONObject.isNull("startOffset") ? r(jSONObject.optJSONObject("startOffset")) : null, jSONObject.isNull("timerDuration") ? null : r(jSONObject.optJSONObject("timerDuration")));
    }

    public final HashMap<String, String> a() {
        HashMap<String, String> hashMap = this.f24860l;
        return hashMap == null ? new HashMap<>() : hashMap;
    }

    public final JSONObject b() {
        try {
            return this.f24853e.getJSONObject(0);
        } catch (JSONException e10) {
            gg.a().a(new hg(e10));
            return null;
        }
    }

    public final int c() {
        bv bvVar = this.f24852d;
        if (bvVar == null) {
            return 0;
        }
        Iterator<bt> it = bvVar.iterator();
        while (it.hasNext()) {
            bt next = it.next();
            if (next.f24812d.equalsIgnoreCase("card_scrollable")) {
                return ((bv) next).C;
            }
        }
        return 0;
    }

    public final boolean d() {
        if (this.f24852d == null) {
            return false;
        }
        if (f() == null) {
            return j();
        }
        if (c() <= 0) {
            return false;
        }
        return j();
    }

    public final List<String> e() {
        return new ArrayList(this.f24863p.keySet());
    }

    private static String e(JSONObject jSONObject) {
        try {
            return jSONObject.getString("assetName");
        } catch (JSONException e10) {
            gg.a().a(new hg(e10));
            return "";
        }
    }

    public final bv a(int i10) {
        Iterator<bt> it = this.f24852d.iterator();
        while (it.hasNext()) {
            bt next = it.next();
            if (next.f24812d.equalsIgnoreCase("card_scrollable")) {
                bv bvVar = (bv) next;
                if (i10 >= bvVar.C) {
                    return null;
                }
                return (bv) bvVar.a(i10);
            }
        }
        return null;
    }

    public bx(int i10, JSONObject jSONObject, fq fqVar, HashMap<String, String> hashMap, ds dsVar) {
        this(i10, jSONObject, null, false, fqVar, hashMap, dsVar);
    }

    public final bt b(String str) {
        if (str != null && str.length() != 0) {
            if (this.f24864q.get(str) != null) {
                return this.f24864q.get(str);
            }
            bx bxVar = this.f24854f;
            if (bxVar != null) {
                return bxVar.f24864q.get(str);
            }
        }
        return null;
    }

    public bx(int i10, JSONObject jSONObject, bx bxVar, boolean z10, fq fqVar) {
        this(i10, jSONObject, bxVar, z10, fqVar, bxVar == null ? null : bxVar.f24860l, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static String e(String str) {
        char c10;
        String trim = str.toLowerCase(Locale.US).trim();
        switch (trim.hashCode()) {
            case -1178781136:
                if (trim.equals("italic")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case -1026963764:
                if (trim.equals("underline")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case -891985998:
                if (trim.equals("strike")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 3029637:
                if (trim.equals("bold")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 3387192:
                if (trim.equals("none")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        return c10 != 2 ? c10 != 3 ? c10 != 4 ? c10 != 5 ? "none" : "underline" : "strike" : "italic" : "bold";
    }

    private static String f(JSONObject jSONObject) {
        try {
            return jSONObject.getString("assetType");
        } catch (JSONException e10) {
            gg.a().a(new hg(e10));
            return "";
        }
    }

    private bx(int i10, JSONObject jSONObject, bx bxVar, boolean z10, fq fqVar, HashMap<String, String> hashMap, ds dsVar) {
        this.f24867t = i10;
        this.f24854f = bxVar;
        this.f24866s = fqVar;
        this.f24861n = jSONObject;
        this.f24849a = (byte) 0;
        this.f24850b = false;
        this.f24856h = dsVar;
        this.f24864q = new HashMap();
        this.f24865r = new HashMap();
        this.f24863p = new HashMap();
        this.f24857i = new a();
        this.f24868u = z10;
        this.f24860l = hashMap;
        i();
    }

    private static String d(JSONObject jSONObject) {
        try {
            return jSONObject.getString("assetId");
        } catch (JSONException e10) {
            gg.a().a(new hg(e10));
            return Integer.toString(jSONObject.hashCode());
        }
    }

    private static String f(String str) {
        char c10;
        String trim = str.toLowerCase(Locale.US).trim();
        int hashCode = trim.hashCode();
        if (hashCode != 3321844) {
            if (hashCode == 3387192 && trim.equals("none")) {
                c10 = 1;
            }
            c10 = 65535;
        } else {
            if (trim.equals("line")) {
                c10 = 2;
            }
            c10 = 65535;
        }
        return c10 != 2 ? "none" : "line";
    }

    public final List<bt> c(String str) {
        if (this.f24863p.containsKey(str)) {
            return this.f24863p.get(str);
        }
        return Collections.emptyList();
    }

    public static bv a(bt btVar) {
        if (btVar instanceof bv) {
            bv bvVar = (bv) btVar;
            if (a(bvVar)) {
                return bvVar;
            }
        }
        for (bv bvVar2 = (bv) btVar.f24828t; bvVar2 != null; bvVar2 = (bv) bvVar2.f24828t) {
            if (a(bvVar2)) {
                return bvVar2;
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0183 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008b A[Catch: JSONException -> 0x0189, TryCatch #0 {JSONException -> 0x0189, blocks: (B:7:0x0015, B:12:0x0024, B:14:0x002e, B:39:0x0085, B:41:0x008b, B:43:0x0097, B:47:0x00ad, B:108:0x0166, B:110:0x016c, B:112:0x0172, B:114:0x0178, B:115:0x017c, B:82:0x0119, B:83:0x0125, B:85:0x0129, B:88:0x0133, B:91:0x013d, B:94:0x0147, B:50:0x00b7, B:53:0x00c1, B:56:0x00c9, B:59:0x00d3, B:62:0x00dd, B:65:0x00e7, B:68:0x00f2, B:21:0x0053, B:24:0x005d, B:27:0x0067), top: B:121:0x0015 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.List<com.inmobi.media.cf> b(org.json.JSONObject r17) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.bx.b(org.json.JSONObject):java.util.List");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static byte d(String str) {
        char c10;
        String trim = str.toUpperCase(Locale.US).trim();
        switch (trim.hashCode()) {
            case -2084521848:
                if (trim.equals("DOWNLOAD")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case -1038134325:
                if (trim.equals("EXTERNAL")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 69805756:
                if (trim.equals("INAPP")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 1411860198:
                if (trim.equals("DEEPLINK")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        if (c10 != 2) {
            if (c10 != 3) {
                return c10 != 4 ? (byte) 2 : (byte) 4;
            }
            return (byte) 3;
        }
        return (byte) 1;
    }

    private static String c(JSONObject jSONObject) {
        try {
            return ((f(jSONObject).equalsIgnoreCase("ICON") || f(jSONObject).equalsIgnoreCase("IMAGE") || f(jSONObject).equalsIgnoreCase("GIF")) && jSONObject.getJSONArray("assetValue").getString(0).length() != 0) ? jSONObject.getJSONArray("assetValue").getString(0) : "";
        } catch (JSONException e10) {
            gg.a().a(new hg(e10));
            return "";
        }
    }

    public static byte a(String str) {
        String trim = str.toLowerCase(Locale.US).trim();
        trim.hashCode();
        char c10 = 65535;
        switch (trim.hashCode()) {
            case -1412832500:
                if (trim.equals("companion")) {
                    c10 = 0;
                    break;
                }
                break;
            case 0:
                if (trim.equals("")) {
                    c10 = 1;
                    break;
                }
                break;
            case 112202875:
                if (trim.equals(DownloadResource.TYPE_VIDEO)) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return (byte) 2;
            case 1:
            case 2:
                return (byte) 1;
            default:
                return (byte) 0;
        }
    }

    private Point j(JSONObject jSONObject) {
        JSONObject i10;
        Point point = new Point();
        try {
            i10 = i(jSONObject);
        } catch (JSONException e10) {
            gg.a().a(new hg(e10));
        }
        if (i10.isNull("geometry")) {
            return point;
        }
        JSONArray jSONArray = i10.getJSONArray("geometry");
        point.x = ic.a(jSONArray.getInt(0));
        point.y = ic.a(jSONArray.getInt(1));
        return point;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:409|(6:411|39|40|41|(6:46|(1:60)(1:50)|51|(1:55)|56|(1:58)(1:59))|61)|383|412|39|40|41|(0)|61) */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x044e, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x044f, code lost:
        r6 = r46;
        r26 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x063a, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x063b, code lost:
        r44 = r12;
        r26 = "GIF";
        r15 = r15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01ee A[Catch: JSONException -> 0x01fd, TRY_LEAVE, TryCatch #11 {JSONException -> 0x01fd, blocks: (B:109:0x01cc, B:111:0x01e7, B:113:0x01ee, B:110:0x01d1), top: B:420:0x01ad }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0517 A[Catch: JSONException -> 0x0527, TRY_LEAVE, TryCatch #3 {JSONException -> 0x0527, blocks: (B:215:0x04c3, B:221:0x0510, B:223:0x0517, B:216:0x04c7, B:217:0x04df, B:219:0x04eb, B:220:0x04fe), top: B:405:0x049d }] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x05ee A[Catch: JSONException -> 0x063a, TryCatch #7 {JSONException -> 0x063a, blocks: (B:243:0x058d, B:245:0x059a, B:247:0x05aa, B:263:0x05e4, B:252:0x05c9, B:255:0x05d3, B:264:0x05e6, B:267:0x05ee, B:268:0x0613), top: B:413:0x0162 }] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0613 A[Catch: JSONException -> 0x063a, TRY_LEAVE, TryCatch #7 {JSONException -> 0x063a, blocks: (B:243:0x058d, B:245:0x059a, B:247:0x05aa, B:263:0x05e4, B:252:0x05c9, B:255:0x05d3, B:264:0x05e6, B:267:0x05ee, B:268:0x0613), top: B:413:0x0162 }] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0722 A[Catch: JSONException -> 0x081d, TryCatch #10 {JSONException -> 0x081d, blocks: (B:313:0x071e, B:315:0x0722, B:316:0x0725, B:317:0x072f, B:319:0x0735, B:320:0x0764, B:353:0x07d1, B:365:0x07f0, B:367:0x07f6, B:369:0x0800, B:371:0x0805, B:372:0x080f, B:322:0x0769, B:325:0x0774, B:328:0x077e, B:331:0x0789, B:334:0x0793, B:337:0x079d, B:340:0x07a7, B:343:0x07b2, B:346:0x07bc, B:349:0x07c6, B:312:0x070a), top: B:418:0x070a }] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0735 A[Catch: JSONException -> 0x081d, TryCatch #10 {JSONException -> 0x081d, blocks: (B:313:0x071e, B:315:0x0722, B:316:0x0725, B:317:0x072f, B:319:0x0735, B:320:0x0764, B:353:0x07d1, B:365:0x07f0, B:367:0x07f6, B:369:0x0800, B:371:0x0805, B:372:0x080f, B:322:0x0769, B:325:0x0774, B:328:0x077e, B:331:0x0789, B:334:0x0793, B:337:0x079d, B:340:0x07a7, B:343:0x07b2, B:346:0x07bc, B:349:0x07c6, B:312:0x070a), top: B:418:0x070a }] */
    /* JADX WARN: Removed duplicated region for block: B:383:0x083f  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0173 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e4 A[Catch: JSONException -> 0x0120, TRY_ENTER, TryCatch #13 {JSONException -> 0x0120, blocks: (B:51:0x00e4, B:54:0x00ee, B:57:0x00f6, B:60:0x0100, B:63:0x0108, B:66:0x0114, B:73:0x012f, B:76:0x0137, B:79:0x0140, B:83:0x014b), top: B:425:0x00df }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ee A[Catch: JSONException -> 0x0120, TryCatch #13 {JSONException -> 0x0120, blocks: (B:51:0x00e4, B:54:0x00ee, B:57:0x00f6, B:60:0x0100, B:63:0x0108, B:66:0x0114, B:73:0x012f, B:76:0x0137, B:79:0x0140, B:83:0x014b), top: B:425:0x00df }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f6 A[Catch: JSONException -> 0x0120, TryCatch #13 {JSONException -> 0x0120, blocks: (B:51:0x00e4, B:54:0x00ee, B:57:0x00f6, B:60:0x0100, B:63:0x0108, B:66:0x0114, B:73:0x012f, B:76:0x0137, B:79:0x0140, B:83:0x014b), top: B:425:0x00df }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0100 A[Catch: JSONException -> 0x0120, TryCatch #13 {JSONException -> 0x0120, blocks: (B:51:0x00e4, B:54:0x00ee, B:57:0x00f6, B:60:0x0100, B:63:0x0108, B:66:0x0114, B:73:0x012f, B:76:0x0137, B:79:0x0140, B:83:0x014b), top: B:425:0x00df }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0108 A[Catch: JSONException -> 0x0120, TryCatch #13 {JSONException -> 0x0120, blocks: (B:51:0x00e4, B:54:0x00ee, B:57:0x00f6, B:60:0x0100, B:63:0x0108, B:66:0x0114, B:73:0x012f, B:76:0x0137, B:79:0x0140, B:83:0x014b), top: B:425:0x00df }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0114 A[Catch: JSONException -> 0x0120, TryCatch #13 {JSONException -> 0x0120, blocks: (B:51:0x00e4, B:54:0x00ee, B:57:0x00f6, B:60:0x0100, B:63:0x0108, B:66:0x0114, B:73:0x012f, B:76:0x0137, B:79:0x0140, B:83:0x014b), top: B:425:0x00df }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012f A[Catch: JSONException -> 0x0120, TryCatch #13 {JSONException -> 0x0120, blocks: (B:51:0x00e4, B:54:0x00ee, B:57:0x00f6, B:60:0x0100, B:63:0x0108, B:66:0x0114, B:73:0x012f, B:76:0x0137, B:79:0x0140, B:83:0x014b), top: B:425:0x00df }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0137 A[Catch: JSONException -> 0x0120, TryCatch #13 {JSONException -> 0x0120, blocks: (B:51:0x00e4, B:54:0x00ee, B:57:0x00f6, B:60:0x0100, B:63:0x0108, B:66:0x0114, B:73:0x012f, B:76:0x0137, B:79:0x0140, B:83:0x014b), top: B:425:0x00df }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0140 A[Catch: JSONException -> 0x0120, TryCatch #13 {JSONException -> 0x0120, blocks: (B:51:0x00e4, B:54:0x00ee, B:57:0x00f6, B:60:0x0100, B:63:0x0108, B:66:0x0114, B:73:0x012f, B:76:0x0137, B:79:0x0140, B:83:0x014b), top: B:425:0x00df }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014b A[Catch: JSONException -> 0x0120, TRY_LEAVE, TryCatch #13 {JSONException -> 0x0120, blocks: (B:51:0x00e4, B:54:0x00ee, B:57:0x00f6, B:60:0x0100, B:63:0x0108, B:66:0x0114, B:73:0x012f, B:76:0x0137, B:79:0x0140, B:83:0x014b), top: B:425:0x00df }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0165  */
    /* JADX WARN: Type inference failed for: r0v66, types: [com.inmobi.media.by] */
    /* JADX WARN: Type inference failed for: r0v67, types: [com.inmobi.media.ca] */
    /* JADX WARN: Type inference failed for: r0v70, types: [com.inmobi.media.by] */
    /* JADX WARN: Type inference failed for: r0v71, types: [com.inmobi.media.ca] */
    /* JADX WARN: Type inference failed for: r11v0, types: [byte] */
    /* JADX WARN: Type inference failed for: r14v16, types: [com.inmobi.media.cg, com.inmobi.media.bt] */
    /* JADX WARN: Type inference failed for: r1v48, types: [com.inmobi.media.cb, com.inmobi.media.bt] */
    /* JADX WARN: Type inference failed for: r1v50, types: [com.inmobi.media.bz, com.inmobi.media.bt] */
    /* JADX WARN: Type inference failed for: r1v57, types: [com.inmobi.media.cd, com.inmobi.media.bt] */
    /* JADX WARN: Type inference failed for: r26v12 */
    /* JADX WARN: Type inference failed for: r26v13 */
    /* JADX WARN: Type inference failed for: r26v20 */
    /* JADX WARN: Type inference failed for: r26v21 */
    /* JADX WARN: Type inference failed for: r26v30 */
    /* JADX WARN: Type inference failed for: r2v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.inmobi.media.bw] */
    /* JADX WARN: Type inference failed for: r3v8, types: [com.inmobi.media.bw] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r8v13, types: [com.inmobi.media.ch, com.inmobi.media.bt] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.inmobi.media.bt a(org.json.JSONObject r47, java.lang.String r48, java.lang.String r49) {
        /*
            Method dump skipped, instructions count: 2330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.bx.a(org.json.JSONObject, java.lang.String, java.lang.String):com.inmobi.media.bt");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.inmobi.media.cb.a c(android.graphics.Point r30, android.graphics.Point r31, android.graphics.Point r32, android.graphics.Point r33, org.json.JSONObject r34) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.bx.c(android.graphics.Point, android.graphics.Point, android.graphics.Point, android.graphics.Point, org.json.JSONObject):com.inmobi.media.cb$a");
    }

    private Point b(JSONObject jSONObject, Point point) {
        try {
            JSONObject i10 = i(jSONObject);
            if (i10.isNull("finalGeometry")) {
                return point;
            }
            Point point2 = new Point();
            JSONArray jSONArray = i10.getJSONArray("finalGeometry");
            point2.x = ic.a(jSONArray.getInt(2));
            point2.y = ic.a(jSONArray.getInt(3));
            return point2;
        } catch (JSONException unused) {
            return point;
        }
    }

    private static String g(JSONObject jSONObject) {
        try {
            return jSONObject.getString("valueType");
        } catch (JSONException e10) {
            gg.a().a(new hg(e10));
            return "";
        }
    }

    private static String g(String str) {
        char c10;
        String trim = str.toLowerCase(Locale.US).trim();
        int hashCode = trim.hashCode();
        if (hashCode != -1349116587) {
            if (hashCode == 1787472634 && trim.equals("straight")) {
                c10 = 1;
            }
            c10 = 65535;
        } else {
            if (trim.equals("curved")) {
                c10 = 2;
            }
            c10 = 65535;
        }
        return c10 != 2 ? "straight" : "curved";
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.inmobi.media.cb.a b(android.graphics.Point r32, android.graphics.Point r33, android.graphics.Point r34, android.graphics.Point r35, org.json.JSONObject r36) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.bx.b(android.graphics.Point, android.graphics.Point, android.graphics.Point, android.graphics.Point, org.json.JSONObject):com.inmobi.media.cb$a");
    }

    private static String h(JSONObject jSONObject) {
        try {
            return jSONObject.getString("dataType");
        } catch (JSONException e10) {
            gg.a().a(new hg(e10));
            return "";
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static String h(String str) {
        char c10;
        String trim = str.trim();
        switch (trim.hashCode()) {
            case -1626174665:
                if (trim.equals("unspecified")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -1362001767:
                if (trim.equals("aspectFit")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 3143043:
                if (trim.equals("fill")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 727618043:
                if (trim.equals("aspectFill")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        return c10 != 2 ? c10 != 3 ? c10 != 4 ? "unspecified" : "aspectFit" : "aspectFill" : "fill";
    }

    private JSONObject i(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.isNull("assetStyle") ? null : jSONObject.getJSONObject("assetStyle");
            if (jSONObject2 == null) {
                if (jSONObject.isNull("assetStyleRef")) {
                    return new JSONObject();
                }
                String string = jSONObject.getString("assetStyleRef");
                JSONObject jSONObject3 = this.f24862o;
                return jSONObject3 == null ? new JSONObject() : jSONObject3.getJSONObject(string);
            }
            return jSONObject2;
        } catch (JSONException e10) {
            gg.a().a(new hg(e10));
            return new JSONObject();
        }
    }

    private static void a(bt btVar, JSONObject jSONObject) throws JSONException {
        String str;
        String str2;
        boolean z10;
        boolean z11 = true;
        String str3 = "";
        if (p(jSONObject)) {
            if (jSONObject.getJSONObject("assetOnclick").isNull("itemUrl")) {
                str2 = "";
                z10 = false;
            } else {
                str2 = jSONObject.getJSONObject("assetOnclick").getString("itemUrl");
                z10 = true;
            }
            if (jSONObject.getJSONObject("assetOnclick").isNull("action")) {
                str = "";
                str3 = str2;
                z11 = z10;
            } else {
                str = jSONObject.getJSONObject("assetOnclick").getString("action");
                str3 = str2;
            }
        } else {
            str = "";
            z11 = false;
        }
        btVar.a(str3);
        btVar.f24818j = str;
        btVar.f24816h = z11;
    }

    private static boolean a(JSONObject jSONObject, String str) {
        if (jSONObject.isNull("geometry")) {
            return false;
        }
        try {
            if (a(jSONObject.getJSONArray("geometry"))) {
                char c10 = 65535;
                switch (str.hashCode()) {
                    case -1919329183:
                        if (str.equals("CONTAINER")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case 67056:
                        if (str.equals("CTA")) {
                            c10 = '\t';
                            break;
                        }
                        break;
                    case 70564:
                        if (str.equals("GIF")) {
                            c10 = 7;
                            break;
                        }
                        break;
                    case 2241657:
                        if (str.equals("ICON")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case 2571565:
                        if (str.equals("TEXT")) {
                            c10 = '\b';
                            break;
                        }
                        break;
                    case 69775675:
                        if (str.equals("IMAGE")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 79826725:
                        if (str.equals("TIMER")) {
                            c10 = 5;
                            break;
                        }
                        break;
                    case 81665115:
                        if (str.equals("VIDEO")) {
                            c10 = 4;
                            break;
                        }
                        break;
                    case 1942407129:
                        if (str.equals("WEBVIEW")) {
                            c10 = 6;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        return true;
                    case '\b':
                    case '\t':
                        if (jSONObject.isNull("text")) {
                            return false;
                        }
                        try {
                            return ((int) Double.parseDouble(jSONObject.getJSONObject("text").getString("size"))) > 0;
                        } catch (NumberFormatException e10) {
                            gg.a().a(new hg(e10));
                            return false;
                        }
                    default:
                        return false;
                }
            }
            return false;
        } catch (JSONException e11) {
            gg.a().a(new hg(e11));
            return false;
        }
    }

    private static boolean a(JSONArray jSONArray) {
        try {
            return jSONArray.getInt(2) > 0 && jSONArray.getInt(3) > 0;
        } catch (JSONException e10) {
            gg.a().a(new hg(e10));
            return false;
        }
    }

    private static cf a(int i10, String str, JSONObject jSONObject) throws JSONException {
        String trim = jSONObject.isNull(ImagesContract.URL) ? "" : jSONObject.getString(ImagesContract.URL).trim();
        HashMap hashMap = new HashMap();
        if ("VideoImpression".equals(str)) {
            JSONArray optJSONArray = jSONObject.optJSONArray("events");
            if ((trim.length() == 0 || ((trim.startsWith("http") && !URLUtil.isValidUrl(trim)) || !trim.startsWith("http"))) && optJSONArray == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            if (optJSONArray != null) {
                for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                    String a10 = cf.a(optJSONArray.getString(i11));
                    if ("creativeView".equals(a10) || "start".equals(a10) || "Impression".equals(a10)) {
                        arrayList.add(a10);
                    }
                }
            }
            hashMap.put("referencedEvents", arrayList);
        } else if (trim.length() == 0 || !URLUtil.isValidUrl(trim)) {
            return null;
        }
        HashMap hashMap2 = new HashMap();
        try {
            if (!jSONObject.isNull("params")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("params");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap2.put(next, jSONObject2.getString(next));
                }
            }
        } catch (JSONException e10) {
            gg.a().a(new hg(e10));
        }
        cf cfVar = new cf(trim, i10, str, hashMap2);
        cfVar.f24924f = new HashMap(hashMap);
        return cfVar;
    }

    private static List<cf> a(JSONObject jSONObject) {
        LinkedList linkedList = new LinkedList();
        try {
            HashMap hashMap = new HashMap();
            if (!jSONObject.isNull("macros")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("macros");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject2.getString(next));
                }
            }
            JSONArray jSONArray = jSONObject.getJSONArray("adVerifications");
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i10);
                if (!jSONObject3.isNull(ImagesContract.URL)) {
                    linkedList.add(new em(jSONObject3.optString("vendor"), jSONObject3.optString("verificationParams"), jSONObject3.getString(ImagesContract.URL), "OMID_VIEWABILITY", hashMap));
                }
            }
            if (linkedList.isEmpty()) {
                linkedList.add(new cf("", 0, "OMID_VIEWABILITY", hashMap));
            }
        } catch (Exception e10) {
            gg.a().a(new hg(e10));
        }
        return linkedList;
    }

    private dt a(JSONObject jSONObject, String str, bt btVar) {
        if (f(jSONObject).equalsIgnoreCase("VIDEO")) {
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("assetValue");
                if (jSONArray != null && jSONArray.length() != 0) {
                    if (btVar instanceof cg) {
                        return (dt) btVar.f24813e;
                    }
                    return new dp(this.f24866s.vastVideo).a(str);
                }
                return null;
            } catch (JSONException e10) {
                gg.a().a(new hg(e10));
            }
        }
        return null;
    }

    private Point a(JSONObject jSONObject, Point point) {
        try {
            JSONObject i10 = i(jSONObject);
            if (i10.isNull("finalGeometry")) {
                return point;
            }
            Point point2 = new Point();
            JSONArray jSONArray = i10.getJSONArray("finalGeometry");
            point2.x = ic.a(jSONArray.getInt(0));
            point2.y = ic.a(jSONArray.getInt(1));
            return point2;
        } catch (JSONException unused) {
            return point;
        }
    }

    private static int a(JSONObject jSONObject, boolean z10) {
        try {
            JSONObject n10 = n(jSONObject);
            String str = "delay";
            if (n10.isNull(z10 ? "delay" : "hideAfterDelay")) {
                return -1;
            }
            if (!z10) {
                str = "hideAfterDelay";
            }
            int i10 = n10.getInt(str);
            if (3 == l(jSONObject)) {
                return i10;
            }
            if (4 == l(jSONObject)) {
                if (i10 == 0) {
                    return i10;
                }
                if (i10 > 0 && i10 <= 100) {
                    int[] iArr = {25, 50, 75, 100};
                    double d10 = Double.MAX_VALUE;
                    int i11 = -1;
                    for (int i12 = 0; i12 < 4; i12++) {
                        int i13 = i10 - iArr[i12];
                        double d11 = i13 * i13;
                        if (d11 < d10) {
                            i11 = i12;
                            d10 = d11;
                        }
                    }
                    return iArr[i11];
                }
            }
            return -1;
        } catch (JSONException e10) {
            gg.a().a(new hg(e10));
            return -1;
        }
    }

    private bu a(Point point, Point point2, Point point3, Point point4, JSONObject jSONObject) throws JSONException {
        String str;
        String str2 = "none";
        String str3 = "#ff000000";
        str = "straight";
        if (!jSONObject.isNull("border")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("border");
            if (!jSONObject2.isNull("style")) {
                str2 = f(jSONObject2.getString("style"));
                str = jSONObject2.isNull("corner") ? "straight" : g(jSONObject2.getString("corner"));
                if (!jSONObject2.isNull("color")) {
                    str3 = jSONObject2.getString("color").trim();
                }
            }
        }
        return new bu(point.x, point.y, point2.x, point2.y, point3.x, point3.y, point4.x, point4.y, !jSONObject.isNull("contentMode") ? h(jSONObject.getString("contentMode")) : "fill", str2, str, str3, jSONObject.isNull("backgroundColor") ? "#00000000" : jSONObject.getString("backgroundColor").trim(), s(jSONObject));
    }

    private static boolean a(bv bvVar) {
        return "card_scrollable".equalsIgnoreCase(bvVar.f24812d);
    }

    private static void a(cg cgVar) {
        cgVar.f24832x = 8;
        HashMap hashMap = new HashMap();
        hashMap.put("[ERRORCODE]", "601");
        cgVar.a("error", hashMap);
    }

    private static bt a(bx bxVar, bt btVar) {
        do {
            String str = (String) btVar.f24813e;
            if (str == null || str.length() == 0) {
                return null;
            }
            String[] split = str.split("\\|");
            bt b10 = bxVar.b(split[0]);
            if (b10 == null) {
                bxVar = bxVar.f24854f;
            } else if (b10.equals(btVar)) {
                return null;
            } else {
                if (1 == split.length) {
                    b10.f24821m = (byte) 1;
                    return b10;
                }
                b10.f24821m = a(split[1]);
                return b10;
            }
        } while (bxVar != null);
        return null;
    }
}
