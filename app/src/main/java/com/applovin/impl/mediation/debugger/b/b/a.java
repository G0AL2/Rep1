package com.applovin.impl.mediation.debugger.b.b;

import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f7494a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7495b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f7496c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(JSONObject jSONObject, m mVar) {
        this.f7494a = JsonUtils.getString(jSONObject, "name", "");
        this.f7495b = JsonUtils.getString(jSONObject, "description", "");
        List list = JsonUtils.getList(jSONObject, "existence_classes", null);
        this.f7496c = list != null ? Utils.checkClassesExistence(list) : Utils.checkClassExistence(JsonUtils.getString(jSONObject, "existence_class", ""));
    }

    public static boolean a(String str, String str2, String str3) {
        if (str == null) {
            return true;
        }
        if (str2 == null || Utils.compare(str2, str) != 1) {
            return str3 == null || Utils.compare(str3, str) != -1;
        }
        return false;
    }

    public String a() {
        return this.f7494a;
    }

    public String b() {
        return this.f7495b;
    }

    public boolean c() {
        return this.f7496c;
    }
}
