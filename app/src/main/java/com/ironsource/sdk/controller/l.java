package com.ironsource.sdk.controller;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    String f27816a;

    /* renamed from: b  reason: collision with root package name */
    com.ironsource.sdk.h.b f27817b;

    /* loaded from: classes3.dex */
    final class a implements com.ironsource.sdk.k.c {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ o f27818a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ n f27819b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(o oVar, n nVar) {
            this.f27818a = oVar;
            this.f27819b = nVar;
        }

        @Override // com.ironsource.sdk.k.c
        public final void a(com.ironsource.sdk.h.c cVar) {
            try {
                o oVar = this.f27818a;
                n nVar = this.f27819b;
                oVar.a(nVar, l.d(nVar, cVar.a()));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // com.ironsource.sdk.k.c
        public final void a(com.ironsource.sdk.h.c cVar, com.ironsource.sdk.g.e eVar) {
            try {
                o oVar = this.f27818a;
                n nVar = this.f27819b;
                oVar.b(nVar, l.c(nVar, eVar.f28187a));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(String str, com.ironsource.sdk.h.b bVar) {
        this.f27816a = str;
        this.f27817b = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.ironsource.sdk.h.c a(JSONObject jSONObject, String str) {
        if (jSONObject.has("filePath") && jSONObject.has("fileName")) {
            String string = jSONObject.getString("filePath");
            return new com.ironsource.sdk.h.c(IronSourceStorageUtils.buildAbsolutePathToDirInCache(str, string), jSONObject.getString("fileName"));
        }
        throw new Exception("Missing params for file");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static JSONObject b(n nVar, long j10) {
        try {
            return nVar.a().put(IronSourceConstants.EVENTS_RESULT, j10);
        } catch (Exception e10) {
            e10.printStackTrace();
            return new JSONObject();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static JSONObject c(n nVar, String str) {
        try {
            return nVar.a().put("errMsg", str);
        } catch (Exception e10) {
            e10.printStackTrace();
            return new JSONObject();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static JSONObject d(n nVar, JSONObject jSONObject) {
        try {
            return nVar.a().put(IronSourceConstants.EVENTS_RESULT, jSONObject);
        } catch (Exception e10) {
            e10.printStackTrace();
            return new JSONObject();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.ironsource.sdk.h.c e(JSONObject jSONObject, String str) {
        if (jSONObject.has("folderPath")) {
            return new com.ironsource.sdk.h.c(IronSourceStorageUtils.buildAbsolutePathToDirInCache(str, jSONObject.getString("folderPath")));
        }
        throw new Exception("Missing params for folder");
    }
}
