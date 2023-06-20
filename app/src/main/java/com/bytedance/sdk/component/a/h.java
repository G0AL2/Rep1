package com.bytedance.sdk.component.a;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.lang.reflect.Type;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DataConverterActual.java */
/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private l f9241a;

    private h(l lVar) {
        this.f9241a = lVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static h a(l lVar) {
        return new h(lVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <T> T a(String str, Type type) throws JSONException {
        a(str);
        if (!type.equals(JSONObject.class) && (!(type instanceof Class) || !JSONObject.class.isAssignableFrom((Class) type))) {
            return (T) this.f9241a.a(str, type);
        }
        return (T) new JSONObject(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <T> String a(T t10) {
        String obj;
        if (t10 == null) {
            return JsonUtils.EMPTY_JSON;
        }
        if (!(t10 instanceof JSONObject) && !(t10 instanceof JSONArray)) {
            obj = this.f9241a.a(t10);
        } else {
            obj = t10.toString();
        }
        a(obj);
        return obj;
    }

    private static void a(String str) {
        if (str.startsWith("{") && str.endsWith("}")) {
            return;
        }
        i.a(new IllegalArgumentException("Param is not allowed to be List or JSONArray, rawString:\n " + str));
    }
}
