package com.applovin.impl.adview;

import android.annotation.TargetApi;
import android.webkit.WebSettings;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f7124a;

    public v(JSONObject jSONObject) {
        this.f7124a = jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(21)
    public Integer a() {
        int i10;
        String string = JsonUtils.getString(this.f7124a, "mixed_content_mode", null);
        if (StringUtils.isValidString(string)) {
            if ("always_allow".equalsIgnoreCase(string)) {
                i10 = 0;
            } else if ("never_allow".equalsIgnoreCase(string)) {
                i10 = 1;
            } else if ("compatibility_mode".equalsIgnoreCase(string)) {
                i10 = 2;
            }
            return Integer.valueOf(i10);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public WebSettings.PluginState b() {
        String string = JsonUtils.getString(this.f7124a, "plugin_state", null);
        if (StringUtils.isValidString(string)) {
            if ("on".equalsIgnoreCase(string)) {
                return WebSettings.PluginState.ON;
            }
            if ("on_demand".equalsIgnoreCase(string)) {
                return WebSettings.PluginState.ON_DEMAND;
            }
            if ("off".equalsIgnoreCase(string)) {
                return WebSettings.PluginState.OFF;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Boolean c() {
        return JsonUtils.getBoolean(this.f7124a, "allow_file_access", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Boolean d() {
        return JsonUtils.getBoolean(this.f7124a, "load_with_overview_mode", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Boolean e() {
        return JsonUtils.getBoolean(this.f7124a, "use_wide_view_port", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Boolean f() {
        return JsonUtils.getBoolean(this.f7124a, "allow_content_access", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Boolean g() {
        return JsonUtils.getBoolean(this.f7124a, "use_built_in_zoom_controls", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Boolean h() {
        return JsonUtils.getBoolean(this.f7124a, "display_zoom_controls", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Boolean i() {
        return JsonUtils.getBoolean(this.f7124a, "save_form_data", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Boolean j() {
        return JsonUtils.getBoolean(this.f7124a, "geolocation_enabled", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Boolean k() {
        return JsonUtils.getBoolean(this.f7124a, "need_initial_focus", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Boolean l() {
        return JsonUtils.getBoolean(this.f7124a, "allow_file_access_from_file_urls", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Boolean m() {
        return JsonUtils.getBoolean(this.f7124a, "allow_universal_access_from_file_urls", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Boolean n() {
        return JsonUtils.getBoolean(this.f7124a, "offscreen_pre_raster", null);
    }
}
