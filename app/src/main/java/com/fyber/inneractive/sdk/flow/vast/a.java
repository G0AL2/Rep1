package com.fyber.inneractive.sdk.flow.vast;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.flow.vast.c;
import com.fyber.inneractive.sdk.measurement.i;
import com.fyber.inneractive.sdk.model.vast.h;
import com.fyber.inneractive.sdk.model.vast.j;
import com.fyber.inneractive.sdk.model.vast.m;
import com.fyber.inneractive.sdk.model.vast.n;
import com.fyber.inneractive.sdk.model.vast.p;
import com.fyber.inneractive.sdk.model.vast.q;
import com.fyber.inneractive.sdk.model.vast.s;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.d0;
import com.fyber.inneractive.sdk.util.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public int f17298a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f17299b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f17300c = -1;

    /* renamed from: d  reason: collision with root package name */
    public boolean f17301d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f17302e = false;

    /* renamed from: i  reason: collision with root package name */
    public final List<i> f17306i = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public Map<m, c> f17303f = new LinkedHashMap();

    /* renamed from: g  reason: collision with root package name */
    public List<com.fyber.inneractive.sdk.model.vast.f> f17304g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final List<com.fyber.inneractive.sdk.model.vast.f> f17305h = new ArrayList();

    /* renamed from: com.fyber.inneractive.sdk.flow.vast.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0235a extends Exception {

        /* renamed from: a  reason: collision with root package name */
        public int f17307a;

        public C0235a(a aVar, String str, int i10) {
            super(str);
            this.f17307a = i10;
        }
    }

    public void a(com.fyber.inneractive.sdk.model.vast.b bVar, com.fyber.inneractive.sdk.model.vast.f fVar, boolean z10) throws C0235a {
        String str;
        List<p> list;
        String str2;
        Integer num;
        Integer num2;
        List<String> list2 = fVar.f17417h;
        if (list2 != null) {
            if (z10) {
                this.f17305h.add(fVar);
            }
            for (String str3 : list2) {
                if (!d0.f(str3)) {
                    throw new C0235a(this, "Found non secure click tracking url for companion: " + fVar, 0);
                }
            }
        }
        String str4 = fVar.f17416g;
        if (d0.f(str4)) {
            Integer num3 = fVar.f17410a;
            Integer num4 = fVar.f17411b;
            boolean z11 = true;
            if (num3 != null && num4 != null && num3.intValue() >= 100 && num4.intValue() >= 100) {
                String str5 = fVar.f17412c;
                List<p> list3 = fVar.f17419j;
                if (list3 != null) {
                    for (p pVar : list3) {
                        if (!d0.f(pVar.f17454b)) {
                            throw new C0235a(this, "Found non secure tracking event: " + pVar, 0);
                        }
                    }
                }
                if (TextUtils.isEmpty(fVar.f17414e) && TextUtils.isEmpty(fVar.f17415f) && fVar.f17413d == null) {
                    z11 = false;
                }
                if (z11) {
                    String str6 = fVar.f17414e;
                    if (d0.f(str6)) {
                        com.fyber.inneractive.sdk.model.vast.i iVar = fVar.f17413d;
                        if (iVar != null) {
                            String str7 = iVar.f17428a;
                            h hVar = h.Gif;
                            h hVar2 = !TextUtils.isEmpty(str7) ? (h) ((HashMap) h.f17425c).get(str7.toLowerCase()) : null;
                            if (hVar2 != null) {
                                str = str6;
                                list = list3;
                                str2 = str5;
                                num = num4;
                                num2 = num3;
                                a(bVar, com.fyber.inneractive.sdk.model.vast.g.Static, z10, num3.intValue(), num4.intValue(), str5, str4, list2, list, iVar.f17429b, hVar2);
                            } else {
                                throw new C0235a(this, "Found invalid creative type:" + iVar.f17428a, 0);
                            }
                        } else {
                            str = str6;
                            list = list3;
                            str2 = str5;
                            num = num4;
                            num2 = num3;
                        }
                        if (!TextUtils.isEmpty(str)) {
                            a(bVar, com.fyber.inneractive.sdk.model.vast.g.Iframe, z10, num2.intValue(), num.intValue(), str2, str4, list2, list, str, null);
                        }
                        String str8 = fVar.f17415f;
                        if (TextUtils.isEmpty(str8)) {
                            return;
                        }
                        a(bVar, com.fyber.inneractive.sdk.model.vast.g.Html, z10, num2.intValue(), num.intValue(), str2, str4, list2, list, str8, null);
                        return;
                    }
                    throw new C0235a(this, "Found non secure iframe url:" + str6, 0);
                }
                throw new C0235a(this, "None sources of companion avaliable", 0);
            }
            throw new C0235a(this, "Incompatible size: " + num3 + "," + num4, 16);
        }
        throw new C0235a(this, "Found non secure click through url: " + str4, 0);
    }

    public com.fyber.inneractive.sdk.model.vast.b a(com.fyber.inneractive.sdk.model.vast.d dVar, List<com.fyber.inneractive.sdk.model.vast.d> list, String str) throws e {
        IAlog.a("%sprocess started", "VastProcessor: ");
        if (dVar != null && dVar.f17405c != null) {
            int e10 = l.e();
            int d10 = l.d();
            com.fyber.inneractive.sdk.model.vast.b bVar = new com.fyber.inneractive.sdk.model.vast.b(new d(this.f17300c, e10, d10), new b(e10, d10));
            bVar.f17386a = str;
            List<j> list2 = dVar.f17405c.f17408c;
            if (list2 != null && !list2.isEmpty()) {
                if (list != null) {
                    for (com.fyber.inneractive.sdk.model.vast.d dVar2 : list) {
                        s sVar = dVar2.f17404b;
                        if (sVar != null) {
                            a(bVar, (com.fyber.inneractive.sdk.model.vast.e) sVar, true);
                        }
                    }
                }
                a(bVar, (com.fyber.inneractive.sdk.model.vast.e) dVar.f17405c, false);
                if (bVar.f17389d.size() == 0) {
                    if (this.f17303f.size() == 0) {
                        throw new e("ErrorNoMediaFiles", "No media files exist after merge");
                    }
                    throw new e("ErrorNoCompatibleMediaFile", "No compatible media files after filtering");
                }
                if (IAlog.f20222a == 2) {
                    IAlog.d("%sLogging merged model media files: ", "VastProcessor: ");
                    Iterator it = new ArrayList(bVar.f17389d).iterator();
                    int i10 = 0;
                    while (it.hasNext()) {
                        IAlog.d("%s(%d) %s", "VastProcessor: ", Integer.valueOf(i10), (m) it.next());
                        i10++;
                    }
                }
                if (IAlog.f20222a == 2) {
                    IAlog.d("%sLogging merged model companion ads: ", "VastProcessor: ");
                    ArrayList arrayList = new ArrayList(bVar.f17391f);
                    if (arrayList.size() > 0) {
                        Iterator it2 = arrayList.iterator();
                        int i11 = 0;
                        while (it2.hasNext()) {
                            IAlog.d("%s(%d) %s", "VastProcessor: ", Integer.valueOf(i11), ((com.fyber.inneractive.sdk.model.vast.c) it2.next()).a());
                            i11++;
                        }
                    } else {
                        IAlog.d("%sNo companion ads found!", "VastProcessor: ");
                    }
                }
                return bVar;
            }
            throw new e("ErrorNoMediaFiles", "Empty inline with no creatives");
        }
        IAlog.a("%sno inline found", "VastProcessor: ");
        throw new e("ErrorNoMediaFiles", "Empty inline ad found");
    }

    public final void a(com.fyber.inneractive.sdk.model.vast.b bVar, com.fyber.inneractive.sdk.model.vast.e eVar, boolean z10) {
        String[] split;
        c cVar;
        Integer num;
        List<String> list;
        IAlog.a("%sprocessing ad element: %s", "VastProcessor: ", eVar);
        List<String> list2 = eVar.f17407b;
        if (list2 != null) {
            for (String str : list2) {
                IAlog.a("%sadding impression url: %s", "VastProcessor: ", str);
                a(bVar, q.EVENT_IMPRESSION, str);
            }
        }
        String str2 = eVar.f17406a;
        if (!TextUtils.isEmpty(str2)) {
            IAlog.a("%sadding error url: %s", "VastProcessor: ", str2);
            bVar.a(q.EVENT_ERROR, str2);
        }
        if (IAConfigManager.J.I != null) {
            for (i iVar : eVar.f17409d) {
                if (iVar.b()) {
                    bVar.f17390e.add(iVar);
                } else {
                    q qVar = q.EVENT_VERIFICATION_NOT_EXECUTED;
                    Map<q, List<String>> map = iVar.f17349c;
                    if (((map == null || (list = map.get(qVar)) == null) ? 0 : list.size()) > 0) {
                        com.fyber.inneractive.sdk.player.f.a(new com.fyber.inneractive.sdk.measurement.h(iVar, iVar.a(qVar), com.fyber.inneractive.sdk.measurement.j.VERIFICATION_NOT_SUPPORTED), qVar);
                    }
                    this.f17306i.add(iVar);
                }
            }
        }
        for (j jVar : eVar.f17408c) {
            com.fyber.inneractive.sdk.model.vast.l lVar = jVar.f17430a;
            if (lVar != null) {
                List<m> list3 = lVar.f17432a;
                if (list3 != null) {
                    bVar.f17394i = list3.size();
                    for (m mVar : list3) {
                        c cVar2 = null;
                        if (!mVar.f17437a.equals("progressive")) {
                            cVar2 = new c(c.a.UNSUPPORTED_DELIVERY, "progressive");
                        } else {
                            if ((this.f17299b > -1) && (num = mVar.f17441e) != null && num.intValue() != 0) {
                                int intValue = mVar.f17441e.intValue();
                                int i10 = this.f17298a;
                                if (intValue < i10) {
                                    cVar2 = new c(c.a.BITRATE_NOT_IN_RANGE, Integer.valueOf(i10));
                                } else {
                                    int intValue2 = mVar.f17441e.intValue();
                                    int i11 = this.f17299b;
                                    if (intValue2 > i11) {
                                        cVar2 = new c(c.a.BITRATE_NOT_IN_RANGE, Integer.valueOf(i11));
                                    }
                                }
                            }
                            String str3 = mVar.f17440d;
                            HashMap hashMap = (HashMap) n.f17448f;
                            if (!((hashMap.containsKey(str3) ? (n) hashMap.get(str3) : n.UNKNOWN) != n.UNKNOWN)) {
                                cVar = new c(c.a.UNSUPPORTED_MIME_TYPE, null);
                            } else if (this.f17301d && mVar.f17438b.intValue() >= mVar.f17439c.intValue()) {
                                cVar = new c(c.a.VERTICAL_VIDEO_EXPECTED, null);
                            } else {
                                String str4 = mVar.f17442f;
                                if (str4 != null && this.f17302e && str4.equalsIgnoreCase("VPAID")) {
                                    cVar = new c(c.a.FILTERED_BY_APP_OR_UNIT, null);
                                } else if (TextUtils.isEmpty(mVar.f17443g)) {
                                    cVar = new c(c.a.NO_CONTENT, null);
                                } else if (!d0.f(mVar.f17443g)) {
                                    cVar = new c(c.a.UNSECURED_VIDEO_URL, null);
                                }
                            }
                            cVar2 = cVar;
                        }
                        if (cVar2 != null) {
                            IAlog.a("%smedia file filtered!: %s", "VastProcessor: ", mVar);
                            IAlog.a("%s-- %s", "VastProcessor: ", mVar);
                            IAlog.a("%s-- %s", "VastProcessor: ", cVar2);
                            this.f17303f.put(mVar, cVar2);
                        } else {
                            IAlog.a("%sadding media file: %s", "VastProcessor: ", mVar);
                            bVar.f17389d.add(mVar);
                            bVar.f17393h++;
                        }
                    }
                }
                List<String> list4 = lVar.f17435d;
                if (list4 != null) {
                    for (String str5 : list4) {
                        a(bVar, q.EVENT_CLICK, str5);
                    }
                }
                List<p> list5 = lVar.f17433b;
                if (list5 != null) {
                    for (p pVar : list5) {
                        q a10 = q.a(pVar.f17453a);
                        if (a10 != q.UNKNOWN) {
                            bVar.a(a10, pVar.f17454b);
                        }
                    }
                }
                bVar.f17387b = lVar.f17434c;
                String str6 = lVar.f17436e;
                if (!TextUtils.isEmpty(str6) && (split = str6.split(":")) != null && split.length <= 3) {
                    if (split.length == 1) {
                        try {
                            Integer.parseInt(str6);
                        } catch (NumberFormatException unused) {
                        }
                    } else if (split.length == 2) {
                        Integer.parseInt(split[1]);
                        Integer.parseInt(split[0]);
                    } else {
                        Integer.parseInt(split[2]);
                        Integer.parseInt(split[1]);
                        Integer.parseInt(split[0]);
                    }
                }
            }
            List<com.fyber.inneractive.sdk.model.vast.f> list6 = jVar.f17431b;
            if (list6 != null) {
                for (com.fyber.inneractive.sdk.model.vast.f fVar : list6) {
                    try {
                        a(bVar, fVar, z10);
                    } catch (C0235a e10) {
                        IAlog.a("Failed processing companion ad: %s error = %s", fVar, e10.getMessage());
                        fVar.f17418i = e10;
                        this.f17304g.add(fVar);
                    }
                }
            }
        }
    }

    public final void a(com.fyber.inneractive.sdk.response.i iVar, q qVar, String str) throws e {
        if (d0.f(str)) {
            ((com.fyber.inneractive.sdk.model.vast.b) iVar).a(qVar, str);
            return;
        }
        throw new e("VastErrorUnsecure", "found unsecure tracking event: " + qVar.f17476a);
    }

    public void a(com.fyber.inneractive.sdk.model.vast.b bVar, com.fyber.inneractive.sdk.model.vast.g gVar, boolean z10, int i10, int i11, String str, String str2, List<String> list, List<p> list2, String str3, h hVar) {
        com.fyber.inneractive.sdk.model.vast.c cVar = new com.fyber.inneractive.sdk.model.vast.c(gVar, i10, i11, str);
        cVar.f17401g = str2;
        if (list2 != null) {
            for (p pVar : list2) {
                cVar.a(q.a(pVar.f17453a), pVar.f17454b);
            }
        }
        if (list != null) {
            for (String str4 : list) {
                cVar.a(q.EVENT_CLICK, str4);
            }
        }
        a(cVar, z10);
        cVar.f17400f = str3;
        cVar.f17396b = hVar;
        bVar.f17391f.add(cVar);
    }

    public boolean a(com.fyber.inneractive.sdk.model.vast.c cVar, boolean z10) {
        boolean z11 = false;
        if (!this.f17305h.isEmpty()) {
            com.fyber.inneractive.sdk.model.vast.f fVar = null;
            if (z10) {
                List<com.fyber.inneractive.sdk.model.vast.f> list = this.f17305h;
                fVar = list.remove(list.size() - 1);
            }
            String str = cVar.f17399e;
            for (com.fyber.inneractive.sdk.model.vast.f fVar2 : this.f17305h) {
                String str2 = fVar2.f17412c;
                if ((str != null && str.equals(str2)) || (str2 == null && cVar.f17397c == fVar2.f17410a.intValue() && cVar.f17398d == fVar2.f17411b.intValue())) {
                    List<String> list2 = fVar2.f17417h;
                    if (list2 != null) {
                        for (String str3 : list2) {
                            if (d0.f(str3)) {
                                cVar.a(q.EVENT_CLICK, str3);
                            }
                        }
                    }
                    z11 = true;
                }
            }
            if (fVar != null) {
                this.f17305h.add(fVar);
            }
        }
        return z11;
    }
}
