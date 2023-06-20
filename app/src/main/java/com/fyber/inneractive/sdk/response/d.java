package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.y;
import com.fyber.inneractive.sdk.model.vast.m;
import com.fyber.inneractive.sdk.model.vast.o;
import com.fyber.inneractive.sdk.model.vast.r;
import com.fyber.inneractive.sdk.model.vast.s;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.d0;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.inmobi.media.jh;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

/* loaded from: classes2.dex */
public class d extends b {

    /* renamed from: e  reason: collision with root package name */
    public g f20154e;

    /* renamed from: f  reason: collision with root package name */
    public y f20155f;

    /* renamed from: g  reason: collision with root package name */
    public com.fyber.inneractive.sdk.model.vast.d f20156g;

    /* renamed from: h  reason: collision with root package name */
    public List<com.fyber.inneractive.sdk.model.vast.d> f20157h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public int f20158i;

    /* renamed from: j  reason: collision with root package name */
    public r f20159j;

    @Override // com.fyber.inneractive.sdk.response.b
    public e a() {
        g gVar = new g();
        this.f20150a = gVar;
        this.f20154e = gVar;
        return gVar;
    }

    public void b(String str) throws com.fyber.inneractive.sdk.flow.vast.e, Exception {
        o oVar;
        try {
            String replaceFirst = str.replaceFirst("<\\?.*\\?>", "");
            DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
            newInstance.setCoalescing(true);
            Document parse = newInstance.newDocumentBuilder().parse(new InputSource(new StringReader(replaceFirst)));
            if (parse != null) {
                Node firstChild = parse.getFirstChild();
                if (firstChild.getNodeName().equalsIgnoreCase("VAST")) {
                    oVar = o.a(firstChild);
                } else {
                    IAlog.a("XML does not contain a VAST tag as its first child!", new Object[0]);
                    throw new Exception("XML does not contain a VAST tag as its first child!");
                }
            } else {
                oVar = null;
            }
            try {
                if (this.f20159j == null) {
                    this.f20159j = new r(oVar.f17451a);
                } else {
                    r rVar = new r(oVar.f17451a);
                    if (rVar.compareTo(this.f20159j) >= 0) {
                        this.f20159j = rVar;
                    }
                }
            } catch (r.a unused) {
            }
            List<com.fyber.inneractive.sdk.model.vast.d> list = oVar.f17452b;
            if (list != null && list.size() != 0) {
                com.fyber.inneractive.sdk.model.vast.d dVar = list.get(0);
                s sVar = dVar.f17404b;
                if (sVar != null) {
                    IAlog.a("Vast response parser: found VAST wrapper #%d", Integer.valueOf(this.f20157h.size()));
                    int size = this.f20157h.size();
                    int i10 = this.f20158i;
                    if (size < i10) {
                        this.f20157h.add(dVar);
                        String str2 = sVar.f17479e;
                        if (!TextUtils.isEmpty(str2)) {
                            if (d0.f(str2)) {
                                String a10 = com.fyber.inneractive.sdk.util.r.a(str2, AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS, jh.DEFAULT_BITMAP_TIMEOUT, 5);
                                if (!TextUtils.isEmpty(a10)) {
                                    this.f20154e.G.put(str2, a10);
                                    b(a10);
                                    return;
                                }
                                throw new com.fyber.inneractive.sdk.flow.vast.e("VastErrorInvalidFile", "Failed getting data from ad tag URI");
                            }
                            IAlog.a("Vast response parser: Unsecure Wrapper URL. Aborting! url: %s", str2);
                            throw new com.fyber.inneractive.sdk.flow.vast.e("VastErrorUnsecure", "Unsecure ad tag URI for wrapper");
                        }
                        IAlog.a("Vast response parser: found an empty tag uri in wrapper! aborting!", new Object[0]);
                        throw new com.fyber.inneractive.sdk.flow.vast.e("VastErrorInvalidFile", "No ad tag URI for wrapper");
                    }
                    IAlog.a("Vast response parser: too many vast wrappers! Only %dallowed. stopping", Integer.valueOf(i10));
                    throw new com.fyber.inneractive.sdk.flow.vast.e("VastErrorTooManyWrappers", "More than " + this.f20158i + " found");
                } else if (dVar.f17405c != null) {
                    this.f20156g = dVar;
                    return;
                } else {
                    throw new com.fyber.inneractive.sdk.flow.vast.e("VastErrorInvalidFile", "A top level ad with no wrapper on inline found!");
                }
            }
            IAlog.a("Vast response parser: no ads found in model. aborting", new Object[0]);
            throw new com.fyber.inneractive.sdk.flow.vast.e("ErrorNoMediaFiles", "No ads found in model. Empty Vast?");
        } catch (Exception e10) {
            IAlog.a("Failed parsing Vast file! parsing error = %s", e10.getMessage());
            throw new com.fyber.inneractive.sdk.flow.vast.e("VastErrorInvalidFile", e10.getMessage());
        }
    }

    @Override // com.fyber.inneractive.sdk.response.b
    public boolean b() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.response.b
    public void a(String str, y yVar) throws Exception {
        this.f20155f = yVar;
        if (yVar != null && yVar.f17077f != null) {
            this.f20154e.B = System.currentTimeMillis();
            this.f20158i = IAConfigManager.J.f16873i.f17010c;
            this.f20154e.getClass();
            try {
                b(str);
                a(this.f20156g, this.f20157h);
                return;
            } catch (com.fyber.inneractive.sdk.flow.vast.e e10) {
                this.f20154e.f20168i = e10.getMessage();
                this.f20154e.f20169j = e10.getCause().getMessage();
                return;
            } catch (InterruptedException e11) {
                throw e11;
            } catch (Exception e12) {
                this.f20154e.f20169j = String.format("%s", e12.getMessage());
                g gVar = this.f20154e;
                gVar.f20168i = "VastErrorInvalidFile";
                gVar.f20183x = e12;
                if (IAlog.f20222a == 2) {
                    e12.printStackTrace();
                    return;
                }
                return;
            }
        }
        this.f20150a.f20168i = "ErrorConfigurationMismatch";
    }

    public void a(com.fyber.inneractive.sdk.model.vast.d dVar, List<com.fyber.inneractive.sdk.model.vast.d> list) throws com.fyber.inneractive.sdk.flow.vast.e {
        com.fyber.inneractive.sdk.flow.vast.a aVar = new com.fyber.inneractive.sdk.flow.vast.a();
        int intValue = this.f20155f.f17077f.f16901c.intValue();
        int intValue2 = this.f20155f.f17077f.f16900b.intValue();
        int intValue3 = this.f20155f.f17077f.f16905g.intValue();
        aVar.f17298a = intValue;
        aVar.f17299b = intValue2;
        aVar.f17300c = intValue3;
        if (UnitDisplayType.VERTICAL.equals(this.f20155f.f17077f.f16908j)) {
            aVar.f17301d = true;
        }
        if (this.f20155f.f17077f.f16909k.contains(2)) {
            aVar.f17302e = true;
        }
        try {
            r rVar = this.f20159j;
            this.f20154e.C = aVar.a(dVar, list, rVar != null ? rVar.f17478b : "");
        } catch (com.fyber.inneractive.sdk.flow.vast.e e10) {
            g gVar = this.f20154e;
            gVar.getClass();
            gVar.f20168i = e10.getMessage();
        }
        g gVar2 = this.f20154e;
        Map<m, com.fyber.inneractive.sdk.flow.vast.c> map = aVar.f17303f;
        gVar2.getClass();
        if (map != null) {
            gVar2.D.putAll(map);
        }
        g gVar3 = this.f20154e;
        List<com.fyber.inneractive.sdk.model.vast.f> list2 = aVar.f17304g;
        gVar3.getClass();
        if (list2 != null) {
            gVar3.E.addAll(list2);
        }
        g gVar4 = this.f20154e;
        List<com.fyber.inneractive.sdk.measurement.i> list3 = aVar.f17306i;
        gVar4.getClass();
        if (list3 != null) {
            gVar4.F.addAll(list3);
        }
        if (IAlog.f20222a == 2) {
            Map<m, com.fyber.inneractive.sdk.flow.vast.c> map2 = aVar.f17303f;
            if (map2.size() > 0) {
                IAlog.d(" VParser: Unsupported media files:", new Object[0]);
                for (m mVar : map2.keySet()) {
                    IAlog.d("VParser: %s", mVar);
                    IAlog.d("VParser: reason = %s", map2.get(mVar));
                }
                return;
            }
            IAlog.d("VParser: Unsupported media files: none", new Object[0]);
        }
    }
}
