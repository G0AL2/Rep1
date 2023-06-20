package com.bytedance.sdk.component.adexpress.dynamic.b;

import android.text.TextUtils;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: DynamicLayoutBrick.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Integer> f9569a;

    /* renamed from: b  reason: collision with root package name */
    private String f9570b;

    /* renamed from: c  reason: collision with root package name */
    private String f9571c;

    /* renamed from: d  reason: collision with root package name */
    private f f9572d;

    /* renamed from: e  reason: collision with root package name */
    private f f9573e;

    /* renamed from: f  reason: collision with root package name */
    private String f9574f;

    static {
        HashMap hashMap = new HashMap();
        f9569a = hashMap;
        hashMap.put("root", 8);
        hashMap.put("footer", 6);
        hashMap.put("empty", 6);
        hashMap.put("title", 0);
        hashMap.put("subtitle", 0);
        hashMap.put("source", 0);
        hashMap.put("score-count", 0);
        hashMap.put("text_star", 0);
        hashMap.put("text", 0);
        hashMap.put("tag-group", 17);
        hashMap.put("app-version", 0);
        hashMap.put("development-name", 0);
        hashMap.put("privacy-detail", 23);
        hashMap.put("image", 1);
        hashMap.put("image-wide", 1);
        hashMap.put("image-square", 1);
        hashMap.put("image-long", 1);
        hashMap.put("image-splash", 1);
        hashMap.put("image-cover", 1);
        hashMap.put("app-icon", 1);
        hashMap.put("icon-download", 1);
        hashMap.put("logoad", 4);
        hashMap.put("logounion", 5);
        hashMap.put("logo-union", 9);
        hashMap.put("dislike", 3);
        hashMap.put("close", 3);
        hashMap.put("close-fill", 3);
        hashMap.put("webview-close", 22);
        hashMap.put("feedback-dislike", 12);
        hashMap.put("button", 2);
        hashMap.put("downloadWithIcon", 2);
        hashMap.put("downloadButton", 2);
        hashMap.put("fillButton", 2);
        hashMap.put("laceButton", 2);
        hashMap.put("cardButton", 2);
        hashMap.put("colourMixtureButton", 2);
        hashMap.put("arrowButton", 1);
        hashMap.put("download-progress-button", 2);
        hashMap.put("vessel", 6);
        hashMap.put("image-group", 6);
        hashMap.put("custom-component-vessel", 6);
        hashMap.put("carousel", 24);
        hashMap.put("video-hd", 7);
        hashMap.put(DownloadResource.TYPE_VIDEO, 7);
        hashMap.put("video-vd", 7);
        hashMap.put("muted", 10);
        hashMap.put("star", 11);
        hashMap.put("skip-countdowns", 19);
        hashMap.put("skip-with-countdowns-skip-btn", 21);
        hashMap.put("skip-with-countdowns-video-countdown", 13);
        hashMap.put("skip-with-countdowns-skip-countdown", 20);
        hashMap.put("skip-with-time", 14);
        hashMap.put("skip-with-time-countdown", 13);
        hashMap.put("skip-with-time-skip-btn", 15);
        hashMap.put("skip", 15);
        hashMap.put("timedown", 13);
        hashMap.put("icon", 16);
        hashMap.put("scoreCountWithIcon", 6);
        hashMap.put("split-line", 18);
        hashMap.put("creative-playable-bait", 0);
        hashMap.put("score-count-type-2", 0);
    }

    public int a() {
        if (TextUtils.isEmpty(this.f9570b)) {
            return 0;
        }
        if (this.f9570b.equals("logo")) {
            String str = this.f9570b + this.f9571c;
            this.f9570b = str;
            if (str.contains("logoad")) {
                return 4;
            }
            if (this.f9570b.contains("logounion")) {
                return 5;
            }
        }
        Map<String, Integer> map = f9569a;
        if (map.get(this.f9570b) != null) {
            return map.get(this.f9570b).intValue();
        }
        return -1;
    }

    public String b() {
        return this.f9570b;
    }

    public String c() {
        return this.f9571c;
    }

    public String d() {
        return this.f9574f;
    }

    public f e() {
        return this.f9572d;
    }

    public f f() {
        return this.f9573e;
    }

    public String toString() {
        return "DynamicLayoutBrick{type='" + this.f9570b + "', data='" + this.f9571c + "', value=" + this.f9572d + ", themeValue=" + this.f9573e + ", dataExtraInfo='" + this.f9574f + "'}";
    }

    public void b(String str) {
        this.f9571c = str;
    }

    public void c(String str) {
        this.f9574f = str;
    }

    public void b(f fVar) {
        this.f9573e = fVar;
    }

    public void a(String str) {
        this.f9570b = str;
    }

    public void a(f fVar) {
        this.f9572d = fVar;
    }

    public static void a(JSONObject jSONObject, e eVar) {
        if (jSONObject == null || eVar == null) {
            return;
        }
        eVar.a(jSONObject.optString("type", "root"));
        eVar.b(jSONObject.optString("data"));
        eVar.c(jSONObject.optString("dataExtraInfo"));
        f c10 = f.c(jSONObject.optJSONObject("values"));
        f c11 = f.c(jSONObject.optJSONObject("nightThemeValues"));
        eVar.a(c10);
        eVar.b(c11);
    }
}
