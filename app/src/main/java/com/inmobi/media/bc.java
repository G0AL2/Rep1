package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AdStore.java */
/* loaded from: classes3.dex */
public class bc {

    /* renamed from: e  reason: collision with root package name */
    private static final String f24690e = "bc";

    /* renamed from: a  reason: collision with root package name */
    public final a f24691a;

    /* renamed from: b  reason: collision with root package name */
    public final ba f24692b;

    /* renamed from: f  reason: collision with root package name */
    private final bo f24695f;

    /* renamed from: c  reason: collision with root package name */
    public long f24693c = 0;

    /* renamed from: d  reason: collision with root package name */
    public final bh f24694d = new bh() { // from class: com.inmobi.media.bc.1
        @Override // com.inmobi.media.bh
        public final void a(aw awVar, final byte b10) {
            bc.this.f24696g.a(awVar, b10);
            String unused = bc.f24690e;
            ba unused2 = bc.this.f24692b;
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.inmobi.media.bc.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    bc.this.f24691a.a(bc.this.f24692b, false, bc.a(b10));
                }
            });
        }

        @Override // com.inmobi.media.bh
        public final void a(aw awVar) {
            bc.this.f24696g.a(awVar);
            String unused = bc.f24690e;
            ba unused2 = bc.this.f24692b;
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.inmobi.media.bc.1.2
                @Override // java.lang.Runnable
                public final void run() {
                    bc.this.f24691a.a(bc.this.f24692b, true, (byte) 0);
                }
            });
        }
    };

    /* renamed from: g  reason: collision with root package name */
    private final bh f24696g = new bh() { // from class: com.inmobi.media.bc.2
        @Override // com.inmobi.media.bh
        public final void a(aw awVar, byte b10) {
            String unused = bc.f24690e;
        }

        @Override // com.inmobi.media.bh
        public final void a(aw awVar) {
            String unused = bc.f24690e;
            if (awVar != null) {
                Set<bn> set = awVar.f24648b;
                for (av avVar : awVar.f24647a) {
                    if (!avVar.f24636j) {
                        String a10 = bc.a(set, avVar);
                        HashMap hashMap = new HashMap();
                        hashMap.put("latency", Long.valueOf(avVar.f24627a));
                        hashMap.put("size", Float.valueOf((((float) is.a(avVar.f24631e)) * 1.0f) / 1024.0f));
                        hashMap.put("assetType", a10);
                        hashMap.put("networkType", ib.b());
                        hashMap.put("adType", bc.this.f24692b.l());
                        bc.this.f24695f.b("AssetDownloaded", hashMap);
                    }
                }
            }
            String unused2 = bc.f24690e;
            ba unused3 = bc.this.f24692b;
        }
    };

    /* compiled from: AdStore.java */
    /* loaded from: classes3.dex */
    public interface a {
        void a(ba baVar, boolean z10, byte b10);
    }

    public bc(a aVar, bo boVar, ba baVar) {
        this.f24691a = aVar;
        this.f24695f = boVar;
        this.f24692b = baVar;
    }

    static /* synthetic */ byte a(byte b10) {
        switch (b10) {
            case 1:
                return (byte) 78;
            case 2:
                return (byte) 79;
            case 3:
                return (byte) 80;
            case 4:
                return (byte) 81;
            case 5:
                return (byte) 5;
            case 6:
                return (byte) 77;
            case 7:
                return (byte) 31;
            case 8:
                return (byte) 27;
            default:
                return (byte) 82;
        }
    }

    private void b() {
        HashMap hashMap = new HashMap();
        hashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - this.f24693c));
        hashMap.put("adType", this.f24692b.l());
        hashMap.put("networkType", ib.b());
        hashMap.put("plId", Long.valueOf(this.f24692b.e()));
        hashMap.put("plType", "NonAB");
        this.f24695f.b("ServerFill", hashMap);
    }

    public final bb a(cn cnVar) throws bp {
        try {
            return a(new JSONObject(cnVar.f24943a.b()));
        } catch (JSONException unused) {
            HashMap hashMap = new HashMap();
            hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, (byte) 3);
            a(hashMap);
            throw new bp(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), (byte) 0);
        }
    }

    private bb b(JSONObject jSONObject) {
        String trim;
        JSONArray jSONArray;
        String string;
        try {
            trim = jSONObject.optString("winningAdSetId").trim();
            jSONArray = jSONObject.getJSONArray("adSets");
            string = jSONObject.getString(bb.KEY_REQUEST_ID);
        } catch (JSONException unused) {
        }
        if (jSONArray.length() != 0) {
            bb a10 = bb.a(jSONArray.getJSONObject(0), this.f24692b.e(), this.f24692b.l(), string);
            if (a10 != null) {
                return a10;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, (byte) 3);
            a(hashMap);
            return null;
        } else if (TextUtils.isEmpty(trim)) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - this.f24693c));
            hashMap2.put("adType", this.f24692b.l());
            hashMap2.put("networkType", ib.b());
            hashMap2.put("plId", Long.valueOf(this.f24692b.e()));
            hashMap2.put("plType", "NonAB");
            this.f24695f.b("ServerNoFill", hashMap2);
            throw new bp(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NO_FILL), (byte) 0);
        } else {
            return null;
        }
    }

    public final bb a(JSONObject jSONObject) throws bp {
        bb b10 = b(jSONObject);
        if (b10 != null) {
            b();
            if (b10.c() && b10.l() == null) {
                HashMap hashMap = new HashMap();
                hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, (byte) 3);
                a(hashMap);
                throw new bp(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), (byte) 0);
            }
            return b10;
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put(IronSourceConstants.EVENTS_ERROR_CODE, (byte) 3);
        a(hashMap2);
        throw new bp(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), (byte) 0);
    }

    public final void a(Map<String, Object> map) {
        map.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - this.f24693c));
        map.put("adType", this.f24692b.l());
        map.put("networkType", ib.b());
        map.put("plId", Long.valueOf(this.f24692b.e()));
        map.put("plType", "NonAB");
        this.f24695f.b("ServerError", map);
    }

    public static void a(cm cmVar) {
        if (cmVar != null) {
            Map<String, String> map = cmVar.f24940d;
            if (map == null) {
                map = new HashMap<>();
            }
            cmVar.f24940d = map;
        }
    }

    static /* synthetic */ String a(Set set, av avVar) {
        String str;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            bn bnVar = (bn) it.next();
            if (bnVar.f24803b.equals(avVar.f24630d)) {
                byte b10 = bnVar.f24802a;
                if (b10 == 0) {
                    str = DownloadResource.TYPE_VIDEO;
                } else if (b10 == 1) {
                    str = "gif";
                } else if (b10 != 2) {
                    return "";
                } else {
                    str = "image";
                }
                return str;
            }
        }
        return "";
    }
}
