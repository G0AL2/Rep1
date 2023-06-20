package com.bytedance.sdk.openadsdk.core.j;

import com.bytedance.sdk.openadsdk.core.j.b.c;
import com.bytedance.sdk.openadsdk.core.j.c.a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: VastResource.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    protected int f12440a;

    /* renamed from: b  reason: collision with root package name */
    protected int f12441b;

    /* renamed from: c  reason: collision with root package name */
    protected a.EnumC0172a f12442c;

    /* renamed from: d  reason: collision with root package name */
    protected a.b f12443d;

    /* renamed from: e  reason: collision with root package name */
    protected String f12444e;

    /* renamed from: f  reason: collision with root package name */
    protected List<com.bytedance.sdk.openadsdk.core.j.b.c> f12445f;

    /* renamed from: g  reason: collision with root package name */
    protected List<com.bytedance.sdk.openadsdk.core.j.b.c> f12446g;

    /* renamed from: h  reason: collision with root package name */
    protected String f12447h;

    /* renamed from: i  reason: collision with root package name */
    private String f12448i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VastResource.java */
    /* renamed from: com.bytedance.sdk.openadsdk.core.j.c$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f12449a;

        static {
            int[] iArr = new int[a.b.values().length];
            f12449a = iArr;
            try {
                iArr[a.b.STATIC_RESOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12449a[a.b.HTML_RESOURCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12449a[a.b.IFRAME_RESOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public c(int i10, int i11, a.EnumC0172a enumC0172a, a.b bVar, String str, List<com.bytedance.sdk.openadsdk.core.j.b.c> list, List<com.bytedance.sdk.openadsdk.core.j.b.c> list2, String str2) {
        this.f12445f = new ArrayList();
        this.f12446g = new ArrayList();
        this.f12440a = i10;
        this.f12441b = i11;
        this.f12442c = enumC0172a;
        this.f12443d = bVar;
        this.f12444e = str;
        this.f12445f = list;
        this.f12446g = list2;
        this.f12447h = str2;
    }

    public void a(long j10) {
        com.bytedance.sdk.openadsdk.core.j.b.c.b(this.f12445f, null, j10, this.f12448i);
    }

    public int b() {
        return this.f12440a;
    }

    public int c() {
        return this.f12441b;
    }

    public String d() {
        int i10 = AnonymousClass1.f12449a[this.f12443d.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return null;
                }
                return "<iframe frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" style=\"border: 0px; margin: 0px;\" width=\"" + this.f12440a + "\" height=\"" + this.f12441b + "\" src=\"" + this.f12444e + "\"></iframe>";
            }
            return this.f12444e;
        }
        a.EnumC0172a enumC0172a = this.f12442c;
        if (enumC0172a == a.EnumC0172a.IMAGE) {
            return "<html><head></head><body style=\"margin:0;padding:0\"><img src=\"" + this.f12444e + "\" width=\"100%\" style=\"max-width:100%;max-height:100%;\" /></body></html>";
        } else if (enumC0172a == a.EnumC0172a.JAVASCRIPT) {
            return "<script src=\"" + this.f12444e + "\"></script>";
        } else {
            return null;
        }
    }

    public String e() {
        if (this.f12443d == a.b.STATIC_RESOURCE && this.f12442c == a.EnumC0172a.IMAGE) {
            return this.f12444e;
        }
        return null;
    }

    public static float a(int i10, int i11, int i12, int i13, a.b bVar, a.EnumC0172a enumC0172a) {
        if (i11 == 0 || i13 == 0) {
            return 0.0f;
        }
        float f10 = i10;
        float f11 = i12;
        return a(bVar, enumC0172a) / ((Math.abs((f10 / i11) - (f11 / i13)) + Math.abs((f10 - f11) / f10)) + 1.0f);
    }

    public void b(long j10) {
        com.bytedance.sdk.openadsdk.core.j.b.c.b(this.f12446g, null, j10, this.f12448i);
    }

    public static c b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int optInt = jSONObject.optInt("width");
        int optInt2 = jSONObject.optInt("height");
        String optString = jSONObject.optString("creativeType", a.EnumC0172a.NONE.toString());
        String optString2 = jSONObject.optString("resourceType", a.b.HTML_RESOURCE.toString());
        String optString3 = jSONObject.optString("contentUrl");
        String optString4 = jSONObject.optString("clickThroughUri");
        JSONArray optJSONArray = jSONObject.optJSONArray("clickTrackers");
        JSONArray optJSONArray2 = jSONObject.optJSONArray("creativeViewTrackers");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
            arrayList.add(new c.a(optJSONArray.optString(i10)).a());
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < optJSONArray2.length(); i11++) {
            arrayList2.add(new c.a(optJSONArray2.optString(i11)).a());
        }
        return new c(optInt, optInt2, a.EnumC0172a.valueOf(optString), a.b.valueOf(optString2), optString3, arrayList, arrayList2, optString4);
    }

    private static float a(a.b bVar, a.EnumC0172a enumC0172a) {
        int i10 = AnonymousClass1.f12449a[bVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return i10 != 3 ? 0.0f : 1.0f;
            }
            return 1.2f;
        } else if (a.EnumC0172a.JAVASCRIPT.equals(enumC0172a)) {
            return 1.0f;
        } else {
            return a.EnumC0172a.IMAGE.equals(enumC0172a) ? 0.8f : 0.0f;
        }
    }

    public void a(String str) {
        this.f12448i = str;
    }

    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", this.f12440a);
        jSONObject.put("height", this.f12441b);
        jSONObject.put("creativeType", this.f12442c.toString());
        jSONObject.put("resourceType", this.f12443d.toString());
        jSONObject.put("contentUrl", this.f12444e);
        jSONObject.put("clickThroughUri", this.f12447h);
        jSONObject.put("clickTrackers", com.bytedance.sdk.openadsdk.core.j.b.c.b(this.f12445f));
        jSONObject.put("creativeViewTrackers", com.bytedance.sdk.openadsdk.core.j.b.c.b(this.f12446g));
        return jSONObject;
    }
}
